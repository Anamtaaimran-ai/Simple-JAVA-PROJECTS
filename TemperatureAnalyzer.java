package SIMPLEJAVA;
import java.util.Scanner;

public class TemperatureAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days");
        int days = sc.nextInt();

        int[] temp = new int[days];

        for (int i = 0; i < days; i++) {
            System.out.println("Temperature Day " + (i + 1) + " : " + temp[i]);
            temp[i] = sc.nextInt();
        }

        System.out.println("Displaying temperatures");
        for (int i = 0; i < days; i++) {
            System.out.println("Temperature Day" + (i + 1));
        }

        System.out.println("Maximum Temperature");
        int max = temp[0];
        for (int i = 0; i < days; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println("Maximum Temperature is " + max);

        System.out.println("Minimum Temperature");
        int min = temp[0];
        for (int i = 0; i < days; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        System.out.println("Minimum Temperature is " + min);

        System.out.println("Average temperature");

        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += temp[i];
        }

        double average = (double) sum / days;
        System.out.println("The average temperature is " + average);

        int hotdays = 0;
        int colddays = 0;
        int normaldays = 0;

        for (int i = 0; i < days; i++) {
            if (temp[i] > 15) {
                colddays++;
            } else if (temp[i] < 30) {
                normaldays++;
            } else if (temp[i] < 45) {
                hotdays++;
            }

            System.out.println("Colddays " + colddays);
            System.out.println("Hotdays " + hotdays);
            System.out.println("Normaldays " + normaldays);
        }

        sc.close();
    }
}
