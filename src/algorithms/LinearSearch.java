package algorithms;

import java.util.Scanner;

public class LinearSearch {

    // This method searches for the target in the array
    public static int search(int[] arr, int target) {

        // Check every element one by one
        for (int i = 0; i < arr.length; i++) {

            // If current element matches target
            if (arr[i] == target) {
                return i;
            }
        }

        // If target was not found
        return -1;
    }

    public static void main(String[] args) {

        // Create Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Our array for now
        int[] arr = {8, 3, 6, 1, 9, 2};

        // Ask the user what number they want to find
        System.out.print("Enter the number you want to find: ");
        int target = sc.nextInt();

        // Perform Linear Search
        int result = search(arr, target);

        // Display the result
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}