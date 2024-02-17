package java8_miscellaneous;

public class switch_statement {
    public static void main(String[] args){

        //switch statement
        Fruit fruit = Fruit.ORANGE;
        int numberOfLetters = switch (fruit){
            case PEAR -> 4;
            case APPLE, MANGO, GRAPE -> 5;
//            case ORANGE, PAPAYA -> 6;
            case ORANGE, PAPAYA ->{
                String s = fruit.name();
                int result = s.length();
                yield result;
            }

        };
        System.out.println(numberOfLetters);
    }
    private enum Fruit{
        PEAR,APPLE,MANGO,GRAPE,ORANGE,PAPAYA;
    }
}
