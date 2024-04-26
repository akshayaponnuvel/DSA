package Recursion.Patterns;

public class CountOfNumbers {
    public static void main(String[] args) {
        int n = 5; // Number of terms you want to generate
        printCount(n);
    }

    private static void printCount(int n) {
        if (n <= 0) return;
        
        String term = "1"; // Starting term
        System.out.println(term); // Print the first term
        
        for (int i = 1; i < n; i++) {
            term = getNextTerm(term); // Generate the next term based on current term
            System.out.println(term); // Print the generated term
        }
    }

    private static String getNextTerm(String term) {
        StringBuilder nextTerm = new StringBuilder();
        char[] arr = term.toCharArray();
        int count = 1; // Initialize count of the current digit
        
        for (int i = 0; i < arr.length; i++) {
            // If the current digit is the same as the next one, increment count
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
            } else {
                // Append the count and the digit itself to the next term
                nextTerm.append(count).append(arr[i]);
                count = 1; // Reset count for the next unique digit
            }
        }
        
        return nextTerm.toString();
    }
}
