class Singleton{
    private static Singleton uniqueInstance = new Singleton();;
    private Singleton(){
        System.out.println("Instance created");
    }
    public static Singleton getInstance()
    {
        return uniqueInstance;
    }
}
public class Main
{
	public static void main(String[] args) {
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		Singleton ob3 = Singleton.getInstance();
	}
}