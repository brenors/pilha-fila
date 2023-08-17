import java.util.ArrayList;

public class Stack<T> {
    // vamos ter q usar generics
    // pq tem uma base se é a stack
    // vai ter q implementar um array generico na mao
    ArrayList<T> array;
    private int top = -1;
    private int size;
    private T[] stack;


    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new T [size];
    }

    public boolean isFull() {
        return stack[size-1] != null;
    }

    public boolean isEmpty() { return top == -1;}

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack vazia, não é possível remover itens");
        }
        else{
            top --;
        }
    }

    public void push(T valor){
        if(top == (stack.length - 1)){
            throw new RuntimeException("Stack está cheio!");
        }
        top++;
        stack[top] = valor;
    }

    public void clear(){
        for (T item : this.array) {
            this.pop();
        }
    }
}
