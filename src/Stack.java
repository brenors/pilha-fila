import java.util.ArrayList;

//A classe Stack é uma classe genérica que implementa uma pilha. Ela é parametrizada com o tipo T,
// que representa o tipo de elementos que serão armazenados na pilha.
public class Stack<T> {
    //é um objeto do tipo ArrayList<T> que será usado para armazenar os elementos da pilha.
    private ArrayList<T> stack;

    //é um inteiro que representa o índice do elemento no topo da pilha.
    private int top;

    // é um inteiro que representa o tamanho máximo da pilha.
    private int size;

    // o método construtor recebe como parâmetro o tamanho da pilha e inicializa os atributos size,
    // top e stack. Ele cria um novo objeto ArrayList<T> com o tamanho especificado.
    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new ArrayList<T>(size);
    }

    // verifica se o o topo da pilha é igual ao tamanhao - 1 da pilha, retornando true, caso contrário retorna false
    public boolean isFull() {
        return top == size - 1;
    }

    //verifica se a pilha está vazia, retornando true caso top seja = -1, do contrário retorna false
    public boolean isEmpty() {
        return top == -1;
    }

    //o métoto pop() verifica se a lista está vazia, mostrando uma mensagem no console caso true, do contrário, ele usa o método remove()
    //nativo do ArrayList para remover o item na posição correspondente do topo e também diminui em 1 o valor de top
    public void pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia, não é possível remover itens.");
        } else {
            stack.remove(top);
            top--;
        }
    }

    // o método push() adiciona um valor(parâmetro) à pilha através so método .add() nativo do ArrayList, caso a pilha esteja cheia ele mostra uma mensagem no console
    public void push(T valor) {
        if (isFull()) {
            System.out.println("A pilha está cheia!");
        }
        top++;
        stack.add(top, valor);
    }

    // por fim o método clear() apenas remove todos os itens da pila através do método .clear() nativo do ArraList e
    //altera o valor de top = -1
    public void clear() {
        stack.clear();
        top = -1;
    }

    // Com a implementação da pilha basta brincar na classe main, instanciando e utilizando os métodos criados aqui.
}
