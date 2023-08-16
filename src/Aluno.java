
public class Aluno {
	private String nome, turma;
	private int idade;
	private double nota;
	
	/*@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", turma=" + turma + ", idade=" + idade + ", nota=" + nota + "]";
	}*/
	
	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}

	public Aluno(String nome, String turma, int idade, double nota) {
		super();
		this.nome = nome;
		this.turma = turma;
		this.idade = idade;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
}
