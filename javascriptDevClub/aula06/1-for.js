/*
Estrutura de Repetição - LOOP
    - FOR
    1- INICIALIZAÇÃO - Criar uma variável e colocar um valor iicial para ela.

    2- CONDIÇÃO - Enquanto for true, o laço continuará iterando. Ele irá verificar antes de cada iteração.

    3- EXPRESSÃO FINAL - O que irá acontecer a cada vez que o nosso laço der uma volta.

    for ([inicialiazação]; [condição]; [expressão final]){
        seu código aqui
    }
*/

for(let i = 0; i < 10; i++){
    console.log(i)
}


const users = ['Maria', 'Aline', 'João'] //lenght = tamanho do array

for(let j = 0; j < users.length; j++){
    console.log(users[j])
}