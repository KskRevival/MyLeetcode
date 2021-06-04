import java.util.ArrayList;

class Solution {
    public int reverse(int x) {
        if (Math.abs(x) < 10 && x != -2147483648) return x;
        int answer = (x / Math.abs(x));
        long tmp = 0;
        x = Math.abs(x);
        ArrayList<Integer> list = new ArrayList<>();
        while(x > 0){
            list.add(x % 10);
            System.out.println(x % 10);
            x /= 10;
        }
        for (int i = 0; i < list.size(); i++) {
            tmp = tmp * 10 + list.get(i);
            if (tmp > Integer.MAX_VALUE) return 0;
        }

        return answer * (int)tmp;
    }
}
//33ms 38.7mb
