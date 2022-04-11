package se.lexicon.Sudipta;


import java.time.LocalDate;



public class JavaTimeExercise {

    public static void main(String[] args) {

        DateTime();
        DifferentDateTimeFormat();
    }

    public static void DateTime() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is :--" + today);
    }

    public static void DifferentDateTimeFormat() {
        LocalDate today1 = LocalDate.now();
        System.out.println(today1);

    }
}