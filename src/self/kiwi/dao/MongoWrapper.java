package self.kiwi.dao;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public abstract class MongoWrapper {
	private MongoClient mongoClinet = null;
	public DB db = null;
	private String ip = "166.111.53.46";
	private int port = 27017;
	private String dbname = "Tozz";
	
	public MongoWrapper() throws UnknownHostException {
		// TODO Auto-generated constructor stub
		mongoClinet = new MongoClient(ip, port);
		db = mongoClinet.getDB(dbname);
	}
	
	public void destroy(){
		if (mongoClinet != null){
			mongoClinet.close();	
		}
	}
}
