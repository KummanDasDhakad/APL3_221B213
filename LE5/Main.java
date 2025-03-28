public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("For Whiskey:");
		Beverage b = new Whiskey();
		b.templateMethod(30);
		System.out.println();
		
		System.out.println("For Rum:");
		b = new Rum();
		b.templateMethod(50);
		System.out.println();
		
		System.out.println("For Beer:");
		b = new Beer();
		b.templateMethod(100);
	}
}
