package Business.validation;
import java.util.List;
import java.util.regex.Pattern;

import Entites.concretes.User;

public class Validation {
	public boolean dogrulama(User user, List<User> users, String kod) {

		if (
				parolaDogrulama(user.getPassword()) == true && userNameIsSorName(user.getName(), user.getSorName()) == true
				&& isEmailValid(user.geteMail()) && mailKontol(users, user.geteMail()) && dogrulamaKodu(kod)) {
			return true;
		} else {
			return false;
		}

	}
	


	public boolean parolaDogrulama(String parola) {
		if (parola.length() > 6) {
			return true;

		} else {
			System.out.println("sifreniz en az 6 karakter olmalıdır");
			return false;
		}
	}

	public boolean userNameIsSorName(String name, String sorName) {
		if (name.length() > 2 && sorName.length() > 2) {
			return true;

		} else {
			return false;
		}
	}

	public boolean mailKontol(List<User> users, String mail) {
		for (User user : users) {
			if (user.geteMail() == mail) {
				System.out.println("aynı mail sistemte mevcut");
				return false;
			}

		}
		return true;

	}
	

	public boolean dogrulamaKodu(String kod) {
		if (kod == "e") {
			return true;
		}

		return false;
	}

	public boolean isEmailValid(String email) {
		final Pattern EMAIL_REGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);
		if (EMAIL_REGEX.matcher(email).matches()) {
			return true;
		} else {
			System.out.println("e postanızı kontrol ediniz");
			return false;
		}
	}

}
