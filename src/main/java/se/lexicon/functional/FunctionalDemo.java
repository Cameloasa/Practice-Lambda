package se.lexicon.functional;

import java.util.regex.Pattern;

public class FunctionalDemo {

    static DoStringStuff concatOperator = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            return s1 + s2;
        }
    };

    static DoubleOperator additionalOperator = new DoubleOperator() {
        @Override
        public double apply(double n1, double n2) {
            return n1 + n2;
        }
    };

    static DoubleOperator subtractionOperator = new DoubleOperator() {
        @Override
        public double apply(double n1, double n2) {
            return n1 -n2;
        }
    };
    static StringValidator isNotNull = new StringValidator() {
        @Override
        public boolean validate(String input) {
            return input != null;
        }
    };

    static StringValidator mobileValidator = new StringValidator() {
        @Override
        public boolean validate(String input) {
            return input != null && Pattern.compile("^\\d{10}$").matcher(input).matches();
        }
    };

    public static double calcOperator(double n1, double n2, DoubleOperator operator) {
        return operator.apply(n1, n2);
    }

    public static boolean doValidOperator(String input, StringValidator operator){
        return operator.validate(input);
    }






    public static void main(String[] args) {
        BiggestStringOperator biggestString = new BiggestStringOperator();
        System.out.println(biggestString.operate("ABC", "ABCD"));

        System.out.println(concatOperator.operate("Hello," , " Java !"));
        System.out.println(additionalOperator.apply(10d,15d));
        System.out.println(subtractionOperator.apply(25,13));
        System.out.println(isNotNull.validate("Text"));
        System.out.println(mobileValidator.validate("1234567890"));

        System.out.println(calcOperator(40, 3, additionalOperator));
        System.out.println(calcOperator(40, 3, subtractionOperator));

        System.out.println(doValidOperator("Hello", isNotNull));
        System.out.println(doValidOperator("1234567890", mobileValidator ));
    }
}



