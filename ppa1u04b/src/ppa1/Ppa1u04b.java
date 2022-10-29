package ppa1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Vazač
 * @version 0.1
 */
public class Ppa1u04b {
    /**
     * Vstupní metoda
     * @param args
     */
    public static void main(String[] args) {

        List<Double> inputList = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        int i= 0;
        double input = sc.nextDouble();
        while(input != 0){
            i++;
            inputList.add(input);

            java.lang.String line = i + ";" + String.format(Locale.US, "%.2f", inputList.get(i-1))  + ";";
            if (i > 3){
                line += ((inputList.get(i-1) * 4 + inputList.get(i - 2) * 3) + inputList.get(i - 3) * 2 + inputList.get(i - 4))/ 10;
            }
            System.out.println(line);

            input = sc.nextDouble();
        }
        sc.close();

    }
}
