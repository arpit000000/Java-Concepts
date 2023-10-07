// parameters can be passed to methods using two main techniques: pass-by-value and pass-by-reference.
//Java only supports pass-by-value, but this can behave somewhat like pass-by-reference when working with objects.
class Person{
    String name;
    public Person(String name){
        this.name=name;
    }
}
public class Parameter {
    public static void main(String[] args) {
        int x=10;
        System.out.println("Before calling :"+x);
        change(x);//Pass-by-Value:
        // When you pass a primitive type to a method, a copy of the value is made, and changes to the parameter inside the method do not affect the original value.
        System.out.println("After calling :"+x);
        Person obj=new Person("Arpit");
        System.out.println("Before calling :"+obj.name);
   //     In Java, objects are also passed by value. However, the value being passed is actually a reference to the object in memory. This means that if you modify the state of the object inside a method, those changes will be reflected outside the method.
        modify(obj);
        System.out.println("After calling :"+obj.name);



    }
    public  static void change(int x){
        x=20;
        System.out.println("Value inside method :"+x);
    }
    public static void modify(Person p){
        p.name="Madhav";
        System.out.println("Inside method :"+p.name);
    }
}
