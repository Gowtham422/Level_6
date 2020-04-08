package inheritance;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		
		
		 a = new Animal();
		 a.WhoAmI();
		 
		 a = new Dog();
		 a.WhoAmI();

		 a = new Cat();
		 a.WhoAmI();
		
	}

}
