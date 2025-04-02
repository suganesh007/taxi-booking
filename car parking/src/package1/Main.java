package package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] srs){
        while (true) {
            System.out.println("1 for booking");
            System.out.println("2 for exit");

            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            switch (start) {
                case 1: {
                    System.out.println("Enter the pickUp location");
                    char pickup_loc = sc.next().charAt(0);
                    System.out.println("Enter the drop location");
                    char drop_loc = sc.next().charAt(0);
                    System.out.println("Enter the pickUp time");
                    int pickup_time = sc.nextInt();
                    car_booking.start_booking(pickup_loc, drop_loc, pickup_time);

                }
                case 2: {
                    break;
                }
                case 3: {
                    car_booking.print();
                }
            }
        }
    }
}
