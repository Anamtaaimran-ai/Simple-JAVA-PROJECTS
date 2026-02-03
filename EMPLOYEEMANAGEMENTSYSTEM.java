package JAVAPROJECTS;

import java.util.Scanner;

public class EMPLOYEEMANAGEMENTSYSTEM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();

        int[] ID = new int[n];
        int[] Salary = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter ID"+(i+1));
            ID[i] = sc.nextInt();
            System.out.println("Enter Salary"+(i+1));
            Salary[i] = sc.nextInt();
        }
        int choice;

        do {
            System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Display All Employees");
            System.out.println("2.Highest Salary");
            System.out.println("3.Lowest Salary");
            System.out.println("4.Sum Salary");
            System.out.println("5.Search Employee by Id");
            System.out.println("6.Count salary which is greater than 80000");
            System.out.println("7.Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Display All Employees");
                    for (int i = 0; i < n; i++) {
                        System.out.println("ID: " + ID[i] + " SALARY: " + Salary[i]);
                    }
                    break;
                case 2:
                    System.out.println("Highest Salary");
                    int max = Salary[0];
                    for (int i = 0; i < n; i++) {
                        if (Salary[i] > max)
                            max = Salary[i];
                    }
                    System.out.println("Highest Salary: " + max);
                    break;
                case 3:
                    System.out.println("Lowest Salary");
                    int min = Salary[0];
                    for (int i = 0; i < n; i++) {
                        if (Salary[i] < min)
                            min = Salary[i];
                    }
                    System.out.println("Lowest Salary: " + min);
                    break;
                case 4:
                    System.out.println("Sum Salary");
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum = sum + Salary[i];
                    }

                    System.out.println("Sum Salary: " + sum);
                    break;

                case 5:
                    System.out.println("Enter the id you want to search");
                    int searchID = sc.nextInt();

                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (ID[i] == searchID) {
                            System.out.println("ID: " + searchID);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No such ID");
                        break;
                    }
                case 6:
                    System.out.println("Counting Employees with salary above 80000");

                    int count = 0;

                    for (int i = 0; i < n; i++) {
                        if (Salary[i] > 80000) {
                            count++;
                        }
                    }

                    System.out.println("Number of employees with salary above 80000: " + count);
                    break;

                case 7:
                    System.out.println("Exiting Program");
            }
        }
        while(choice!= 7);{
            System.out.println("Invalid choice");
        }

    }
}


