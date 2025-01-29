# exemplos sobre dicionários
# dicionários usam chaves { }

capitais = {'RS': 'Porto Alegre', 'PR': 'Curitiba', 'SC': 'Florianópolis'}
n_habit = {'RS': 1500000, 'PR': 1900000, 'SC': 510000}

for k in capitais:
    print(k)
    print(f'A cidade de {capitais[k]} possui {n_habit[k]} habitantes.')

print(capitais['PR'])


# exemplos sobre Dicionários

tKeys = ('Nome', 'Idade', 'Sexo', 'Peso', 'Altura')
cliente1 = {tKeys[0]: 'Luis Fernando da Silva', tKeys[1]: 35, tKeys[2]: 'M', tKeys[3]: 87, tKeys[4]: 1.92}
cliente2 = {tKeys[0]: 'Sandro Almeida', tKeys[1]: 22, tKeys[2]: 'M', tKeys[3]: 68, tKeys[4]: 1.68}
cliente3 = {tKeys[0]: 'Ana Júlia Faria', tKeys[1]: 18, tKeys[2]: 'f', tKeys[3]: 56, tKeys[4]: 1.59}

print(cliente1['Nome'])
print(cliente2[tKeys[3]])
print('O cliente', cliente3[tKeys[0]], 'possui um peso de', cliente3[tKeys[3]], 'Kg.')