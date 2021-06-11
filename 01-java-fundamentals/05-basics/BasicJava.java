import java.util.ArrayList;

public class BasicJava {
    public void print255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void arrayIteration(int[] myArray) {
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    public void findMaxArray(int[] myArray1) {
        int max = myArray1[0];
        for (int i : myArray1) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] myArray2) {
        double sum = 0;
        for (int i : myArray2) {
            sum += i;
        }
        double average = 0;
        average = sum / myArray2.length;
        System.out.print(average);
    }

    public ArrayList array255Odd() {
        ArrayList<Integer> j = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            j.add(i);
        }
        return j;
    }

    public int greaterThanY(int[] myArray, int y) {
        int sum = 0;
        for (int i : myArray) {
            if (i > y) {
                sum++;
            }
        }
        return sum;
    }

    public int[] squaredValues(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] * myArray[i];
        }
        return myArray;
    }

    public int[] noNegativeValues(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = 0;
            }
        }
        return myArray;
    }

    public int[] maxMinAvg(int[] myArray) {
        int max = myArray[0];
        int min = myArray[0];
        int sum = myArray[0];
        int avg = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
            sum += myArray[i];
        }
        avg = sum / myArray.length;
        int[] newArray = { max, min, avg };
        return newArray;
    }

    public int[] shiftValues(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        myArray[myArray.length - 1] = 0;
        return myArray;
    }

}
