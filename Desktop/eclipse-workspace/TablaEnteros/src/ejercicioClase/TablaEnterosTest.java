package ejercicioClase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {
	
	Integer [] numeros = {1, 2, 3, 4};
	TablaEnteros tabla;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		tabla = new TablaEnteros(numeros);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testTablaEnteros() {
		fail("Not yet implemented");
	}

	@Test
	void testSumaTabla() {
		assertEquals(10, tabla.sumaTabla());
	}

	@Test
	void testMayorTabla() {
		assertEquals(4, tabla.mayorTabla());
	}

	@Test
	void testPosicionTabla() {
		fail("Not yet implemented");
	}

}
