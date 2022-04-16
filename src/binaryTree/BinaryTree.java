package binaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data , Node left , Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    private Node root = null;
    private int size = 0;
    BinaryTree(){
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s,null,false);
    }
    public Node takeInput(Scanner s , Node parent, boolean isNodeRightOrLeft){
        if(parent == null){
            System.out.println("Enter the data for root node");
        }else {
            if(isNodeRightOrLeft){
                System.out.println("Enter the data for left node " + parent.data);
            }else {
                System.out.println("Enter the data for right node " + parent.data);
            }
        }
        int nodeData = s.nextInt();
        Node node = new Node(nodeData,null,null);
        size++;
        boolean choice = false;
        System.out.println("Do you have left child of node " + node.data);
        choice = s.nextBoolean();
        if(choice){
            node.left = takeInput(s,node,true);
        }
        choice = false;
        System.out.println("Do you have right child of node " + node.data);
        choice = s.nextBoolean();
        if(choice){
            node.right = takeInput(s,node,false);
        }
        return node;
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left!=null){
            str=str+node.left.data+"=>";
        }else{
            str = str + "END=>";
        }
        str = str+node.data;
        if(node.right!=null){
            str=str+"<="+node.right.data;
        }else{
            str = str + "<=END";
        }
        System.out.println(str);
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }
    public void height(){
        this.height(this.root);
    }
    private int height(Node node){
        if(node==null){
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);

        int height = Math.max(lheight,rheight)+1;
        return height;
    }
    ////SSSS
    public void preOrder(){
        this.preOrder(this.root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        this.postOrder(this.root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.data+", ");
    }

    public void inOrder(){
        this.preOrder(this.root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+", ");
        inorder(node.right);
    }
    public void levelOrder(){
        this.levelOrder(this.root);
    }
    private void levelOrder(Node node){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()){
            Node rv = queue.removeFirst();
            System.out.print(rv.data+", ");
            if(rv.left!=null){
                queue.addLast(rv.left);
            }
            if (rv.right!=null){
                queue.addLast(rv.right);
            }
        }
        System.out.println("End");
    }
    public boolean isBst(){
        return this.isBst(this.root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    private boolean isBst(Node node  , int min , int max){
        //base case
        if(node == null){
            return true;
        }
        // we are comparing every node 
        if(node.data > max || node.data < min ){
            return false;

        }else if(!this.isBst(node.left ,min, node.data)){
            return false;
        }else if(!this.isBst(node.right,node.data,max)){
            return false;
        }
        return true;
    }
    public int sumLeaf(){
        return this.sumLeaf(this.root);
    }

    private int sumLeaf(Node node){
        if (node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return node.data;
        }

        int lSum = sumLeaf(node.left);
        int rSum = sumLeaf(node.right);

        return lSum+rSum;
    }

}
