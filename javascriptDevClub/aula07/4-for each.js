/*
    ForEach(item, index, array)

    item = Dados/Informações contidos na posição atual do Array.
    index = Número da Posição. Sempre começando em 0.
    array = Número do Array completo.
*/

const users = [
    {nome: 'Rodolfo', idade: 33, contato: '(19) 94343-3434'},
    {nome: 'Paulo', idade: 17, contato: '(12) 93443-3535'},
    {nome: 'Aline', idade: 40, contato: '(13) 94566-3737'},
    {nome: 'Maria', idade: 13, contato: '(14) 95343-3939'},
]

users.forEach(function(item, index, array){
    if(item.idade < 18){
        console.log(`O cliente ${item.nome}, posição ${index}, é menor de idade.`)
    }
})