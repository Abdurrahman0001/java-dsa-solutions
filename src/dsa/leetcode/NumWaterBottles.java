package dsa.leetcode;

public class NumWaterBottles {
    public static void main(String[] args) {
        int numWaterBottles = 15;
        int numExchange = 4;
        int ans = numExchange(numWaterBottles, numExchange);
        System.out.println(ans);
    }

    private static int numExchange(int numWaterBottles, int numExchange) {

        int ans = numWaterBottles;
        while (numWaterBottles >= numExchange){
            int newBottles = numWaterBottles / numExchange;
            int remBottle = numWaterBottles % numExchange;
            ans  = ans + newBottles;
            numWaterBottles = newBottles + remBottle;
        }
        return ans;
    }
}
