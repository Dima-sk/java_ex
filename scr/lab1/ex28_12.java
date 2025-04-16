import java.util.Scanner;
class ex12
{
	static double a, b, c;
	public static double deg(double a) {
        return Math.exp(2 * Math.log(a));
    }
	public static double hyp(double a, double b){
		return c = Math.sqrt(deg(a) + deg(b));
		}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first katet: ");
		a = in.nextFloat();
		System.out.print("Input second katet: ");
		b = in.nextFloat();
		System.out.println("katet а=" + a);
		System.out.println("katet b=" + b);
		System.out.println("hypotenuse с=" + hyp(a, b));
		
	}
}