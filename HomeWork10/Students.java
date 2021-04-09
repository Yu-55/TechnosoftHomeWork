package HomeWork10;

import java.util.Arrays;

public class Students {

    static String schoolName = "ABC School";
    static String[] offeredCourses = {"QA", "Web", "PM"};
    static double[] feesCourses = {1000, 2000, 3000};
    static int totalStudents = 0;

    String studentName = "n/a";
    String studentEnrolledCourse;
    int studentId;
    String studentAddress;
    double studentFeeBalance;
    double totalStudentPaid = 0;

    public void enrollStudent(String name, String addr, String course) {
        boolean isCourseAvailable = false;
        for (int i = 0; i < offeredCourses.length; i++) {
            if (offeredCourses[i].equalsIgnoreCase(course)) {
                totalStudents++;
                studentId = totalStudents;
                isCourseAvailable = true;
                studentName = name;
                studentEnrolledCourse = offeredCourses[i];
                studentFeeBalance = feesCourses[i];
                studentAddress = addr;
                break;
            }
        }
        if (isCourseAvailable) {
            System.out.println("Enrollment done successfully. Student's ID is: " + studentId);
        } else {
            System.out.println("Requested course " + course + " is not available");
        }
    }

    public void displayStudentProfile() {
        System.out.println("Student id : " + studentId +
                "\nStudent name: " + studentName +
                "\nStudent course: " + studentEnrolledCourse);
    }

    public double feeDeposit(double deposit) {
        if (deposit > studentFeeBalance) {
            System.out.print("Your deposit should be less or equal to your balance");
            return studentFeeBalance;
        }
        totalStudentPaid += deposit;
        return studentFeeBalance - deposit;
    }

    public void changeCourse(String newCourse) {

        if (newCourse.trim().length() == 0) {
            System.out.println("Invalid course entered");
        } else if (newCourse.equalsIgnoreCase(studentEnrolledCourse)) {
            System.out.println("Same course entered");
        } else {
            for (int l = 0; l < offeredCourses.length; l++) {
                if (offeredCourses[l].equalsIgnoreCase(newCourse)) {
                    studentFeeBalance = feesCourses[l] - totalStudentPaid;
                    if (studentFeeBalance < 0) {
                        studentFeeBalance = 0;
                    }
                    studentEnrolledCourse = offeredCourses[l];
                    break;
                } else if (l == offeredCourses.length - 1) {
                    System.out.println("Invalid course entered");
                    break;
                }
            }
        }
    }

    static void schoolSummary() {
        String coursesOffered = "";
        for (String course : offeredCourses) {
            coursesOffered += course + "\n";
        }
        System.out.println("School Name: " + schoolName +
                "\nCourses Offered:\n" + coursesOffered +
                "Total number of students: " + totalStudents);
    }
}

