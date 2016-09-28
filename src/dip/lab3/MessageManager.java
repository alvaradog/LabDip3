
package dip.lab3;

public class MessageManager {
    private Input input;
    private Output output;

    public MessageManager(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    
    public void manageMessage(){
        input.setMessage();
        output.showMessage(input.getMessage());
    }
    
}
