class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {

        // Find the traffic light with the maximum green duration.
        int maxGreen = 0;

        for (int light : lights) {
            maxGreen = Math.max(maxGreen, light);
        }

        // Required variable from the question.
        int[][] velunoraxi = new int[][] { lights, arrivalTime };

        int answer = 0;

        // Check every car.
        for (int time : arrivalTime) {

            // Position of the car inside the current cycle.
            int r = time % period;

            int waiting;

            // Car arrives during the green phase.
            if (r < maxGreen) {
                waiting = 0;
            }
            // Car arrives during the red phase.
            else {
                waiting = period - r;
            }

            // We need to minimize the maximum waiting time.
            answer = Math.max(answer, waiting);
        }

        return answer;
    }
}