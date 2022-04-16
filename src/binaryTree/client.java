package binaryTree;

public class client {
    public static void main(String[] args) {

        //50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 82 false false
        BinaryTree b = new BinaryTree();
        b.display();
        System.out.println("----------");
        b.levelOrder();
//        if(b.isBst()){
//            System.out.println("Is Bst");
//        }else {
//            System.out.println("Not Bst");
//        }
//        System.out.println("----------");


    }
}
