import java.util.Arrays;

public class ControlFlowExercises {
    public static void main(String[] args) {
////        int i =5;
////        while (i  <= 15){
////            System.out.print(i+" ");
////            i++;
////        }
//        for (int i = 5; i <= 15; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int intdownby5 = 100; intdownby5 >=-10; intdownby5 -=5){
//            System.out.println(intdownby5);
//        }
//
////        int intdownby5 =100;
////        do {
////            System.out.println(intdownby5);
////            intdownby5 -=5;
////        }while (intdownby5 >= -10);
//        System.out.println();
//        for (int squaredof2 =2; squaredof2 <100000; squaredof2 = (int) Math.pow(squaredof2,2)){
//            System.out.println(squaredof2);
//        }
//
////        int squaredof2 = 2;
////        do {
////            System.out.println(squaredof2);
////            squaredof2 = (int) Math.pow(squaredof2,2);
////        }while (squaredof2 < 1000000);

        for (int frezzbuzz =1; frezzbuzz <=100; frezzbuzz++){
            System.out.print("["+frezzbuzz+"]");
            if (frezzbuzz % 3 == 0 && frezzbuzz % 5 ==0) {
                System.out.print(" FrizzBuzz");
            }else if (frezzbuzz % 3 ==0){
                System.out.print(" Frizz");
            }else if (frezzbuzz % 5==0){
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}
