package Introducao;
/*Introdução a classes , objetos e métodos.
  Cadastro de alunos
*/

public class Aluno {
        private String nome;
        private String endereco;
        private int telefone;
        private String email;
        private int matricula;
        
        public Aluno(String nome,String endereco, int telefone,String email, int matricula){
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
            this.matricula = matricula;
        }
    }

/*
ALUNO

public class Aluno {

	private String nome;
	private int idade;
	private double notas[];

	public Aluno(String nome, int idade, double... notas) {
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		if (notas != null) {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", notas=" + Arrays.toString(notas) + "]";
		}
		return "Aluno [nome=" + nome + ", idade=" + idade + ", notas= sem notas no sistema"  + "]";
	}

}
FÁBRICA DE ALUNO

public class FabricaAluno {
	
	 //A fábrica de aluno, vai retornar uma instancia de aluno
	 
	public Aluno criarAluno(String nome, int idade, double...notas){
		return new Aluno(nome, idade, notas);
	}
	public Aluno criarAluno(String nome, int idade){
		return new Aluno(nome, idade);
	}
}
MAIN

public class Main {

	public static void main(String[] args) {

		List<Aluno> list = new ArrayList<>();
		// fábrica que criar aluno
		FabricaAluno frabica = new FabricaAluno();

		Aluno aluno = frabica.criarAluno("José", 25);
		// adicionei um aluno
		list.add(aluno);

		// novo aluno
		aluno = frabica.criarAluno("Francisco", 24);
		// adicione outro aluno
		list.add(aluno);

		// novo aluno
		aluno = frabica.criarAluno("Maria", 57, 8, 7, 6, 8);
		// adicione outro aluno
		list.add(aluno);

		System.out.println(list);





