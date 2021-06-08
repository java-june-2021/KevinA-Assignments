import java.lang.Math;
public class PythagoreanTheorem {
    public String calculateHypotenuse(int legA, int legB) {
        calculateHypotenuse(4, 3);
        double hypotenuse = Math.sqrt((legA*legA)+(legB*legB));
        return "The length of the hypotenuse is: " + hypotenuse;
    }
}

