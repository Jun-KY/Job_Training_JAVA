package J25_06_04;

public class Logical_operator {
    public static void main(String[] args){
        boolean hasID = true;
        int age = 20;

        if(age >= 18 && hasID) {
            System.out.println("access granted");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday){
            System.out.println("Rest");
        }

        boolean isRaining = true;
        if (!isRaining){
            System.out.println("Can go out");
        }else{
            System.out.println("Bring umbrella");
        }
    }
}
