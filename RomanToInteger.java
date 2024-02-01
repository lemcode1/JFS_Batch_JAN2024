// WAP to convert roman number to integer number
public class RomanToInteger {
    // Input : VI  == 1 + 5 == 6
    // Input : IV  == 5 - 1 == 4
    // I,V, X, L, C, M, D
    public static int numericValueFromChar(char roman) {
        if (roman == 'I') {
            return 1;
        } else if(roman == 'V') {
            return 5;
        } else if(roman == 'X') {
            return 10;
        } else if(roman == 'L') {
            return 50;
        }
        else if(roman == 'C') {
            return 100;
        }
        else if(roman == 'D') {
            return 500;
        }
        else if(roman == 'M') {
            return 1000;
        } else {
            return -1;  // invalid input
        }
    }

    public static int romanToInteger(String romanValue) { // XIV
        int resultSum = 0;
         for(int i=0; i<romanValue.length() ; i++) {
             int ch1Value = numericValueFromChar(romanValue.charAt(i)); // I
             if (i+1 < romanValue.length()) {
                 int ch2Value = numericValueFromChar(romanValue.charAt(i+1)); // V
                 if (ch1Value >= ch2Value) {
                     resultSum = resultSum + ch1Value;
                 } else {
                     resultSum = resultSum - ch1Value;
                 }
             } else {
                 resultSum = resultSum + ch1Value;
             }

//             if (ch1Value != -1) {
//                 resultSum = resultSum + ch1Value;
//             } else {
//                 resultSum = -1;
//                 break;
//             }
         }
         return resultSum;
    }
    public static void main(String []args) {
        int finalIntValue = romanToInteger("IVX");
        if(finalIntValue!= -1) {
            System.out.println("Roman number is :"+finalIntValue);
        } else {
            System.out.println("You have provider invalid input");
        }
    }
}
