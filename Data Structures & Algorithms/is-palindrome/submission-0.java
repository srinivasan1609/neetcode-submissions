class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String sr = new StringBuilder(s).reverse().toString();
        return sr.equals(s);
    }
}
