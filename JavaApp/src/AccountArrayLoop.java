
public class AccountArrayLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double valueOfSupply = 12345.0;
		double vatRate = 0.1;
		double vat=valueOfSupply * vatRate;
		double total=valueOfSupply +vat;
		double expenseRate=0.3;
		double expense=valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double divided1 = income * dividendRates[0];
		double divided2 = income * dividendRates[1];
		double divided3 = income * dividendRates[2];
		
		System.out.println("Value of supply :"+valueOfSupply);
		System.out.println("VAT :"+vat);
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		
		int i=0;
		while(i < dividendRates.length) {
			System.out.println("Dividend 1 :"+(income * dividendRates[i]));
			i=i+1
					;
		}
	}

}
