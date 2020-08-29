package Gun37.InstanceModifiers.publicModifier.other;

import Gun37.InstanceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {

        // diger paketteki bu constructor a ulaşabildim, çunku public

        SearchEngine microsoft = new SearchEngine("explorer");

        microsoft.name = "Edge";   // diger paketteki bu fields e ulaşabildim.

        System.out.println("microsoft = " + microsoft);

    }
}
