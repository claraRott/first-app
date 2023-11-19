package ch;

import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in); 
        ExcelReader exceli = new ExcelReader();
        Set<Vokabel> vokabeln = exceli.vokabelnEinlesen("C:/Users/clara/Documents/JavaProjects/Vokabeln.xlsx");
        for (Vokabel v : vokabeln){
            System.out.println(v.getDeutsch());
            System.out.println("Antwort:");
            String antwort = sc.nextLine();
            if(antwort.equals(v.getSpanisch())){
                System.out.println("Korrekt");
            }else{
                System.out.println("Falsch");
            }

        }
        sc.close();


            
    }
}
