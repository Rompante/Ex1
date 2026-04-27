public class Sala {
    private String nome;
    private String local;
    private String piso;
    private String iDsala;

    public Sala() {
        this.nome = "";
        this.local = "";
        this.piso = "";
        this.iDsala = "";
    }
    public Sala(String nome, String local, String piso, String iDsala) {
        this.nome = nome;
        this.local = local;
        this.piso = piso;
        this.iDsala = iDsala;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getiDsala() {
        return iDsala;
    }
    public void setiDsala(String iDsala) {
        this.iDsala = iDsala;
    }
    @Override
    public String toString() {
        return "Sala [nome= " + nome + ", local= " + local + ", piso= " + piso + ", iDsala= " + iDsala + "]";
    }  
}
