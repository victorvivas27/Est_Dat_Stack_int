package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    //1)Crear Stack comprivar que esta vacia
    //2)Hacer push al stack solo push
    //3)Obtener size de la stack
    //4Hacer push y optener el size
    //5)Hacer push ,push y optener el size
    //6)Hacer pop  solo pop
    //7)Hacerpush y pop
    //8)Hacer peek solo peek
    //9)push,peek hacer size
    //10)push,push,pop,pop
    //11)push,pop,push,pop
    //12)max size
    //13)push ,max size +1
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(3);
    }

    @Test
    public void stackVacia() {
        assertNotNull(stack);
    }

    @Test
    public void hacerPushAlStack() {
        stack.push(1);

    }


    @Test
    public void obtenerElSizeDeLaStack() {
        assertEquals(0, stack.size());
    }

    @Test
    public void hacerPushAlStackDevolverElSize() {
        stack.push(2);
        stack.size();
        assertEquals(1, stack.size());
        System.out.println(stack.size());

    }

    @Test
    public void hacerDosPushOptenerElSize() {
        stack.push(23);
        stack.push(56);
        assertEquals(2, stack.size());
    }

    @Test
    public void hacerPopEnStackVacio() {

        assertThrows(IllegalAccessException.class, () -> stack.pop());
    }

    @Test
    public void hacerPushYPop() throws IllegalAccessException {
        stack.push(1);
        stack.pop();
        assertThrows(IllegalAccessException.class, () -> stack.pop());
    }

    @Test
    public void hacerPeek() {
        int resultado = stack.peek();
        assertEquals(-1, resultado);
        System.out.println("PEEK: " + resultado);

    }

    @Test
    public void hacerPushPushPopPop() throws IllegalAccessException {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushPopPushPop() throws IllegalAccessException {
        stack.push(10);
        stack.push(20);
        assertAll(
                () -> assertEquals(20, stack.pop()),
                () -> assertEquals(10, stack.pop()),
                () -> assertTrue(stack.isEmpty())
        );
    }

    @Test
    public void maxSize() {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    public void pushMasAllaDeMaxSize() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertThrows(StackOverflowError.class, () -> stack.push(23));
    }
}



