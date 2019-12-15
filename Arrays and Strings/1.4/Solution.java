public class Solution {
    private int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('b');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z) {
            return val - 'a';
        } else {
            return -1;
        }
    }

    public boolean isPermutation(String phrase) {
        int countOdd = 0;
        int[] table = new Int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if(table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
