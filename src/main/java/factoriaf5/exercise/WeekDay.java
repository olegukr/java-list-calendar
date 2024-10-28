package factoriaf5.exercise;
import java.util.ArrayList;
import java.util.List;

public class WeekDay {

    public List<String> days;

    public WeekDay() {
        createList();
    }

    public void createList() {
        days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        
            // DaysOfWeek.

        // String[] daysOfWeek = 
        // {
        //     "Monday", 
        //     "Tuesday", 
        //     "Wednesday", 
        //     "Thursday", 
        //     "Friday", 
        //     "Saturday", 
        //     "Sunday", 
        // };
    }

    // public void render() {
    //     System.out.println(days);
    // }

    public List<String> getDays() {
        return days;
    }

    public int getSizeList() {
        return days.size();
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public void deleteDay(int dayNum) {
        days.remove(dayNum);
    }

    public String getSpecificDayByName(String day) {
        return days.get(days.indexOf(day));
    }

    public String getSpecificDayByIndex(int index) {
        return days.get(index);
    }

}