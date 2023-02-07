
public class ArithmeticOperation {

	public static void main(String[] args) {
    int num1 = 100;
    int num2 = 10;
    int [] result = new int[5];
    result[0] = num1 + num2;
    System.out.println("num1 + num2 = " + result[0]);
    result[1] = num1 - num2;
    System.out.println("num1 - num2 = " + result[1]);
    result[2] = num1 * num2;
    System.out.println("num1 * num2 = " + result[2]);
    result[3] = num1 / num2;
    System.out.println("num1 / num2 = " + result[3]);
    result[4] = num1 % num2;
    System.out.println("num1 % num2 = " + result[4]);
	}

}
