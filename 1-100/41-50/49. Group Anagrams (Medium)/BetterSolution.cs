public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        var dict = new Dictionary<string, HashSet<string>>();
        foreach (var str in strs)
        {
            var curr = GetHashedString(str);
            if (!dict.ContainsKey(curr)) dict.Add(curr, new HashSet<string>());
            dict[curr].Add(str);   
        }

        IList<IList<string>> res = dict.Values.Select(value => value.ToList()).Cast<IList<string>>().ToList();

        return res;
    }

    public string GetHashedString(string str)
    {
        var mas = new int[26];
        foreach (var c in str) mas[c - 'a']++;
        return string.Join(" ", mas);
    }
}
