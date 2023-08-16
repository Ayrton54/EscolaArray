
public class TesteAluno {

	public static void main(String[] args) {
		Aluno a= new Aluno("EU");
		Aluno b= new Aluno("Brasil");
		Aluno c= new Aluno("China");
		Aluno d= new Aluno("Japão");
		Vetor lista = new Vetor();
		lista.Adicionar(a);
		lista.Adicionar(b);
		lista.Adicionar(c);
		System.out.println(lista.pega(1));
		System.out.println(lista.posicaoOcupada(1));
		System.out.println(lista.posicaoOcupada(2));
		System.out.println(lista.toString2());
		lista.adiciona(1, d);
		System.out.println(lista.toString2());
		lista.remover(0);
		System.out.println(lista.toString2());

	}

}
