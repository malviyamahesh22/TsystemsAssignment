/**
 * Created by Mahesh on 24-01-2022.
 */
public class ValidNumInArray {

    protected static void checkValidNum(String[] input) {

        for (int i = input.length -1 ; i>=0 ; i--) {
            try {
                Double.parseDouble(input[i]);
                System.out.println("index =" + i + " and number ="+input[i]);
            } catch (NumberFormatException ex) {

            }
        }

    }
}
