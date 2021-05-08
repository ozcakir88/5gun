package Business.abstracts;

import java.util.List;

import Entites.concretes.User;

public interface UserService {
	void add(User user ,List<User> users,String dogrulamaKodu);
	List<User> getAll();
	void update(User user);
	void register(List<User> users, String userName,String password);

}
