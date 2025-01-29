# exemplos sobre bibliotecas / módulos
import math

graus = float(input('Informe o ângulo em graus (º): '))

seno = math.sin(math.radians(graus))
cosseno = math.cos(math.radians(graus))
tangente = math.tan(math.radians(graus))

print(f'Seno de {graus}º = {seno:.2f}')
print(f'Cosseno de {graus}º = {cosseno:.2f}')
print(f'Tangente de {graus}º = {tangente:.2f}')


# exemplos sobre bibliotecas / módulos
import turtle

turtle.shape('turtle')
def quadrado(lado):
    for i in range(4):
        turtle.forward(lado)
        turtle.left(90)
        lado = lado + 5

quadrado(10)
quadrado(30)
quadrado(50)
quadrado(70)

turtle.done()


# exemplos sobre bibliotecas / módulos
import turtle
import time

turtle.shape('turtle')
def quadrado(lado):
    for i in range(4):
        turtle.forward(lado)
        turtle.left(90)
        lado = lado + 5
        time.sleep(1)

quadrado(10)
quadrado(30)
quadrado(50)
quadrado(70)

turtle.done()