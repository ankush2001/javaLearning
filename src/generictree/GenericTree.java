package generictree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node {
        int data;
        ArrayList<Node> children;
        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }
        private Node root;
        private int size;

        GenericTree() {
            Scanner sc = new Scanner(System.in);
           this.root = takeInput(sc, null, 0);
        }

        public Node takeInput(Scanner sc, Node parent, int ithChild) {
            if (parent == null) {
                System.out.println("Enter the data for root node");
            } else {
                System.out.println("Enter the data for the " + ithChild + "th child of " + parent.data);
            }
            int nodedata = sc.nextInt();
            Node node = new Node(nodedata);
            this.size++;

            System.out.println("Enter the no. of children for " + node.data);
            int children = sc.nextInt();

            //will be executed acc to the value of the children
            for (int i = 0; i < children; i++) {
                Node child = this.takeInput(sc, node, i);
                node.children.add(child);
            }
            return node;
        }

        public void display() {
            this.display(this.root);
        }
        private void display(Node node) {
            String str = node.data + "=>";
            for (int i = 0; i <node.children.size(); i++) {
                str = str + node.children.get(i).data + ", ";
            }
            str = str + "END";
            System.out.println(str);
            for (int i = 0; i < node.children.size(); i++) {
                this.display(node.children.get(i));
            }

        }

}

