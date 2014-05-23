package self.kiwi.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import self.kiwi.model.GeneralItem;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class ItemDAO extends MongoWrapper {
	private DBCollection coll = null;
	private final float RANGETHRESHOLD = 5;

	public ItemDAO()
			throws UnknownHostException {
		super();
		// TODO Auto-generated constructor stub
		coll = db.getCollection("item_list");
	}
	
	public void insert(GeneralItem item){
		coll.insert(item.getItemObj());
		super.destroy();
	}
	
	public List<DBObject> getNeighbourItemID(float longitude, float latitude){
		List<DBObject> itemIdList = new ArrayList<DBObject>();
		//TODO
		BasicDBObject query = new BasicDBObject();
		
		BasicDBList longitudeRange = new BasicDBList();
		longitudeRange.add(longitude - RANGETHRESHOLD);
		longitudeRange.add(longitude + RANGETHRESHOLD);
		
		BasicDBList latitudeRange = new BasicDBList();
		latitudeRange.add(latitude - RANGETHRESHOLD);
		latitudeRange.add(latitude + RANGETHRESHOLD);
		
		query.append("longitude", new BasicDBObject("$in",longitudeRange))
				.append("latitude", new BasicDBObject("$in",latitudeRange));
		
        itemIdList = coll.find(query, new BasicDBObject("_id",1)).toArray();
        	
		return itemIdList;
	}
	
	public BasicDBObject queryItemById(String id){
		BasicDBObject itemObj = null;
		BasicDBObject query = new BasicDBObject("id", id);
		DBCursor cursor = coll.find(query);
		try{
			if (cursor.hasNext()){
				itemObj = (BasicDBObject) cursor.next();
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return itemObj;
		
		}
	
}
