//final method cannot be overridden
//finalfield value cannot be changed once it initialized;
//final class cannot be subclass
class value{
    final int n;
    //If a final variable is not initialized during declaration,
    // it is known as blank final variable. We can initialize a blank final variable only in the constructor
    value(int n){
        this.n=n;
    }
    final void meth(){
        System.out.println("hello");
    }


}
public class final_key extends value{
    final_key(){
        super(7);
    }
//    @Override
//    void meth(){
//        System.out.println("Bye");
//    }
    public static void main(String[] args) {
        value obj=new value(5);
        System.out.println(obj.n);
    }
}
