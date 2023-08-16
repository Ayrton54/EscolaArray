import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos;

	public void Adicionar(Aluno aluno) {
		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		return builder.toString();
	}

	public String toString2() {
		String a = "[";
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			a += this.alunos[i] + ", ";
		}

		a += this.alunos[this.totalDeAlunos - 1] + "]";
		return a;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.alunos[posicao];
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}

	public void remover(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}
		for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}

	private void garantaEspaco() {
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novo = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novo[i] = this.alunos[i];
			}
			this.alunos = novo;
		}

	}
}
