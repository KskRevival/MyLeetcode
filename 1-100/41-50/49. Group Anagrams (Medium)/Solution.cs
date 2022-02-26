public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        var dict = new Dictionary<string, List<string>>();
        foreach (var str in strs)
        {
            var curr = GetHashedString(str);
            if (!dict.ContainsKey(curr)) dict.Add(curr, new List<string>());
            dict[curr].Add(str);   
        }

        IList<IList<string>> res = dict.Values.Select(value => value).Cast<IList<string>>().ToList();

        return res;
    }

    public string GetHashedString(string str)
    {
        var mas = new int[26];
        foreach (var c in str) mas[c - 'a']++;
        return string.Join(" ", mas);
    }
}
//225ms 72,3%
//51,5mb 14,81%
