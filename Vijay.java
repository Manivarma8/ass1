// Task-3;

// public class Calculator
// {

// public static void main(String[] args)
// {
// Calculator calc = new Calculator();
// calc.add();

// }
// public void add()
// {
// System.out.println(10+20);
// }

// }

//subtract()

//multiply()

//divide()


class Vijay{
	public static void main(String[] agr) {
		Vijay test = new Vijay();
		int add = test.calulatorsum(23,11);
		System.out.println("The addition of give value is " + add);
		int sub = test.calulatorsub(23,11);
		System.out.println("The addition of give value is " + sub);
		int multi =test.calulatormul(23,11);
		System.out.println("The addition of give value is " + multi);
		int divide = test.calulatordiv(23,11);
		System.out.println("The addition of give value is " + divide);
		int module = test.calulatormod(23,11);
		System.out.println("The addition of give value is " + module);
		}
	int calulatorsum(int a, int b) {
		int val = a + b;
		
		
		return val;
	}
	int calulatorsub(int a, int b) {
		return a - b;
	}
	int calulatormul(int a, int b) {
		return a * b;
	}
	int calulatordiv(int a, int b) {
		return a / b;
	}
	int calulatormod(int a, int b) {
		return a % b;
	}
}