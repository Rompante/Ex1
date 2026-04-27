import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        Sala sala3 = new Sala("Redes", "INA", "4", "INA 3");
        System.out.println(sala3);

        Sala sala4 = new Sala("programação", "INA", "4", "INA 4");
        System.out.println(sala4);

        Modulos modulo1 = new Modulos("algoritmia", 12);
        // modulo1.setNota(16);
        System.out.println("\n A tua nota é: " + modulo1.getNota());
        
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(16);
        notas.add(17);
        System.out.println(notas);

        System.out.println("Diz me o teu nome: ");
        String nomePessoal = myObj.nextLine();

        System.out.println("Olá " + nomePessoal);

        myObj.close();
    }
}