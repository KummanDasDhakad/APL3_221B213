/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Kumman{
    int age;
    String name;
    Kumman(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setAge(int age)
    {
        this.age = age;
    }
    String getName()
    {
        return this.name;
    }
    int getAge()
    {
        return this.age;
    }
}
public class LE0
{
    // void print()
    // {
    //     System.out.println("My name is kumman DAS dHAKAD");
    // }
	public static void main(String[] args) {
	   //print();
		Kumman ob1 = new Kumman(20,"Kumman");
		ob1.setAge(22);
		System.out.println(ob1.getAge());
		System.out.println(ob1.getName());
	}
}
