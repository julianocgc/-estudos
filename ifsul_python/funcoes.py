# exemplos sobre funções
def imprimir():
    print('Executando uma função!')

imprimir()


def imprimir(s):
    print(f'Executando uma função, com o argumento {s}!')

imprimir('teste')


def soma(a, b):
    print('Soma =', a + b)

soma(3, 5)


def soma(a, b):
    return a + b

s = soma(2,7)
print(f'Soma = {s}')