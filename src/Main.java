import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.println("Please enter the size of the array: ");
        int N = scanner.nextInt();

        // Initialize the array and ask the use to enter its elements
        int[] array = new int[N];
        System.out.println("Please enter " + N + " integers to store in the array: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        while (true) {
            // Ask the user to enter the operation
            System.out.println("Please enter operation ('S' to search, 'D' to delete, 'Q' to quit): ");
            char operation = scanner.next().charAt(0);

            if (operation == 'S' || operation == 's') {
                // Search operation
                System.out.println("Please enter the value to search: ");
                int searchValue = scanner.nextInt();
                boolean found = false;
                // Iterate over the array and print the index if found
                for (int i = 0; i < N; i++) {
                    if (array[i] == searchValue) {
                        found = true;
                        System.out.println("Found at index: " + i);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Not found");
                }
            } else if (operation == 'D' || operation == 'd') {
                // Delete operation
                System.out.println("Enter the index to delete: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < N) {
                    // Shift the array from the index of element deleted
                    for (int i = index; i < N - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    // Update the size of the array
                    N--;
                    // Print the updated array
                    System.out.println("New array after deletion: ");
                    for (int i = 0; i < N; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Invalid index");
                }
            } else if (operation == 'Q' || operation == 'q') {
                // Exit operation
                System.out.println("Exiting program");
                break;
            } else {
                System.out.println("Invalid operation. Please enter S, D, or Q.");
            }
        }
        scanner.close();
    }
}