meu_arquivo = open('C:\\Users\\usuario\\arquivo_teste.txt', encoding='utf-8')
linhas = meu_arquivo.readlines()

for linha in linhas:
    print(linha, end= '')

meu_arquivo = open('C:\\Users\\usuario\\arquivo_teste.txt', 'w', encoding='utf-8')
meu_arquivo.write('NOVO TEXTO ESCRITO NO ARQUIVO!')

meu_arquivo = open('C:\\Users\\usuario\\arquivo_texte.txt', 'a', encoding='utf-8')
meu_arquivo.write('\n')
meu_arquivo.write('NOVO TEXTO ESCRITO NO ARQUIVO SEM SUBSTITUIR O TEXTO ORIGINAL!')
meu_arquivo.close()