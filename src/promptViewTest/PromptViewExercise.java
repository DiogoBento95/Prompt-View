package promptViewTest;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class PromptViewExercise {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in, System.out);

        while (true) {

            String[] options = {"Login", "Exit"};

            MenuInputScanner menu = new MenuInputScanner(options);
            menu.setMessage("What would you like to do?");

            int optionsChoice = prompt.getUserInput(menu);

            if (optionsChoice == 1) {

                System.out.println("Insert your Username and Password below: ");

                StringInputScanner question1 = new StringInputScanner();
                question1.setMessage("What is your Username? : ");

                PasswordInputScanner question2 = new PasswordInputScanner();
                question2.setMessage("What is your Password? : ");

                String username = prompt.getUserInput(question1);
                String password = prompt.getUserInput(question2);

                System.out.println("Login authorized.");
                System.out.println("Hello " + username + ", how are you today?");

            } else {
                System.exit(0);
            }
        }
    }
}
