
public class AccountMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		valueOfSupply = 12345.0;
		vatRate = 0.1;
		double vat=getVat();
		double total=getTotal();
		double expenseRate=0.3;
		double expense=valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		double divided1 = income * 0.5;
		double divided2 = income * 0.3;
		double divided3 = income * 0.2;
		
		System.out.println("Value of supply :"+valueOfSupply);
		System.out.println("VAT :"+vat);
		System.out.println("Total :"+total);
		System.out.println("Expense :"+expense);
		System.out.println("Income :"+income);
		System.out.println("Dividend 1 :"+divided1);
		System.out.println("Dividend 2 :"+divided2);
		System.out.println("Dividend 3 :"+divided3);
	}
	public static double getTotal() {
		return valueOfSupply +getVat();
	}
	public static double getVat() {
		return valueOfSupply * vatRate;
	}

}
