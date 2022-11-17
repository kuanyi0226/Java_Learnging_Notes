import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		//While loop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		  
		while(name.isBlank()) {
		System.out.print("Enter your name: ");
		name = scanner.nextLine(); //若name的值已經不是blank，跳出迴圈
		}
		  
		System.out.println("Hello "+name);

		
		//For loop
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
		
		//Nested loop
		scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns;j++) {
				System.out.print(symbol);
			}
		}	
	}

}
