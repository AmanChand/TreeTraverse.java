import java.util.Queue;
import java.util.LinkedList;

public class TreeTraverse {

    private static class Node<T> {
    public Node<T> left;
    public Node<T> right;
    public T data;

    public Node(T data) {
        this.data = data;
    }
    
    public Node<T> getLeftChild() {
        return this.left;
    }
    
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRightChild() {
        return this.right;
    }
    
    public void setRight(Node<T> right) {
        this.right = right;
    }

}
    
    /**
    * Getting the postorder traversal for the tree
    */
    private static void postorderTraverse(Node<?> n) {
        if (n != null) {
            postorderTraverse(n.getLeftChild());
            postorderTraverse(n.getRightChild());
            System.out.print(n.data + " ");
        }
    }

    public static void main(final String[] args) {
        Node<Integer> one = new Node<Integer>(9);
        Node<Integer> two = new Node<Integer>(27);
        Node<Integer> three = new Node<Integer>(88);
        Node<Integer> four = new Node<Integer>(83);
        Node<Integer> five = new Node<Integer>(82);
        Node<Integer> six = new Node<Integer>(97);
        Node<Integer> seven = new Node<Integer>(39);
        Node<Integer> eight = new Node<Integer>(32);
        Node<Integer> nine = new Node<Integer>(5);
        one.setLeft(two);
        one.setRight(three);
        two.setLeft(four);
        two.setRight(five);
        three.setLeft(six);
        four.setLeft(seven);
        six.setLeft(eight);
        six.setRight(nine);

    System.out.println("Postorder: ");
    postorderTraverse(one);

    }
}
