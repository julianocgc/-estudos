var meses = ["jan", "fev", "mar", "abr", "mai", "jun", "jul"];
var dolar = [4.56, 4.89, 4.93, 5.23, 5.45];

console.log("VALOR DO DOLAR: ")
for(i = 0; i < dolar.length; i++){
    console.log("");
    console.log(meses[i] + ": R$ " + dolar[i]);
}