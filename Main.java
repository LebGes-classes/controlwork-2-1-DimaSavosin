
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.AddAtIndex(1,4); // добавление элемента по индексу
        System.out.println("ArrayList: " + list);
        System.out.println("Размер: " + list.size());
        System.out.println("Элемент по индексу 1: " + list.get(1));
        list.remove(1);
        System.out.println("ArrayList после удаления элемента под индексом 1: " + list);
        System.out.println("Проверка на пустоту: "+list.isEmpty());
    }
}
