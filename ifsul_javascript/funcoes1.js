function teste(){
    const var1 = 'Valor';
    function teste2(){
        console.log('Função Interna');
    }
    teste2();
}

teste();
console.log(var1); // não será executado pois var1 é uma variável local