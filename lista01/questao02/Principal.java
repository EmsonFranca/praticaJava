package lista01.questao02;



public class Principal {
    public static void main(String[] args) {
     
        Elevador e = new Elevador(3, 10);
		System.out.println(e.getAndarAtual());
		//e1.andarAtual=10;
		e.entrar();
		e.entrar();
		e.entrar();
		e.entrar();
		System.out.println(e.getAndarAtual());
		e.subir();
		e.subir();
		e.subir();
		if(e.subir()) {
			System.out.println("Deu certo!");
		}
		else {
			System.out.println("Já no último andar.");
		}
        
        
    }
}
