package ch;

import javax.swing.*;

public class GUI {

    public static void main(String[] args) {
        JFrame meinframe = new JFrame("Vokabeltrainer");
        meinframe.setSize(800, 800);
        JFileChooser chooser = new JFileChooser();
        // Dialog zum Oeffnen von Dateien anzeigen
        chooser.showOpenDialog(null);
        meinframe.getContentPane().add(chooser);
        meinframe.setVisible(true);
        
        
    }

    
}
