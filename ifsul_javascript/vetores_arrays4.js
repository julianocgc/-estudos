var meses = ["jan", "fev", "mar", "abr", "mai", "jun", "jul"];
var dolar = [4.56, 4.89, 4.93, 5.23, 5.45, 5.75, 5.80];

meses.push("ago"); //adiciona ao vetor
dolar.push(5.95); //adiciona ao vetor

console.log("VALOR DO DOLAR: ")
for(i = 0; i < dolar.length; i++){
    console.log("");
    console.log(meses[i] + ": R$ " + dolar[i]);
}