class Solution {
    int[] table = new int[256];
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;
        int ptr = needle.length() - 1;
        createBauerMooreTable(needle);
        while (ptr < haystack.length()){
            if (needle.charAt(needle.length() - 1) == haystack.charAt(ptr)){
                for (int i = 1; i < needle.length() + 1; i++) {
                    if (needle.charAt(needle.length() - i) != haystack.charAt(ptr - i + 1)) break;
                    else if (i == needle.length()) return ptr - needle.length() + 1;
                }
            }
            ptr += needle.length() - 1 - table[haystack.charAt(ptr)];
        }
        return -1;
    }

    public void createBauerMooreTable(String template){
        for (int i = 0; i < 256; i++) {
            table[i] = -1;
        }
        for (int i = 0; i < template.length() - 1; i++) {
            table[template.charAt(i)] = i;
        }
    }
}
//2ms 38.5mb
