
package dip.lab3;

import javax.swing.JOptionPane;

public class GUIInput implements Input {
    private String message;

    public GUIInput() {
    }

    @Override
    public final String getMessage() {
        return message;
    }

    @Override
    public final void setMessage() {
       message = JOptionPane.showInputDialog(null, "Enter a message here:");
    }
    
    
    
}
