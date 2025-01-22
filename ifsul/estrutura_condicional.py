n = input('Entre com um número inteiro entre 0 e 100: ')

n = int(n)

if n > 5:
    print(f'O número {n} é maior do que 5.')
elif n == 5:
    print(f'O número {n} é igual a 5.')
else:
    print(f'O número {n} é menor do que 5.')