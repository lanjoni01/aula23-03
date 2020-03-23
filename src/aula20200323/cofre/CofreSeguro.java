package aula20200323.cofre;

public class CofreSeguro {

	private int senha;
	private boolean aberto;

	public CofreSeguro(int senha) {
		this.senha = senha;
		this.aberto = false;
	}

	public void abrir(int senha) {
		if(this.senha == senha) {
			this.aberto = true;
			return;
		}

		System.out.println("Senha errada");
	}

	public void fechar() {
		this.aberto = false;

	}

	public boolean isAberto() {
		return aberto;
	}
}
