import java.util.Scanner;
public class ex28_1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input surname: ");
		String surname = in.nextLine();
		System.out.print("Input name: ");
		String name = in.nextLine();
		System.out.print("Input patronymic: ");
		String patronymic = in.nextLine();
		System.out.printf("Hallo %s %s %s \n", surname, name, patronymic);
		in.close();
	}
}