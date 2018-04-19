package GitExerciseMaven.GitExerciseMaven;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class AccountNameTest {

	private int counter;
	@Test
	public void test() {
		HashMap <String ,String> m1 = new HashMap();
		Account1 a = new Account1("jack","flanagan","123");
		Account1 a1 = new Account1("jack","flanagan","125");
		Account1 a2 = new Account1("john","johnson","126");
		
		String name = a.getfirstName()+" " + a.getlastName();
		String name1 = a1.getfirstName()+" " + a1.getlastName();
		String name2 = a2.getfirstName()+" " + a2.getlastName();
		
		String givenName = "jack";
		
		m1.put(a.getaccountNumber(),name);
		m1.put(a1.getaccountNumber(),name1);
		m1.put(a2.getaccountNumber(),name2);
		
		System.out.println(m1);
		
		
		for(String key : m1.values()) {
			
			String str = key;
			String[] splitStr = str.split(" ");
			
			String fname = splitStr[0];
			
			if(givenName.equals(fname)) {
				counter++;
			}
			
			
			
			
		}
		System.out.println("The number of jacks is  " + counter);
		Assert.assertEquals(2, counter);
	}

}
