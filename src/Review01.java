
public class Review01 {

	public static void main(String[] args) {
		int price= 1000;
		int tax = 10;
        double intax =tax(price,tax);

	System.out.println(price + "円の税込価格は"+((int)(intax+price))+"（消費税は"+ (int)intax + "円）です。");
	}

	public static double tax(double num1, double num2){
		    double result = num1*(num2/100);
		    return result;
}
}
