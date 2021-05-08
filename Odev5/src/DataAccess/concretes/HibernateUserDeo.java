package DataAccess.concretes;

import DataAccess.abstracts.UserDeo;
import Entites.concretes.User;

public class HibernateUserDeo implements UserDeo{

	@Override
	public void add(User user) {
			System.out.println("kullanıcı eklendi "+user.getUserName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullanıcı güncellendi "+user.getUserName());

		
	}

	@Override
	public void delete(User user) {
		System.out.println("kullanıcı silindi "+user.getUserName());
		
	}

}
