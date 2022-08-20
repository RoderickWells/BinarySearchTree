class Tree {
    // node class that defines BST node
    static class Node {
        int key;
        Node left, right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST =>initial empty tree
    Tree() {
        root = null;
    }

    // delete a node from BST
    void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }

    // recursive delete function
    Node delete_Recursive(Node root, int key) {
        // tree is empty
        if (root == null)
            return root;

        // traverse the tree
        if (key < root.key) // traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key) // traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            // get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        // initially minval = root
        int minval = root.key;
        // find minval
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // insert a node in BST
    void insert(int key) {
        root = insert_Recursive(root, key);
    }

    // recursive insert function
    Node insert_Recursive(Node root, int key) {
        // tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // traverse the tree
        if (key < root.key) // insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key) // insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    // method for inorder traversal of BST
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    boolean search(int key) {
        root = search_Recursive(root, key);
        if (root != null)
            return true;
        else
            return false;
    }

    // recursive insert function
    Node search_Recursive(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.key == key)
            return root;
        // val is greater than root's key
        if (root.key > key)
            return search_Recursive(root.left, key);
        // val is less than root's key
        return search_Recursive(root.right, key);
    }

    //BST class
    class BST_class {
        // BST root node
        Node root;

        BST_class() {
            root = null;
        }

        //PostOrder Traversal - Left:Right:rootNode (LRn)
        public void postOrder(Node node) {
            if (node == null)
                return;

            // first traverse left subtree recursively
            postOrder(node.left);

            // then traverse right subtree recursively
            postOrder(node.right);

            // now process root node
            System.out.print(node.key + " ");
        }

        // InOrder Traversal - Left:rootNode:Right (LnR)
        void inOrder(Node node) {
            if (node == null)
                return;
            //first traverse left subtree recursively
            inOrder(node.left);

            //then go for root node
            System.out.print(node.key + " ");

            //next traverse right subtree recursively
            inOrder(node.right);
        }

        //PreOrder Traversal - rootNode:Left:Right (nLR)
        void preOrder(Node node) {
            if (node == null)
                return;

            //first print root node first
            System.out.print(node.key + " ");
            // then traverse left subtree recursively
            preOrder(node.left);
            // next traverse right subtree recursively
            preOrder(node.right);
        }

        // Wrappers for recursive functions
        void postOrder_traversal() {
            postOrder(root);
        }

        void inOrder_traversal() {
            inOrder(root);
        }

        void preOrder_traversal() {
            preOrder(root);
        }
    }
}
