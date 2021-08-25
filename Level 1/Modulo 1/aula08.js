
// ESTRUTURAS DE REPETIÇÃO:

//While verifica primeiro e executa depois
//DoWhile executa primeiro e verifica depois

num = 1
while (num<=10) {
  console.log(num++)
}

do {
  console.log(num++)
} while (num<=10)

for (num = 1; num <= 10; num++) {
  console.log(num)
}


//Exemplo de for

alunos = ["Cleber", "Kauan", "Cleiton", "Jander"]
notas = [  [5.2,4.7], [7.3,4.2], [6.2,8.8], [7.0,7.2]  ]
notasDoAluno = 0

for (num = 0; num < alunos.length; num++) {

alunoSelecionado = num

nomeDoAluno = alunos[alunoSelecionado]
notasDoAluno = notas[alunoSelecionado]

nota1 = notasDoAluno[0]
nota2 = notasDoAluno[1]
media = (nota1 + nota2)/2

console.log(nomeDoAluno)
console.log("A primeira nota foi:", nota1)
console.log("A segunda nota foi:", nota2)
console.log(nomeDoAluno, "Teve média:", media)
console.log("")

}

//Exercício:

nomes = ["Cleiton", "Jonas", "Cleber", "Juarez", "Claudio"];
for(i = 0; i < nomes.length; i++) {
    nome = nomes[i];
    console.log(nome);
}

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

arrayNum = [1, 3, 6, 9, 15, 78]
arraySum = 0

for (i = 0; i < arrayNum.length; i++) {
  arraySum += arrayNum[i]  
}
media = arraySum / arrayNum.length
console.log(media)

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


myName = "Italo"
nomeComum = false
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

for (i = 0; i < nomesComuns.length; i++) {
    if (nomesComuns[i] == myName) {
      nomeComum = true;
      break
    }    
  }      
    if (nomeComum == true) {        
      console.log("É, nome comum :P.")
    } else {
      console.log("Diferentão, hein? XD.")
    }