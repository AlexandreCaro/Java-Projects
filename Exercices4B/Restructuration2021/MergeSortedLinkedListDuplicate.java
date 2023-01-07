public class MergeSortedLinkedListDuplicate {
    public static Node merge(Node list1, Node list2) {
        ListBuilder builder = new ListBuilder();

        while (list1 != null &&
               list2 != null) {
            if (list1.value < list2.value) {
                builder.append(list1.value);
                list1 = list1.next;
            } else {
                builder.append(list2.value);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            builder.append(list1.value);
            list1 = list1.next;
        }
        while (list2 != null) {
            builder.append(list2.value);
            list2 = list2.next;
        }

        return builder.getResult();
    }


    static private class ListBuilder {
        private Node list = null;
        private Node tail = null;

        public void append(int value) {
            if (list == null) {
                list = new Node(value, null);
                tail = list;
            } else if (value != tail.value) {
                Node node = new Node(value, null);
                tail.next = node;
                tail = node;
            }
        }

        public Node getResult() {
            return list;
        }
    }


    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
