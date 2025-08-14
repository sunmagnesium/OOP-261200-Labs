
import java.util.Scanner;

public class StudentGrades {

    /**
     * Calculates the average of the provided scores array.
     * Validates input for null, empty array, and score range (0-100).
     * Throws FailedSignificantlyException if the average is below 40.
     *
     * @param scores array of integer scores
     * @return the average score as a double
     */
    public static double calculateAverage(int[] scores) {
        // Validation: null array
        if (scores == null) {
            throw new IllegalArgumentException("Error: Scores array cannot be null.");
        }

        // Validation: empty array
        if (scores.length == 0) {
            throw new IllegalArgumentException("Error: Scores array cannot be empty.");
        }

        int sum = 0;
        for (int score : scores) {
            // Validation: score less than 0
            if (score < 0) {
                throw new IllegalArgumentException("Error: Score cannot be less than 0.");
            }
            // Validation: score greater than 100
            if (score > 100) {
                throw new IllegalArgumentException("Error: Score cannot be greater than 100.");
            }
            sum += score;
        }

        double average = (double) sum / scores.length;

        // Check for significant failure (average < 40)
        if (average < 40) {
            throw new FailedSignificantlyException(
                    "Student average is " + average + ", which is a significant failure.");
        }

        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter scores (comma-separated): ");
            String input = scanner.nextLine().trim();

            // Validation for empty input string
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Error: Scores array cannot be empty.");
            }

            // Split input by commas and parse into integers
            String[] parts = input.split(",");
            int[] scores = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                scores[i] = Integer.parseInt(parts[i].trim());
            }

            // Calculate and display average
            double average = calculateAverage(scores);
            System.out.println("Average score: " + average);

        } catch (NumberFormatException e) {
            // Handle invalid numeric input
            System.out.println("Invalid input: Please enter a valid number for scores. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle general validation errors
            System.out.println(e.getMessage());
        } catch (FailedSignificantlyException e) {
            // Handle significant failure exception
            System.out.println("Significant Failure: " + e.getMessage());
        } finally {
            // Always executed: close scanner and display conclusion message
            scanner.close();
            System.out.println("Grade calculation process concluded.");
        }
    }
}
