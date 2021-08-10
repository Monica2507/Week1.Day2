package Week1.Day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int sum = obj.add();
		int sub = obj.sub();
		double mult = obj.mul();
		float divi = obj.divide();
		System.out.println("Sum of the given numbers is= " + sum);
		System.out.println("Substraction of the given numbers is= " + sub);
		System.out.println("Multiplication of the given numbers is= " + mult);
		System.out.println("Division of the given numbers is= " + divi);
	}

}
