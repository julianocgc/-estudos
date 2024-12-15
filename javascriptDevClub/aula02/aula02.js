/* * Variáveis

    const
    let
    var (não é recomendado usar)

    * Tipos de dados

    Strings = Textos
    Numbers = Números
    Boolean = Booleano
    Object = Objetos
    Null & Undefined
    Array = Matriz

    "" é usuada para textos
    '' também é usada para textos
    `` usada em textos de mais de uma linha misturando com variáveis `texto ${var}`

    */

const abacate = "E aí, já se inscreveu no canal?"
let numero = 30

console.log(abacate)
console.log(numero)

let banana = "Tudo certo por aí?"
console.log(banana)

banana = 50
console.log(banana)

numero = 39
const texto = `O número é ${numero}`
console.log(texto)

numero = 200 / 20
let frase = `O resultado é ${numero}`
console.log(frase)

const nome = "Rodolfo"
const idade = 30
const casado = true

const usuario = {
    nome: 'Rodolfo',
    idade: 30,
    casado: true,
    conjuge: "Dona Bonita"
}

console.log(usuario)
console.log(usuario.nome)
console.log(usuario.conjuge)

const meuArray = [10, 20, 30, 40, 50]
console.log(meuArray)
console.log(meuArray[1])