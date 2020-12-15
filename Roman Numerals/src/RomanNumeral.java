
import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		int num4 = 1;
				
		//print statement to input a valid number
		if (number > 3999) {
			System.out.println("Number Can not be Proccesessd, please choose a number under 3000");
		}
	
		//evaluating roman numerals as a string
		
		String i[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		String x[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		String c[] = {"a", "aa", "aaa", "ab", "b", "ba", "baa", "baaa", "Fg"};
		
		String[] m = {"y", "yy", "yyy"};
		
		if (number >= 1000) {
			num1 = number/1000;
			if (num1 == 1) {
				System.out.print("y");
			}
			if (num1 == 2) {
				System.out.print("yy");
			}
			if (num1 == 3) {
				System.out.print("yyy");
			}
		}
		if (number >= 100) {
			num2 = number%1000/100;
			if (num2 == 1) {
				System.out.print("a");
			}
			if (num2 == 2) {
				System.out.print("aa");
			}
			if (num2 == 3) {
				System.out.print("aaa");
			}
			if (num2 == 4) {
				System.out.print("ab");
			}
			if (num2 == 5) {
				System.out.print("b");
			}
			if (num2 == 6) {
				System.out.print("ba");
			}
			if (num2 == 7) {
				System.out.print("baa");
			}	
			if (num2 == 8) {
				System.out.print("baaa");
			}	
			if (num2 == 9) {
				System.out.print("Fg");
			}	
		}
		
		
		if (number >= 1) {
			num4 = number%10;
			if (num4 == 1) {
				System.out.print("I");
			}
			if (num4 == 2) {
				System.out.print("II");
			}
			if (num4 == 3) {
				System.out.print("III");
			}
			if (num4 == 4) {
				System.out.print("IV");
			}
			if (num4 == 5) {
				System.out.print("V");
			}
			if (num4 == 6) {
				System.out.print("VI");
			}
			if (num4 == 7) {
				System.out.print("VII");
			}
			if (num4 == 8) {
				System.out.print("VIII");
			}
			if (num4 == 9) {
				System.out.print("IX");
			}
			
			
		}
	}
}
				
		
	
		
	

