public class Main
{
	public static void main(String[] args) {
	    Offering o1 = new Coffee();
	    o1 = new Rum(o1);
		System.out.println(o1.getName() + " at Rs." + o1.getPrice());
		
		Offering o2 = new Tea();
	    o2 = new Rum(o2);
		System.out.println(o2.getName() + " at Rs." + o2.getPrice());
		
		Offering o3 = new Coffee();
	    o3 = new Gin(o3);
		System.out.println(o3.getName() + " at Rs." + o3.getPrice());
		
		Offering o4 = new Tea();
	    o4 = new Gin(o4);
		System.out.println(o4.getName() + " at Rs." + o4.getPrice());
	}
}
