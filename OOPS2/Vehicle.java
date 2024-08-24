package OOPS2;

public class Vehicle {
    private String color;
    int maxSpeed;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;;
    }
    public void print(){
        System.out.println("Vehile "+"color "+color+" maxspeed "+maxSpeed);
    }
}
