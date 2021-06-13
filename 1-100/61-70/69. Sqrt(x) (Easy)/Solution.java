class Solution {
    public int mySqrt(int x) {
        double r = x, dif = 0.0001;
        while (Math.abs(x - r*r) > dif){
            r = (r + x / r) / 2;
        }
        return (int) Math.floor(r);
    }
}
//2ms 38.3mb
