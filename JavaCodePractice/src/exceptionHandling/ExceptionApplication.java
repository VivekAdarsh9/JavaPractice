package exceptionHandling;

public class ExceptionApplication {
    public static void main(String[] args) {
        System.out.println("Exception Handling Practice");
        try {
            int a[] = new int[10];
            System.out.println(a[11]);
            System.out.println(25/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}