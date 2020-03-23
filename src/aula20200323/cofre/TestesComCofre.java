package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	void AbrirEFecharCofre() {

		Cofre cofreBloqueado = new Cofre();
		assertEquals(false, cofreBloqueado.isAberto());

		cofreBloqueado.abrir();
		assertEquals(true, cofreBloqueado.isAberto());

		cofreBloqueado.fechar();
		assertEquals(false, cofreBloqueado.isAberto());

		Cofre cofreDesbloqueado = new Cofre();
		cofreDesbloqueado.abrir();
		assertEquals(true, cofreDesbloqueado.isAberto());
	}

	@Test
	void AbrirEFecharComSenha() {

		CofreSeguro cofreComSenha = new CofreSeguro(456);

		assertEquals(false, cofreComSenha.isAberto());

		cofreComSenha.abrir(456);
		assertEquals(true, cofreComSenha.isAberto());

		CofreSeguro cofreComSenhaIncorreta = new CofreSeguro(465);
		cofreComSenhaIncorreta.abrir(564);

		assertEquals(false, cofreComSenhaIncorreta.isAberto());
	}

}
