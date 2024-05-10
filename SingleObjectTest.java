import static org.junit.Assert.*;


import org.junit.Test;

public class SingleObjectTest {
	
	@Test
	public void testSingleObject() {
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		assertEquals(true, object1==object2);
		assertEquals(false, object1==object2);
		
	}

}
