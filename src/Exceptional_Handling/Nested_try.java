package Exceptional_Handling;
//If you don't handle the exception, before terminating the program, JVM executes finally block (if any).
import java.io.IOException;
//For each try block there can be zero or more catch blocks, but only one finally block
//The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).
public class Nested_try {
    public static void main(String[] args) {
        try{
            System.out.println(5/2);
            try{
                System.out.println(4/0);
                try{
                    int arr[]=new int[5];
                    System.out.println(arr[8]);
                }
                catch(ArithmeticException e){
                    System.out.println("Inner try block");
                    System.out.println(e);
                }
                finally {
                    System.out.println("this is inner finally");
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Outer catch");
                System.out.println(e);
            }
            finally {
                System.out.println("outer finally");
            }
        }
        catch (Exception e){
            System.out.println("Main catch");
            System.out.println(e);
        }
        finally {
            System.out.println("main finally");
        }
    }
}
