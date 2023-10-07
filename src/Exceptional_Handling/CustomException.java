package Exceptional_Handling;
// we can create our own exceptions that are derived classes of the Exception class.
// Creating our own Exception is known as custom exception or user-defined exception.
// Basically, Java custom exceptions are used to customize the exception according to user need.
//public class ageException extends Exception{
//    public ageException(String str){
//        super(str);
//    }
//}
//public class CustomException {
//    public static void validate(int n)throws ageException{
//        if(n<18){
//            throw new ageException("You are not eligible for vote");
//        }
//        else{
//            System.out.println("You are eligible to vote");
//        }
//    }
//
//    public static void main(String[] args) {
//        try{
//            validate(7);
//        }
//        catch (ageException e){
//            System.out.println("Exception caught "+e);
//        }
//        System.out.println("Rest of the code");
//    }
//}
