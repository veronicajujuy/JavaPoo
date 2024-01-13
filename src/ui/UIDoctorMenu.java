package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available appointment");
            System.out.println("2. My schedule appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }
    private static void showAvailableAppointmentMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add available appointment");
            System.out.println(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + " . "+ UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            if (response > 0 && response <4){
                int monthSelected = response;
                System.out.println(monthSelected + " . "+UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date available [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Your date is: "+ date + "\n1.Correct \n2.Change Date");
                int responseDate = sc.nextInt();
                if (response == 2) continue;

                System.out.println("Insert the time available for the date: "+ date + " [hh:mm]");
                String time = sc.nextLine();
                System.out.println("Your time is "+ time);


            } else if (response == 0) {
                showDoctorMenu();
            }
        }while(response !=0);
    }
}
