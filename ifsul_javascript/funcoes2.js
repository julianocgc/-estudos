function criarProduto(nome, quantidade){
    return {nome: nome, quantidade: quantidade}
}

var produto = criarProduto("Martelo", 30);
console.log(produto);