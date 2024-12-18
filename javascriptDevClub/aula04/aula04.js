/*
    Functions / Funções
        - Trecho de código que é executado SOMENTE quando solicitado (chamado)
        - Trecho de código que pode ser REUTILIZADO várias vezes.

    [x] O que é uma função e como usar
    [x] Função VOID (vazia) = não RETORNA nada
    [x] Função com parâmetros
    [x] Função Return
    [x] Arrow Function
*/
const number = 200

console.log(number)

/* void */
function digaMeuNome(){
    console.log("Rodolfo Mori")
}

digaMeuNome()

function digaMeuNome1(){
    const name = 'Juliano'
    console.log(name)
}

digaMeuNome1()

/* parâmetros */
function digaQualquerNome(nome){

    console.log(nome)
}

digaQualquerNome("Vitor")

function soma(numero1, numero2){
    const resultado = numero1 + numero2

    console.log(resultado)
}

soma(2,6)
soma(50,33)

/* return */
function soma(numero1, numero2){
    const resultado = numero1 + numero2

    return resultado
}

const resultadoDaSoma = soma(30, 40)

console.log(resultadoDaSoma)

function estaEndividado(receita, despesa){
    if(receita > despesa){
        return "Está no AZUL"
    } else {
        return "Está no VERMELHO"
    }
}

const maria = estaEndividado(5000, 7000)
const joao = estaEndividado(10000, 2000)

console.log(maria)
console.log(joao)

/* arrow function (função flecha) */

function abacate(){} // forma clássica
const digaMeuNome2 = () =>{
    console.log("Rodolfo")
}

digaMeuNome2()