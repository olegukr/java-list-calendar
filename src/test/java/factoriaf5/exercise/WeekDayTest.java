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
    @DisplayName("Test int index")
    void testgetSpecificDayByIndex() {
        WeekDay weekDay = new WeekDay();
        assertEquals(weekDay.getSpecificDayByIndex(1), "Tuesday");
    }

//     @Test
//     void testSetDaysOfWeek() {

//     }
//         @Test
//     @DisplayName("Devuelve Fizz si el número es divisible por 5")
//     void testIfdivisibleBy5_ReturnBuzz() {
//         // test Object type Fizzbuzz Inisialisation
        
//         //Given
//         int numb = 5;

//         //When
//         String result = fizzbuzz.checkNumber(numb);

//         //Then
//         assertThat(fizzbuzz, instanceOf(FizzBuzz.class));
//         assertThat(result,is("Buzz"));
// }
}
