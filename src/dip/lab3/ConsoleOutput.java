
package dip.lab3;

public class ConsoleOutput implements Output{
    
    @Override
    public final void showMessage(String message){
        System.out.println(message);
    }
    
}
