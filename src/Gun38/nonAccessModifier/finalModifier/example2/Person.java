package Gun38.nonAccessModifier.finalModifier.example2;

public class Person {

    String name;

    final int fingerprintCode;

    public Person(String name, int fingerprintCode){

        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }

    // final degiskenlerine ilk deger atama işlemi direk
    // yapılabildigi gibi constructorla da atanabilir.
    // ancak daha sonra yine degeri degistirilemez.
    // bu işlem ilk deger atama için geçerli.



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}
