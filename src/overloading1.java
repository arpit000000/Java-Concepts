//Polymorphism is the ability of an object to take different forms,
// i.e., a single action that can be performed in different ways. So, polymorphism means many forms.
//Polymorphism that gets resolved during compile time is known as static polymorphism called as Method overloading.
//Signature can differ by
//the number of parameters
//the data type of parameters
//the order of the parameters
class Par{
    public void show(){
        System.out.println("parent class paremeter");
    }
}
//Method overloading allows the programmer to have multiple methods with the same name
// in the same class, but differing in their signature.
public class overloading1 extends Par{
    public void show(){
        System.out.println("no paremeter");
    }
    public void show(int i,int j){
        System.out.println("paremeter :"+i+" "+j);
    }
    public static void main(String[] args) {
        overloading1 obj=new overloading1();
        obj.show();
        obj.show(3,5);
        Par obj1=new overloading1();
        obj1.show();
//        overloading1 obj2= (overloading1) new Par();
//        obj2.show();
//        obj2.show(4,7);


    }
}
