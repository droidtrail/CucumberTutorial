#language: pt

Funcionalidade: Pagina Inicial do Google

A feature verificar uma funcionalidade na pagina inicial do Google.

Cenário: Verifica que o o elemento principla na pagina inicial do Google esta visivel
	Dado eu inicio o Google Chrome 
	Quando eu abro a pagina inicial do Google
	Então eu verifico que a pagina mostra a caixa de pesquisa de texto
	E a pagina mostra o botao de pesquisa do Google
	E a pagina mostra o botao eu estou com sorte 