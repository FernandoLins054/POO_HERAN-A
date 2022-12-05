
public  class  MenuCriação {

static  MenuInicio  menuInicio = new  MenuInicio ();

	public  static  void  menuAdicionarAluno ( List < Aluno > alunos , Scanner  sc ) {
		boolean  matriculaDisponivel = false ;

		Sistema . fora . print ( "Nome do aluno: " );
		String  nomeAluno = sc . próximo ();
		Sistema . fora . print ( "Sobrenome do aluno: " );
		String  sobrenomeAluno = sc . próximo ();

		String  matriculaAluno = null ;
		while ( matriculaDisponivel == false ) {
			Sistema . fora . print ( "Matrícula do aluno: " );
			matriculaAluno = sc . próximo ();
			matriculaDisponivel = menuInicio . verificarMatriculaDisponivel ( alunos , matriculaAluno );
		}

		Sistema . fora . print ( "Curso matriculado: " );
		String  nomeCurso = sc . próximo ();

		alunos . add ( new  Aluno ( nomeAluno , sobrenomeAluno , matriculaAluno , nomeCurso ));
	}
}