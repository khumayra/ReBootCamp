package Java;

public class CalculateSumOfNumbersInString {
    public static void main(String[] args) {
        calculateSumOfNumbers("jav54ai15sgre1at82");
        //expected result is 152;
    }

    public static void calculateSumOfNumbers(String str) {
        String check = "";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
          if(Character.isDigit(str.charAt(i))){
              check+=str.charAt(i);
              if(i==str.length()-1||!Character.isDigit(str.charAt(i+1))){
                  result+=Integer.parseInt(check);
                  check="";
              }
          }
        }
        System.out.println(result);
    }
}
