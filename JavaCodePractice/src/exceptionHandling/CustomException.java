package exceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ItemNotPresentException extends Exception {

    public ItemNotPresentException(String msg) {
        // System.out.println("ItemNotFoundException");
        super(msg);
    }

}

public class CustomException {

    public static void validateNumber(List ls, int number) throws ItemNotPresentException {

        if (ls.contains(number)) {
            System.out.println("Item Present in ArrayList");
        } else {
            throw new ItemNotPresentException("Item is not there buddy!");
        }

    }

    public static void main(String[] args) {

        List ls = Arrays.asList(1, 2, 3, 4, 5, 6);

        try {
            validateNumber(ls, 8);
        } catch (Exception e) {

            System.out.println(e);

        }

    }
}
