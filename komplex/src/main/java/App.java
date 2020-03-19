import java.util.ArrayList;
import java.util.List;

import controllers.UserController;
import data.User;
import repositories.UserRepository;
import validators.LengthValidator;
import validators.SpaceValidator;
import validators.Validator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		UserRepository repository = new UserRepository();
		System.out.println("Repository létrehozva.");
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(new SpaceValidator());
		validators.add(new LengthValidator());
		System.out.println("Bemeneti feltételek megállapítva.");
		UserController controller = new UserController();
		System.out.println("Adatok bevitele:");
		repository.save(new User("Lacoka", "nkf56", true));
		repository.save(new User("Bazsika", "GoZ56", true));
		repository.save(new User("Ferike", "Gor56", true));
		System.out.println("Adatok felvétele: ");
		for (User u : repository.findAll()) {
			System.out.println(u.getName());
		}
		System.out.println("Adatok felvéve.");
		System.out.println("Lefutott!"); 
	}

}
