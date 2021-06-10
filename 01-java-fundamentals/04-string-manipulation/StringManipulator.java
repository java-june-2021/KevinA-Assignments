public class StringManipulator{
    public static String trimAndConcat(String string1, String string2){
        return string1.trim() + string2.trim();
    }

    public static Integer getIndexOrNull(String string, char character){
        if (string.indexOf(character) < 0) {
            return null;
        } 
        else {
            return string.indexOf(character);
        }
    }

    public static Integer getIndexOrNull(String string1, String string2){
        int indx = string1.indexOf(string2);
        if (indx > -1){
            return indx;
        }
        return null;
    }

    public static String concatSubstring(String string1, int int1, int int2, String string2){
        return string1.substring(int1, int2) + string2;
    }

}