import java.util.*;

public class LAB15_1 {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of nodes
        System.out.println("Enter number of nodes");
        int n = sc.nextInt(); // Read the number of nodes

        // Initialize arrays to store preorder and postorder traversals
        int[] pre = new int[n];
        int[] post = new int[n];

        // Read the preorder traversal from user input
        System.out.println("Enter Preorder Traversal");
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }

        // Read the postorder traversal from user input
        System.out.println("Enter Postorder Traversal");
        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }

        // Create an instance of ConstructBTree to construct the binary tree
        ConstructBTree cb = new ConstructBTree();
        TreeNode root = cb.constructFromPrePost(pre, post);

        // Create an instance of BSTTree to print the tree
        BSTTree btree = new BSTTree();
        btree.inOrder(root); // Perform preorder traversal and print the nodes

        // Close the Scanner
        sc.close();
    }
}

// Class to construct a binary tree from preorder and postorder traversals
class ConstructBTree {
    int preIndex;
    int posIndex;

    // Constructor to initialize indices
    public ConstructBTree() {
        preIndex = 0;
        posIndex = 0;
    }

    // Method to construct the binary tree from preorder and postorder arrays
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        // Create a new node with the current value in preorder traversal
        TreeNode root = new TreeNode(pre[preIndex++]);

        // If the root's data does not match the current postorder value, construct the
        // left subtree
        if (root.data != post[posIndex])
            root.left = constructFromPrePost(pre, post);

        // If the root's data does not match the current postorder value, construct the
        // right subtree
        if (root.data != post[posIndex])
            root.right = constructFromPrePost(pre, post);

        // Increment the postorder index
        posIndex++;

        // Return the constructed tree node
        return root;
    }
}

class BSTTree {

    // Method to insert an element into the BST
    public TreeNode insertInBST(int element, TreeNode root) {
        TreeNode n = new TreeNode(element); // Create a new node
        if (root == null) { // If the tree is empty, set the new node as root
            root = n;
            return root;
        }

        TreeNode temp = root;

        // Traverse the tree to find the correct position for the new node
        while (temp != null) {
            if (temp.data == element)
                break; // If the element already exists, do nothing
            if (temp.data > element) { // If the current node's data is greater than the element
                if (temp.left == null) {
                    temp.left = n; // Insert the new node to the left
                    break;
                } else {
                    temp = temp.left; // Move to the left child
                }
            } else if (temp.data < element) { // If the current node's data is less than the element
                if (temp.right == null) {
                    temp.right = n; // Insert the new node to the right
                    break;
                } else {
                    temp = temp.right; // Move to the right child
                }
            }
        }

        return root; // Return the root of the tree
    }

    // Method to delete an element from the BST
    public TreeNode delete(TreeNode root, int n) {
        if (root == null)
            return null; // If the tree is empty, return null
        if (root.data == n) {
            return replace(root); // If the element is found, replace the node
        }
        if (root.data < n)
            root.right = delete(root.right, n); // Traverse the right subtree
        if (root.data > n)
            root.left = delete(root.left, n); // Traverse the left subtree
        return root; // Return the root of the tree
    }

    // Method to replace a node in the BST
    public TreeNode replace(TreeNode root) {
        if (root.left == null && root.right == null)
            return null; // If the node is a leaf, remove it
        if (root.right == null)
            return root.left; // If the node has only left child, replace with left child
        if (root.left == null)
            return root.right; // If the node has only right child, replace with right child
        TreeNode temp = root.right;
        if (temp.left == null) {
            temp.left = root.left; // If the right child has no left child, replace with right child
        } else {
            TreeNode temp2 = temp;
            while (temp2.left != null) {
                temp2 = temp2.left; // Find the leftmost node in the right subtree
            }
            temp2.left = root.left; // Replace with the leftmost node in the right subtree
        }
        return temp; // Return the replacement node
    }

    // Method to search for an element in the BST
    public void searchElement(int element, TreeNode root) {
        if (root == null) {
            System.out.println("---------- Element Not Found -----------");
            return;
        }
        if (root.data == element) {
            System.out.println("---------- Element found ----------");
        } else if (root.data < element) {
            searchElement(element, root.right); // Search in the right subtree
        } else {
            searchElement(element, root.left); // Search in the left subtree
        }
    }

    // Method for inorder traversal
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left); // Traverse the left subtree
            System.out.print(root.data + " "); // Visit the root
            inOrder(root.right); // Traverse the right subtree
        }
    }

    // Method for preorder traversal
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " "); // Visit the root
            preOrder(root.left); // Traverse the left subtree
            preOrder(root.right); // Traverse the right subtree
        }
    }

    // Method for postorder traversal
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left); // Traverse the left subtree
            postOrder(root.right); // Traverse the right subtree
            System.out.print(root.data + " "); // Visit the root
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}