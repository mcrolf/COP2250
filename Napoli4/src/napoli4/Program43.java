// Michael Napoli 2275778
/* Here are some data regarding a retail purchase:

	item: photo paper
	dept: A
	price: $8.99
	quantity: 4
	taxable: true
	Assign these data items (without user inputs) to Java variables of the most suitable type as 
	suggested by the values. Then use the variables to calculate and generate the output exactly 
	as shown below. Use only the printf() method. Purple indicates a variable to be displayed 
	using a printf format specifier.
	
	Required Output
	Purchase: photo paper, quantity 4 @ $8.99
	Dept A, taxable? true
	Subtotal $35.96
	7 % sales tax is $2.52
	Total payable $38.48  */

package napoli4;

public class Program43 {
	public static void main(String[] args) {

		String itemOne = "photo paper";
		char departmentTyp = 'a';
		double itemPrice = 8.99;
		int itemQuantity = 4;
		boolean taxable = true;

		System.out.printf("Purchase: %s, quantity %d @ $%f", itemOne, itemQuantity, itemPrice);
		System.out.printf("\nDept %C, taxable? %b", departmentTyp, taxable);
		System.out.printf("\nSubtotal $%4.2f", 35.96);
		System.out.printf("\n7%% sales tax is $%3.2f", 2.52);
		System.out.printf("\nTotal payable is $%4.2f", 38.48);

	}
}