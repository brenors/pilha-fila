import java.util.ArrayList;

//a fila possui duas posições, front e end, que representam o início e o fim da fila, respectivamente.
public class Queue<T> {
    private ArrayList<T> queue;
    private int front;
    private int end;
    private int size;

    /* o método construtor recebe como parâmetro o tamanho da fila e inicializa os atributos size,
    front, end e stack. Ele cria um novo objeto ArrayList<T> com o tamanho especificado.
     */
    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.end = -1;
        this.queue = new ArrayList<T>(size);
    }

    // verifica se o end é igual ao tamanhao - 1 da fila, retornando true, caso contrário retorna false
    public boolean isFull() {
        return end == size - 1;
    }

    //verifica se a fila está vazia, retornando true caso front seja = -1, do contrário retorna false
    public boolean isEmpty() {
        return front == -1;
    }

    /* o método enqueue() é usado para adicionar um elemento à fila. Ele verifica se a fila está cheia e
     mostra uma mensagem no console caso esteja. Se a fila estiver vazia, a posição front é definido como 0. Em seguida,
     a posição end é adicionado + 1 e o item é adicionado ao ArrayList na posição correspondente ao end.*/
    public void enqueue(T valor) {
        if (isFull()) {
            System.out.println("A fila está cheia!");
        }
        if (isEmpty()) {
            front = 0;
        }
        end++;
        queue.add(end, valor);
    }

    /* o método dequeue() é usado para remover o item do início da fila. Ele verifica se a fila está vazia e
     exibe uma mensagem no console caso esteja. Caso contrário, o item é removido do ArrayList na posição correspondente ao front
     e tambem é salvo na variavel value para ser retornado.
     Se o end for igual a 0, significa que a fila está vazia após a remoção, então as posições front e end são redefinidos como -1.
     Caso contrário, o end é decrementado em - 1.
     */
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia, não é possível remover itens.");
            return null;
        }
        T value = queue.remove(front);
        if (end == 0) {
            front = -1;
            end = -1;
        } else {end--;}
        return value;
    }

    // o método clear() apenas limpa a fila, utilziando o método clear() nativo do ArrayList e redefinindo as posições front e end = -1
    public void clear() {
        queue.clear();
        front = -1;
        end = -1;
    }

    // Com a implementação da fila basta brincar na classe main, instanciando e utilizando os métodos criados aqui.
}
