import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the amount of random numbers to generate: ");
        int amountNums = myScanner.nextInt();
        System.out.print("Enter the lower bound of the range for your random numbers: ");
        int lowBound = myScanner.nextInt();
        System.out.print("Enter the upper bound of the range for your random numbers: ");
        int highBound = myScanner.nextInt();
        myScanner.close();
        
        System.out.print("Your random numbers are: ");
        Random rand = new Random();
        for (int i = 0; i < amountNums; i++) {
            int randomNum = rand.nextInt((highBound-lowBound)+1)+lowBound;
            System.out.print(randomNum + " ");
        }

        // Future Idea:
        // Make it so that values returned are unique
        
    }
}