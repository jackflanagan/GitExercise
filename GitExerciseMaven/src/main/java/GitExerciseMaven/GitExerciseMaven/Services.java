package GitExerciseMaven.GitExerciseMaven;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Services  {
	
	Map m1 = new HashMap();
	Account a = new Account("jack","flanagan","123");
	
	public void setMap() {
		
		
		String name = a.getfirstName()+" " + a.getlastName();
		m1.put(name,a.getaccountNumber());
	
		
		
		JSONObject mapper = new JSONObject(m1);
		System.out.println(mapper);
		
		
		
		
		
		
	}
	
	
	

}