import java.util.ArrayList;
import java.util.List;

import Business.concretes.UserManager;
import DataAccess.concretes.HibernateUserDeo;
import Entites.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager(new HibernateUserDeo());
		User user=new User(1,"isa","özçakır","isa@isa","1234567","ozçakırisa");
		User user1=new User(2,"engin ","demirog","engin@engin","1234567","engindemirog");
		User user2=new User(3,"ahmet","özçakır","sas@sda","1234567","ozçakırahmet");
		String dogrulamaKodu="e";
		List<User> users=new ArrayList<User>();
		users.add(user);
	//	userManager.add(user1,users,dogrulamaKodu);
		users.add(user1);
	//	userManager.add(user2,users,dogrulamaKodu);
		users.add(user2);
		userManager.register(users, "ozçakırahmet2", "1234567");
		
	}

}
