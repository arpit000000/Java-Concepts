public class default_value {
    static int a;//instance var
    //a=9;//Assignments should typically be placed inside a method or a static block.
    public static void main(String[] args) {
        int b;//local var
        a=9;
        System.out.println(a*5);
        //System.out.println(b*3);Error

//default values are not applicable to the variables declared inside a method.
    }
}
