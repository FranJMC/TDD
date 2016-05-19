import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testArray {

	ArrayAsociativo a;
	ArrayAsociativo b;

	@Before
	public void setUp() {
		a = new ArrayAsociativo();
		b = new ArrayAsociativo("nombre", "luis");
		a.put("nombre", "luis");
	}

	@Test
	public void addValueWithPut() {
		assertEquals(b, a);
	}

	@Test
	public void getValue() {
		assertEquals("luis", a.get("nombre"));
	}

	@Test
	public void getOrElseEncontrado() {
		assertEquals("luis", a.getOrElse("nombre", "hola"));
	}

	@Test
	public void getOrElseDefault() {
		assertEquals("hola", a.getOrElse("nombre", "hola"));
	}

	@Test
	public void CalcularTamVacio() {
		ArrayAsociativo c = new ArrayAsociativo();
		assertEquals(0, c.size());
	}

	@Test
	public void CalcularTamConElem() {
		assertEquals(1, b.size());
	}

	@Test
	public void removeVacio() {
		assertEquals(a, a.remove("NOMBRE"));
	}

	@Test
	public void removeElem() {
		assertEquals(a, b.remove("nombre"));
	}
}
