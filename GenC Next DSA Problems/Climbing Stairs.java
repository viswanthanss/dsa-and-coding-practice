class Solution {
    public int climbStairs(int n) {
        // Base cases: if n is 1 or 2, return n directly
        if (n == 1) return 1;
        if (n == 2) return 2;

        // ways to the step before previous step
        int waysToStepBeforePrev = 1; // step 1
        // ways to the previous step
        int waysToPrevStep = 2;       // step 2
        // ways to the current step
        int waysToCurrentStep = 0;

        // Start counting from step 3 to step n
        for (int step = 3; step <= n; step++) {
            // Ways to reach current step = ways to (prev step) + ways to (step before prev)
            waysToCurrentStep = waysToPrevStep + waysToStepBeforePrev;

            // Shift values for next loop iteration
            waysToStepBeforePrev = waysToPrevStep; // move prev into beforePrev
            waysToPrevStep = waysToCurrentStep;    // move current into prev
        }

        // At the end, current step will hold answer
        return waysToCurrentStep;
    }
}
