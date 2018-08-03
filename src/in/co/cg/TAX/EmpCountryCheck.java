package in.co.cg.TAX;

import org.junit.Test;

import in.co.cg.TAXcalc.TaxCalculator;

public class EmpCountryCheck {

	@Test
	public void ifIndian() {
	TaxCalculator calculator=new TaxCalculator();
	calculator.calculateTax("rohit",true,15000);
	}
	
	@Test(expected=in.co.cg.exception.CountryNotValidException.class)
	public void ifNotIndian() {
	TaxCalculator calculator=new TaxCalculator();
	calculator.calculateTax("rohit",false,15000);

	}

}
