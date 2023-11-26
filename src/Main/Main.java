package Main;

import Vista.MainGUI;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        //UIManager.setLookAndFeel();
        
        MainGUI ventana = new MainGUI();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
