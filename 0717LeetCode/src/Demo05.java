public class Demo05 {

    //暴力解法超时
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String maxStr = "";
        for (int i=0;i<s.length();i++) {
            for (int j=s.length();j>i+1;j--) {
                String str = s.substring(i, j);
                if (str.equals(new StringBuffer(str).reverse().toString())) {
                    if (str.length() > maxLen) {
                        maxStr = str;
                    }
                }
            }
        }
        return maxStr;
    }
}
