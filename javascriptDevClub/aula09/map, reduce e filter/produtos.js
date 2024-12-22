/*
    Dominando Arrays no JavaScript

    Map (Mapear item por item do Array)
        - Criar um novo Array com a mesma quantidade de itens do Array original.
        - No novo Array você pode alterar o que quiser em relação ao Array original.
        - Você tem acesso a 3 dados:
            - Item por item do Array
            - Posição atual do Array
            - Array completo

    Reduce (Reduzir o Array a um único valor)
        - Reduz o Array inteiro a um ÚNICO valor.
        - Você tem acesso a 4 dados:
            - Acumulador
            - Valor atual
            - Posição atual
            - Array completo

    Filter (Filtrar o Array)
        - Cria um novo Array filtrando os valores desejados do Array original.
        - Você tem acesso a 3 dados:
            - Item por item do Array
            - Posição atual do Array
            - Array completo
*/

const produtos = [
    { id: 1, nome: "Smartphone Galaxy S21", preco: 3999.99, temDesconto: true, quantidade: 5 },
    { id: 2, nome: "Notebook Dell Inspirion", preco: 4500.00, temDesconto: false, quantidade: 3 },
    { id: 3, nome: "Smart TV LG 55\"", preco: 2799.00, temDesconto: true, quantidade: 5 },
    { id: 4, nome: "Fone de Ouvido Bluetooth JBL", preco: 299.90, temDesconto: false, quantidade: 2 },
    { id: 5, nome: "Câmera DSLR Canon", preco: 3200.00, temDesconto: true, quantidade: 1 },
    { id: 6, nome: "Tablet iPad Air", preco: 4199.00, temDesconto: false, quantidade: 8 },
    { id: 7, nome: "Console PlayStation 5", preco: 4699.00, temDesconto: true, quantidade: 2 },
    { id: 8, nome: "Smartwatch Apple Watch", preco: 2499.00, temDesconto: false, quantidade: 7 },
    { id: 9, nome: "Impressora HP Multifuncional", preco: 599.90, temDesconto: true, quantidade: 5 },
    { id: 10, nome: "Caixa de Som Portátil Sony", preco: 1000.00, temDesconto: false, quantidade: 3 },
]

console.log(produtos)

// CRIAR UM NOVO ARRAY FORMATANDO A MOEDA E DANDO DESCONTO AOS CLIENTES
const novosProdutos = produtos.map( produto => {

    const novoPreco = produto.temDesconto ? produto.preco * 0.9 : produto.preco

    return {
        id: produto.id,
        nome: produto.nome,
        preco: novoPreco.toLocaleString('pt-br', {
            style: 'currency', currency: 'BRL'
        }),
        quantidade: produto.quantidade
    }
})

console.log(novosProdutos)

// QUAL SERÁ O FATURAMENTO SE VENDERMOS TODO O ESTOQUE
const totalVendas = produtos.reduce((acumulador, produto) => {

    return acumulador + (produto.preco * produto.quantidade)
}, 0)

console.log(totalVendas.toLocaleString('pt-br', {
    style: 'currency', currency: 'BRL'
}),)

// FILTRAR SOMENTE OS PRODUTOS EM PROMOÇÃO
const promocao = produtos.filter( produto => produto.temDesconto)

console.log(promocao)

// Adicionar + 10 em cada produto
// Filtrar somente os que estão em promoção
// Saber qual será o faturamento se vendermos todos em promoção

const faturamentoTotal = produtos
.map((produto) => {
    return { ...produto, quantidade: produto.quantidade + 10 }
})
.filter((produto) => produto.temDesconto)
.reduce(
    (acumulador, produto) => acumulador + produto.quantidade * produto.preco, 
    0,
)

console.log(faturamentoTotal.toLocaleString('pt-br', {style: 'currency', currency: 'BRL'}))