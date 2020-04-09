package homecollection;


public class MyLinkedList <E> {

    private MyNode<E> head = null;







    public int size(E e) {
        MyNode<E> node = new MyNode<>(e, null);
        while (head != null) { // пока элемент не пустой
            node = node.getNext();

        } else{
            if (head == null) {
                node = null;
            }
        }
    }


    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            if (head != null) {

            }
            return false;
        }
    }


    public boolean contains(E e) {
        MyNode<E> node = new MyNode<>(e, null);
        while (head != null) {
            if (head.equals(head)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }


     public E toArray () {
    MyNode<E> node = head;
    E[] Array = (E[]) new Object[size()]; // переделать, нужен счетчик!
    }


    public boolean add(E e) { // положили объект
        MyNode<E> node = new MyNode<>(e, null); //создали объект на входе, допустим 8
        if (head == null) { //если в элементе пусто
            head = node; //то настоящий элемент = е, (допустим та самая 8)
        } else {

            MyNode curNode = null; //текущий узел, по которому будем бежать
            while (curNode.getNext() != null) { //пока каждый элемент по которму пробежимся не будет пустым
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        return true;
    }


    public void clear(E e) {
        MyNode<E> node = new MyNode<>(e, null);
        if (head == null) {
            head = node;
            System.out.println("List consists of " + node + " elements");
        }
        if (head != null) {

            head.setValue(null);
            System.out.println("Elements have been removed. The size = " + node);
        }
    }


    public E get ( int index){
        MyNode <E> node = new MyNode<>(null);
           if (index < 0 || index >= index(size())) {
               throw new IndexOutOfBoundsException();
           }
            head = node(index);
           for (int i = 0; i <head = head; index; i++) {

          }

            return ;
     }


    //public E set ( int index, E e) {
    //    checkElementIndex(index);
    //     MyNode<E> node = head;
    //    E oldVal = x.item;
    //    x.item = element;
    //    return oldVal;
    //}


    public E remove(int index) {
        MyNode<E> removingNode = null;
        if (head != null) {
            MyNode<E> curNode = head;
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.getNext();
            }
            removingNode = curNode.getNext();
            if (removingNode.getNext() != null) {
                curNode.setNext(removingNode.getNext());
            } else {
                curNode.setNext(null);
            }
            removingNode.setNext(null);
        }
        return (E) removingNode.getValue();
    }


        //public int indexOf (E e){
        //    int index = 0;
        //    MyNode lastNode = head;
        //    if (head == null) {
        //        for (index = 0; index <index; index++) {
        //            if (lastNode == head)
        //                return index;
        //            index++;
        //        }
        //    } else {

        //}


        //public boolean containsAll (Collection E){
        //
        //}


        @Override
        public String toString () {
            StringBuilder stringBuilder = new StringBuilder();
            if (head != null) {
                MyNode curNode = head;
                while (curNode.getNext() != null) {
                    stringBuilder.append(curNode.getValue()).append(" ");
                    curNode = curNode.getNext();
                }
            }
            return stringBuilder.toString();

        }


    }










