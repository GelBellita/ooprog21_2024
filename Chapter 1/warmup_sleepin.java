public class warmup_sleepin {

public static boolean canSleepIn(boolean isWeekday, boolean isOnVacation) {
        if (isOnVacation) {
            // can sleep in if  on vacation
            return true;
        } else if (!isWeekday) {
            // can sleep in if it's not a weekday
            return true;
        } else {
            // cannot sleep in if it is a weekday and not on vacation
            return false;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(canSleepIn(false, false)); //true: weekend
        System.out.println(canSleepIn(true, false));  //false: weekday
        System.out.println(canSleepIn(false, true));  //true: vacation
    }
}