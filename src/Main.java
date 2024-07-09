import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1: ");
        int[] nums = {10, 20, 30};
        int length = nums.length;
        System.out.println("The length is: " + length + " indexes");
        System.out.println(Arrays.toString(nums));
        System.out.println(" ");


        //Task 2
        System.out.println("Task 2: ");
        int[] middleElement = {13, 5, 7, 68, 2};
        System.out.println(Arrays.toString(middleElement));
        System.out.println("Output: " + middleElement[2]);
        System.out.println(" ");

        //Task 3
        System.out.println("Task 3: ");
        String[] colors = {"red", "green", "blue", "yellow"};
        String[] targetColors = colors.clone(); // a copy
        targetColors[2] = "Black";
        System.out.println("Array length = " + colors.length);
        System.out.println("Original Array: " + Arrays.toString(colors));
        System.out.println("Clone Array with a new color: " + Arrays.toString(targetColors));


        System.out.println(" ");
        //Task 4
        System.out.println("Task 4: ");
        int[] arrNum = {1980, 1954, 1944, 2024, 1995};

        int firstArr = arrNum[0];
        System.out.println("First index " + firstArr);
        System.out.println("Last index " + arrNum[arrNum.length - 1]);
        System.out.println("Last index " + arrNum[arrNum.length - 1]);

        // array index 5
        try {
            arrNum[5] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception when assigning value to index 5: " + e);
        }
        System.out.println(" ");


        // Task 5
        System.out.println("Task 5: ");
        int[] arr = {4, 20, 5, 10, 30, 90};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(" ");


        // Task 6
        System.out.println("Task 5: ");

    }
}