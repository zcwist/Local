package self.kiwi.dao;

import java.net.UnknownHostException;

import self.kiwi.model.User;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("kiwi", "112358");
		try {
			UserDAO mongo = new UserDAO();
			mongo.insertUser(user);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
