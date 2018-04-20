package GitExerciseMaven.GitExerciseMaven;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.junit.Test;

import junit.framework.TestCase;


public class ServicesTest1 extends TestCase {

	
	@Test
	public void testCorrectValues() {
		
		Map m1 = new HashMap();
		Account1 a = new Account1("jack","flanagan","123");
		
		String name = a.getfirstName()+" " + a.getlastName();
		m1.put(name,a.getaccountNumber());
		
		String expected = "jack flanagan";
				String actual = name;
				
				assertEquals(expected,actual);
				
				
		
	}
	
	
	
}
