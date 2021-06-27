import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    int[] myNums;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        myNums = nums;
        int fuck = combinations();

        for (int i = 0; i < fuck; i++) {
            addToList();
            nextPermutation();
        }

        return ans;
    }

    private void addToList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int myNum : myNums) list.add(myNum);
        ans.add(list);
    }

    private int combinations(){
        int pos = 0, fac = 1;
        int[] nums = new int[myNums.length];
        nums[0] = 1;
        for (int i = 1; i < myNums.length; i++) {
            if (myNums[i] != myNums[i - 1]) pos++;
            nums[pos]++;
        }

        for (int num : nums) {
            if (num == 0) break;
            fac *= factorial(num);
        }
        
        return factorial(nums.length) / fac;
    }

    private int factorial(int a){
        int fac = 1;
        for (int i = 2; i <= a; i++) {
            fac*= i;
        }
        return fac;
    }

    private void nextPermutation() {
        int point = -1;
        for (int i = myNums.length - 1; i >= 1; i--) {
            if (myNums[i] > myNums[i - 1]){
                point = i - 1;
                break;
            }
        }
        if (point != -1){
            for (int i = myNums.length - 1; i >= 1; i--) {
                if (myNums[i] > myNums[point]){
                    swap(point, i);
                    break;
                }
            }
        }
        for (int i = 1; i < (myNums.length - point)/2+1; i++) {
            swap(i + point, myNums.length - i);
        }
    }

    private void swap(int a, int b){
        int tmp = myNums[a];
        myNums[a] = myNums[b];
        myNums[b] = tmp;
    }
}
//1ms 99.31%
//39.3mb 95.12%
