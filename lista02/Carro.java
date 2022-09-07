package lista02;

public class Carro {
    private String placa;
    private Pessoa p;

    public Carro(){
        this.placa = "-";
        this.p = new Pessoa();
    }

    public Carro(String placa, Pessoa p) {
        this.placa = placa;
        this.p = p;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Pessoa getP() {
        return p;
    }
    public void setP(Pessoa p) {
        this.p = p;
    }
    @Override
    public String toString() {
        
        return "\nNúmero da Placa: "+placa+"\nDados da pessoa: "+p+".";
    }


}
