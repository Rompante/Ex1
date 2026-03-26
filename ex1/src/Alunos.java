import java.util.Scanner;

public class Alunos {
    public static int numAlunos = 20;
    private static String nomeXXX = "Tomás Rompante";
    static int n = 10;
    final float pi = 3.14f;
    public static String[] nomes = new String[numAlunos]; 
    public static int[] idades = new int[numAlunos];

    public void mostrarInfo() {
        System.out.println("\nTurma 2025/2026");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println(nomes[i] + " (" + idades[i] + " ano(s))");
            }
        }
    }

    public static void pedirDados() {
        Scanner idadeX = new Scanner(System.in);
        Scanner nomeX = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            // Pedir o nome e idade de cada aluno
            System.out.println("Qual o teu nome, numero " + (i + 1) + ": ");
            String nome = nomeX.nextLine();
            nomes[i] = nome;
            System.out.println(nomes[i] + " Qual a tua idade: ");
            int idade = idadeX.nextInt();
            idades[i] = idade;
        }

        nomeX.close();
        idadeX.close();
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
    }

    public static String transforma (String texto) {
        return texto.toUpperCase();
    }

    public static void main(String[] args) throws Exception {
        Alunos al = new Alunos();

        System.out.println(Alunos.n); 
        System.out.println(al.pi);
        System.out.println(nomeXXX);

        System.out.println(transforma("luis santos o goat"));
        soma (6, 7);
        pedirDados();
        al.mostrarInfo();
    }
}

/*
*   metodo estattico, apenas mostra quando é chamado diretamente pela classe
*   ex:
*
*           Alunos.mostra();
* */

/*
*   metodo publico, pode ser chamado atravez do objeto
*    ex:
*       Alunos al = new Alunos();
*       al.mostra2();
*/