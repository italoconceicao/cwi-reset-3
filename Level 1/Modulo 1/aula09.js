  // Função:

function imprimir(argumento){
  console.log(argumento)
}

imprimir()


//Verifica se os dois nomes informados são iguais.

function mesmoNome(nomeDoFulano, nomeDoBeltrano){
  return nomeDoFulano == nomeDoBeltrano
}

cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false


// Verificação de maioridade.

function maiorDeIdade(idade){
  return idade >= 18
}

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false


// Realiza o cálculo do valor do boleto com juros. (Atualmente, a taxa de juros é de 10%.)

function valorComJuros(valor){
  return valor*1.1
}

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95


// Cálculo da média aritmética de todos os itens presentes no array passado como argumento.

function mediaAritmetica(numeros){
  
  soma = 0
    //soma todos os itens do array:
  for (i = 0; i < numeros.length; i++){ 
    soma = soma + numeros[i]
  }
  media = soma / numeros.length

  return media
}

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3


/* Cálculo da margem bruta da empresa com base na 
 receita líquida de vendas e no custo dos produtos vendidos.
 O resultado final é multiplicado por 100 para considerar o valor percentual. */

function margemBruta(receitaLiquida, custoProdutos) {
  lucroBruto = receitaLiquida - custoProdutos
  
  return (lucroBruto / receitaLiquida) * 100
}

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]
 