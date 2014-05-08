

import java.net.UnknownHostException;
import java.util.Date;

import self.kiwi.dao.UserDAO;
import self.kiwi.model.User;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test().printDate();

	}
	
	private void addUser(){
		User user = new User("kiwi", "112358");
		try {
			UserDAO mongo = new UserDAO();
			mongo.insertUser(user);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void checkUser(){
		try {
			UserDAO mongo = new UserDAO();
			System.out.println(mongo.checkUser("kiwi2", "11235"));
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
	}
	private void printDate(){
		System.out.println(new Date().getTime());
	}

}
