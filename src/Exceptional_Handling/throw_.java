/*package Exceptional_Handling;
import java.io.BufferedReader;
import java.io.FileReader;
//If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.
// Every subclass of Error and RuntimeException is an unchecked exception in Java. A checked exception is everything else under the Throwable class.
public class throw_ {
    public static void file() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
    }


        throw new FileNotFoundException();

    //Unchecked exception
    public static void test(int n){
        if(n<18){
            throw new ArithmeticException("Age is less");
        }
        else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        throw_.test(4);
        System.out.println("Rest of the code");

    }
}
 */
