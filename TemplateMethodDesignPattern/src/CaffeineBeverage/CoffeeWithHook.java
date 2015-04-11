package CaffeineBeverage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CoffeeWithHook extends CaffeineBeverageWithHook {

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar And Milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected boolean customerWantsCondiments() {
        
        String userUnswer = getUserInput();
        if( userUnswer.toLowerCase().startsWith("y")){
            return true;
        }
        
        return false;
    }

    @Override
    protected void brew() {
        brewCoffeeGrinds();
    }

    @Override
    protected void addCondiments() {
        addSugarAndMilk();
    }
    
    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

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
