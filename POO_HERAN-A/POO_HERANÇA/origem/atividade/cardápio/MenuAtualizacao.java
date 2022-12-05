public  class  MenuAtualização {
public  static  void  menuAtualizarAluno ( List < Aluno > alunos , Scanner  sc ) {

		Sistema . fora . println ( "----------------------------------------- " );
		Sistema . fora . print ( "Informe a matricula do aluno que deseja atualizar: " );
		String  matrícula = sc . próximo ();
		Aluno  alunoASerAtualizado = null ;

		boolean  matriculaValida = false ;
		para ( Aluno  aluno : alunos ) {

			if ( aluno . getMatriculaAluno (). equals ( matrícula )) {
				matrículaValida = true ;
				alunoASerAtualizado = aluno ;
			}
		}
		if ( matrícula válida == true ) {
			int  opção = 1 ;
			while ( opção != 0 ) {
				Sistema . fora . println ();
				Sistema . fora . println ( "O que deseja alterar do aluno " + alunoASerAtualizado . getNomeAluno () + ": " );
				Sistema . fora . println ( "1 - Nome do aluno" );
				Sistema . fora . println ( "2 - Sobrenome do aluno" );
				Sistema . fora . println ( "3 - Matrícula do aluno" );
				Sistema . fora . println ( "4 - Curso do Aluno" );
				Sistema . fora . println ( "0 - Voltar" );
				Sistema . fora . print ( "Opcao: " );
				opção = sc . proximoInt ();

				switch ( opção ) {

				caso  0 :
					Sistema . fora . println ( "Sessão finalizada." );
					quebrar ;
				caso  1 :
					alteraNomeDoAluno ( alunoASerAtualizado , sc );
					quebrar ;
				caso  2 :
					alteraSobrenomeDoAluno ( alunoASerAtualizado , sc );
					quebrar ;
				caso  3 :
					alteraMatriculaDoAluno ( alunos , alunoASerAtualizado , sc );
					quebrar ;
				caso  4 :
					alteraCursoDoAluno ( alunoASerAtualizado , sc );
					quebrar ;
				padrão :
					Sistema . fora . println ( "Opcao incorreta, tente novamente." );
					Sistema . fora . println ();
					quebrar ;
				}
			}
		} senão {
			Sistema . fora . println ( "Matrícula não encontrada!" );
		}
	}

	private  static  void  alteraCursoDoAluno ( Aluno  alunoASerAtualizado , Scanner  sc ) {
		Sistema . fora . print ( "Informe o novo curso: " );
		String  curso = sc . próximo ();
		alunoASerAtualizado . atualizarNomeCurso ( curso );
	}

	private  static  void  alteraMatriculaDoAluno ( List < Aluno > alunos , Aluno  alunoASerAtualizado , Scanner  sc ) {
		MenuInício  menuInício = new  MenuInício ();
		boolean  matriculaDisponivel = false ;
		String  matricula = null ;
		while ( matriculaDisponivel == false ) {
			Sistema . fora . print ( "Informe a nova matrícula (Informe 0 para sair):" );
			matrícula = sc . próximo ();
			if ( matrícula == "0" ) {
				retorno ;
			}
			matriculaDisponivel = menuInicio . verificarMatriculaDisponivel ( alunos , matricula );
		}
		if ( matrícula != null ) {
			alunoASerAtualizado . atualizarMatriculaAluno ( matricula );
		}
	}

	private  static  void  alteraSobrenomeDoAluno ( Aluno  alunoASerAtualizado , Scanner  sc ) {
		Sistema . fora . print ( "Informe o novo sobrenome: " );
		String  sobrenome = sc . próximo ();
		alunoASerAtualizado . atualizarSobrenomeAluno ( sobrenome );
	}

	private  static  void  alteraNomeDoAluno ( Aluno  alunoASerAtualizado , Scanner  sc ) {
		Sistema . fora . print ( "Informe o novo nome: " );
		String  nome = sc . próximo ();
		alunoASerAtualizado . atualizarNomeAluno ( nome );
	}

}