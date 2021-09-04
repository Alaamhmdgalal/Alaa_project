package dataStructures;
import java.util.*;

public class RandomNumberArray {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array bounds: ");
        int bounds = scan.nextInt();

        int[] arrayOfNumbers = new int[bounds];

        for (int i = 0 ; i < arrayOfNumbers.length ; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(20);
            arrayOfNumbers[i]= randomNumber;
            System.out.println(randomNumber);
        }

        for (int i = 0 ; i < arrayOfNumbers.length -1; i++) {
            for (int j = i+1 ; j < arrayOfNumbers.length ; j++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[j]) {
                    int temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
