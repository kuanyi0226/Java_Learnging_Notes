import java.util.Scanner; //引入Scanner Class

public class input {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name= scanner.nextLine(); //輸入結果存入name
		System.out.println("Hello "+name);

		System.out.println("How old are you?");
		int age= scanner.nextInt();
		System.out.println("I'm "+age+" as well.");
	}

}
