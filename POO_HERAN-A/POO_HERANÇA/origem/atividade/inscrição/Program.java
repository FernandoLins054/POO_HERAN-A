pacote  Atividade . aplicação ;

importar  java . io . IOException ;
importar  java . . _ ArrayList ;
importar  java . . _ lista ;
importar  java . . _ Scanner ;

importar  Atividade . entidades . Aluno ;
importar  Atividade . menu . MenuInicio ;

 Programa de classe  pública {


	public  static  void  main ( String [] args ) throws  IOException {
		MenuInício  menuInício = new  MenuInício ();

		List < Aluno > alunos = new  ArrayList <>();
		Scanner  sc = novo  Scanner ( System . in );
		menuInicio . menuPrincipal ( alunos , sc );
	}

}