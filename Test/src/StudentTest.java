public class StudentTest {
    public static void main(String[] args) {
        String[][] marksArray = {
                {"name1", "24"},
                {"name2", "80"},
                {"name3", "84"},
                {"name2", "90"}
        };

        String studentWithHighestAverage = findStudentWithHighestAverage(marksArray);

        System.out.println("Student with the highest average mark: " + studentWithHighestAverage);
    }

    private static String findStudentWithHighestAverage(String[][] marksArray) {
        double highestAverage = 0.0;
        String studentWithHighestAverage = "";

        for (String[] marks : marksArray) {
            String studentName = marks[0];
            int mark = Integer.parseInt(marks[1]);

            if (mark > 100 || mark < 0) {
                throw new IllegalArgumentException("Invalid mark: " + mark);
            }

            if (studentName.isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty");
            }

            double average = calculateAverage(marksArray, studentName);

            if (average > highestAverage) {
                highestAverage = average;
                studentWithHighestAverage = studentName;
            }
        }

        return studentWithHighestAverage;
    }

    private static double calculateAverage(String[][] marksArray, String studentName) {
        int sum = 0;
        int count = 0;

        for (String[] marks : marksArray) {
            if (marks[0].equals(studentName)) {
                int mark = Integer.parseInt(marks[1]);
                sum += mark;
                count++;
            }
        }

        return (double) sum / count;
    }
}
