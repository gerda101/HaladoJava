package data;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private String name;
	private String neptun;
	private boolean enabled;
	
//Konstruktorok
	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}

	public User(String name, String neptun) {
		super();
		this.name = name;
		this.neptun = neptun;
	}

	public User(String name, String neptun, boolean enabled) {
		super();
		this.name = name;
		this.neptun = neptun;
		this.enabled = enabled;
	}
	
//Getterek
	public String getName() {
		return name;
	}

	public String getNeptun() {
		return neptun;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	
}
