package org.example;



public class Stack {
    private int[] node;
    private int tamaño;

    public Stack(int capacidad) {
        this.node=new int[capacidad];
        this.tamaño=-1;
    }

    public void push(int valor) {
        if (tamaño + 1 >= node.length) {
            throw new StackOverflowError("Stack overflow");
        }
        node[++tamaño] = valor;
    }

    public int size() {
       return tamaño +1;
    }

    public int pop() throws IllegalAccessException {
        if (isEmpty()){
            throw new IllegalAccessException("El stack esta vacio");
    }
     return node[tamaño--];
    }

    public boolean isEmpty(){
        return tamaño == -1;
    }
    public int peek() {
        if (tamaño==-1){
            return -1;
        }
        return node[tamaño];
    }

}