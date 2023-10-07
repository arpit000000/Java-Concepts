package Exceptional_Handling;

public class Exception02 {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        finally {
            System.out.println("Hello");
        }
        System.out.println("Helo");
    }
}
