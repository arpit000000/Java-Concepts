//Java Nested Interface
//The nested interface must be public if it is declared inside the interface, but it can have any access modifier if declared within the class.
interface outer{
    interface inner{
        void msg();
    }
}

public class inner_static implements outer.inner{
    public void msg(){
        System.out.println("inner interface method");
    }
    static int data=30;
    int d1=65;
    static class inner{
        static void msg(){
            System.out.println("Static inner class static method "+data);
            //System.out.println(d1); NonStatic
        }
        void msg1(){
            System.out.println("Static inner class non_static method "+data);
        }
    }

    public static void main(String[] args) {
        inner_static.inner obj=new inner_static.inner();
        obj.msg1();
        inner_static.inner.msg();//no need to create the instance of static nested class
        outer.inner mess=new inner_static();//upcasting
        mess.msg();
    }
}
