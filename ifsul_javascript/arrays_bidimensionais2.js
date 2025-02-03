var notas = [[4.5, 6.5, 8.7], [8.5, 9.7, 9.9]];

var colunas = notas[0].length;

acu = 0;
for(let i = 0; i < colunas; i++){
    acu = acu + notas[0][i];
}

var media = acu/colunas;
console.log("Média do João: " + media);