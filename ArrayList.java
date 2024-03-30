import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Нельзя создавать массив с такиим размером : " + initialCapacity);
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    public int size() { // метод размер
        return size;
    }

    public boolean isEmpty() { // метод пустота
        return size == 0;
    }

    public void add(E element) { // метод добавления
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = element;
    }

    public E get(int index) { // метод получение элемента
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        return (E) elements[index];
    }

    public void remove(int index) { // метод удаления
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    private void increaseCapacity() { // метод увелечения размера
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    @Override
    public String toString() { // вывод
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.append(elements[size - 1]).append("]");
        return sb.toString();
    }
    public void AddAtIndex(int index, E element) { // добавление элемента по индексу
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        if (size == elements.length) {
            increaseCapacity();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }
}
