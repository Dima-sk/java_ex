import java.util.Scanner;
class ex13
{
	static double a, b, c;
	public static double deg(double a, double b) {
        return Math.pow(a,b);
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first katet: ");
		a = in.nextFloat();
		System.out.print("Input second katet: ");
		b = in.nextFloat();
		System.out.println("katet а=" + a);
		System.out.println("katet b=" + b);
		System.out.println("degree a^b =" + deg(a, b));
		
	}
}