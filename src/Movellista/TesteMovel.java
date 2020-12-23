package Movellista;

public class TesteMovel {
	 
	public static void main(String[] args) {
		movel movel1 = new movel();
		movel movel2 = new movel();
		movel movel3 = new movel();
		
		movel1.setNome("Cadeira");
		movel2.setNome("Mesa");
		movel3.setNome("Quadro");
	
		listaMOvel lista = new listaMOvel();
	
		lista.adicionar(movel1);
		lista.adicionar(movel2);
		lista.adicionar(movel3, 5);
		
		System.out.println("Quantidade de moveis  "+ lista.tamanho());
		
		lista.remover(5);
		System.out.println("Quantidade de moveis:  "+ lista.tamanho());
	
		lista.pega(2);
		System.out.println("VOCE PEGOU: "+ movel2.getNome());
		
		
		System.out.println(lista.contem(movel2));
		System.out.println(lista.listademoveis);
	}

}
