public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop -> Rows
        for (int i = 1; i <= n; i++) {

            // 1. Spaces (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // 2. 1st Half: Descending numbers (i down to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // 3. 2nd Half: Ascending numbers (2 up to i)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Next row
            System.out.println();
        }
    }
}