Doação RS

Nosso Trabalho é voltado para um programa que cria uma lista de doações,como roupas,comida ou dinheiro,essa ideia surgiu devido às tragédias que aconteceram no RS,no programa o usuário escolhe o tipo da doação, quantidade e data, isso é  salvo em um arquivo texto.

Funcionalidade                 
Entrada: coloca os dados da adoção (Tipo, Quantidade e Data).
Processamento: Converte o número digitado para um tipo e joga para um arquivo de texto.
Saída: se o arquivo for salvo com sucesso ele dá uma mensagem dizendo que foi salvo, caso contrário ele mostra o erro.




Autores:
Samuel Andrade Resende ,
Thomas Sheldon Freire Padley 

Conversa com a IA:
Nos pedimos a IA para nos dar os requisitos funcionais do sistema a nossa pergunta foi:
Cite requisitos funcionais de um Sistema muito simples de doações que apenas recebe a data,o tipo da doação e o valor se tipo for dinheiro e depois entrega relatório em arquivo txt.
ChatGPT
Claro, aqui estão alguns requisitos funcionais para um sistema de doações:
Registro de Doações:
O sistema deve permitir o registro da data da doação.
Deve permitir especificar o tipo de doação (por exemplo, dinheiro, roupas, alimentos).
O sistema deve permitir inserir quantidade/valor doado.
Geração de Relatório:
O sistema deve ser capaz de gerar um relatório em formato de arquivo de texto (TXT).
O relatório deve conter informações sobre todas as doações registradas.
Cada entrada no relatório deve incluir a data da doação, o tipo de doação e, o valor/quantidade doado.






Critica:

 Os requisitos para registrar doações são bem tranquilos de entender, o que é ótimo para quem vai usar o sistema. Não precisa se preocupar muito com muitos detalhes ou opções complicadas. E isso é bom, porque facilita bastante o processo de inserir os dados das doações, sem ter que ficar quebrando a cabeça. E quando se trata de gerar os relatórios, é legal saber que vai ser tudo em arquivo de texto, o que todo mundo consegue abrir, sem precisar de programas complicados. Assim, o sistema parece ser bem fácil de usar e de entender, o que é uma vantagem.







Diagrama de Classe:

Classe Doação:

Propriedades: 
-tipo; String
-Quantidade; Int
-Data; String 


Métodos;
+getTipo (); String
+setTipo (); Void
+getQuantidade (); Int
+setQuantidade ():Void
+getData (); String
+setData (); Void



Classe Gerenciamento:

Metodos;

+salvarDoacao; Void



Classe InterfaceDoacao:


Metodo:

+receberEntrada; doaçao

