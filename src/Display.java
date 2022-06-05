import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Display {
static Scanner scan=new Scanner(System.in);
static Calculator calculate=new Calculator();
static SimpleCalculator simpCalculate;
static Map<Double,String> op=new TreeMap<>();

	public static void main(String[] args) {
		System.out.println(calculate.factorial.factorial(5));
		calculate.factorial.factorial(5);
	}
	public static double printresult() {
		return 0.0;
	}
	public static void clear() {
	}

}
