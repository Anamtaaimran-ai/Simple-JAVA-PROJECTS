package SIMPLEJAVA;
import java.util.Scanner;

public class VOTINGSYSTEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of candidates:");
        int num = sc.nextInt();
        sc.nextLine();

        String[] name = new String[num];
        int[] id = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of candidate " + (i + 1) + ":");
            name[i] = sc.nextLine();
            System.out.println("Enter the ID of candidate " + (i + 1) + ":");
            id[i] = sc.nextInt();
            sc.nextLine();
        }

        int MOON = 0, STARS = 0, EARTH = 0, WATER = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("\nHello " + name[i] + ", please vote:");
            System.out.println("1. MOON");
            System.out.println("2. STARS");
            System.out.println("3. EARTH");
            System.out.println("4. WATER");

            int vote;
            while (true) {
                System.out.print("Enter your choice: ");
                vote = sc.nextInt();

                switch (vote) {
                    case 1:
                        System.out.println("Voting for MOON");
                        MOON++;
                        break;
                    case 2:
                        System.out.println("Voting for STARS");
                        STARS++;
                        break;
                    case 3:
                        System.out.println("Voting for EARTH");
                        EARTH++;
                        break;
                    case 4:
                        System.out.println("Voting for WATER");
                        WATER++;
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                        continue;
                }
                break;
            }
        }

        System.out.println("\n=== Voting Results ===");
        System.out.println("MOON → " + MOON);
        System.out.println("STARS → " + STARS);
        System.out.println("EARTH → " + EARTH);
        System.out.println("WATER → " + WATER);


        sc.close();
    }
}
