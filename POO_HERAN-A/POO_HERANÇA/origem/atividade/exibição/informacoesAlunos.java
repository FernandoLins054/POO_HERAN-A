pacote  Atividade . exibição ;

importar  java . io . IOException ;
importar  java . . _ lista ;

importar  Atividade . entidades . Aluno ;

public  class  InformacoesDosAlunos {

	public  static  void  listaDeAlunosNaTela ( List < Aluno > alunos ) throws  IOException {
		Sistema . fora . println ( "----------------------------------------- " );
		Sistema . fora . println ();
		Sistema . fora . println ( "Dados dos alunos:" );
		para ( Aluno  aluno : alunos ) {
			Sistema . fora . println ( aluno );
		}
		Sistema . fora . println ();
		Sistema . fora . println ( "Pressione ENTER para continuar" );
		Sistema . em . ler ();
	}
}