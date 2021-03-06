package HomeWork10;

public class School {
    public static void main(String[] args) {
        /**
         Method to display student profile
         ID
         Name
         Course

         name: displayStudentProfile
         */
        Students student1 = new Students();
        student1.enrollStudent("Alex", "LA", "pm");
        student1.displayStudentProfile();

        /**
         Method to fee deposit
         */
        student1.feeDeposit(1200);

        /**
         Student to change course
         Req:
         1. earlier deposited fees should be subtracted from new course fees
         2. Show error (saying, Same course entered) if student enter enrolled course as new course
         3. Show error (saying, Invalid course entered) if student enter a course not offered by school
         */
        student1.changeCourse("qa");
        student1.displayStudentProfile();
        System.out.println(student1.studentFeeBalance);


        /**
         static Method to display school summary:
         School Name
         Courses Offered
         Total number of students
         */
        Students.schoolSummary();
    }
}
