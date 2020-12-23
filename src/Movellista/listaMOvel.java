package Movellista;

import java.util.Arrays;

public class listaMOvel {
	
	@Override
	public String toString() {
		return "listaMOvel [listademoveis=" + Arrays.toString(listademoveis) + ", quantidadeDeMoveis="
				+ quantidadeDeMoveis + "]";
	}

	public movel [] listademoveis = new movel[10];
	int quantidadeDeMoveis = 0;

	public void adicionar(movel movel) {
		for (int i = 0; i < this.listademoveis.length; i++) {
			if (this.listademoveis[i] == null) {
				this.listademoveis[i] = movel;
				quantidadeDeMoveis++;
				break;
			}
		}
	}
	
	public void adicionar(movel movel, int pos) {
		if (this.listademoveis[pos] == null) {
			this.listademoveis[pos] = movel;
			this.quantidadeDeMoveis++;
			System.out.println("Movel Adcionado");
		}else {
			System.out.println(" MOVEL NAO ADICIONADO");
		}
	}
	

	public int tamanho() {
		return this.quantidadeDeMoveis;
	}
	
	public void remover(int pos) {
		if (listademoveis[pos] != null) {
			listademoveis[pos] = null;
			this.quantidadeDeMoveis--;
			System.out.println("Movel removido");
			
		}else {
			System.out.println("Movel nõa removido");
		}
		
	}
	
	public void pega(int pos) {
		System.out.println("Voce pegou a posição:"+ pos);
	}
	
	public boolean contem (movel movel) {
		for (int i = 0; i < listademoveis.length; i++) {
			if (movel == listademoveis[i]) {
				return true;
				} 
		}
		return false;
		
	}
}
