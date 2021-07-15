package Generic;

public class GenericDisplay {
    public static void main(String[] args) {
//        Integer arr[] = {1, 2, 3, 4, 5, 6};
//        String str[] = {"A", "B", "C", "D", "E"};
//        display(str);
//        display(arr);
        Car[] cars = new Car[5];
        cars[0] = new Car(1000, 200, "White");
        cars[1] = new Car(2000, 150, "Black");
        cars[2] = new Car(3000, 185, "Yellow");
        cars[3] = new Car(400, 100, "Red");
        cars[4] = new Car(350, 50, "Grey");
        //display(cars);
        BubbleSort(cars);
        display(cars);
    }

        public static <T extends Comparable<T>> void BubbleSort(T[] arr){
        for(int i=0 ; i <arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-1-i ; j++){
                if( arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static <T> void display (T[]arr){
        for (T e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

}
