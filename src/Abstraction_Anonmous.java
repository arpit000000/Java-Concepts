//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//If there is an abstract method in a class, that class must be abstract.
// this means the parent class Customer will not have any implementation for the payBill method but we need to enforce that the child classes implement the payBill() method.
abstract class Abs{
    //It can have abstract and non-abstract methods.
    public void Big(){
        System.out.println("How are you ?");
    }
     abstract void greet();
}
public class Abstraction_Anonmous extends Abs{
    void guppi(){
        System.out.println("Dueee");
    }
    //No, you cannot change the signature of an abstract method when implementing it in a subclass.
    void greet(){
        System.out.println("Hello Arpit");
    }
    public static void main(String[] args) {
        //it shown Error
        //methods cannot be defined within other methods. Instead, methods should be defined within the class body, outside of other methods.
//        void greet(){
//            System.out.println("Hello Arpit");
//        }
        Abstraction_Anonmous obj1=new Abstraction_Anonmous();
        obj1.greet();
        obj1.Big();
        obj1.guppi();
        //A class is created, but its name is decided by the compiler, which extends the Person class and provides the implementation of the eat() method.
        Abs obj=new Abs() {
            //Anonmous class
            //Java anonymous inner class is an inner class without a name and for which only a single object is created.
            @Override
            void greet() {
                System.out.println("Second Hello");
            }
        };
        obj.Big();
        obj.greet();

    }
}
