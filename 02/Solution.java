class Solution {
    public static boolean isPalindrome(int x) {
        char[] xChar = String.valueOf(x).toCharArray();
        for(int i = 0; i < xChar.length; i++){
            int mirrorPosition = xChar.length - i - 1;
            if(xChar[i] != xChar[mirrorPosition]){
                return false;
            }
            if(i >= mirrorPosition){
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(1001);
        System.out.println(result);
    }
}