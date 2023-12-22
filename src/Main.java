public class Main {
    public static void main(String [] args) {
        Time time1 = new Time(8, 9, 58);
        System.out.println(time1.info());
        time1.tick();
        System.out.println(time1.info());
        Time time2 = new Time(15, 59, 58);
        System.out.println(time2.info());
        time2.tick();
        System.out.println(time2.info());
        Time time3 = new Time(10, 14, 43);
        System.out.println(time3.info());
        Time time4 = new Time(8, 30, 29);
        time3.add(time4.info());
        System.out.println(time3.info());
        System.out.println(time4.info());
        Time time5 = new Time(7, 20, 0);
        time3.add(time5);
        System.out.println(time3.info());
    }
}
