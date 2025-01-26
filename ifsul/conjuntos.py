# exemplos sobre conjuntos
# conjuntos usam chaves { }
# conjuntos não possuem elementos repetidos

l1 = [0, 1, 1, 3, 1, 4, 5, 6, 7, 1]
cj = set(l1)

print(cj)


# exemplos sobre conjuntos
cj1 = {0, 1, 2, 3, 4, 5, 6}
cj2 = {1, 2, 3, 5, 7, 8, 9}

# união dos conjuntos 1 e 2
print('União:', cj1.union(cj2))
print('União:', cj1 | cj2)

# intersecção dos conjuntos 1 e 2
print('Intercecção:', cj1.intersection(cj2))
print('Intersecção:', cj1 & cj2)

# diferença dos conjuntos 1 e 2
print('Diferença do conjunto 1 para o 2:', cj1.difference(cj2))
print('Diferença do conjunto 2 para o 1:', cj2.difference(cj1))

print('Diferença do conjunto 1 para o 2:', cj1 - cj2)
print('Diferença do conjunto 2 para o 1:', cj2 - cj1)

# diferença simétrica dos conjuntos 1 e 2
print('Diferença simétrica:', cj1.symmetric_difference(cj2))
print('Diferença simétrica:', cj1 ^ cj2)


# exemplos sobre conjuntos
menores = {'João', 'Maria', 'José', 'Lucas', 'Tiago'}
maiores = {'Natália', 'Ricardo', 'José', 'Tiago', 'Sandra', 'Michele'}
futebol = {'Joao', 'Maria', 'José', 'Sandra'}
basquete = {'Natália', 'José', 'Tiago'}
atletismo = {'João', 'José'}
masculino = {'João', 'José', 'Lucas', 'Tiago'}
feminino = {'Maria', 'Natália', 'Sandra', 'Michele'}

# todos os alunos do sexo feminino e que praticam ou não um esporte
print('Todos os alunos: ')
print(menores | maiores)

# alunos maiores que jogam futebol
print('Alunos maiores que jogam futebol:', maiores & futebol)

# alunos que praticam mais de um esporte
print('Praticantes de mais de um esporte:', futebol & basquete & atletismo)

# alunas que praticam futebol
print('Alunas que praticam futebol:', futebol & feminino)