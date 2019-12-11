//Find if a string has all unique characters or not

public class Solution{
    //Assuming string to be composed of ASCII characterset (256)
    public boolean isUnique(String input) {
        if (input.length() > 256) {
            return false;
        }

        boolean[] charSet = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            int cur = input.charAt(i);
            if (charSet[cur]) {
                //Already found before, seeing again
                return false;
            }
            charSet[cur] = true;
        }

        return true;
    }
}

// Time: O(n) for traversing through the array
// Space: O(256) for creating the character set 
