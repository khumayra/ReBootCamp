package Java;

public class FinRa {
    //Write a program that prints out the numbers from 1 to 30 but numbers which are a multiple of 3, print "FIN"
    //instead fo the number and for numbers which are multiple of 5, print "RA" instead of the number. For numbers
    //which are a multiple of both 3 and 5 print "FINRA" instead of the number
    public static void main(String[] args) {
        makeFinRa();
    }

    public static void makeFinRa(){
        for (int i=1; i<=30;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else if (i%3==0){
                System.out.println("FIN");
            } else if (i%5==0){
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}
