package lista02;

public class Pessoa {
    String nome;
    int apt;
    public Pessoa(String nome, int apt) {
        this.nome = nome;
        this.apt = apt;
    }
    public Pessoa() {
        this.nome = "-";
        this.apt = 0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getApt() {
        return apt;
    }
    public void setApt(int apt) {
        this.apt = apt;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("\nNome: "+nome+"\nApartamento: "+apt+".");
    }
}
