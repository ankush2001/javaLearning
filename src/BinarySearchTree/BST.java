package BinarySearchTree;

public class BST {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    BST(int arr[]){
        this.root = BinarySearchTree(arr,0,arr.length-1);
    }
    public Node BinarySearchTree(int arr[] , int low , int high){
       //base case
        if(low>high){
            return null;
        }
        int mid = (low+high)/2;

        Node nn = new Node();
        nn.data = arr[mid];

        nn.left = BinarySearchTree(arr,low,mid-1);
        nn.right = BinarySearchTree(arr,mid+1,high);
        return nn;
    }
    public void Display(){
        this.Display(this.root);
    }
    private void Display(Node node){
        if(node==null){
            return;
        }
        String str = " ";
        if(node.left!=null){
            str += str + node.left.data + " -> ";
        }else{
            str += " . " + " -> ";
        }
        str += node.data;
        if(node.right!=null){
            str += " <- " + node.right.data ;
        }else{
            str += " <- " + " . ";
        }
        System.out.println(str);
        Display(node.left);
        Display(node.right);

    }
    public boolean find(int item){
        return this.find(this.root,item);
    }
    private boolean find(Node node ,int item){
        if(node == null){
            return false;
        }
        if(item> node.data){
           return find(node.right,item);
        }else if(item< node.data){
            return find(node.left,item);
        }else {
            return true;
        }

    }
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node.right==null){
            return node.data;
        }
        return max(node.right);
    }
    public void add(int item){
        this.add(this.root , item);
    }
    public void add(Node node , int item){
        if(item>node.data){
            if(node.right == null){
                Node nn = new Node();
                nn.data =item;

                node.right =nn;
            }else {
                add(node.right,item);
            }
        }else{
            if(node.left == null){
                Node nn = new Node();
                nn.data = item;

                nn.left=nn;
            }else {
                add(node.left,item);
            }

        }
    }
    //...Function to remove from BST
    public void remove(int item){
        this.remove(this.root,null,false,item);
    }
    private void remove(Node node , Node parent , boolean ilc , int item){
        //base case if item not found
        if(node == null){
            return;
        }

        if(node.data < item){
            remove(node.right,node,false,item);
        }else if (node.data > item){
            remove(node.left,node,true,item);
        }
        else {
            //1 case
            if (node.right == null && node.left == null){
                if(ilc){
                    parent.left = null;
                }else {
                    parent.right = null;
                }
            }
            //2 case
            else if (node.left == null && node.right != null){
                if (ilc){
                    parent.left = node.right;
                }else {
                    parent.right = node.right;
                }
            }
            // 3 case
            else if (node.left != null && node.right == null){
                if (ilc){
                    parent.right = node.left;
                }else {
                    parent.left = node.left;
                }
            }
            // 4 case
            else if(node.left != null && node.right != null){
                int max = max(node.left);
                node.data = max;

                remove(node.left,node,true,max);
            }

        }


    }
    public int rangeSumBST(int low,int high){

        return this.rangeSumBST(this.root,low,high);
    }
    public int sum=0;
    private int rangeSumBST(Node root, int low, int high) {

        if(root==null){
            return 0 ;
        }

        if(root.data >= low && root.data <= high){
            sum += root.data;
        }

        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);

        return sum;
    }

}
