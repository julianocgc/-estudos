/*
    Estrutura de Repetição - LOOP
        - FOR IN
        - Usado para iterar Objetos
*/

const user = { 
    nome: 'Rodolfo', 
    idade: 33, 
    endereco: 'Rua dos Bobos'
}

for(let key in user){
    console.log(key)
    console.log(user.nome)
    console.log(user.idade)
    console.log(user.endereco)
}

    for(let key in user){
        console.log(key + ': ' + user[key])
}

for(let key in user){
    console.log(`${key} : ${user[key]}`)
}