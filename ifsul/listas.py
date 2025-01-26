# exemplos sobre Listas
# listas usam colchetes [ ]
# listas podem ser modificadas

l1 = [2, 6, 8, 0, 35]
# l1 [0, 1, 2, 3, 4]

l2 = ['f', 0, 1, 3.14, 'abacaxi']
l2[1] = 5 # modificando um elemento da lista


print(l1[2])  # é possível acessar os elementos da Lista

for i in range(len(l1)):
    print(f'O {i + 1}º elemento da lista é {l1[i]}')

print(l2)