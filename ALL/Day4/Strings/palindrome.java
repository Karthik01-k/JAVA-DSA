public class palindrome {
    public static void main(String[] args) {
        String str = "level";  // can be input from user
        boolean isPalindrome = true;
        int n = str.length();
        // Compare characters from both ends
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
