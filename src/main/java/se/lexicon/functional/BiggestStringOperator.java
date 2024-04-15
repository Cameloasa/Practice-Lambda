package se.lexicon.functional;

public class BiggestStringOperator implements DoStringStuff{
    @Override
    public String operate(String s1, String s2) {
        //Compare 2 strings by length
        /*if (s1.length() >= s2.length()){
            return s1;
        } else {
            return s2;
        }*/
        // using lambda
        //(s1.length() >= s2.length()) ? s1 : s2;
        return (s1.length() >= s2.length()) ? s1 : s2;
    }
}
