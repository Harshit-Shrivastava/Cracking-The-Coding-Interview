public class Solution {
    public boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if((len == s2.length()) && (len > 0)) {
            return isSubstring(s1 + s2, s2);
        }
        return false;
    }
}
