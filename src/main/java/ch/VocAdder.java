package ch;

import java.util.*;

/*
 * Fragt nach Vokabeln, Deutsch, Spanisch und später: selber klassifizieren, zunächst Frage nach Kategorie.
 * 
 */
public class VocAdder {

    public void addToList(HashSet<Vokabel> vocabs){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Vok. hinzufügen? 1 - ja, 0 - no");
        int answer = sc.nextInt();
        while (answer == 1){
            System.out.println("Deutsch: ");
            String deutsch = sc.nextLine();
            System.out.println("Spanisch: ");
            String spanisch = sc.nextLine();
            //später hier Classifier: basierend auf deutsch und/oder spanisch
            System.out.println("Kategorie: (1 = Verb, 2 = Adjektiv, 3 = Nomen)");
            int kat = sc.nextInt(); 
            vocabs.add(new Vokabel(deutsch, spanisch, kat)); 
        }
        sc.close();
    }
    
}
