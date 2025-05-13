import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		double d,m;
		
		System.out.println("Enter the degree in Fahrenheit: ");
		d=Double.parseDouble(s.nextLine());
		m=(d-32)*5/9;
		
		System.out.println(d +" degree Fahrenheit is equal to "+m+" in Celsius");
		
		

	}

}


