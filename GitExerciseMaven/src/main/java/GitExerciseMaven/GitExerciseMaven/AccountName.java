package GitExerciseMaven.GitExerciseMaven;

import java.util.HashMap;

public class AccountName {

	
	
	
	private int counter;

	public void matchingAccountName() {
		HashMap <String ,String> m1 = new HashMap();
		Account a = new Account("jack","flanagan","123");
		Account a1 = new Account("jack","flanagan","125");
		Account a2 = new Account("john","johnson","126");
		
		String name = a.getfirstName()+" " + a.getlastName();
		String name1 = a1.getfirstName()+" " + a1.getlastName();
		String name2 = a2.getfirstName()+" " + a2.getlastName();
		
		String givenName = "jack";
		
		m1.put(a.getaccountNumber(),name);
		m1.put(a1.getaccountNumber(),name1);
		m1.put(a2.getaccountNumber(),name2);
		
		
		
		
		for(String key : m1.values()) {
			
			String str = key;
			String[] splitStr = str.split(" ");
			
			String fname = splitStr[0];
			
			if(givenName.equals(fname)) {
				counter++;
			}
			
			
			
			
		}
		System.out.println("The number of jacks is  " + counter);
		
	}

}
	
	

