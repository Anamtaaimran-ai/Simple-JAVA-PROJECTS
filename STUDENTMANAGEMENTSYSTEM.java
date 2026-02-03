package JAVAPROJECTS;

import java.util.Scanner;

public class STUDENTMANAGEMENTSYSTEM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ID = new int[n];
        int[] Marks = new int[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            ID[i] = sc.nextInt();

            System.out.print("Enter Student Marks " + (i + 1) + ": ");
            Marks[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Display all students");
            System.out.println("2. Highest Marks");
            System.out.println("3. Lowest Marks");
            System.out.println("4. Sum of Marks");
            System.out.println("5. Average Marks");
            System.out.println("6. Search Student by Marks");
            System.out.println("7. Count Students with Marks > 80");
            System.out.println("8. Arrange Marks in Ascending Order");
            System.out.println("9. Arrange Marks in Descending Order");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- All Students ---");
                    for (int i = 0; i < n; i++) {
                        System.out.println("ID: " + ID[i] + " | Marks: " + Marks[i]);
                    }
                    break;

                case 2:
                    int max = Marks[0];
                    for (int i = 1; i < n; i++) {
                        if (Marks[i] > max) {
                            max = Marks[i];
                        }
                    }
                    System.out.println("Highest Marks: " + max);
                    break;

                case 3:
                    int min = Marks[0];
                    for (int i = 1; i < n; i++) {
                        if (Marks[i] < min) {
                            min = Marks[i];
                        }
                    }
                    System.out.println("Lowest Marks: " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += Marks[i];
                    }
                    System.out.println("Sum of Marks: " + sum);
                    break;

                case 5:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        total += Marks[i];
                    }
                    double average = (double) total / n;
                    System.out.println("Average Marks: " + average);
                    break;

                case 6:
                    System.out.print("Enter marks to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (Marks[i] == search) {
                            System.out.println("Student Found → ID: " + ID[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with these marks.");
                    }
                    break;

                case 7:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (Marks[i] > 80) {
                            count++;
                        }
                    }
                    System.out.println("Students with marks > 80: " + count);
                    break;

                case 8:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (Marks[i] > Marks[j]) {
                                int temp = Marks[i];
                                Marks[i] = Marks[j];
                                Marks[j] = temp;
                            }
                        }
                    }
                    System.out.println("Marks in Ascending Order:");
                    for (int m : Marks) {
                        System.out.print(m + " ");
                    }
                    System.out.println();
                    break;

                case 9:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (Marks[i] < Marks[j]) {
                                int temp = Marks[i];
                                Marks[i] = Marks[j];
                                Marks[j] = temp;
                            }
                        }
                    }
                    System.out.println("Marks in Descending Order:");
                    for (int m : Marks) {
                        System.out.print(m + " ");
                    }
                    System.out.println();
                    break;

                case 10:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 10);

        sc.close();
    }
}

