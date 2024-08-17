import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("enter no first: ");
		int A = input.nextInt();

		System.out.print("enter no second: ");
		int B = input.nextInt();

		int sum = A+B;
		System.out.println("Sum is "+sum);

		int product = A*B;
		System.out.println("Product is "+product);

		int devide = A/B;
		System.out.println("Devide is " + devide);

		int minus = A-B;
		System.out.println("minus is " + minus);

	}
}