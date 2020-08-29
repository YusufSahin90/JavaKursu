package Gun13;

import java.util.Scanner;

public class SwitchCase6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // girilen bir ay numarasına göre, ayın kaç gün olduğunu görünüz.

     //   System.out.println("bir ay giriniz: ");
      //  int sayı = sc.nextInt();



//        switch (sayı){
//            case 1:
//                System.out.println("31");
//                break;
//            case 2:
//                System.out.println("29");
//                break;
//            case 3:
//                System.out.println("30");
//                break;
//            case 4:
//                System.out.println("31");
//                break;
//            case 5:
//                System.out.println("30");
//                break;
//            case 6:
//                System.out.println("31");
//                break;
//            case 7:
//                System.out.println("30");
//                break;
//            case 8:
//                System.out.println("31");
//                break;
//            case 9:
//                System.out.println("30");
//                break;
//            case 10:
//                System.out.println("31");
//                break;
//            case 11:
//                System.out.println("30");
//                break;
//            case 12:
//                System.out.println("30");
//                break;

        // *******************  2. Yöntem ********************


        System.out.print("yıl =");
        int sayı= sc.nextInt();

        switch (sayı)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31"); break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30"); break;
            case 2:

                if (sayı%4==0)
                    System.out.println("29");
                else
                    System.out.println("28");
                break;

            default: System.out.println("Hatalı no");
        }






    }
    }

