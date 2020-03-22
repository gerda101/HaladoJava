package app;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import data.User;
import repositories.UserRepository;
import validators.LengthValidator;
import validators.SpaceValidator;
import validators.Validator;

public class App {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(App.class.toString());
		UserRepository repository = new UserRepository();
		logger.info("Repository létrehozva.");
		List<Validator> validators = new ArrayList<Validator>();
		validators.add(new SpaceValidator());
		validators.add(new LengthValidator());
		logger.info("Bemeneti feltételek megállapítva.");
		logger.info("Adatok bevitele:");
		repository.save(new User("Lacoka", "nkf56", true));
		repository.save(new User("Bazsika", "GoZ56", true));
		repository.save(new User("Ferike", "Gor56", true));
		logger.info("Adatok felvétele: ");
		for (User u : repository.findAll()) {
			logger.info(u.getName());
		}
		logger.info("Adatok felvéve.");
		logger.info("Lefutott!"); 
	}

}
