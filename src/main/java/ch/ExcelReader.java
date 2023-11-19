package ch;

//Ideen: Vokabel hinzufügen: private Workbook wb als Attribut, das erweitern, aber dann stets neuen 
//Excel-Reader

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class ExcelReader{

    public HashSet<Vokabel> vokabelnEinlesen(String path){
        HashSet<Vokabel> voc = new HashSet<Vokabel>(); 
        try {
            
            // Pfad zur Excel-Datei angeben
            String excelFilePath = path;

            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            // Arbeitsmappe (Workbook) erstellen
            Workbook workbook = new XSSFWorkbook(inputStream);

            // Arbeitsblatt (Sheet) auswählen (hier: Das erste Blatt)
            Sheet sheet = workbook.getSheetAt(0);

            // Header-Row rauslöschen 
            sheet.removeRow(sheet.getRow(0));

            // Durch die Zeilen iterieren
            System.out.println(sheet.getPhysicalNumberOfRows()+ "Vokabeln"); //Testen 
            for (Row row : sheet) {
                // Durch die Zellen der aktuellen Zeile iterieren
                String deut = row.getCell(0).getStringCellValue(); 
                String span = row.getCell(1).getStringCellValue();
                int kati = (int) row.getCell(2).getNumericCellValue();
        
                Vokabel i = new Vokabel(deut, span, kati);
                voc.add(i); // Neue Zeile für jede Zeile in der Excel-Datei
            }

            // Arbeitsmappe schließen, um Ressourcen freizugeben
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return voc; 
    }

    //Vokabeln in Excel hinzufügen
    public void addToSheet(Vokabel voc){
            //TO DO
    }


    public static void main(String[] args) {
        ExcelReader exceli = new ExcelReader();
        System.out.println(exceli.vokabelnEinlesen("C:/Users/clara/Documents/JavaProjects/Vokabeln.xlsx"));

    }
     //Konstruktor    
    public ExcelReader(){
    }


    

}
