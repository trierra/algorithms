package misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trierra on 9/26/16 for
 * algorithms.
 */
public class ArabicToRoman {
    //TODO: Complete problem
    Map<Integer, String> numbers = new HashMap();

    public ArabicToRoman() {
        numbers.put(1, "I");
        numbers.put(5, "V");
        numbers.put(10, "X");
        numbers.put(50, "L");
        numbers.put(100, "C");
        numbers.put(500, "D");
        numbers.put(1000, "M");
    }

    public String toRoman(Integer num) {
        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        int reminder = 0;

        thousands = num / 1000;
        reminder = num % 1000;
        hundreds = reminder / 100;
        tens = reminder % 100 / 10;
        ones = reminder % 100 % 10;

        System.out.println(thousands + " " + hundreds + " " + tens + " " + ones);

        StringBuilder result = new StringBuilder();

        if (thousands > 0) {
            if (thousands % 5 == 0) {
                while (thousands > 0) {
                    result.append(numbers.get(1000));
                    thousands--;
                }
            } else {

            }
        }
        if (hundreds > 0) {
            if (hundreds % 5 == 0) {
                while (hundreds > 0) {
                    result.append(numbers.get(100));
                    hundreds--;
                }
            } else {
                result = fivePlus(hundreds, result);
//                if(hundreds > 5 && 10 - hundreds > 1){
//                    result.append(numbers.get(500));
//                    hundreds = hundreds -5;
//                    while (hundreds > 0){
//                        result.append(100);
//                        hundreds--;
//                    }
//                }
            }
        }

        if (tens > 0) {
            if (tens * 10 % 10 == 0) {
                while (tens > 0) {
                    result.append(numbers.get(10));
                    tens--;
                }
            }
        }


        System.out.println(result.toString());

        return null;
    }

    private StringBuilder fivePlus(Integer num, StringBuilder result) {
        if (num > 5 && 10 - num > 1) {
            result.append(numbers.get(500));
            num = num - 5;
            while (num > 0) {
                result.append(100);
                num--;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        ArabicToRoman arabicToRoman = new ArabicToRoman();
        arabicToRoman.toRoman(2700);
    }
}
