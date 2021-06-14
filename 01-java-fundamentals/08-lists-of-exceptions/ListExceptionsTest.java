import java.util.ArrayList;

public class ListExceptionsTest {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        ListExceptions listExcept = new ListExceptions();
        listExcept.myListExceptions(myList);
    }
}
