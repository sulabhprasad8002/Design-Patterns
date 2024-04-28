package Behavioural.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon to the tea");
    }

    public boolean customerWantsCondiments() {
        if(getUserInput().toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = "";

        System.out.println("Would you like to add condiments to the tea ? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("System was trying to get the answer");
        }

        if(answer == null) {
            return "No";
        }

        return answer;
    }
}
