
import java.util.Scanner;

public class ThinkSmart_Test2 {

    public static void main(String[] args) {
        String strName;
        char[] cChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int[] iChar = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        try (// input
                var in = new Scanner(System.in)) {
            System.out.print("Enter Name :");
            String strInput1 = in.next();
            System.out.print("Enter Surname :");
            String strInput2 = in.next();

            strName = strInput1 + ' ' + strInput2;
        }
        System.out.println("My name is\"" + strName + "\"");
        strName = strName.toLowerCase();

        // count
        for (int i = 0; i < strName.length(); i++) {
            for (int j = 0; j < cChar.length; j++) {
                if (cChar[j] == strName.charAt(i)) {
                    iChar[j] = iChar[j] + 1;
                }
            }
        }

        // Result
        for (int k = 0; k < cChar.length; k++) {
            System.out.println("'" + cChar[k] + "' = " + String.valueOf(iChar[k]));

        }

    }

}