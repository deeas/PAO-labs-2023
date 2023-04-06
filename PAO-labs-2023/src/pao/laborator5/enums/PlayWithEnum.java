package pao.laborator5.enums;

enum Day {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
}

enum Month {
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JULY
}

public class PlayWithEnum {
    public enum seasons {
        Spring,
        Summer,
        Monsoon,
        Autumn,
        Winter
    }

    public static void main(String[] args) {

        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction());
        }

        //////////////////////////////
        /*Both == operator and .equals() method are meant for comparison only. But there are few differences :
        == operator never throws NullPointerException whereas .equals() method can throw NullPointerException.
        == is responsible for type compatibility check at compile time whereas .equals() method will never worry about the types of both the arguments.
     */
        // Comparing two enum members which are from different enum type
        // using == operator
        //System.out.println(Month.JAN == Day.MON);

        // Comparing two enum members which are from different enum type
        // using .equals() method
        System.out.println(Month.JAN.equals(Day.MON));

        //////////////
        // iterate over enums using for loop
        for (seasons s : seasons.values()) {
            System.out.println(s);
        }
    }
}
