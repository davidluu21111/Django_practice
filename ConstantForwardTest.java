import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstantForwardTest {
	public ConstantForward state = new ConstantForward();

	@Test
	void testConstantForward() {
		
		assertEquals("Stop State",state.toString());
	}

}
