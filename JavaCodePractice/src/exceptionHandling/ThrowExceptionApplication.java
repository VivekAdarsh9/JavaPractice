package exceptionHandling;

class UserDefinedException extends Exception {

    public UserDefinedException(int age) {
        super();
    }



}

public class ThrowExceptionApplication {

    static void validate(int age) throws UserDefinedException {

        if (age > 18) {
            System.out.println("valid");
        } else {
            throw new UserDefinedException(age);
        }
    }

    public static void main(String[] args) {



    }
}
