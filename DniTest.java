import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DniTest {

	public Dni dni;
	
	@BeforeEach
	void setUp() throws Exception {
		dni = new Dni();
	}

	@Test
	void testCheckDni() {
		//DNI valids amb assertEquals
		assertEquals(dni.checkDni("56963156E"), true);
		assertEquals(dni.checkDni("85738283X"), true);
		assertEquals(dni.checkDni("47563267A"), true);
		
		//DNI invalids amb assertEquals
		assertEquals(dni.checkDni("45782245S"), false);
		assertEquals(dni.checkDni("45782245L"), false);
		assertEquals(dni.checkDni("67431256L"), false);
		assertEquals(dni.checkDni("999999999"), false);
		assertEquals(dni.checkDni("AAAAAAAAA"), false);
		assertEquals(dni.checkDni("A"), false);
		assertEquals(dni.checkDni("a"), false);
		assertEquals(dni.checkDni("12345"), false);
		assertEquals(dni.checkDni("12345789"), false);
		assertEquals(dni.checkDni("000000000"), false);
		assertEquals(dni.checkDni("45782245U"), false);
		assertEquals(dni.checkDni("45782245I"), false);
		assertEquals(dni.checkDni("45782245O"), false);
		assertEquals(dni.checkDni("45782245Ñ"), false);
		
		//DNI valids amb assertTrue
		assertTrue(dni.checkDni("82574865N"));
		assertTrue(dni.checkDni("64784275Z"));
		
		//DNI invalids amb assertFalse
		assertFalse(dni.checkDni("82574865U"));
		assertFalse(dni.checkDni("64784275Ñ"));
		assertFalse(dni.checkDni("74831a67Z"));
		assertFalse(dni.checkDni("012345678-"));
	}

}
