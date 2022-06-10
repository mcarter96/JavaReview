import java.util.Arrays;

class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    Car (String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
public class MyArrays {
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void arrManipulation() {
        int[] intArr = { 24, 12, 37, 39, 25, 10, 28, 43, 19, 17 };

        // Cloning the array creates a new instance of the original array
        int[] sortedIntArr = intArr.clone();
        Arrays.sort(sortedIntArr);
        printArr(intArr);
        printArr(sortedIntArr);

        int[] intArrA = intArr.clone();
        int[] intArrB = intArrA;
        System.out.println("Int Arr A ");
        printArr(intArrA);
        System.out.println("Int Arr B ");
        printArr(intArrB);

        // Since intArrB is set to intArrB, altering one array will alter the other since they
        // are pointing to the same location in memory
        intArrA[0] = 0;
        intArrB[1] = 1;
        System.out.println("Int Arr A ");
        printArr(intArrA);
        System.out.println("Int Arr B ");
        printArr(intArrB);

        int[] multiArr = intArr.clone();
        for (int i = 0; i < multiArr.length; i++) {
            if ((multiArr[i] % 2) != 0) {
                multiArr[i] = multiArr[i]*2;
            }
        }
        printArr(multiArr);

        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }

    public static void objectArrays() {
        Car[] cars = new Car[3];

        cars[0] = new Car("Chevrolet", "Equinox", 2012, "black");
        cars[1] = new Car("Ford", "Escape", 2014, "white");
        cars[2] = new Car("Auid", "A8L", 2013, "black");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car at index: " + i + " is a " + cars[i].color + " " + cars[i].year + " " + cars[i].make + " " + cars[i].model);
        }
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        arr[0] = 31;
        arr[1] = 34;
        arr[2] = 41;
        arr[3] = 46;
        arr[4] = 8;

        printArr(arr);

        arrManipulation();
        objectArrays();
    }
}