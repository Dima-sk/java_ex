package scr.lab9.example28_5;

public class example1 {
    public static void main(String[] args) {
        Node head = null;

        // Построение списка с головы (от 0 до 9)
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        System.out.println("Список (вывод рекурсией):");
        printListRecursive(head);
    }

    // Рекурсивный метод вывода списка
    public static void printListRecursive(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.value + " ");
        printListRecursive(node.next);
    }
}