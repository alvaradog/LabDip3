
package dip.lab3;

public class StartUp {
    
    public static void main(String[] args) {        
        
    Input input1 = new ConsoleInput();
    Output output1 = new GUIOutput();
    MessageManager message = new MessageManager(input1,output1);
    message.manageMessage();
    
    }
    
}
