import java.util.Scanner;
public class Calculator {

		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in); //Starts listening for user input
			System.out.println("Enter a number: 1 is add, 2 is multiply, 3 is subtract, 4 is divide");
			int operation = reader.nextInt(); //Sets operation to the next user input as an integer.
			System.out.println("Enter the first operand.");
			float n1 = reader.nextFloat(); //Sets n1 to the next user input as an float.
			System.out.println("Enter the second operand.");
			float n2 = reader.nextFloat(); //Sets n2 to the next user input as an float.
			reader.close(); //stops listening for user input
			
			if (operation == 1) {
				System.out.println(add(n1,n2));
			}
			else if (operation == 2) {
				System.out.println(multiply(n1,n2));
			}
			else if (operation == 3) {
				System.out.println(subtract(n1,n2));
			}
			else if (operation == 4) {
				System.out.println(divide(n1,n2));
			}
			else {
				System.out.println("Given operation is invalid. Please try again using 1, 2, 3, or 4.");
			}
			System.exit(0);
		}
		
		public static float add(float n1, float n2) {
			return n1+n2;
		}
		
		public static float multiply(float n1, float n2) {
			return n1*n2;
		}
		
		public static float subtract(float n1, float n2) {
			return n1-n2;
		}
		
		public static float divide(float n1, float n2) {
			return n1/n2;
		}
}
