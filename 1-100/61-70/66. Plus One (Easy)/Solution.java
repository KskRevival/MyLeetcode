class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10){
                digits[i - 1] += 1;
                digits[i] = 0;
            }
        }
        if (digits[0] == 10){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        } else return digits;
    }
}
//0ms 37.4mb
