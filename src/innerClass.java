//Java inner class or nested class is a class that is declared inside the class or interface.
//it can access all the members (data members and methods) of the outer class, including private.
//two types of nested classes non-static and static nested classes.
//non-static nested classes are also known as inner classes.
//inner class types-
//Member inner class A class created within class and outside method.
//Anonymous inner class A class created for implementing an interface or extending class. The java compiler decides its name.
//Local inner class A class was created within the method.
//Static Nested Class	A static class was created within the class.
//Nested Interface	An interface created within class or interface
public class innerClass {
    private int a=10;
    public class inner{
        private int b=5;
        void meth(){
            System.out.println("Member Inner class method "+a);

        }
    }
    //Java local inner class
    void display(){
        //Local variables can't be private, public, or protected.
       // private int d=56;
        class Local{
            private int c=6;
            void meth1(){
                System.out.println("Local inner class "+a);
            }
        }
        Local l1=new Local();
        l1.meth1();
        System.out.println(l1.c);
    }

    public static void main(String[] args) {
        innerClass obj=new innerClass();
        innerClass.inner obj1=obj.new inner();
        obj1.meth();
        System.out.println(obj1.b);
        System.out.println(obj.a);
        obj.display();

    }
}
