public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        // Assume the first element is the maximum
        int maxValue = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If current element is greater than maxValue, update it
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}
