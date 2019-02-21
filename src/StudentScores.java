public class StudentScores {
    public static void main (String [] args) {
        final int NUM_POINTS = 4;
        int[] dataPoints = new int[NUM_POINTS];
        int minValue;
        int i;

        dataPoints[0] = 2;
        dataPoints[1] = 12;
        dataPoints[2] = 9;
        dataPoints[3] = 20;

        minValue = 10;

        /* Your solution goes here  */
        for (i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i]<minValue){
                dataPoints[i]*=2;
            }

        }

        for (i = 0; i < dataPoints.length; ++i) {
            System.out.print(dataPoints[i] + " ");
        }
        System.out.println();
    }
}