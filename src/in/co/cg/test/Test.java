package in.co.cg.test;

import in.co.cg.TAXcalc.TaxCalculator;
import in.co.cg.exception.CountryNotValidException;
import in.co.cg.exception.EmployeNameInavlidException;
import in.co.cg.exception.TaxNotElgibleException;

public class Test {
public static void main(String[] args) {
	TaxCalculator taxCalculator=new TaxCalculator();//Instantiating class TaxCalculator
	try {
		taxCalculator.calculateTax("Ron", false, 34000);//Invoking calculateTax from class TaxCalculator
	
	} catch (EmployeNameInavlidException | CountryNotValidException | TaxNotElgibleException e) {
		e.printStackTrace();
	}
	try {
		taxCalculator.calculateTax("Tim", true, 1000);//Invoking calculateTax from class TaxCalculator
	} catch (EmployeNameInavlidException | CountryNotValidException | TaxNotElgibleException e) {
		e.printStackTrace();
	}
	try {
		System.out.println("Tax amount is: "+taxCalculator.calculateTax("Jack", true, 55000));//Invoking calculateTax from class TaxCalculator
	} catch (EmployeNameInavlidException | CountryNotValidException | TaxNotElgibleException e) {
		e.printStackTrace();
	}
	try {
		taxCalculator.calculateTax("", true, 55000);//Invoking calculateTax from class TaxCalculator
	} catch (EmployeNameInavlidException | CountryNotValidException | TaxNotElgibleException e) {
		e.printStackTrace();
	}
	
}

}
