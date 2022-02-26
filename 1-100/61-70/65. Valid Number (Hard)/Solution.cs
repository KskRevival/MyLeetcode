using System.Text.RegularExpressions;

public class Solution {
    public bool IsNumber(string s)
    {
        const string patternWithE = @"^[+-]?[0-9]+\.?[0-9]*[eE][+-]?[0-9]+$";
        const string patternWithEBefore = @"^[+-]?[0-9]*\.?[0-9]+[eE][+-]?[0-9]+$";
        const string patternWithNoE = @"^[+-]?[0-9]+\.?[0-9]*$";
        const string patternWithNoEBefore = @"^[+-]?[0-9]*\.?[0-9]+$";
        return Regex.IsMatch(s, patternWithE) || Regex.IsMatch(s, patternWithNoE)
            || Regex.IsMatch(s, patternWithEBefore) || Regex.IsMatch(s, patternWithNoEBefore);
    }
}
//190 ms 
//39.7 MB 
