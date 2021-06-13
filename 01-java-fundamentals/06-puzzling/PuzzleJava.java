import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the
    // sum of all numbers in the array.
    // Also have the function return an array that only includes numbers that are
    // greater than 10 (e.g. when you pass
    // the array above, it should return an array with the values of 13,25,32)

    public ArrayList<Integer> sumArray(int[] arr) {
        int sum = 0;
        int temp = 0;
        ArrayList<Integer> aboveTen = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            if (arr[i] > 10) {
                temp = arr[i];
                aboveTen.add(temp);
            }
        }
        System.out.println(sum);
        return aboveTen;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi,
    // Momochi, Ishikawa. Shuffle the array and // print the name of each person.
    // Have the method also return an array with names that are longer than 5
    // characters.

    public ArrayList<String> nameShuffle() {
        ArrayList<String> allNames = new ArrayList();
        allNames.add("Nancy");
        allNames.add("Jinichi");
        allNames.add("Fujibayashi");
        allNames.add("Momochi");
        allNames.add("Ishikawa");
        ArrayList<String> overFiveNames = new ArrayList();
        Collections.shuffle(allNames);
        for (String i : allNames) {
            System.out.println(i);
            if (i.length() > 5) {
                overFiveNames.add(i);
            }
        }
        return overFiveNames;
    }

    // Create an array that contains all 26 letters of the alphabet (this array must
    // have 26 values). Shuffle the array
    // and, after shuffling, display the last letter from the array. Have it also
    // display the first letter of the
    // array. If the first letter in the array is a vowel, have it display a
    // message.

    public ArrayList alphabetFun() {
        ArrayList<Character> alphabetList = new ArrayList();
        for (char chr = 'a'; chr <= 'z'; chr++) {
            alphabetList.add(chr);
        }
        Collections.shuffle(alphabetList);
        System.out.println("The last letter in the array is: " + alphabetList.get(25));
        System.out.println("The first letter in the array is: " + alphabetList.get(0));
        if (alphabetList.get(0) == 'a' || alphabetList.get(0) == 'A' || alphabetList.get(0) == 'e'
                || alphabetList.get(0) == 'E' || alphabetList.get(0) == 'i' || alphabetList.get(0) == 'I'
                || alphabetList.get(0) == 'o' || alphabetList.get(0) == 'O' || alphabetList.get(0) == 'u'
                || alphabetList.get(0) == 'U') {
            System.out.print("The First Letter in the Array is a Vowel");
        } else {
            System.out.print("The First Letter in the Array is NOT a Vowel");
        }
        return alphabetList;
    }

    // Generate and return an array with 10 random numbers between 55-100.

    public ArrayList randomNumbers() {
        Random r = new Random();
        ArrayList<Integer> numberList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            numberList.add(r.nextInt(45) + 55);
        }
        return numberList;
    }

    // Generate and return an array with 10 random numbers between 55-100 and have
    // it be sorted (showing the smallest number in the beginning). Display all the
    // numbers in the array. Next, display the minimum value in the array as well as
    // the maximum value.

    public ArrayList randomNumbersSort() {
        Random r = new Random();
        ArrayList<Integer> numberArr = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            numberArr.add(r.nextInt(45) + 55);
        }
        Collections.sort(numberArr);
        System.out.println("The Lowest Number in the Array will be: " + numberArr.get(0));
        System.out.println("The Highest Number in the Array will be: " + numberArr.get(9));
        return numberArr;
    }

    // Create a random string that is 5 characters long.

    public String randomString() {
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 5;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphaNumeric.length());
            char randomChar = alphaNumeric.charAt(index);
            sb.append(randomChar);
        }
        String randomStringOut = sb.toString();
        return randomStringOut;
    }

    // Generate an array with 10 random strings that are each 5 characters long

    public ArrayList tenRandomStrings() {
        ArrayList<String> randomStrings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            randomStrings.add(randomString());
        }
        return randomStrings;
    }

}
