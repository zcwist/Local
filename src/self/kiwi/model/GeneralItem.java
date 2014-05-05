package self.kiwi.model;

import java.util.Date;

import com.mongodb.BasicDBObject;

public class GeneralItem {
	private float longitue;
	private float latitude;
	private Date date;
	public BasicDBObject itemObj;
	
	public float getLongitue() {
		return longitue;
	}
	public float getLatitude() {
		return latitude;
	}
	public Date getDate() {
		return date;
	}
	public BasicDBObject getItemObj() {
		return itemObj;
	}
	

}
