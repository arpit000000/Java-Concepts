//polymorphism can also be achieved at runtime. Such type of polymorphism is known as dynamic polymorphism.
//When we override a method in the child class, it should have the same signature as that of the parent class.
//The method should not have a weaker access modifier.
// Private methods are not overridden.
////No, in Java, you cannot change the return type of an overriding method when implementing a subclass.
class par1{
    public void add(){
        System.out.println("Add method parent");
    }
    //    public void add(int a,int b){
//        System.out.println("parent :"+(a+b));
//    }
    public void sum(){
        System.out.println("Sum method parent");
    }
}
class c1 extends par1{
    public void add(){
        System.out.println("Child 1");
    }
    public void mul(){
        System.out.println("Multiplex in c1");
    }
}
class c2 extends par1{
    public void add(){
        System.out.println("Child 2");
    }
    public void div(){
        System.out.println("div in c2");
    }
}
public class Overriding {
    public static void main(String[] args) {
        par1 obj1=new c1();
        obj1.add();
        obj1.sum();
        par1 obj2=new par1();
        obj2.sum();
        obj2.add();
        c2 obj3=new c2();
        obj3.add();
        obj3.div();
        obj3.sum();
//        c1 obj4= (c1) new par1();
//        obj4.add();
//        obj4.mul();
//        obj4.sum();
    }
}
