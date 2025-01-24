
public class Main{
    public static void main (String[] args) 
    {
        Mother m = new Mother();
        Mother m1 = new Mother();
        m1.show();
        Child ch = new Child();
        ch.show();
    }
}
//opt1 : hello world
//opt2 : error: show() in Child cannot override show() in Mother (Can not override static functions)
//opt3 : error: show() in Child cannot override show() in Mother
//opt4 : Hello world (Static methods are inharitable)/
//opt5 : (1) Hello World (2) Hello Juet