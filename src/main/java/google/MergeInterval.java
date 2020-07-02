package google;

import java.util.*;

public class MergeInterval {

    /**
     * Given a collection of intervals, merge all overlapping intervals.
     *
     * Example 1:
     *
     * Input: [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     * Example 2:
     *
     * Input: [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     * @param args
     */
    public static void main(String [] args) {
        int[][] integers = {{1,3},{2,6},{8,10},{15,18}};
        mergeIntervals(integers);
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        //if only single integer return back
        if(intervals.length <=1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        // add first interval
        int[] addedInterval = intervals[0];
        result.add(addedInterval);

        // start from second interval
        for(int i=1; i < intervals.length; i++) {

            int[] current = intervals[i];
            // if current intervals starting range is less than previous interval ending range
            // then we have a overlap. so do not add to the list instead update the current interval in the list
            if (current[0] <= addedInterval[1]) {
                addedInterval[1] = Math.max(current[1],addedInterval[1]);
            } else {
                result.add(current);
                addedInterval = current;
            }
        }

        return result.toArray(new int[result.size()][]);
    }


}
