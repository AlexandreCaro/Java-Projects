public class LinkedList {

    Element head = null;

    void add(Element e){
        if(head != null){
            e.next = head;
        }
        head = e;
    }

    static void myMethod(int i){
        if(i < 0){
            throw new NumberFormatException();
        }
    }
}

class Element {
    Element next;
    int value;

    Element(int value){
        this.value = value;
    }
}
