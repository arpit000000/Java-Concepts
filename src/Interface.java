//It is used to achieve abstraction.
//By interface, we can support the functionality of multiple inheritance.
// It can be used to achieve loose coupling.
/*all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default.
A class that implements an interface must implement all the methods declared in the interface.*/
interface Dreawable{
    //constructor is not allowed in interface
    void draw();
    static void meth(){
        System.out.println("This is static interface method");
    }
}
public class Interface implements Dreawable{
    //Interface can have only abstract methods,static and default
    public void draw(){
        System.out.println("Hello abstract method");
    }
    public static void main(String[] args) {
       Interface obj=new Interface();
       obj.draw();
       Dreawable.meth();
       //cannot create object of interface
       Dreawable obj1=new Dreawable() {
           @Override
           public void draw() {
               System.out.println("Anonmous class");
           }
       };
       obj1.draw();

    }

}
