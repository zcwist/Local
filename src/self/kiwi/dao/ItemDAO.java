package self.kiwi.dao;

import java.net.UnknownHostException;

import com.mongodb.DBCollection;

import self.kiwi.model.GeneralItem;

public class ItemDAO extends MongoWrapper {

	public ItemDAO()
			throws UnknownHostException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void insert(GeneralItem item){
		DBCollection coll = db.getCollection("item_list");
		coll.insert(item.getItemObj());
	}

}
