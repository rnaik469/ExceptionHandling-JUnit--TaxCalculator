package in.co.cg.TAX;

import org.junit.Test;
import in.co.cg.TAXcalc.TaxCalculator;

public class TaxNameTest {


	@Test (expected=in.co.cg.exception.EmployeNameInavlidException.class)
	public void checkNameEmpty() {
		TaxCalculator calculator = new TaxCalculator();
		calculator.calculateTax("", true, 15000);

	}

	@Test
	public void checkName() {
		TaxCalculator calculator = new TaxCalculator();
		calculator.calculateTax("rohit", true, 15000);
	}
}
