public class Operacoes {
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }  
    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }
    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }
    public static double dividir(int n1, int n2) {
        if (n2 != 0) {
            return (double) n1 / n2;
        } else {
            System.out.println("Divisão por zero nâo dá.");
            return 0; 
        }
    }
}
