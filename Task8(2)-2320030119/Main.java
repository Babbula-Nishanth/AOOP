import java.util.HashMap;
import java.util.Map;

class GradeManager {
    private Map<Integer, Double> studentGrades;

    public GradeManager() {
        studentGrades = new HashMap<>();
    }

    public void addGrade(int studentId, double grade) {
        studentGrades.put(studentId, grade);
        System.out.println("Grade added for student ID: " + studentId + " -> Grade: " + grade);
    }

    public Double getGrade(int studentId) {
        return studentGrades.get(studentId);
    }

    public void displayAllGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Student Grades:");
            for (Map.Entry<Integer, Double> entry : studentGrades.entrySet()) {
                System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();

        gradeManager.addGrade(101, 88.5);
        gradeManager.addGrade(102, 92.0);
        gradeManager.addGrade(103, 75.5);

        System.out.println("Grade of student with ID 102: " + gradeManager.getGrade(102));

        gradeManager.displayAllGrades();
    }
}
