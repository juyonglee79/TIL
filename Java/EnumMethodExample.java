public class EnumMethodExample {
    public static void main(String[] args){
        Week today = Week.Sunday;
        String name = today.name();
        System.out.println(name);

        int ordinal = today.ordinal();
        System.out.println(ordinal);

        Week day1 = Week.Monday;
        Week day2 = Week.Wednesday;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        if(args.length ==1){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.Saturday || weekDay == Week.Sunday){
                System.out.println("주말이네요!");
            } else {
                System.out.println("평일이네요...");
            }
        }
        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }
    }
}
