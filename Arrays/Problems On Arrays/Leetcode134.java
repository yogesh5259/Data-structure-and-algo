public class Leetcode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0, costSum = 0;

        //check the sum if it solution is possible or not
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
        }

        if (gasSum < costSum)
            return -1;

        //garunted the solution is present
        int total = 0, ans = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                ans = i + 1;
            }
        }
        return ans;
    }
}