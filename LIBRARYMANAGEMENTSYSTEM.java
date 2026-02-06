package SIMPLEJAVA;

import java.util.Scanner;

public class LIBRARYMANAGEMENTSYSTEM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books");
        int n = sc.nextInt();

        int[] BOOKID = new int[n];
        int[] BookCopies = new int[n];
        String[] BookName = new String[n];
        String[] BookAuthor = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Book ID");
            BOOKID[i] = sc.nextInt();

            System.out.println("Enter Book Name");
            BookName[i] = sc.next();

            System.out.println("Enter Book Author");
            BookAuthor[i] = sc.next();

            System.out.println("Enter Book Copies");
            BookCopies[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\nLIBRARY MANAGEMENT SYSTEM");
            System.out.println("1. Display All Books");
            System.out.println("2. Maximum Book Copies");
            System.out.println("3. Minimum Book Copies");
            System.out.println("4. Total Book Copies");
            System.out.println("5. Average Book Copies");
            System.out.println("6. Search Book by Name");
            System.out.println("7. Arrange Books Ascending");
            System.out.println("8. Arrange Books Descending");
            System.out.println("9. Count Number of Books");
            System.out.println("10. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println(
                                BOOKID[i] + " " + BookName[i] + " " + BookAuthor[i] + " " + BookCopies[i]);
                    }
                    break;

                case 2:
                    int max = BookCopies[0];
                    for (int i = 1; i < n; i++) {
                        if (BookCopies[i] > max) {
                            max = BookCopies[i];
                        }
                    }
                    System.out.println("Maximum Book Copies: " + max);
                    break;

                case 3:
                    int min = BookCopies[0];
                    for (int i = 1; i < n; i++) {
                        if (BookCopies[i] < min) {
                            min = BookCopies[i];
                        }
                    }
                    System.out.println("Minimum Book Copies: " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += BookCopies[i];
                    }
                    System.out.println("Total Book Copies: " + sum);
                    break;

                case 5:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        total += BookCopies[i];
                    }
                    double avg = (double) total / n;
                    System.out.println("Average Book Copies: " + avg);
                    break;

                case 6:
                    System.out.println("Enter Book Name to Search");
                    String search = sc.next();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (BookName[i].equalsIgnoreCase(search)) {
                            System.out.println(
                                    BOOKID[i] + " " + BookName[i] + " " + BookAuthor[i] + " " + BookCopies[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 7:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (BookCopies[i] > BookCopies[j]) {
                                int temp = BookCopies[i];
                                BookCopies[i] = BookCopies[j];
                                BookCopies[j] = temp;
                            }
                        }
                    }
                    System.out.println("Books Arranged in Ascending Order");
                    break;

                case 8:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (BookCopies[i] < BookCopies[j]) {
                                int temp = BookCopies[i];
                                BookCopies[i] = BookCopies[j];
                                BookCopies[j] = temp;
                            }
                        }
                    }
                    System.out.println("Books Arranged in Descending Order");
                    break;

                case 9:
                    System.out.println("Total Number of Books: " + n);
                    break;

                case 10:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 10);

        sc.close();
    }
}