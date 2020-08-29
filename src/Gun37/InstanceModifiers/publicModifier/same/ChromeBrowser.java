package Gun37.InstanceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {

        // public oldugundan rahalıkla ulaşabliyorum aynı paket içinden.
        SearchEngine google = new SearchEngine("chrome");

        google.name = "Chrome";

        System.out.println("google = " + google);
        // toString methoduna gider o da public
    }
}
