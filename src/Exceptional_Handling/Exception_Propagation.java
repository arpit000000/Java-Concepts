package Exceptional_Handling;
//By default, Checked Exceptions are not forwarded in calling chain (propagated).
public class Exception_Propagation {
    void m(){
        int data=5/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            m();
        }
        catch (ArithmeticException e){
            System.out.println("exception handeled");
        }
    }

    public static void main(String[] args) {
        Exception_Propagation obj=new Exception_Propagation();
        obj.p();
        System.out.println("Normal flow");

    }
}
