

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		new Test().writeFile();

	}
	
	public void addUser(){
		User user = new User("kiwi", "112358");
		try {
			UserDAO mongo = new UserDAO();
			mongo.insertUser(user);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkUser(){
		try {
			UserDAO mongo = new UserDAO();
			System.out.println(mongo.checkUser("kiwi2", "11235"));
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
	}
	public void printDate(){
		System.out.println(new Date().getTime());
	}
	
	public void writeFile(){
		File file = new File("hello.txt");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("Hello World!");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
