package inheritance;
//To invoke immediate parent class constructor
class Aanimal{
	Aanimal(){
		System.out.println("animal is created ");
	}
}

class Ddog extends Aanimal{
	Ddog(){
		super();
		System.out.println("dog is created");
	}
}
class Aanimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ddog d = new Ddog();
	}

}
