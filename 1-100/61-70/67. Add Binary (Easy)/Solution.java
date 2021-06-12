class Solution {
    public String addBinary(String a, String b) {
        char[] as = a.toCharArray(), bs = b.toCharArray();
        int aPtr = as.length - 1, bPtr = bs.length - 1, addition = 0;
        StringBuilder s = new StringBuilder();
        while (aPtr >= 0 && bPtr >= 0){
            if (as[aPtr] == bs[bPtr]){
                s.append(addition);
                addition = as[aPtr] - '0';
            } else {
                s.append((addition + 1) % 2);
            }
            aPtr--;bPtr--;
        }
        while (aPtr >= 0){
            s.append((as[aPtr] - '0' + addition) % 2);
            if (addition != 1 || as[aPtr] != '1')
                addition = 0;
            aPtr--;
        }
        while (bPtr >= 0){
            s.append((bs[bPtr] - '0' + addition) % 2);
            if (addition != 1 || bs[bPtr] != '1')
                addition = 0;
            bPtr--;
        }
        if (addition == 1) s.append(1);

        return s.reverse().toString();
    }
}
//3ms 39.1mb
