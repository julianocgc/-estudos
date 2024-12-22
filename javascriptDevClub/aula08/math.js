/*
    Math -> Matemática
        - pow(2,2) / potência / 2² = 4
        - sqrt(25,2) / raiz / 
        - ceil / teto -> arredondar para cima
        - floor / chão -> arredondar para baixo
        - random() número aleatório entre 0 e 1
*/

const potencia = Math.pow(2,5)
console.log(potencia)

const raiz = Math.sqrt(25,2)
console.log(raiz)

const teto = Math.sqrt(125,2)
console.log(Math.ceil(teto))

const chao = Math.sqrt(125,2)
console.log(Math.floor(chao))

const num_ale = Math.random()
console.log(num_ale)

const max_min = Math.random() * (100 - 1) + 1;
console.log(max_min)