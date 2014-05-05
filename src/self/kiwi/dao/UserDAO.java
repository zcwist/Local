package self.kiwi.dao;

import java.net.UnknownHostException;

import self.kiwi.model.User;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

public class UserDAO extends MongoWrapper {
	private String COLLNAME = "user_list";

	public UserDAO()
			throws UnknownHostException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void insertUser(User user) {
		DBCollection coll = db.getCollection(COLLNAME);
		coll.insert(user.getUserobj());

	}
	public boolean checkUser(String username, String password){
		DBCollection coll = db.getCollection(COLLNAME);
		BasicDBObject query = new BasicDBObject("username", username);
		DBCursor cursor = coll.find(query);
		if (!cursor.hasNext()){ //this user doesn't exist
			insertUser (new User(username,password));
			return true;
		} else{
			while (cursor.hasNext()){
				BasicDBObject usrobj = (BasicDBObject) cursor.next();
				if (password == usrobj.getString("password")){
					return true;
				}
			}
		}
		
		return false;
		
	}

}
