package SIMPLEJAVA;

import java.util.Scanner;

public class HOSPITALMANAGEMENTSYSTEM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Patients");
        int n = sc.nextInt();
        int size = 7;

        int[] PatientID = new int[n];
        int[] Admitt = new int[n];
        String[] PatientName = new String[n];
        String[] Disease = new String[n];
        int count = n;

        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE DETAILS OF THE PATIENTS");
            System.out.println("PATIENT ID");
            PatientID[i] = sc.nextInt();
            System.out.println("PATIENT NAME");
            PatientName[i] = sc.next();
            System.out.println("DISEASE NAME");
            Disease[i] = sc.next();
            System.out.println("Admitt Days");
            Admitt[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Update Patient");
            System.out.println("5. Arrange Patients in Ascending Order");
            System.out.println("6. Arrange Patients in Descending Order");
            System.out.println("7. Total Number of Patients");
            System.out.println("8. Search Any Patient");
            System.out.println("9. Exit Program");

            System.out.println("Enter your Choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Patient");
                    if (count < n) {
                        System.out.println("Enter Patient ID");
                        PatientID[count] = sc.nextInt();
                        System.out.println("Enter Patient Name");
                        PatientName[count] = sc.next();
                        System.out.println("Enter Patient Disease");
                        Disease[count] = sc.next();
                        System.out.println("Enter Patient Admission Days");
                        Admitt[count] = sc.nextInt();
                        count++;
                    } else {
                        System.out.println("Hospital is full");
                    }
                    break;

                case 2:
                    System.out.println("Remove Patient");
                    System.out.println("Enter the name of the patient you want to remove");
                    String deletename = sc.next();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (PatientName[i].equalsIgnoreCase(deletename)) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        for (int i = index; i < count - 1; i++) {
                            PatientID[i] = PatientID[i + 1];
                            PatientName[i] = PatientName[i + 1];
                            Disease[i] = Disease[i + 1];
                            Admitt[i] = Admitt[i + 1];
                        }
                        count--;
                        System.out.println("Patient has been removed successfully");
                    } else {
                        System.out.println("Invalid Patient Name");
                    }
                    break;

                case 3:
                    System.out.println("Display All Patients");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Patient ID: " + PatientID[i] + " Name: " + PatientName[i] + " Disease: " + Disease[i] + " Admission Days: " + Admitt[i]);
                    }
                    break;

                case 4:
                    System.out.println("Update Patients");
                    System.out.println("Enter the name of the patient you want to update");
                    String updatename = sc.next();
                    boolean Updated = false;
                    for (int i = 0; i < count; i++) {
                        if (PatientName[i].equalsIgnoreCase(updatename)) {
                            System.out.println("Enter the new Admission Days");
                            Admitt[i] = sc.nextInt();
                            Updated = true;
                        }
                    }
                    if (!Updated) {
                        System.out.println("Invalid Patient Name");
                    }
                    break;

                case 5:
                    System.out.println("Arrange Patients in Ascending Order");
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (PatientName[i].compareToIgnoreCase(PatientName[j]) > 0) {
                                String tempName = PatientName[i];
                                PatientName[i] = PatientName[j];
                                PatientName[j] = tempName;

                                int tempID = PatientID[i];
                                PatientID[i] = PatientID[j];
                                PatientID[j] = tempID;

                                String tempDisease = Disease[i];
                                Disease[i] = Disease[j];
                                Disease[j] = tempDisease;

                                int tempDays = Admitt[i];
                                Admitt[i] = Admitt[j];
                                Admitt[j] = tempDays;
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Arrange Patients in Descending Order");
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (PatientName[i].compareToIgnoreCase(PatientName[j]) < 0) {
                                String tempName = PatientName[i];
                                PatientName[i] = PatientName[j];
                                PatientName[j] = tempName;

                                int tempID = PatientID[i];
                                PatientID[i] = PatientID[j];
                                PatientID[j] = tempID;

                                String tempDisease = Disease[i];
                                Disease[i] = Disease[j];
                                Disease[j] = tempDisease;

                                int tempDays = Admitt[i];
                                Admitt[i] = Admitt[j];
                                Admitt[j] = tempDays;
                            }
                        }
                    }
                    break;

                case 7:
                    System.out.println("Total number of Patients: " + count);
                    break;

                case 8:
                    System.out.println("Search Any Patient");
                    System.out.println("Enter the name of the patient you want to search");
                    String searchname = sc.next();
                    boolean found = false;
                    int frequency = 0;
                    for (int i = 0; i < count; i++) {
                        if (PatientName[i].equalsIgnoreCase(searchname)) {
                            found = true;
                            frequency++;
                        }
                    }
                    if (found) {
                        System.out.println(searchname + " appears " + frequency + " time(s).");
                    } else {
                        System.out.println("Invalid Patient Name");
                    }
                    break;

                case 9:
                    System.out.println("Exit Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}