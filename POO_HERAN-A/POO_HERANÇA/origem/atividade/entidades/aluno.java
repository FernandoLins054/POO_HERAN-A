public  class  Aluno {

	Public  Object  getMatriculaAluno () {
		// TODO stub de método gerado automaticamente
		retornar  nulo ;
	}

	public  void  exibeListaDeDisciplinasMatriculadas () {
		// TODO stub de método gerado automaticamente

	}

	public  void  moveDisciplinaDeMatriculadaParaAprovada ( String  disciplinaASerMovida ) {
		// TODO stub de método gerado automaticamente

	}
	importar  java . . _ ArrayList ;
	importar  java . . _ lista ;

	public  class  Aluno {
		private  String  nomeAluno ;
		private  String  sobrenomeAluno ;
		 String  privada matriculaAluno ;
		private  String  nomeCurso ;
		private  List < String > disciplinasAprovadasAluno = new  ArrayList <>();
		private  List < Double > notasAluno = new  ArrayList <>();
		private  List < String > disciplinasMatriculadasAluno = new  ArrayList <>();

		public  Aluno () {
		}

		public  Aluno ( String  nomeAluno , String  sobrenomeAluno , String  matriculaAluno , String  nomeCurso ) {
			isso . nomeAluno = nomeAluno ;
			isso . sobrenomeAluno = sobrenomeAluno ;
			isso . matriculaAluno = matriculaAluno ;
			isso . nomeCurso = nomeCurso ;
		}

		public  String  getNomeAluno () {
			return  nomeAluno ;
		}

		public  String  getSobrenomeAluno () {
			return  sobrenomeAluno ;
		}

		public  String  getMatriculaAluno () {
			retornar  matriculaAluno ;
		}

		public  String  getNomeCurso () {
			return  nomeCurso ;
		}

		public  void  atualizarNomeAluno ( String nomeAluno ) { 
			isso . nomeAluno = nomeAluno ;
		}

		public  void  atualizarSobrenomeAluno ( String  sobrenomeAluno ) {
			isso . sobrenomeAluno = sobrenomeAluno ;
		}

		public  void  atualizarMatriculaAluno ( String  matriculaAluno ) {
			isso . matriculaAluno = matriculaAluno ;
		}

		public  void  atualizarNomeCurso ( String nomeCurso ) { 
			isso . nomeCurso = nomeCurso ;
		}

		public  void  adicionarNotasAluno ( Nota dupla  ) {
			notasAluno . adicionar ( nota );
		}

		public  void  listaNotasAluno () {
			Sistema . fora . println ( "Notas do aluno:" );
			for ( Notas duplas  : notasAluno ) {
				Sistema . fora . println ( notas );
			}
		}


		private  void  atualizarListaAprovadasEMatriculadas () {
			for ( String  disciplinaMatricula : disciplinasMatriculadasAluno ) {
				if ( disciplinas AprovadasAluno . contém ( disciplinaMatricula )) {
					disciplinasMatriculadasAluno . remover ( disciplinaMatricula );
				}
			}
		}

		public  void  adicionarDisciplinaAprovada ( String  disciplina ) {
			boolean  jaContemDisciplinaNaLista = false ;
			if ( disciplinas AprovadasAluno . contém ( disciplina )) {
				jaContemDisciplinaNaLista = true ;
				retorno ;
			} if (! jaContemDisciplinaNaLista ) {
				disciplinasAprovadasAluno . adicionar ( disciplina );
				atualizarListaAprovadasEMatriculadas ();
			}
		}

		public  void  adicionarDisciplinaMatriculada ( String  disciplina ) {
			boolean  jaContemDisciplinaNaLista = false ;
			if ( disciplinasMatriculadasAluno . contém ( disciplina ) || disciplinasAprovadasAluno . contém ( disciplina )) {
				Sistema . fora . println ();
				Sistema . fora . println ( "Disciplina (" + disciplina + ") já matriculada e/ou aprovado." );
				Sistema . fora . println ();
				retorno ;
			} if (! jaContemDisciplinaNaLista ) {
				disciplinasMatriculadasAluno . adicionar ( disciplina );
			}
		}

		public  void  moveDisciplinaDeMatriculadaParaAprovada ( String  disciplina ) {
			for ( String  string : disciplinasMatriculadasAluno ) {
				if ( disciplinasMatriculadasAluno . contém ( disciplina )) {
					disciplinasMatriculadasAluno . remover ( disciplina );
					adicionarDisciplinaAprovada ( disciplina );
				}
			}
		}

		public  void  exibeListaDeDisciplinasAprovadas () {
			Sistema . fora . println ( "Disciplinas aprovadas pelo aluno:" );
			for ( String  disciplinaAprovada : disciplinasAprovadasAluno ) {
				Sistema . fora . println ( disciplina Aprovada );
			}
			Sistema . fora . println ();
		}

		public  void  exibeListaDeDisciplinasMatriculadas () {
			Sistema . fora . println ( "Disciplinas matriculadas:" );
			for ( String  disciplinaMatriculada : disciplinasMatriculadasAluno ) {
				Sistema . fora . println ( disciplinaMatriculada );
			}
			Sistema . fora . println ();
		}

		@ Substituir
		public  String  toString () {
			return  "Nome: "
					+ isso . nomeAluno
					+ " | Sobrenome: "
					+ isso . sobrenome Aluno
					+ " | Matrícula: "
					+ isso . matrícula Aluno
					+ " | Curso: "
					+ isso . nomeCurso ;
		}
	}