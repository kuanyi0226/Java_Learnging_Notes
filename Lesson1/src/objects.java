
public class objects {
	//objects: An instance of class that may contain methods or attributes 
	public static void main(String[] args) {
		Car myCar1 = new Car(); //從其他檔案叫出class
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
		
		
		//constructor: special method that is called when an object
		//             is instantiated(created)
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
			
		human1.drink();
		human2.eat();
	
	}

}

