let colaboradores = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
let idades = [69, 66, 58, 61, 60, 64, 59, 55]
let temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26, 29]


function verificarAposentadoria(nome) {

  colaborador = false
  idade = 0
  contribuicao = 0

  //buscar por nome:
  for (i = 0; i < colaboradores.length; i++) {

    if (nome == colaboradores[i]) {
      colaborador = true
      idade = idades[i]
      contribuicao = temposDeTrabalho[i]
    }

  }

  if (colaborador) {
    
    porIdade = idade >= 65
    porTempoDeTrabalho = contribuicao >= 30
    porIdadeComTempoDeTrabalho = idade >= 60 && contribuicao >= 25
    
    if (porIdade || porTempoDeTrabalho || porIdadeComTempoDeTrabalho) {
      console.log("Parabéns, já pode sair de férias eternas :)")
    } else {
      console.log("Infelizmente, ainda falta um tempo :(")
    }
  } else {
      console.log("Colaborador inválido :|")
  }
}

verificarAposentadoria('Rosiméri')    // true (regra 3)
verificarAposentadoria('Agripino')    // false (falta 1 ano de idade para regra 3)
verificarAposentadoria('Rhoger')      // true (todas)
verificarAposentadoria('Hudnélson')   // false (colaborador inexistente)
verificarAposentadoria('Gleysberto')  // true (regra 2)
verificarAposentadoria('Regislane')   // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria('Cléverson')   // true (regras 1 e 3)
verificarAposentadoria('Nádio')       // true (regra 3)
verificarAposentadoria('Wellison')    // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria('Florisberto') // false (colaborador inexistente)