import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack;
    private int top;
    private int size;

    /* o método construtor recebe como parâmetro o tamanho da pilha e inicializa os atributos size,
     top e stack. Ele cria um novo objeto ArrayList<T> com o tamanho especificado. */
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

    /*o métoto pop() verifica se a lista está vazia, mostrando uma mensagem no console caso true, do contrário, ele usa o método remove()
    nativo do ArrayList para remover o item na posição correspondente do topo e salvar na variavel value para ser retornado.
    E também o valor de top diminui em 1.
     */
    public T pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia, não é possível remover itens.");
            return null;
        }
        T value = stack.remove(top);
        top--;
        return value;
    }


    /* o método push() é usado para adicionar uma elemento à pilha. Ele verifica se a pilha está cheia e retorna uma mensagem no console.
    Se a pilha estiver vazia, o top é incrementado, em seguida o stack e adicionado com o valor */
    public void push(T valor) {
        if (isFull()) {
            System.out.println("A pilha está cheia!");
        }
        top++;
        stack.add(top, valor);
    }

    /* o método clear() apenas remove o último item e altera o valor de top = -1
     */
    public void clear() {
        stack.clear();
        top = -1;
    }

    // Com a implementação da pilha basta brincar na classe main, instanciando e utilizando os métodos criados aqui.
}
