
public class Review01 {

	public static void main(String[] args) {
		int price= 2000;
        double intax =gettax(2000,10);

	System.out.println(price + "円の税込価格は"+((int)(intax+price))+"（消費税は"+ (int)intax + "円）です。");
	}

	public static double gettax(double num1, double num2){
		    double result = num1*(num2/100);
		    return result;
}
}
