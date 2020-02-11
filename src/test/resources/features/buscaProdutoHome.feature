#language: pt

@pesquisa_produto_tela_home
Funcionalidade: Escolher produto atraves da tela home
	
	Como um usuario do sistema
	Eu quero encontrar um produto atraves da tela home
	Para que eu possa obter mais informações sobre ele
	
Cenario: Devo escolher um produto pela tela home
	Dado que o usuario esteja na pagina home 
	Quando seleciona a categoria "TABLETS"
	E seleciona o produto desejado "HP PRO TABLET 608 G1"
	Então o usuario deve visualizar as informações do produto "HP PRO TABLET 608 G1"