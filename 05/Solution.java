class Solution {
    public static int strStr(String haystack, String needle) {
        int p = -1;
        char[] haystackC = haystack.toCharArray();
        char[] needleC = needle.toCharArray();
        int j = 0;
        if (needleC.length > haystackC.length) {
            return -1;
        }
        for(int i = 0; i < haystackC.length; i++) {
            if(haystackC[i] == needleC[j]){
                if(p == -1){
                    p = i;
                }
                if(j == needleC.length - 1){
                    return p;
                }
                j++;
            } else {
                if(p != -1){
                    i = p;
                }
                p = -1;
                j = 0;
            }

            
        }
        if(j != needleC.length) return -1;
        return p;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "sippia"));
    }
}