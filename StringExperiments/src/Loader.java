
public class Loader{
    public static void main(String[] args){
        String text = "Вася заработала    50005     рублей, Петя - 7563 рубля, а Маша -     30000777      рублей";
        
        int rubFirst = text.indexOf(" руб");
        String earn = " заработал";
        int earnLength = text.indexOf(earn) + earn.length();
        String gap = " ";
        int gapIndex = text.indexOf(gap,earnLength);

        String workerSalary1 = text.substring(gapIndex, rubFirst).trim();
        System.out.println(workerSalary1);

        int rubLast = text.lastIndexOf(" руб");
        String dash = " - ";
        int dashLastIndex = text.lastIndexOf(dash) + dash.length();

        String workerSalary2 = text.substring(dashLastIndex, rubLast).trim();
        System.out.println(workerSalary2);

        int salary = Integer.parseInt(workerSalary2) + Integer.parseInt(workerSalary1);
        System.out.println("Сумма зарплат: " + salary);
    }
}