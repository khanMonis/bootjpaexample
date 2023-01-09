package com.jpa.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

import antlr.collections.List;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		/*
		 * User user=new User();
		 * 
		 * user.setName("Momin Khan"); user.setCity("Basti");
		 * user.setStatus("i am Java Haffij"); User user1 = userRepository.save(user);
		 * 
		 * System.out.println(user1);
		 */

		// Create object of user
		/*
		 * User user1 = new User();
		 *  user1.setName("Ahmad Khan");
		 * user1.setCity("Bandra"); 
		 * user1.setStatus("Pharmacey");
		 * 
		 * User user2 = new User(); 
		 * user2.setName("Saad Khan");
		 *  user2.setCity("Kanpur");
		 * user2.setStatus("LLB");
		 */
		/*
		 * //saving single user \ User user = userRepository.save(user2);
		 */

		/*
		 * java.util.List<User> users = java.util.List.of(user1,user2);
		 * 
		 * //save multiple objects Iterable<User> result =
		 * userRepository.saveAll(users);
		 * 
		 * result.forEach(user->{ System.out.println(user); });
		 */

		/* System.out.println("saved user "+resultUser); */
		/* System.out.println("done"); */

		// update the user of id=6
		/*
		 * Optional<User> optional = userRepository.findById(6); User user =
		 * optional.get();
		 * 
		 * user.setName("Shaima Khan");
		 * 
		 * User result = userRepository.save(user); System.out.println(result);
		 */

		// how to get the data
		// find byID(id)- return optional containing your data
		//

		/* Iterable<User> itr = userRepository.findAll(); */

		/*
		 * itr.forEach(new Consumer<User>() {
		 * 
		 * @Override public void accept(User t) { // TODO Auto-generated method stub
		 * System.out.println(t);
		 * 
		 * }
		 * 
		 * });
		 */

		// get data by lambda expression

		/*
		 * itr.forEach(user->{ System.out.println(user);});
		 */

		// deleting the single user element by id =8
//		userRepository.deleteById(8);
//		System.out.println("Deleted");

		// deleting all elements
		/*
		 * Iterable<User> allusers = userRepository.findAll();
		 * 
		 * allusers.forEach(user->System.out.println());
		 * 
		 * userRepository.deleteAll(allusers);
		 */
		//
		/*
		 * java.util.List<User> users =
		 * userRepository.findByNameAndCity("Anas Khan","Lucknow");
		 * 
		 * users.forEach(e->System.out.println(e));
		 */
		
		//JPQL Query
		
		java.util.List<User> allUser = userRepository.getAllUser();

		allUser.forEach(e -> {
			System.out.println(e);
		});

		System.out.println("_________________________________");
		java.util.List<User> userByName = userRepository.getUserByName("Anas Khan","Lucknow");
		
		userByName.forEach(e ->{
			System.out.println(e);
		});
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		//Native Query
		userRepository.getUsers().forEach(e->
		System.out.println(e));
	}

}