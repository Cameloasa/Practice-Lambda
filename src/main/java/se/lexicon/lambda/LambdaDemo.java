package se.lexicon.lambda;

import se.lexicon.functional.DoStringStuff;
import se.lexicon.functional.DoubleOperator;

import java.util.UUID;

public class LambdaDemo {
    static DoStringStuff concatenate = (str1, str2) -> str1 + " " + str2;


    public static void main(String[] args) {
        //() -> condition
        DoStringStuff getBiggestString = ((s1, s2) -> s1.length() >=s2.length() ? s1 :s2);
        DoubleOperator addition = (n1, n2) -> n1 + n2;
        DoubleOperator subtraction = (n1, n2) -> n1 - n2 ;

        System.out.println(getBiggestString.operate("ABCD","ABCDE"));
        System.out.println(addition.apply(23,13));
        System.out.println(subtraction.apply(24,12));

        // // Printer    void print(String input);
        // () -> condition
        Printer printString = str -> System.out.println(str);
        printString.print("Hello Lambda!");

        // StringRandom () String generate();
        //() -> condition
        StringRandom generateRandomText = () -> UUID.randomUUID().toString();
        printString.print(generateRandomText.generate());

    }

}