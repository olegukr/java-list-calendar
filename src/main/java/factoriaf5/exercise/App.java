package factoriaf5.exercise;

public final class App {

    public static void main(String[] args) {

        WeekDay weekDay = new WeekDay();
        System.out.println(weekDay.getDays());
        weekDay.sortByAlphabet();
        System.out.println(weekDay.getDays());
    }
}
