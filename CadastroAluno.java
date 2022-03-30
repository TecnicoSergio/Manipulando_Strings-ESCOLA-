package estudo;

import javax.swing.JOptionPane;

public class CadastroAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno Sergio;
		Sergio = new Aluno();
		
		Sergio.setNome(JOptionPane.showInputDialog("Digite o seu nome Completo"));
		Sergio.verificarTamanhoString();
		Sergio.compararNome();
		Sergio.compararNomeVersaoDois();
		Sergio.retornaMaiuscula();
		Sergio.retornarInicioNome();
		Sergio.retornarDeterminaParteNome();
		Sergio.retornaPrimeiraMetadeNome();
		Sergio.retornarComecoNome();
		Sergio.modificarCaracteres();
		

	}

}
