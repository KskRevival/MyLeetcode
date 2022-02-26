public class Solution {
    public int[][] Merge(int[][] intervals)
    {
        int? start = null;
        var end = 0;
        Array.Sort(intervals, CompareIntervals);
        var ans = new List<int[]>();
        foreach (var interval in intervals)
        {
            if (!start.HasValue)
            {
                start = interval[0];
                end = interval[1];
                continue;
            }

            if (interval[0] > end)
            {
                ans.Add(new []{(int) start, (int) end});
                start = interval[0];
            }

            end = Math.Max(interval[1], end);
        }

        if (start.HasValue) ans.Add(new[] {(int) start, (int) end});
            return ans.ToArray();
    }

    private static int CompareIntervals(int[] a, int[] b)
    {
        return a[0] - b[0] != 0 ? a[0] - b[0] : a[1] - b[1];
    }
}
//265ms, 35.51%
//46.8 MB, 42.81%
