public class BST {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    Node  root;
    BST(){
        root = null;
    }
    BST(int value)
    {
        root = new Node(value);
    }
     void insert(int key)
    {
        root = insertRec(root , key);
    }
    Node insertRec(Node root, int key)
    {
        if(root == null ){
            root = new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insertRec(root.left,key);
        else if(key>root.key)
            root.right= insertRec(root.right,key);
        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null ){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public Node search(Node root, int key){
        if (root==null || root.key==key)
            return root;
        if (root.key<key)
            return search(root.right,key);
        return search(root.left,key);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(11);
        tree.insert(9);
        tree.insert(7);
        tree.insert(10);
        tree.insert(12);

        tree.inorder();

        Node value = tree.search(tree.root,9);
        System.out.println("searched : " + value.key);
    }
}


