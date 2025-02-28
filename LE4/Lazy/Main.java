class Singleton{
    private static Singleton uniqueInstance;
    private Singleton(){
        System.out.println("Instance created");
    }
    public static Singleton getInstance()
    {
        if(uniqueInstance == null)
        uniqueInstance = new Singleton();
        else{
            System.out.println("can not create Instance");
        }
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