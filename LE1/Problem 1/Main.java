
public class Main{
    public static void main (String[] args) 
    {
        Mother m = new Mother();
        m.show("Calling Mother....from m");
        Child ch = new Child();
        ch.show("Calling Mother....from ch");
    }
}
