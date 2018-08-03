package in.co.cg.TAXcalc;

import in.co.cg.exception.CountryNotValidException;
import in.co.cg.exception.EmployeNameInavlidException;
import in.co.cg.exception.TaxNotElgibleException;


/**
 * @author rnaik
 * THis class calculate tax 
 */
public class TaxCalculator {
	
	/**
	 * @param empName
	 * @param isIndian
	 * @param empSal
	 * @return tax amount
	 * @throws EmployeNameInavlidException
	 * @throws CountryNotValidException
	 * @throws TaxNotElgibleException
	 */
	public float calculateTax(String empName, Boolean isIndian, float empSal)
			throws EmployeNameInavlidException, CountryNotValidException, TaxNotElgibleException {
		float tax = 0;
		if (empName.isEmpty()) { //check if name is empty
			throw new EmployeNameInavlidException("The employee name can't be empty");
		}
		if (!isIndian) {//check nationality
			throw new CountryNotValidException("The employee should be an Indain Citizen for calculating");
		}

		if (empSal > 100000) {//calculate Tax
			tax = empSal * .08f;
		} else if (empSal < 100000 && empSal > 50000) {
			tax = empSal * .06f;
		} else if (empSal < 50000 && empSal > 30000) {
			tax = empSal * .05f;
		} else if (empSal < 30000 && empSal > 10000) {
			tax = empSal * .04f;
		} else {
			throw new TaxNotElgibleException(" employee does not need to pat tax");
		}
		return tax;

	}
}
