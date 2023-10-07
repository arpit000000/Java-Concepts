package Exceptional_Handling;
/*The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
so that the normal flow of the application can be maintained.*/
/*1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions.
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.*/
public class Exceptional01 {
    static int n=5;
    static int m=0;
    public static void main(String[] args) {
        try{
            int arr[]=new int[3];
            System.out.println(n/m);
            System.out.println(arr[43]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(n/(m+1));
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
