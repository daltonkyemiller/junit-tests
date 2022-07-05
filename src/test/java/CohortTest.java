import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CohortTest {
    Cohort umbriel;

    @Before
    public void setUp() {
        umbriel = new Cohort();
        Student student1 = new Student(0, "John Doe");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(100);
        Student student2 = new Student(1, "Jane Doe");
        student2.addGrade(100);
        student2.addGrade(75);
        student2.addGrade(85);
        Student student3 = new Student(2, "Jack Doe");
        student3.addGrade(100);
        student3.addGrade(90);
        student3.addGrade(85);
        umbriel.addStudent(student1);
        umbriel.addStudent(student2);
        umbriel.addStudent(student3);
    }

    @Test
    public void testAddStudent(){
        assertEquals(3, umbriel.getStudents().size());
        assertEquals("John Doe", umbriel.getStudents().get(0).getName());
    }

    @Test
    public void testCohortAverage() {
        assertEquals(90.7, umbriel.getCohortAverage(), 0.01);
    }

    @Test
    public void testGetStudents(){
        assertEquals(3, umbriel.getStudents().size());
        assertNotNull(umbriel.getStudents());
    }
}
