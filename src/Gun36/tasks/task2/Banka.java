package Gun36.tasks.task2;

public class Banka {

    // fields

    String name;
    int year;
    String bankaName;

    // Dipnot: boş bir yerde mouse ile sag tıklayıp, Generate seçiyoruz, açılan menu de Constructor u seçiyoruz,
    // orada String name, int year, String bankaName methodlarından hangisini kullanacaksak seçip sonra tamam a tıklayınca
    // aşagıdaki gibi hazır veriyor bize.
    public Banka(String name, int year, String bankaName){

        this.name = name;
        this.year = year;
        this.bankaName = bankaName;

    }

    public Banka(String name, int year){

        // 1. yol uzun
//        this.name = name;
//        this.year = year;
//        this.bankaName = "";

        // 2. yol en iyisi ve kısa
        this(name,year,"");
    }

    public Banka(String name){

        // 1. yol uzun
//        this.name = name;
//        this.year = 0;
//        this.bankaName = "";

        // 2. yol en iyisi ve kısa
        this(name,0,"");
    }

    public Banka(){

        // 1. yol uzun
//        this.name = "";
//        this.year = 0;
//        this.bankaName = "";

        // 2. yol en iyisi ve kısa
        this("",0,"");
    }

    // Dipnot: boş bir yerde mouse ile sag tıklayıp, Generate seçiyoruz, açılan menu de toString i seçiyoruz,
    // orada String name, int year, String bankaName methodlarından hangisini kullanacaksak seçip sonra tamam a tıklayınca
    // aşagıdaki gibi hazır veriyor bize.
    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", bankaName='" + bankaName + '\'' +
                '}';


        // sıfır çıkmaması için
//        String yazilacak = this.name + " " + this.year;
//        if(bankaName > 0) {
//
//            yazilacak = yazilacak + bankaName;
//            return yazilacak;
//        }
    }
}
