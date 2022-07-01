import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructor() {
        Student student = new Student("Dalton", 5);

        assertEquals("Dalton", student.getName());
        assertEquals(5, student.getId());
        assertEquals(new ArrayList<>(), student.getGrades());
    }

    @Test
    public void testAddGrade() {
        Student student = new Student("Dalton", 5);

        student.addGrade(100);
        assertEquals(1, student.getGrades().size());
        assertEquals(100, student.getGrades().get(0).intValue());
    }

    @Test
    public void testGradeAverage() {
        Student student = new Student("Dalton", 5);

        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(50);
        assertEquals(80, student.getGradeAverage(), 0.01);
    }


}
