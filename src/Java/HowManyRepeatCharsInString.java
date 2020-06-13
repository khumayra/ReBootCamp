package Java;

public class
HowManyRepeatCharsInString {
    public static void main(String[] args) {
        qtyOfEachCharInString("java");
    }

    public static void qtyOfEachCharInString(String str){
        String check="";
        outerLoop: for (int i = 0; i < str.length() ; i++) {
            char currentChar = str.charAt(i);
            if (check.contains(currentChar+"")) continue ;
            int count =0;
            innerLoop: for (int j=0; j<str.length();j++){
                if(currentChar == str.charAt(j)) count++;
            }
            System.out.println("Current char is "+ currentChar +" count in string is "+count);
            check+=currentChar;
        }
    }
}
