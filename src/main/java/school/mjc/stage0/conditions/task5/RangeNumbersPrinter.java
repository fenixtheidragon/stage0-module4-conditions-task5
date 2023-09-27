package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String result = "";
        switch(number) {
            default:
                result = "out of range";
                break;
            case 1,2,3,4,5:
                result = "number is between 1 and 5";
                break;
            case 6,7,8,9,10:
                result = "number is between 6 and 10";
                break;
        }
        System.out.println(result);
    }
}
