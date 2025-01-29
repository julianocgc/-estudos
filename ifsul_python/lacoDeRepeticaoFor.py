for i in range(5):
    print(i)

soma = 0

for i in range(4):
    print(f'{soma} = {soma} + {i}')
    soma = soma + i

print(soma)


n = int(input('Número final da soma: '))
soma = 0

for i in range(n + 1):
    print(f'{soma} = {soma} + {i}')
    soma = soma + i

print(soma)


l = ['x', 3, 6, 'a']

for e in l:
    print(e)