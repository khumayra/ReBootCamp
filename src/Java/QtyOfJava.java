package Java;

public class QtyOfJava {
    public static void main(String[] args) {
        qtyOfJavaMethod("javajavajavajavajava");
    }
    public static void qtyOfJavaMethod(String str){
        int count=0;
        for (int i = 0; i <str.length()-3 ; i++) {
            if(str.substring(i,i+4).equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
