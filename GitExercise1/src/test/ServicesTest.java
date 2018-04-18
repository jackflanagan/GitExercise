package test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ServicesTest {

	@Test
	public void test() {
		Map m1 = new HashMap();
		Account a = new Account("jack","flanagan","123");
		
		String name = a.getfirstName()+" " + a.getlastName();
		m1.put(name,a.getaccountNumber());
		
		String expected = "jack flanagan";
				String actual = name;
				
				assertEquals(expected,actual);
		
	}

}
