var idade;
idade = prompt("Digite a sua idade: ")

if (idade >= 18){
    var maiorIdade = true;
    document.write("Maior de idade. Pode dirigir!");
} else {
    var maiorIdade = false;
    document.write("Menor de idade. Não pode dirigir...")
}