package  com.company;

public class Lamp {
    //stores the value for light
    //true if light is on
    //false if light is off
    boolean isOn;

    //method to turn on the light
    void turnOn(){
        isOn = true;
        System.out.println("Linght on? " + isOn);
    }
}