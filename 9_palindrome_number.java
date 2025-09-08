class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
//            System.out.println("Invalid Input");
            return false;
        }
        if (x < 10) {
//            System.out.println("Palindrome");
            return true;
        }
        String pn = x + "";
        String temp = "";
        for (int i = pn.length() - 1; i >= 0; i--) {
            temp += pn.charAt(i);
            if (temp.equals(pn)) {
//                System.out.println("Palindrome");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(10));

    }
}