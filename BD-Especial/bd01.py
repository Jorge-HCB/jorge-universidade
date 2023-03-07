id = 1
nome = 'feijão'
preco = 7.38
categoria = 'Mercearia'
quantidade = 30

feijao = {"id": 1,
          "nome": "feijão",
          "preco": 7.38,
          "categoria": "mercearia",
          "quantidade": 30
         }

arroz = {"id": 2,
          "nome": "arroz",
          "preco": 4.30,
          "categoria": "mercearia",
          "quantidade": 120
         }

macarrao = {"id": 3,
          "nome": "macarrao",
          "preco": 6.50,
          "categoria": "mercearia",
          "quantidade": 100
         }

farinha = {"id": 4,
          "nome": "farinha de mandioca",
          "preco": 7.00,
          "categoria": "mercearia",
          "quantidade": 80
         }

produtos = [feijao, arroz, macarrao, farinha]

msg = f"""
Código: {id}
Produto: {nome}
Categoria: {categoria}
Valor {preco}
Estoque: {quantidade}
"""

linha = 50 * '='


i = int(input("digite o código do produto: "))
n = input("digite o nome do produto: ")
p = float(input("digite o preço do produto: "))
c = input("digite a categoria do produto: ")
q = int(input("digite a quantidade do produto no estoque: "))

novo_produto = {"id": i,
                "nome": n,
                "preco": p,
                "categoria": c,
                "quantidade": q}

produtos.append(novo_produto)

for produto in produtos:
    print(linha)
    for atributo, valor in produto.items():
        print(atributo, valor)
