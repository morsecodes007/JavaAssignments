package Grace_Assignment;

        /*
        Create an Array and initialize it with values, Then Sum all the values in the Array and print them out.
        Write Pseudocode for it.
        */

public class ArrayAddition {
    public static void main(String[] args) {
        int[] numbers = {90, 40, 90, 89, 32, 51, 64, 87, 19, 92, 96, 85, 62, 53, 30, 46};
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }
        System.out.println(sum);
    }
}
