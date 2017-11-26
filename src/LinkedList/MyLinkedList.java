package LinkedList;

public class MyLinkedList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;

    public String getFirstNode(){
        return firstNode.object.toString();
    }

    public String getLastNode(){
        return lastNode.object.toString();
    }

    private boolean isFirstOrLast = true;

    public void addLast(E object){
       if (isFirstOrLast){
           firstOrLastAdd(object);
       } else {
           Node<E> newLastNode = new Node<>();
           newLastNode.object = object;
           newLastNode.previous = this.lastNode;
           this.lastNode.next = newLastNode;
           this.lastNode = newLastNode;
       }

    }

    public void addFirst(E object){
        if (isFirstOrLast){
            firstOrLastAdd(object);
        } else {
            Node<E> newFirstNode = new Node<>();
            newFirstNode.object = object;
            newFirstNode.next = this.firstNode;
            this.firstNode.previous = newFirstNode;
            this.firstNode = newFirstNode;
        }

    }

    public E removeLast(){
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode){
            this.lastNode = this.firstNode = null;
            isFirstOrLast = true;
        } else {
            this.lastNode = this.lastNode.previous;
            this.lastNode.next = null;
        }
        return node.object;
    }

    public E removeFirst(){
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode){
            this.lastNode = this.firstNode = null;
            isFirstOrLast = true;
        } else {
            this.firstNode = this.firstNode.next;
            this.firstNode.previous = null;
        }
        return node.object;
    }

    private void firstOrLastAdd(E object){
        if (firstNode == null) {
            firstNode = lastNode = new Node<>();
            lastNode.object = object;
        }
        isFirstOrLast = false;
    }

    private class Node<E> {
        private E object;
        private Node next;
        private Node previous;
    }
}
