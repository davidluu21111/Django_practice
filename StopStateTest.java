import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StopStateTest {
	public StopState state = new StopState();

	@Test
	void testStopState() {
		
		assertEquals("Stop State",state.toString());
	}

}
