package CaffeineBeverage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TeaWithHook extends CaffeineBeverageWithHook {

    
    private void addLemon() {
        System.out.println("Adding Lemon");        
    }

    private void steepTeaBag() {
        System.out.println("Steeping The Tea");        
    }

    @Override
    protected void brew() {
        steepTeaBag();
    }

    @Override
    protected void addCondiments() {
        this.addLemon();
    }
    
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    
    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }    
}
