# language: pt

Funcionalidade: Criar uma nova conta em Mercury Tours
	Exemplo de criação de login na página Mercury Tours

Cenário: Criar uma nova conta no site da Mercury Tours  
	Dado que eu abro o site Mercury Tours
	E clico na opção REGISTER
	E preencho os campo para criação de uma nova conta
	|First Name |Last Name |Phone   |Email          |Address|City          |User Name|Password |Confirm Password|
	|xpto4      |c3po4     |99998888|xpto4@gmail.com|Rua b  |Rio de Janeiro|xpto     |leo32an24|leo32an24       |
	
	Então o sistema exibe a tela confirmando a inclusão
	 
	 

