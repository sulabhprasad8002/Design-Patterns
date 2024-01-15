package TemplateMethodPattern;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{
    public void brew() {
        System.out.println("Dripping coffee with filer");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
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

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("System was trying to read user input");
        }

        if(answer == null) {
            return "No";
        }

        return answer;
    }
}
