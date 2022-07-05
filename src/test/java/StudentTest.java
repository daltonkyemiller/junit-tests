import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;
    @Before
    public void setUp() {
        student = new Student("Dalton", 5);

        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(50);
    }

    @Test
    public void testConstructor() {

        assertEquals("Dalton", student.getName());
        assertEquals(5, student.getId());
        assertEquals(3, student.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        assertEquals(3, student.getGrades().size());
        assertEquals(100, student.getGrades().get(0).intValue());
    }

    @Test
    public void testGradeAverage() {

        assertEquals(80, student.getGradeAverage(), 0.01);
    }


}
