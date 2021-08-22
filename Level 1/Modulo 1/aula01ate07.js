/*  =======================  VARIÁVEIS

var nomeCompleto = "Ítalo Oliveira da Conceição"
var apelido = "Italo"
var idade = 31
var dataNascimento = "26/02/1990"
var localNascimento = "Porto Alegre"
var altura = 1.80
var trabalhando = "empregado"

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido como " + apelido + "). Tenho "  + idade + "anos. Nasci no dia " + dataNascimento + ",na cidade de " + ". Tenho " + altura + "metros de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + ".";

console.log(apresentacao);*/

/* ======================= OPERADORES

nomeDoFulano = "João";
nomeDoBeltrano = "Cleito";
mesmoNome = nomeDoFulano == nomeDoBeltrano;

idade = 17;
maiorDeIdade = idade >= 18;

valor = 10.50;
valorComJuros = valor + (valor / 10)
console.log(valorComJuros);

item1 = 1
item2 = 2
item3 = 3
item4 = 4
item5 = 5
media = (item1 + item2 + item3 + item4 + item5) / 5; 

margemBruta = lucroBruto / receitaLiquida * 100;

saldo = 1000.00
saldo = saldo - 99.90
saldo = saldo + 2500
saldo = saldo - 0.10
saldo = saldo - (saldo / 4)
saldo = saldo / 2
console.log(saldo)
*/


/* ======================= CONDICIONAIS


nota1 = 6.0
nota2 = 7.0
media = (nota1 + nota2) / 2
conceito = ""

if (media <= 4.0) {
  conceito = "Ruim!";
} else if (media <= 6.0) {
  conceito = "Regular";
} else if (media <= 8.0) {
  conceito = "Bom"
} else {
  conceito = "Ótimo"
}

console.log("Sua média foi", media)
console.log("O seu conceito foi", conceito)

switch (conceito) {
  case "Ruim":
    console.log("Precisa Estudar mais")
  break;
  case "Regular":
    console.log("Está quase lá")
  break;
  case "Bom":
    console.log("Continue Assim")
  break;
  case "Ótimo":
    console.log("Ólimo!!!")
  break;
}
*/

/*  IMC: Índice de Massa Corpórea

peso = 87
altura = 1.60
imc = peso / (altura ** 2)
classificacao = ""
grau = 0
console.log("Seu IMC é", imc.toFixed(2))

if (imc < 18.50) {
    classificacao = "Magreza"
    grau = 0
  }
  else if (imc > 18.50 && imc <= 24.99) {
    classificacao = "Normal"
    grau = 0
  }
  else if (imc > 24.99 && imc <= 29.99) {
    classificacao = "Sobrepeso"
    grau = 1
  }
  else if (imc > 29.99 && imc <= 39.99) {
    classificacao = "Obesidade"
    grau = 2
  }
  else {
    classificacao = "Obesidade Grave"
    grau = 3
  }
  


console.log("Sua classificacao é", classificacao)
if (grau > 0) {
  console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
}
*/

/* ======================= ARRAYS

alunos = ["Cleber", "Kauan", "Cleiton", "Jander"]
notas = [  [5.2,4.7], [7.3,4.2], [6.2,8.8], [7.0,7.2]  ]

alunoSelecionado = 2

nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]

nota1 = notasDoAluno[0]
nota2 = notasDoAluno[1]
media = (nota1 + nota2)/2

console.log(nomeDoAluno)
console.log("A primeira nota foi:", nota1)
console.log("A segunda nota foi:", nota2)
console.log(nomeDoAluno, "Teve média:", media)

*/