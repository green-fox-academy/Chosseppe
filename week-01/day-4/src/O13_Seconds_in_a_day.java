public class O13_Seconds_in_a_day {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
        int minute_seconds = 60;
        int hour_seconds = 60 * minute_seconds;
        int day_hours = 24;

        System.out.println((day_hours * hour_seconds) - (currentHours * hour_seconds + currentMinutes * minute_seconds + currentSeconds));

    }
}
