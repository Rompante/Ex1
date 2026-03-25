import java.util.Scanner;

public class Alunos {

    public static int numAlunos = 20;
    private static String nomeXXX = "Tomás Rompante";
    static int n = 10;
    final float pi = 3.14f;
    public static String[] aluno = new String[numAlunos];
    public static String[] idades = new String[numAlunos];

    private void pedirDados(){
        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);

        for (int i = 0; i < aluno.length; i++){
            // nomes 
            System.out.println("Qual é o teu nome, numero" + (i + 1) + " ?" );
            String nomePessoal = nome.nextLine();
            aluno[i] = nomePessoal;
            // idades
            System.out.println("Qual é a tua idade ? ");
            String idadeX = idade.nextLine();
            idades[i] = idadeX;
        }
        nome.close();
        idade.close();
    }

    public void mostraInfo(){
        System.out.println("\nTurma 1p 2025/2026 ");
        for (String aux : aluno) {
            if (aux != null){
                System.out.println(aux);
            }
        }
        for (String aux : idades) {
            if (aux != null){
                System.out.println("(" + aux + ")");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Alunos al = new Alunos();
        System.out.println(Alunos.n);
        System.out.println(al.pi);
        System.out.println(nomeXXX);

        al.pedirDados();
        al.mostraInfo();
    }
}
