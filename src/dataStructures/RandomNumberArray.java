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
            for (int k = i+1 ; k < arrayOfNumbers.length ; k++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[k]) {
                    int temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[k];
                    arrayOfNumbers[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
