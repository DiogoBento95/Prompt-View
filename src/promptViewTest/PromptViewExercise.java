package promptViewTest;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class PromptViewExercise {

    public static void main(String[] args){

            Prompt prompt = new Prompt(System.in,System.out);

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("What is your Username?");

        PasswordInputScanner question2 = new PasswordInputScanner();
        question2.setMessage("What is your Password?");

        String username = prompt.getUserInput(question1);
        String password = prompt.getUserInput(question2);

        System.out.println("Hello " + username + ", how are you today?");

    }
}
