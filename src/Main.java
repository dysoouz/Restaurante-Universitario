
import View.Janela;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Janela janela = new Janela();
    }
}

/*
 * O código apresenta a implementação do padrão de projeto Builder. O padrão Builder é um padrão de criação,
 * que é usado quando um objeto complexo precisa ser construído com muitos atributos opcionais ou configuráveis.
 * O objetivo é simplificar a construção de objetos e tornar o código mais legível.
 *
 * Propriedades do Padrão Builder:
 * - Classe principal (Cardapio) com construtor privado e atributos opcionais.
 * - Classe interna (CardapioBuilder) para construir objetos, com métodos para configurar
 *   cada atributo opcional e um método final para criar o objeto.
 *
 * Componentes do Código:
 * - Classe Cardapio: Representa o cardápio com vários atributos opcionais.
 * - Classe interna CardapioBuilder: Responsável por criar uma instância de Cardapio de forma flexível
 *   e legível, com métodos para definir os diferentes atributos do cardápio.
 *
 * Uso do Padrão Builder:
 * - Criar uma instância de CardapioBuilder.
 * - Usar métodos da classe CardapioBuilder para definir os atributos do cardápio conforme necessário.
 * - Chamar o método builder() para criar um objeto Cardapio com os atributos configurados.
 * - O objeto Cardapio resultante pode ser usado para representar um cardápio completo.
 */
