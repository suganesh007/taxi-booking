package package1;

import java.util.ArrayList;

public class car_booking {
    private static final ArrayList<car> carList=new ArrayList<>();
    private static ArrayList<car> carHistory=new ArrayList<>();
    private static int no_of_cars=3, customer_id=1, car_id=1;



    public static int getNo_of_cars() {
        return no_of_cars;
    }
    public static void setNo_of_cars(int no_of_cars) {
        car_booking.no_of_cars = no_of_cars;
    }
    public static int getCustomer_id() {
        return customer_id;
    }
    public static void setCustomer_id(int customer_id) {
        car_booking.customer_id = customer_id;
    }
    public static ArrayList<car> getCarHistory() {
        return carHistory;
    }
    public static void setCarHistory(ArrayList<car> carHistory) {
        car_booking.carHistory = carHistory;
    }


    public static void start_booking(char pickup_loc, char drop_loc, int pickup_time){
        if(carList.size()<no_of_cars){
            car newCar=new car();
            newCar.setDrop_loc(drop_loc);
            newCar.setCurr_loc(drop_loc);
            newCar.setCar_id(car_booking.car_id++);
            newCar.setCustomer_id(car_booking.customer_id++);
            int dist=Math.abs(pickup_loc-drop_loc);
            newCar.setDrop_time(1+dist);
            int min_distance=Math.abs(pickup_loc-drop_loc);
            newCar.setEarnings(newCar.getEarnings()+(min_distance*200));
            carList.add(newCar);
            carHistory.add(newCar);
            System.out.println("Car Booked Successfully!");
            return;
        }

        car tempCar=null;
        int min_distance=Integer.MAX_VALUE;
        for(car c:carList){
            if(c.getDrop_time()<=pickup_time && Math.abs(pickup_loc-c.getDrop_loc())<min_distance ){
                if(tempCar!=null && c.getEarnings()<tempCar.getEarnings()){
                    tempCar=c;
                    min_distance=Math.abs(pickup_loc-c.getDrop_loc());
                }
                else{
                    tempCar=c;
                    min_distance=Math.abs(pickup_loc-c.getDrop_loc());
                }
            }
        }

        if(tempCar!=null){
            tempCar.setPickup_loc(pickup_loc);
            tempCar.setDrop_loc(drop_loc);
            tempCar.setCustomer_id(car_booking.customer_id++);
            tempCar.setDrop_time(pickup_time+min_distance);
            tempCar.setPickup_time(pickup_time);
            tempCar.setEarnings(tempCar.getEarnings()+(min_distance*200));
            tempCar.setCurr_loc(drop_loc);
            carHistory.add(tempCar);
            System.out.println("Car Booked Successfully!");
        }
        else{
            System.out.println("car is not available at the moment! Please try again later. Sorry for inconvenience. :)");
        }

    }

    public static void print(){
        for(car c:carHistory){
            car.print(c);
        }
    }


}
