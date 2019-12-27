public class Solution {
    public int magicIndex(int[] array) {
        return magicIndex(array, 0, array.length - 1);
    }

    private int magicIndex(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }

        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];

        if(midValue == midIndex) {
            return midIndex;
        }

        //search left
        int leftIndex = Math.min(midValue, midIndex - 1);
        int left = magicIndex(array, start, leftIndex);
        if(left >=0 ){
            return left;
        }

        //search right
        int rightIndex = Math.min(midIndex + 1, midValue);
        int right = magicIndex(array, rightIndex, end);

        return right;
    }
}
