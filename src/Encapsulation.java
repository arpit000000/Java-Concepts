//Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
class Human{
    private int id;
    private String name;
    public void get_id(){
        System.out.println(id);
    }
    public void get_name(){
        System.out.println(name);
    }
    public void set_id(int id){
        this.id=id;
    }
    public void set_name(String name){
        this.name=name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.set_id(13);
        obj.set_name("pp");
        obj.get_id();
        obj.get_name();
    }

}
