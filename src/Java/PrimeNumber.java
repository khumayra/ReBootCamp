package Java;
//Create method that will accept a number a print all the prime number from 2 to that given number

public class PrimeNumber {
    public static void main(String[] args) {
        getPrimeNumbers(24);
    }

    public static void getPrimeNumbers(int num){
        //24, Prime numbers are only divisible by itself and one
        for(int i=2; i<=num;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

