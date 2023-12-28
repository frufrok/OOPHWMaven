package Task5;
import junit.framework.TestCase;
import java.util.ArrayList;

public class ProgramTest extends TestCase {

    public void testContains() {
        // given
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> emptyList = new ArrayList<>();

        // when
        list.add("string");

        // then
        assertTrue(Program.contains(list,"string"));
        assertFalse(Program.contains(list, "newString"));
        assertFalse(Program.contains(emptyList, "string"));
    }

    public void testHasExactly() {
        // given
        ArrayList<String> values = new ArrayList<>();

        // when
        String checkValue = "1";
        String controlValue = "2";

        // then
        assertFalse(Program.hasExactly(values, checkValue));

        // when
        values.add(checkValue);

        // then
        assertTrue(Program.hasExactly(values, checkValue));
        assertFalse(Program.hasExactly(values, controlValue));

        // when
        values.add(checkValue);

        // then
        assertFalse(Program.hasExactly(values, checkValue));
    }

    public void testUnique() {
        // given
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("2");
        ArrayList<String> emptyList = new ArrayList<>();

        // when
        ArrayList<String> uniqueList1 = new ArrayList<>(Program.unique(list));
        ArrayList<String> uniqueCheck = new ArrayList<>();
        boolean flag = true;
        for (String value : uniqueList1) {
            if (uniqueCheck.contains(value)) {
                flag = false;
            }
            else {
                uniqueCheck.add(value);
            }
        }
        ArrayList<String> uniqueList2 = new ArrayList<>(Program.unique(emptyList));

        // then
        assertTrue(flag);
        assertEquals(uniqueList2.size(), 0);
    }
}