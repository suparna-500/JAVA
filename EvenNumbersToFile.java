import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EvenNumbersToFile {

    // Method to write even numbers to a file
    public static void writeEvenNumbersToFile(int[] array, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            for (int number : array) {
                if (number % 2 == 0) {
                    // Convert the number to a string and then to bytes
                    String numberStr = number + "\n";
                    fos.write(numberStr.getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read from the file and display the contents
    public static void readAndDisplayFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteData;
            StringBuilder content = new StringBuilder();
            while ((byteData = fis.read()) != -1) {
                content.append((char) byteData);
            }
            System.out.println("Even numbers from the array:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String filename = "even_numbers.txt";

        // Write even numbers to file
        writeEvenNumbersToFile(array, filename);

        // Read from file and display
        readAndDisplayFile(filename);
    }
}