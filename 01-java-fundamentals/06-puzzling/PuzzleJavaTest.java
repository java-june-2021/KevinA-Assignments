import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJava = new PuzzleJava();

        int[] testSumArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        ArrayList<Integer> testAboveTen = pJava.sumArray(testSumArray);
        System.out.println(testAboveTen); // Done

        System.out.println(pJava.nameShuffle()); // Done, Question on i.length() line 33.

        System.out.println(pJava.alphabetFun()); // Done

        System.out.println(pJava.randomNumbers()); // Done

        System.out.println(pJava.randomNumbersSort());

        System.out.println(pJava.randomString());

        System.out.println(pJava.tenRandomStrings());

    }
}
