pacote  Atividade . cardápio ;

importar  java . io . IOException ;
importar  java . . _ InputMismatchException ;
importar  java . . _ lista ;
importar  java . . _ Scanner ;

importar  Atividade . entidades . Aluno ;
importar  Atividade . exibição . InformacoesDosAlunos ;

public  class  MenuInicio {

	public  static  boolean  verificarMatriculaDisponivel ( List < Aluno > alunos , String  matrícula ) {
		if ( alunos . tamanho ()== 0 ) {
			retorna  verdadeiro ;
		} senão {
			para ( Aluno  aluno : alunos ) {
				if ( aluno . getMatriculaAluno (). equals ( matrícula )) {
					Sistema . fora . println ( "Matrícula já existente. Tente novamente." );
					retorna  falso ;
				}
			}
			retorna  verdadeiro ;
		}
	}

	public  static  void  menuPrincipal ( List < Aluno > alunos , Scanner  sc ) throws  IOException {

		novas  InformacoesDosAlunos ();

		tente {
			int  opção = 1 ;
			while ( opção != 0 ) {
				Sistema . fora . println ( "----------------------------------------- " );
				Sistema . fora . println ( "Selecione uma das opções (Digite 0 para sair): " );
				Sistema . fora . println ( "1 - Adicionar aluno" );
				Sistema . fora . println ( "2 - Atualizar aluno" );
				Sistema . fora . println ( "3 - Consultar disciplinas" );
				Sistema . fora . println ( "4 - Lista dos alunos cadastrados" );
				Sistema . fora . print ( "Opcao: " );
				opção = sc . proximoInt ();

				switch ( opção ) {

				caso  0 :
					Sistema . fora . println ( "Sessão finalizada." );
					quebrar ;
				caso  1 :
					MenuCriacao . menuAdicionarAluno ( alunos , sc );
					quebrar ;
				caso  2 :
					MenuAtualização . menuAtualizarAluno ( alunos , sc );
					quebrar ;
				caso  3 :
					MenuDisciplinas . menuPrincipalDisciplinas ( alunos , sc );
					quebrar ;
				caso  4 :
					InformacoesDosAlunos . listaDeAlunosNaTela ( alunos );
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
			menuPrincipal ( alunos , novo  Scanner ( System . in ));
		} finalmente {
			sc . fechar ();
		}
	}

}