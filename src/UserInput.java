import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("What's your Name? ");
		Scanner name = new Scanner(System.in);
		String Name =name.nextLine();
		System.out.println("Hello " + Name);

	}

}
