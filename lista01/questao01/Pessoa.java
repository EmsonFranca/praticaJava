package lista01.questao01;

public class Pessoa {
    private String nome;
    private int id;
    
    public Pessoa() {
        this.nome = "Algo";
        this.id = 0;
    }

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
  
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        
        return "\nNome: "+this.nome+"\nId: "+this.id;
    }

}
