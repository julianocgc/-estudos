a = 2
b = 3
c = 2.2

som = a + b # soma
sub = a - b # subtração
mul = a * b # multiplicação
div = a / b # divisão
exp = a ** b # exponenciação

print(f'Soma: {a} + {b} = {som}')
print(f'Subtração: {a} - {b} = {sub}')
print(f'Multiplicação: {a} + {b} = {mul}')
print(f'Divisão: {a} / {b} = {div}')
print(f'Exponenciação: {a} ** {b} = {exp}')

print(f'a é igual a 2: {a == 2}')
print(f'a é diferente de b: {a != b}')
print(f'b é maior que c: {b > c}')
print(f'b é menor que c: {b < c}')
print(f'a é maior ou igual a c: {a >= c}')
print(f'a é menor ou igual ao dobro de c: {a <= 2 * c}')

print(a == 2 and b == 5) # E
print(a != b or b > c) # OU
print(not b > c or b < c) # NÃO
print(b < c and a >= c)