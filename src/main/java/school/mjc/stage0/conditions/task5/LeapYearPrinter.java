package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result ="";
        int remainderFromDivisionBy4 = year % 4;
        int remainderFromDivisionBy100 = year % 100;
        int remainderFromDivisionBy400 = year % 400;
        switch (remainderFromDivisionBy4) {
            default:
                result = "not leap";
                break;
            case 0:
                switch (remainderFromDivisionBy100) {
                    default:
                        result = "leap";
                        break;
                    case 0:
                        switch (remainderFromDivisionBy400) {
                            default:
                                result = "not leap";
                                break;
                            case 0:
                                result = "leap";
                                break;
                        }
                        break;
                }
                break;
        }
        System.out.println(result);
    }
}
