/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz..*/


programa
{
	
	funcao inicio()
	{
		
		const inteiro t=2
		inteiro l,c,soma=0,op,r,subtracao=0
		real m[t][t]

	
				escreva("Digite um número com base na legenda abaixo: ")
				escreva("\n(1) somar as duas matrizes ")
				escreva("\n(2) subtrair a primeira matriz da segunda ")
				escreva("\n(3) adicionar uma constante as duas matrizes ")
				escreva("\n(4) imprimir as matrizes \n")
				leia(op)


				se(op==1) {
					para(l=0;l<t;l++){
						para(c=0;c<t;c++){

							escreva("\nDigite 4 numeros para realizarmos a soma: ")
							leia(m[l][c])

							r = m[l][c]
						     soma = soma + r
						}
					}

					escreva("A soma é de ", soma)
				}

				se(op==2) {
					para(l=0;l<t;l++){
						para(c=0;c<t;c++){

							escreva("\nDigite 4 numeros para realizarmos a subtração: ")
							leia(m[l][c])

							r = m[l][c]
						     subtracao = subtracao - r
						}
					}

					escreva("A soma é de ", subtracao)
				}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */