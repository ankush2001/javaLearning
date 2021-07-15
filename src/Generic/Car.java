package Generic;

public  class Car implements Comparable<Car>{
    int price;
    int speed;
    String color;
    public Car(int price ,int speed , String color){
        this.price = price;
        this.speed = speed;
        this.color = color;

    }
    public String toString(){
        return "P:" + this.price + " S:"+ + this.speed+" C:" + this.color+"\n";
    }
    public int compareTo(Car other) {
        return other.speed - this.speed;
    }
}
