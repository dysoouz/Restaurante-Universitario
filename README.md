<h1>Restaurante-Universitario</h1>
<p>O código apresenta a implementação do padrão de projeto Builder. O padrão Builder é um padrão de criação,<br>
que é usado quando um objeto complexo precisa ser construído com muitos atributos opcionais ou configuráveis.<br>
O objetivo é simplificar a construção de objetos e tornar o código mais legível.</p>

<h2>Propriedades do Padrão Builder</h2>
<ol>
    <li>Classe principal (Cardapio) com construtor privado e atributos opcionais;</li>
    <li>Classe interna (CardapioBuilder) para construir objetos, com métodos para configurar<br> 
      cada atributo opcional e um método final para criar o objeto.</li>
</ol>
<h2>Componentes do Código:</h2>
<ol>
    <li>Classe Cardapio: Representa o cardápio com vários atributos opcionais;</li>
    <li>Classe interna CardapioBuilder: Responsável por criar uma instância de Cardapio de forma flexível<br>
      e legível, com métodos para definir os diferentes atributos do cardápio.</li>
</ol>
<h2>Uso do Padrão Builder:</h2>
<ol>
    <li>Criar uma instância de CardapioBuilder;</li>
    <li>Usar métodos da classe CardapioBuilder para definir os atributos do cardápio conforme necessário;</li>
    <li>Chamar o método builder() para criar um objeto Cardapio com os atributos configurados;</li>
    <li>O objeto Cardapio resultante pode ser usado para representar um cardápio completo.</li>
</ol>
