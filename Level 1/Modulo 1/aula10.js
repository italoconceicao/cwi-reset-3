// Variáveis :

let niveis = ["Muito abaixo do peso",
              "Abaixo do peso",
              "Peso Normal",
              "Acima do peso",
              "Obesidade Grau I",
              "Obesidade Grau II",
              "Obesidade Grau III"]

let pessoas = ["José", "Josefina", "Claudomiro", "Euzébio", "Clodoaldo"]
let massas = [190, 67, 90, 84, 59]
let alturas = [1.80, 1.60, 1.77, 2.0, 1.55]


// Funções :


function calcularImc(massa, altura){
  let imc = massa / (altura ** 2)
  return imc
}


function verificarNivel( imc ){
  let nivel = 0

  if (imc < 17) {
    nivel = 0
  } else if (imc < 18.5) {
    nivel = 1
  } else if (imc < 25) {
    nivel = 2
  } else if (imc < 30) {
    nivel = 3
  } else if (imc < 35) {
    nivel = 4
  } else if (imc < 40) {
    nivel = 5
  } else {
    nivel = 6
  }

  return nivel
}



// Execução do codigo

for(let indice = 0; indice < pessoas.length; indice++) {

  let pessoa = pessoas[indice]
  let massa = massas[indice]
  let altura = alturas[indice]

  let imc = calcularImc(massa,altura)
  let nivel = verificarNivel(imc)

  console.log("Nome: "+ pessoa)
  console.log("Peso: "+ massa)
  console.log("Altura: "+ altura)
  console.log("IMC: "+ imc.toFixed(2))
  console.log("Estado: "+ niveis[nivel])
  console.log("")


}