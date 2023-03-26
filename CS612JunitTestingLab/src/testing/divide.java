package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divide {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(12,3);
		assertEquals(3.99, output);
		
	}

}
