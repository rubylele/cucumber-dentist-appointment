package uni.fmi;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import uni.fmi.models.Role;
import static org.junit.Assert.assertEquals;

public class TestSet {
	@Test
	public void testSetWithStrings() {
		final Set<String> testInstance = new HashSet<String>();
		String value1 = "value";
		testInstance.add(value1);
		
		String value2 = "value";
		testInstance.add(value2);
		
		String value3 = "value3";
		testInstance.add(value3);
		
		assertEquals(2, testInstance.size());
	}
}
