public class ClimbingStairs {
    public int climbStairs(int n) {
        return climbStairsIter(n,0,1,2);
    }

    int climbStairsIter(int n,  int dpWay,int dp1, int dp2) {
        if (n <= 1) return dp1;
        if (n == 2) return dp2;
        if ((n--) > 2) {
            dpWay = dp1 + dp2;
            dp1 = dp2;
            dp2 = dpWay;
            return climbStairsIter(n, dpWay, dp1, dp2);
        }
        else return dpWay;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.climbStairs(5);
        System.out.println(result);
    }
}
