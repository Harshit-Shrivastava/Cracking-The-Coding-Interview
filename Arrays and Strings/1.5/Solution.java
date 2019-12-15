public class Solution {
    public boolean oneEditAway (String first, String second) {
        if (first.length() == second.length()) {
            oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            oneReplaceAway(first, second);
        } else if (first.length() -1 == second.length()){
            oneReplaceAway(second, first);
        }
    }

    private boolean oneEditReplace(String first, String second) {
        boolean difference = false;
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) != second.charAt(i)) {
                if(difference) {
                    return false;
                }
                difference = true;
            }
        }
        return true;
    }

    private boolean oneReplaceAway(String first, String second) {
        int firstIndex = 0;
        int secondIndex = 0;
        while ((firstIndex < first.length()) && (secondIndex < second.length())) {
            if (first.charAt(firstIndex) != second.charAt(secondIndex)) {
                if (firstIndex != secondIndex) {
                    return false;
                } else {
                    secondIndex;
                }
            } else {
                firstIndex++;
                secondIndex++;
            }
        }
        return true;
    }
}
