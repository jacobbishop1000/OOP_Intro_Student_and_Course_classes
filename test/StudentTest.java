import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrollCourseTest(){
        Student aStudent = new Student(1, "Mark");
        Course aCourse = new Course(12, 111, "CS222", "A course", 3);
        aStudent.enrollCourse(aCourse);
        assertEquals(true, aStudent.getEnrolledCourses().contains(aCourse));
    }
    @Test
    void setGradeWhenCourseIsIncludedTest(){
        Student aStudent = new Student(1, "Mark");
        Course aCourse = new Course(12, 111, "CS222", "A course", 3);
        aStudent.enrollCourse(aCourse);
        assertEquals(true, aStudent.setGrade(aCourse, 80.0));
    }
    @Test
    void setGradeWhenCourseIsNotIncludedTest(){
        Student aStudent = new Student(1, "Mark");
        Course anotherCourse = new Course(11, 222, "CS224", "Another course", 3);
        assertEquals(false, aStudent.setGrade(anotherCourse, 80.0));
    }
    @Test
    void calculateGPATest(){
        Course aCourse = new Course(12, 111, "CS222", "A course", 3);
        Course anotherCourse = new Course(11, 222, "CS224", "Another course", 3);
        Student aStudent = new Student(1, "Mark");
        aStudent.enrollCourse(aCourse);
        aStudent.enrollCourse(anotherCourse);
        aStudent.setGrade(aCourse, 100.0);
        aStudent.setGrade(anotherCourse, 80.0);
        assertEquals(90.0, aStudent.calculateGPA());
    }


}