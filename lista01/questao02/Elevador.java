package lista01.questao02;

public class Elevador {
	private int andarAtual;
	private int quantAndares;
	private int capacidade;
	private int quantAtual;
	
	public Elevador(int capTotal, int quantAndares) {
		this.quantAndares=quantAndares;
		this.capacidade=capTotal;
		this.quantAtual=0;
		this.andarAtual=0;
	}
	
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public void setAndarAtual(int andar) {
		andarAtual=andar;
	}

	public int getQuantAndares() {
		return quantAndares;
	}


	public void setQuantAndares(int quantAndares) {
		this.quantAndares = quantAndares;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public int getQuantAtual() {
		return quantAtual;
	}


	public void setQuantAtual(int quantAtual) {
		this.quantAtual = quantAtual;
	}


	public void entrar() {
		if(quantAtual<capacidade)
			this.quantAtual+=1;
		else
			System.out.println("Elevador lotado!");
	}
	
	public void sair() {
		if(quantAtual==0)
			System.out.println("Elevador vázio!");
		else
			this.quantAtual--;//-=this.quantAtual=this.quantAtual-1;
	}
	
	public boolean subir() {
		if(andarAtual<quantAndares) {
			andarAtual++;
			return true;
		}
		return false;
	}
	
	public void desce() {
		if(andarAtual!=0) {
			andarAtual--;
			return;
		}
		System.out.println("Elevador no terreo.");
	}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nAndar Atual: "+andarAtual+"\nQuantidade de Andares: "+
        quantAndares+"Capacidade do Elevdor: "+capacidade+
        "Quantidade de pessoas no Elevador: "+quantAtual;
    }

}
