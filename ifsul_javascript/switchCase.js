cargo = prompt("Digite o seu cargo: ");
salario = 2000;

switch(cargo){
    case "gerente":
        salario *= 1.15; // salario = salario * 1.15
        break;
    case "supervisor":
        salario *= 1.10; // salario = salario * 1.10
        break;
    default:
        salario *= 1.05; // salario = salario * 1.05
}

console.log("Salário do " + cargo + ": " + salario)