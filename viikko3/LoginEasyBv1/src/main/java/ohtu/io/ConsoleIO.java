
package ohtu.io;

import java.util.Scanner;
<<<<<<< HEAD

=======
import org.springframework.stereotype.Component;

@Component
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
public class ConsoleIO implements IO {
    private Scanner scanner = new Scanner(System.in);
    
    public void print(String toPrint) {
        System.out.println(toPrint);
    }

    public int readInt(String prompt) {
        System.out.print(prompt+" ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String readLine(String prompt) {
        System.out.print(prompt+" ");
        return scanner.nextLine();
    }
    
}
