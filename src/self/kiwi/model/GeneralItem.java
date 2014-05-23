package self.kiwi.model;

import java.util.Date;

import com.mongodb.BasicDBObject;

public abstract class GeneralItem {
	protected String id;
	protected float longitude;
	protected float latitude;
	protected long date;
	protected int hearts; //number of like it!
	protected int remarkNum; // number of remarks
	protected String type;
	protected BasicDBObject itemObj;
	public GeneralItem(float longitude, float latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.date = new Date().getTime();
		itemObj = new BasicDBObject().append("longitude", longitude)
						.append("latitude", latitude)
						.append("date", date)
						.append("hearts", 0)
						.append("remarkNum", 0);
		
	}
	public BasicDBObject getItemObj(){
		return itemObj;
	}
	
	
	
}
