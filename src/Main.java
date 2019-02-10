import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
//    TreeNode parent = new TreeNode('A');
//
//    parent.children.add(new TreeNode('B'));
//    parent.children.add(new TreeNode('C'));
//    parent.children.add(new TreeNode('D'));
//    System.out.println("Parent");
//    System.out.println(parent);
//    System.out.println(parent.letter);
//    System.out.println(parent.children);
//    TreeNode bNode = parent.children.get(0);
//    bNode.children.add(new TreeNode('E'));
//    bNode.children.add(new TreeNode('F'));
//    bNode.children.add(new TreeNode('G'));
//
//    printTreeRecursive(parent);

    MyTree myTree = new MyTree();
    myTree.insert(50);
    myTree.insert(43);
    myTree.insert(21);
    myTree.insert(50);
    myTree.insert(67);
    myTree.insert(74);
    myTree.insert(62);

    System.out.println(myTree.root);
    System.out.println(myTree.root.data);
    System.out.println(myTree.root.left);
    System.out.println(myTree.root.left.data);
    System.out.println(myTree.root.left.left);
    System.out.println(myTree.root.left.left.data);
    System.out.println(myTree.root.right);
    System.out.println(myTree.root.right.data);
    System.out.println(myTree.root.right.right);
    System.out.println(myTree.root.right.right.data);

    System.out.println(myTree.contains(70));
//    BFS(myTree.root);
//    inOrderDFS(myTree.root);
    preOrderDFS(myTree.root);
  }

  /**
   * A          0 /  |   \ B    C    D     1 /  |  \ E   F  G 2 /   \ H    I
   */

//  private static void printTreeRecursive(TreeNode root) {
//    for (TreeNode childNode : root.children) {
//      System.out.println("\nChild Node");
//      System.out.println(childNode);
//      System.out.println(childNode.letter);
//      System.out.println(childNode.children);
//      if (!childNode.children.isEmpty()) {
//        printTreeRecursive(childNode);
//      }
//    }
//  }
  private static void BFS(TreeNode root) {
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);
    while (!treeNodes.isEmpty()) {
      TreeNode current = treeNodes.remove();
      if (current.left != null) {
        treeNodes.add(current.left);
      }

      if (current.right != null) {
        treeNodes.add(current.right);
      }
      System.out.println(current.data);
    }
  }

  public static void inOrderDFS(TreeNode root) {
    if(root != null){
      if (root.left != null) {
        inOrderDFS(root.left);
      }
      System.out.println(root.data);
      if (root.right != null) {
        inOrderDFS(root.right);
      }
    }

  }

  public static void postOrderDFS(TreeNode root) {
    if(root != null){
      if (root.left != null) {
        postOrderDFS(root.left);
      }
      if (root.right != null) {
        postOrderDFS(root.right);
      }
      System.out.println(root.data);
    }

  }

  public static void preOrderDFS(TreeNode root) {
    System.out.println(root.data);
    if(root != null){
      if (root.left != null) {
        preOrderDFS(root.left);
      }
      if (root.right != null) {
        preOrderDFS(root.right);
      }
    }

  }


}
