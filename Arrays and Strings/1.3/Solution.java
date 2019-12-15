// URLify a strings

public class Solution {
    public String URLify (String input) {
        if (input.length() == 0 || input == null) {
            return input
        }
        int spaces = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                spaces++;
            }
        }
        int truelength = input.length;
        int index = truelength + spaces * 2;
        for (i = truelength; i >=0; i--) {
            if(input[i] == ' ') {
                input[index - 1] = '0';
                input[index - 2] = '2';
                input[index - 3] = '%';
                index = index - 3;
            } else {
                input[index - 1] = input[i];
                index--;
            }
        }
    }
}
