package Business.concretes;

import java.util.List;

import Business.abstracts.UserService;
import Business.validation.Validation;
import DataAccess.abstracts.UserDeo;
import Entites.concretes.User;

public class UserManager implements UserService{

	UserDeo userDeo;
	public UserManager(UserDeo userDeo) {
		this.userDeo=userDeo;
	}
	Validation validation=new Validation();
	
	
	@Override
	public void add(User user,List<User> users,String dogrulamaKodu) {
		if (validation.dogrulama(user,users,dogrulamaKodu)) {
			
			userDeo.add(user);
			System.out.println("üyelik işlemi başarılı hog geldin "+ user.getUserName());
		}
			
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register(List<User> users,String userName, String password) {
		
		int kontrol=0;
		for(User user:users) {
			if (user.getUserName()==userName && user.getPassword()==password) {
				System.out.println("sisteme giriş yaptınız hos geldin"+ user.getUserName());
				kontrol=1;
				break;
			}

		}
		if (kontrol==0) {
			System.out.println("lütfen kullanıcı adınızı ve sifrenizi kontrol ediniz");
		}
		
	}

}
