package package1;

public class car {

    private int car_id;
    private int customer_id;
    private char curr_loc;
    private char pickup_loc='A';
    private char drop_loc;
    private int pickup_time=1;
    private int drop_time;
    private int earnings=0;

    public char getCurr_loc() {
        return curr_loc;
    }
    public void setCurr_loc(char curr_loc) {
        this.curr_loc = curr_loc;
    }
    public char getPickup_loc() {
        return pickup_loc;
    }
    public void setPickup_loc(char pickup_loc) {
        this.pickup_loc = pickup_loc;
    }
    public char getDrop_loc() {
        return drop_loc;
    }
    public void setDrop_loc(char drop_loc) {
        this.drop_loc = drop_loc;
    }
    public int getPickup_time() {
        return pickup_time;
    }
    public void setPickup_time(int pickup_time) {
        this.pickup_time = pickup_time;
    }
    public int getDrop_time() {
        return drop_time;
    }
    public void setDrop_time(int drop_time) {
        this.drop_time = drop_time;
    }
    public int getEarnings() {
        return earnings;
    }
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public int getCar_id() {
        return car_id;
    }
    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }


    public static void print(car car){
        System.out.println("car ID: " +car.car_id+"\n" +
                "customer ID: "+ car.customer_id + "\n"
                +"current location: "+car.curr_loc + "\n"+
                "pickup location: "+ car.pickup_loc +"\n"+
                "drop location: " +car.drop_loc+ "\n"+
                "pick up time: " + car.pickup_time + "\n"+
                "drop time: "+car.drop_time+"\n"+
                "total earnings: "+car.earnings);
        System.out.println("----------------------------------------------------"+"\n");
    }

}
