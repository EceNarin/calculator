import java.util.stream.IntStream;

public class CalculatedFactorial extends SciencetificCalculator {
	
	public CalculatedFactorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static double factorial(double n) {
		return IntStream.rangeClosed(1,(int) n).reduce(1, Math::multiplyExact);
	}

}
