import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Diz me o teu nome: ");
        String nomePessoal = myObj.nextLine();

        System.out.println("Olá " + nomePessoal);

        myObj.close();
    }
}