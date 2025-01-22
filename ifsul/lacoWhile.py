n = 1

while n < 10:
    print(f'O valor de n é: {n}.')
    n = n + 1

print('Fim do laço de repetição.')


senha = 0000

while senha != 1234:
    senha = int(input('Informe sua senha (4 digitos): '))

    if senha == 1234:
        print('SENHA CORRETA! ACESSO LIBERADO!')
    else:
        print('SENHA INCORRETA! ACESSO NEGADO!')

print('Fim do programa...')


op = ''

while op != 's':
    n = int(input('Entre com um número inteiro: '))
    if n % 2 == 0:
        print(f'O número {n} é par!')
    else:
        print(f'O número {n} é impar!')

    op = input('Você deseja continuar (c) ou sair (s) do programa?')

print('Programa encerrado...')