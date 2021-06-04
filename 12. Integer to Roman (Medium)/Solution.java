class Solution {
    public String intToRoman(int num) {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("M".repeat(Math.max(0, num / 1000)));
        num %= 1000;
        if (num / 100 == 4) stringBuffer.append("CD");
        else if (num / 100 == 9) stringBuffer.append("CM");
        else{
            if (num / 100 > 4) {
                stringBuffer.append("D");
            }
            num %= 500;
            stringBuffer.append("C".repeat(Math.max(0, num / 100)));
        }
        num %= 100;
        if (num / 10 == 4) stringBuffer.append("XL");
        else if (num / 10 == 9) stringBuffer.append("XC");
        else {
            if (num / 10 > 4) {
                stringBuffer.append("L");
            }
            num %= 50;
            stringBuffer.append("X".repeat(Math.max(0, num / 10)));
        }
        num %= 10;
        if (num % 10 == 4) stringBuffer.append("IV");
        else if (num % 10 == 9) stringBuffer.append("IX");
        else {
            if (num % 10 > 4) {
                stringBuffer.append("V");
            }
            num %= 5;
            stringBuffer.append("I".repeat(Math.max(0, num)));
        }
        return stringBuffer.toString();
    }
}
//10ms 41.8mb
