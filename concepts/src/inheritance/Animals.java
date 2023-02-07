package inheritance;
//To refer immediate parent class instance variable
 class Animals {
	 String color ="white";
 }
 
 class Dogs extends Animals{
	 String color ="black";
	 
	 void printColor() {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
 }
 
 class Animalss{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d = new Dogs();
		d.printColor();
	}

}
