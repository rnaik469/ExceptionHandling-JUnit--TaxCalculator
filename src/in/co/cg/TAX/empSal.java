package in.co.cg.TAX;

import org.junit.Test;

import in.co.cg.TAXcalc.TaxCalculator;
import in.co.cg.exception.TaxNotElgibleException;

public class empSal {

	@Test
	public void checkSal() {
		TaxCalculator calculator = new TaxCalculator();
		calculator.calculateTax("rohit",true,15000);
	}

	@Test(expected=in.co.cg.exception.TaxNotElgibleException.class)
	public void checkMinSal() {
		TaxCalculator calculator=new TaxCalculator();
		calculator.calculateTax("rohit",true,1000);
		}
}
