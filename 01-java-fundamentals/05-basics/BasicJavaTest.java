import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava bJava = new BasicJava();

        bJava.print255(); // Done

        bJava.printOdd255(); // Done

        bJava.printSum(); // Done

        int[] testArray = { 1, 3, 5, 7, 9, 13 };
        bJava.arrayIteration(testArray); // Done

        int[] testArray1 = { 1, 3, 5, 7, 9, 13 };
        bJava.findMaxArray(testArray1); // Done
        int[] testArray2 = { -5, -7, -12, -3, 0, 17, 3, 5, 7 };
        bJava.findMaxArray(testArray2); // Done

        int[] testArray3 = { 2, 10, 3, 20, 40, 23 };
        bJava.getAverage(testArray3); // Done with double variable to show actual average.

        ArrayList<Integer> oddArrList = new ArrayList<Integer>(); // Done
        oddArrList = bJava.array255Odd();
        System.out.println(oddArrList); // Done

        int[] testArrOverY = { 1, 3, 5, 7, 9 };
        int sumResults = bJava.greaterThanY(testArrOverY, 3);
        System.out.println(sumResults); // Done

        int[] testArrSquared = { 1, 5, 10, -2 };
        bJava.squaredValues(testArrSquared);
        System.out.println(Arrays.toString(testArrSquared)); // Done, but I have a question on this one.

        int[] testNoNegative = { 1, 5, 10, -2 };
        int[] resultNoNeg = bJava.noNegativeValues(testNoNegative);
        System.out.println(Arrays.toString(resultNoNeg)); // Done, same question as above.

        int[] testMaxMinAvg = { 1, 5, 10, -2 };
        int[] maxMinAvgResult = bJava.maxMinAvg(testMaxMinAvg);
        System.out.println(Arrays.toString(maxMinAvgResult));

        int[] testShiftValues = { 1, 5, 10, 7, -2 };
        bJava.shiftValues(testShiftValues);
        System.out.println(Arrays.toString(testShiftValues));

    }

}
