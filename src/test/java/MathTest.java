
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	public void testSuma() {
		assertEquals(2,Math.suma(1,1) );
	}
	@Test
	public void testDivide() {
		assertEquals(2, Math.divide(10, 5));
	}
	@Test
	public void profeHoyTrabaje() {
		assertEquals("Toda la tarde", "Y tarde mucho para hacer andar esto porque un monton de problemas con todo esto");
		assertEquals("Trabajé", "*");
	}
	
}
