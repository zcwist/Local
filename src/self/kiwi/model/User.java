package self.kiwi.model;

import com.mongodb.BasicDBObject;

public class User{
	private String id;
	private String username;
	private String password;
	private BasicDBObject userobj;
	
	
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
		this.userobj = new BasicDBObject().append("username", username)
							.append("password", password);
	}


	public String getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}


	public BasicDBObject getUserobj() {
		return userobj;
	}
}
