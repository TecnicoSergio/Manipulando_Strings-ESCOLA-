package estudo;

public class Aluno {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void verificarTamanhoString() {
		int tamanho = this.nome.length();
		System.out.println("O tamanho da do atributo nome �:" + tamanho);
	}
	
	void compararNome() {
		if(this.nome.equals("S�rgio Santos")) {
			System.out.println("O valor do atribut e o valor comparado, s�o iguais.");
		}
		else {
			System.out.println("O valor do atributo e o valor comparado, s�o diferentes");
		}
	}
	void compararNomeVersaoDois() {
		if(this.nome.equalsIgnoreCase("S�rgio Santos")) {
			System.out.println("O valor do atributo e o valor comparado, s�o iguais.");
		}
		else {
			System.out.println("O valor do atributo e o valor comparado, s�o diferentes");
		}
	}
	void retornaMaiuscula() {
		System.out.println("Retorno do atributo nome, em caixa alta/maiscula:" + this.nome.toUpperCase());
	}
	void retornarInicioNome() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.substring(0,4));
		
	}
	void retornarDeterminaParteNome() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.substring(6));
	}
	void retornaPrimeiraMetadeNome() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.substring(0, this.nome.length()/2));
	}
	void retornaSegundaMetadeNome() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.substring(this.nome.length()/2));
	}
	void retornarComecoNome() {
		if(this.nome.startsWith("V")) {
			System.out.println("O nome que est� no atributo nome, come�a com V.");
		}
		else {
			System.out.println("O nome que eset�no atributo nome, n�o come�a com V.");
		}
	}
	void modificarCaracteres() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.replace("a", "1" ));
	}
	
	
	
	
	
	

}
