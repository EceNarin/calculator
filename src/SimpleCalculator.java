
public class SimpleCalculator extends Calculator {
 static double operand1;
 static double operand2;
 char operator;//+,-,/,*
 public SimpleCalculator(double o1, double o2, char operator) {
	this.operand1=o1;
	this.operand2=o2;
	this.operator=operator;
 }
 public static double substraction() {
	double resultSub= operand1-operand2;
	 return resultSub;
 }
 public static double addition() {
	 double resultAdd=operand1+operand2;
	 return resultAdd;
 }
 public static double multiplication() {
	 double resultMult=operand1*operand2;
	 return resultMult;
 }
 public static double division() {
	 double resultDiv=operand1/operand2;
	 return resultDiv;
 }
}
