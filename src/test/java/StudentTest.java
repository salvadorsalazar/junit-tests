import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {


private Student student1;
@Before
    public void setup(){
    ArrayList<Integer> grades = new ArrayList<>();
grades.add(55);
grades.add(65);
    student1 = new Student("sal",grades, 465716864L);
}

@Test
    public void testGetId(){
    assertEquals(465716864,student1.getId());
}


@Test
    public void testGetname(){
    assertEquals("sal", student1.getName());
    }

    @Test
    public void testGetGrade(){
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(55);
////        grades1.add(65);

    assertEquals(grades1,student1.getGrades());
    }
}
