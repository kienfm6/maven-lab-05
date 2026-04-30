import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.calculator.Calculator;

public class CalculatorTest {
	static Calculator calc = new Calculator();

	@BeforeAll
	static void SetUpBeforeAll() {
		Calculator calc = new Calculator();
	}

	@Test
	public void TestCase01() {
		int result = calc.add(3, 5);
		assertEquals(8, result);
	}

	@Test
	public void TestCase02() {
		int result = calc.add(12, 24);
		assertEquals(36, result);
	}

	@Test
	public void TestCase03() {
		int result = calc.sub(9, 4);
		assertEquals(5, result);
	}

	@Test
	public void TestCase04() {
		int result = calc.add(13, 5);
		assertEquals(8, result);
	}

	@Test
	public void TestCase05() {
		int result = calc.mul(12, 12);
		assertEquals(144, result);
	}

	@Test
	public void TestCase06() {
		int result = calc.mul(7, 5);
		assertEquals(35, result);
	}

	@Test
	public void TestCase07() {
		int result = calc.div(6, 3);
		assertEquals(2, result);
	}

	@Test
	public void TestCase08() {
		int result = calc.div(27, 9);
		assertEquals(3, result);
	}

	@Test
	public void TestCase09() {
		assertThrows(IllegalArgumentException.class,() -> calc.div(3,0));
	}
}
