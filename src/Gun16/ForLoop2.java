package Gun16;

public class ForLoop2 {

    public static void main(String[] args) {

        // 0 dan 10 a kadar (0 ve 10) dahil sayıları ekrana yazdırınız.
        // 10 dan 0 a kadar (0 ve 10) dahil sayıları ekrana yazdırınız.

        for(int i = 0; i <= 10; i++){

            System.out.println("ileri dogru: " + i);
        }
        for (int i = 10; i >= 0; i--){
            System.out.println("geriye dogru: " + i);

        }
    }
}
