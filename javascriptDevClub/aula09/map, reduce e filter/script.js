/*
    Dominando Arrays no JavaScript

    Map(Mapear item por item do Array)
        - Criar um novo Array com a mesma quantidade de itens do Array original.
        - No novo Array você pode alterar o que quiser em relação ao Array original.
        - Você tem acesso a 3 dados:
            - Item por item do Array
            - Posição atual do Array
            - Array completo
*/

const numeros = [1,2,3,4,5]

const dobro = numeros.map((numero, index, arrayCompleto) => {
    console.log(arrayCompleto)
})

const num = [1,2,3,8,10]

const item = num.map((num) => {
    return num * 4
})

console.log(item)