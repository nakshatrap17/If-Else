import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount(INR): ");
		float inr = sc.nextFloat();
		float conCurr = 0.0f;
		
		System.out.println("\nList of Currencies: ");
		System.out.println("1. USD");
		System.out.println("2. GBP");
		System.out.println("3. EURO");
		System.out.println("4. DIRHAM");
		System.out.println("5. YEN");
		System.out.println("4. AUD");
		System.out.println("Enter currency to convert: ");
		String cur = sc.next().toUpperCase();
		if(cur.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr+" INR is "+conCurr+" USD");
		}
		else if(cur.equals("GBP"))
		{
			conCurr = inr/107.67f;
			System.out.println(inr+" INR is "+conCurr+" GBP");
		}
		else if(cur.equals("EURO"))	
		{
			conCurr = inr/90.25f;
			System.out.println(inr+" INR is "+conCurr+" EURO");
		}
		else if(cur.equals("DIRHAM"))
		{
			conCurr = inr/23.57f;
			System.out.println(inr+" INR is "+conCurr+" DIRHAM");
		}
		else if(cur.equals("YEN"))
		{
			conCurr = inr/0.5570f;
			System.out.println(inr+" INR is "+conCurr+" YEN");
		}
		else if(cur.equals("AUD"))
		{
			conCurr = inr/54.09f;
			System.out.println(inr+" INR is "+conCurr+" AUD");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
}
