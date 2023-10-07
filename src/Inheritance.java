//this is used to refer to the current instance and can be used for disambiguating variables or calling other constructors within the same class,
// while super is used to refer to the superclass and access its constructors or members when working with inheritance in Java.
class Parent{
    private String cust_name;
    private int cust_Id;
    Parent(){
        System.out.println("Default constructor");
    }
    Parent(String name,int id){
        this();
        System.out.println("parent constructor");
        cust_name=name;
        cust_Id=id;
    }
    public void display(){
        System.out.println("Name :"+cust_name);
        System.out.println("Id :"+cust_Id);
    }
}
//Hirarchical Inheritance
class child1 extends Parent{
    int day;
    child1(int day){
        this.day=day;
    }
    public void Show(){
        System.out.println("Hirarchical :"+day);
    }
}
public class Inheritance extends Parent{
    public static int roll;

    Inheritance(String name,int id,int roll){
        super(name,id);
        roll=roll;

    }
    public static void main(String[] args) {
        Inheritance obj=new Inheritance("Arpit",03,0001);
        obj.display();
        System.out.println(Inheritance.roll);
        child1 obj1=new child1(7);
        obj1.Show();
    }
}
