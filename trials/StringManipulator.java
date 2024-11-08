import java.util.Arrays;

public class StringManipulator {

    public static String sortSubstringDescending(String str, int N, int M) {
        // Convert the specific range to a char array
        char[] chars = str.substring(N, M + 1).toCharArray();

        Arrays.sort(chars);
        String sortString = new String(chars);

        // Reverse the sorted array to get descending order
        String reverseStr = new StringBuilder(sortString).reverse().toString();

        // Reconstruct the original string with the sorted part in place
        return str.substring(0, N) + reverseStr + str.substring(M + 1);
    }

    public static void main(String[] args) {
        System.out.println(sortSubstringDescending("ooneespdf", 0, 8));
    }
}
