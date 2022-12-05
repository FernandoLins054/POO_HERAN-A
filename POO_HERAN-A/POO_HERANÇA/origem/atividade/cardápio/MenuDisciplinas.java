pacote  Atividade . cardápio ;

importar  java . io . IOException ;
importar  java . . _ InputMismatchException ;
importar  java . . _ lista ;
importar  java . . _ Scanner ;

importar  Atividade . entidades . Aluno ;

public  class  MenuDisciplinas {

public  static  void  menuPrincipalDisciplinas ( List < Aluno > alunos , Scanner  sc ) throws  IOException {

		Sistema . fora . println ( "----------------------------------------- " );
		Sistema . fora . print ( "Informe a matrícula do aluno para consultar suas disciplinas: " );
		String  matrícula = sc . próximo ();
		Aluno  alunoConsultado = null ;

		boolean  matriculaValida = false ;
		para ( Aluno  aluno : alunos ) {

			if ( aluno . getMatriculaAluno (). equals ( matrícula )) {
				matrículaValida = true ;
				alunoConsultado = aluno ;
			}
		} if ( matrículaValida ) {
			tente {
				int  opção = 1 ;
				String  pausa = null ;
				while ( opção != 0 ) {
					Sistema . fora . println ( "----------------------------------------- " );
					Sistema . fora . println ( "Selecione umas das opcoes para as disciplinas de " + alunoConsultado . getNomeAluno () + ": " );
					Sistema . fora . println ( "1 - Cadastrar disciplina aprovado" );
					Sistema . fora . println ( "2 - Cadastrar disciplina matriculada" );
					Sistema . fora . println ( "3 - Movimentador disciplina matriculada para aprovado" );
					Sistema . fora . println ( "4 - Listar disciplinas aprovadas" );
					Sistema . fora . println ( "5 - Listar disciplinas matriculadas" );
					Sistema . fora . println ( "0 - Voltar" );
					Sistema . fora . print ( "Opcao: " );
					opção = sc . proximoInt ();

					switch ( opção ) {

					caso  0 :
						Sistema . fora . println ( "Sessão finalizada." );
						quebrar ;
					caso  1 :
						Sistema . fora . print ( "Informa a disciplina aprovada que deseja se cadastrar: " );
						String  disciplinaAprovada = sc . próximo ();
						alunoConsultado . adicionarDisciplinaAprovada ( disciplinaAprovada );
						quebrar ;
					caso  2 :
						Sistema . fora . print ( "Informações a nova disciplina matriculada: " );
						String  disciplinaMatriculada = sc . próximo ();
						alunoConsultado . adicionarDisciplinaMatriculada ( disciplinaMatriculada );
						quebrar ;
					caso  3 :
						Sistema . fora . print ( "Informe a disciplina que deseja mover: " );
						String  disciplinaASerMovida = sc . próximo ();
						alunoConsultado . moverDisciplinaDeMatriculadaParaAprovada ( disciplinaASerMovida );
						quebrar ;
					caso  4 :
						Sistema . fora . println ( "----------------------------------------- " );
						alunoConsultado . exibeListaDeDisciplinasMatriculadas ();
						Sistema . fora . println ();
						Sistema . fora . println ( "Pressione ENTER para continuar" );
						Sistema . em . ler ();
						quebrar ;
					caso  5 :
						Sistema . fora . println ( "----------------------------------------- " );
						alunoConsultado . exibeListaDeDisciplinasMatriculadas ();
						Sistema . fora . println ();
						Sistema . fora . println ( "Pressione ENTER para continuar" );
						Sistema . em . ler ();
						quebrar ;
					padrão :
						Sistema . fora . println ( "Opcao incorreta, tente novamente." );
						Sistema . fora . println ();
						quebrar ;
					}
				}
			} catch ( InputMismatchException  e ) {
				Sistema . fora . println ();
				Sistema . fora . println ( "Informe um dado válido!" );
				Sistema . fora . println ( "Pressione ENTER para continuar" );
				Sistema . em . ler ();
				menuPrincipalDisciplinas ( alunos , novo  Scanner ( System . in ));
			} finalmente {
				sc . fechar ();
			}
		} senão {
			Sistema . fora . println ( "Matrícula não encontrada!" );
		}
	}
}