package Gun37.classModifiers.packageTwo;


import Gun37.classModifiers.packageOne.PublicModifierClass;

public class OtherPackageClass {
    public static void main(String[] args) {

        // Diger paketten defaulta erişemedik.

        PublicModifierClass sm3 = new PublicModifierClass();
//        DefaultModifierClass sm1 = new DefaultModifierClass();
    }
}
