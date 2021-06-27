import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    int[] myNums;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        myNums = nums;
        int fuck = factorial(nums.length);

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
//1ms 92.49%
//39mb 75.09%
