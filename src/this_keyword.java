class A{
    A(){
        //this() : to invoke current class constructor
        this(5);
        System.out.println("Default Constructor");
    }
    A(int a){

        System.out.println("Parameterized Constructor :"+a);
    }
    int age;
    String name;
    int roll;
    //this: to refer current class instance variable
    void set(int age,String name,int r){
        this.age=age;
        this.name=name;
        roll=r;//not required this
        //this: to invoke current class method
        this.get();//it same as get();
    }
    void get(){
        System.out.println(this.age+" "+this.name);
    }
    void m(A obj){
        System.out.println("Method is invoked");
    }
    //this: to pass as an argument in the method
    void p(){
        m(this);
    }

}
public class this_keyword {
    public static void main(String[] args) {
        A obj=new A();
        obj.set(20,"Arpit",4);
        obj.p();


    }
}
