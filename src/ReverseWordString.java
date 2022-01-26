/**
 * Created by Mahesh on 24-01-2022.
 */
public class ReverseWordString {

    protected static String getReverseWordString(String input) {
        String[] inputs = input.split(" ");
        String finalString = "";
        for (String s : inputs) {
            int length = s.length();
            finalString = finalString + " ";
            for (int i = length - 1; i >= 0 ; i--) {
                finalString = finalString + s.charAt(i);
            }
        }
        return finalString;
    }
}
