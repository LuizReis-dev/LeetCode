class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];
        char[] charsFirstString = firstString.toCharArray();
        String returnString = "";
        
        for(int j = 0; j < charsFirstString.length; j++){
            for(int i = 1; i < strs.length; i++){
                String current = strs[i];
                if(current.length() <= j){
                    return returnString;
                }
                if(current.charAt(j) != charsFirstString[j]){
                    return returnString;
                }
            }
            returnString = returnString.concat(String.valueOf(charsFirstString[j]));
        }

        return returnString;
    }

    public static void main(String[] args) {
        var array = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(array));
    }
}