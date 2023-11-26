package Main;

import Vista.MainGUI;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            MainGUI ventana = new MainGUI();
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
        }
    }
}
