//Better solution to find if the two strings are permutations of each other or not

public class BetterSolution {
    public boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256];   //Assuming ASCII character charSet

        for (int i = 0; i < s.length(); i++) {
            letters[(int)s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = (int) t.charAt(i);
            letters[index]--;
            if(letters[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
