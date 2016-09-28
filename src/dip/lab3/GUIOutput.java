
package dip.lab3;
import javax.swing.JOptionPane;

public class GUIOutput implements Output {
    
    @Override
    public final void showMessage(String message){
        JOptionPane.showMessageDialog(null,message);
    }
    
}
