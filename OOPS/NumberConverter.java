package OOPS;

import java.util.Scanner;

public class NumberConverter {

	
	static String[] x = {"", "one","two","Three","four","five","Six","seveen","eight","nine","ten","Eleven","tweleve","thirteen","fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] y = {"", "","twenty","thirty","Fourty","fifty","Sixty","Seventy","Eighty","ninety"};
	static void convert(int num) {
		if(num>=1 && num<=19)
		{
			System.out.print(x[num]+" ");
		}
		if(num>=20 && num<=99)
		{
			System.out.print(y[num/10]+" "+x[num%10]+" ");
		}
		if(num>=100 && num<=999)
		{
			convert(num/100);
			System.out.print("Hundread ");
			convert(num%100);
		}
		if(num>=1000 && num<=99999)
		{
			convert(num/1000);
			System.out.print("Thousand ");
			convert(num%1000);
		}
		if(num>=100000 && num<=9999999)
		{
			convert(num/100000);
			System.out.print("Lakh ");
			convert(num%100000);
		}
		else
			{
			System.out.println("Number out of range");
		}
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	convert(num);
	
	}

}
