import java.util.ArrayList;

public class ListExceptions {
    public void myListExceptions(ArrayList<Object> myArray) {

        for (int i = 0; i < myArray.size(); i++) {
            try {
                Integer castedValue = (Integer) myArray.get(i);
                System.out.println(myArray.get(i) + " was casted successfully!");
            } catch (ClassCastException e) {
                System.out.println("Error! " + myArray.get(i) + " was not able to be casted.");
            }
        }
    }
}
