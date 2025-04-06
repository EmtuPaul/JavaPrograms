public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double max = cgpa[0];
        double sLargest = Double.MIN_VALUE;

        for (int i = 1; i < cgpa.length; i++) {
            if (cgpa[i] > max) {
                sLargest = max;
                max = cgpa[i];
            } else if (cgpa[i] > sLargest && cgpa[i] != max) {
                sLargest = cgpa[i];
            }
        }

        System.out.println("2nd highest CGPA: " + sLargest);
    }
}



