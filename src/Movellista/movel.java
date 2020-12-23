package Movellista;

public class movel {

		String nome;
		
		public String getNome() {
			return nome;
			
		}
		
		public void setNome(String nome) {
			this.nome = nome;	
		}
		
		@Override
		public String toString() {
			return nome;
		}
		
		public boolean equals(movel o) {
			
			movel outro = o;
			return this.nome.equals(outro.nome);
		}
		
}
