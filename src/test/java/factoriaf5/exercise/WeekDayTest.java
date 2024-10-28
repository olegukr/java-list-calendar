package factoriaf5.exercise;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDayTest {

    private WeekDay weekDay;
    

    // @BeforeEach
    // public void setUp() {
    //     WeekDay weekDay = new WeekDay();
    // }

    @Test
    @DisplayName("Test getDaysOfWeek()")
    void testGetDaysOfWeek() {
        // test Object type WeekDay
        WeekDay weekDay = new WeekDay();

        //Given
        ArrayList<String> daysExpected = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        //When
        ArrayList<String> result = (ArrayList<String>) weekDay.getDays();

        //Then
        assertEquals(result, daysExpected);

    }

    @Test
    @DisplayName("Test getSizeList()")
    void testgetSizeList() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.getSizeList(), 7);
    }

    @Test
    @DisplayName("Test testDeleteDay()")
    void testDeleteDay() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.getSizeList(), 7);
    }

    @Test
    @DisplayName("Test getSpecificDayByName(String day)")
    void testGetSpecificDayByName() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.getSpecificDayByName("Tuesday"), "Tuesday");
    }

    @Test
    @DisplayName("Test getSpecificDayByIndex(int index)")
    void testgetSpecificDayByIndex() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.getSpecificDayByIndex(1), "Tuesday");
    }

    @Test
    @DisplayName("Test dayExist(String day)") 
    void testDayExist() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.dayExist("Wednesday"), true);
    }

    @Test
    @DisplayName("Test emptyList()") 
    void testEmptyList() {
        WeekDay weekDay = new WeekDay();
        weekDay.emptyList();
        assertEquals(weekDay.getSizeList(), 0);
    }

    @Test
    @DisplayName("Test sortedByAlphabet()")
    void testSortedByAlphabet() {
       
        WeekDay weekDay = new WeekDay();

        ArrayList<String> daysExpected = new ArrayList<>(Arrays.asList("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday"));

        //When
        weekDay.sortByAlphabet();
        ArrayList<String> result = (ArrayList<String>) weekDay.getDays();

        //Then
        assertEquals(result, daysExpected);
    }

}
