//Напишете програма, в която дефинирате 2 int променливи - month & day.
//Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително)
//и 20-ти юни (включително) и false, в противен случай.

public class Exercise_04_SpringSeason_2 {
    public static void main(String[] args) {

        int month = 4;
        int day = 31;

        String result = (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20) ? "true" : "false";

        System.out.println(result);
    }
}
