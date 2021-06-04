class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) return s;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int curr = i;
            int count = 0;
            if (i == numRows - 1) count = 1;
            while (curr < s.length()){
                answer.append(s.charAt(curr));
                if (count % 2 == 0) curr += numRows * 2 - 2*(i+1);
                else curr += 2 * i;
                if (i != 0 && i != numRows - 1) count++;
            }
        }


        return answer.toString();
    }
}
//6ms 41.6mb
