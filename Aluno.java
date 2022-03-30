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
		System.out.println("O tamanho da do atributo nome é:" + tamanho);
	}
	
	void compararNome() {
		if(this.nome.equals("Sérgio Santos")) {
			System.out.println("O valor do atribut e o valor comparado, são iguais.");
		}
		else {
			System.out.println("O valor do atributo e o valor comparado, são diferentes");
		}
	}
	void compararNomeVersaoDois() {
		if(this.nome.equalsIgnoreCase("Sérgio Santos")) {
			System.out.println("O valor do atributo e o valor comparado, são iguais.");
		}
		else {
			System.out.println("O valor do atributo e o valor comparado, são diferentes");
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
			System.out.println("O nome que está no atributo nome, começa com V.");
		}
		else {
			System.out.println("O nome que esetáno atributo nome, não começa com V.");
		}
	}
	void modificarCaracteres() {
		System.out.println("Retornando apenas os quatro primeiro caracteres do atributo nome:" + this.nome.replace("a", "1" ));
	}
	
	
	
	
	
	

}
