package tel_ran.security.impl;
import java.util.HashMap;

public class SecurConfig {
	HashMap<String,String> mapSecurity;

	public SecurConfig(HashMap<String, String> mapSecurity) {
		super();
		this.mapSecurity = mapSecurity;
	}
	
	public boolean checkSecurity(String login, String password){
		if(mapSecurity.containsKey(login) && mapSecurity.get(login).equals(password))
			return true;
		return false;
	}

}
