import java.util.regex.Matcher;

public class MyTree {

  TreeNode root;

  public MyTree() {
    root = null;
  }

  public void insert(int val) {
    if (root == null) {
      root = new TreeNode(val);
      return;
    }
    insertNode(val, root);
  }

  private void insertNode(int val, TreeNode root) {
    if (val <= root.data) {
      if (root.left == null) {
        root.left = new TreeNode(val);
      } else {
        insertNode(val, root.left);
      }
    } else {
      if (root.right == null) {
        root.right = new TreeNode(val);
      } else {
        insertNode(val, root.right);
      }
    }
  }

  public boolean contains(int val) {
    if (root == null) {
      throw new RuntimeException("Tree is empty");
    }
    return containsNode(val, root);
  }

  private boolean containsNode(int val, TreeNode root) {
    if (val == root.data) {
      return true;
    }

    if (val < root.data) {
      if (root.left == null) {
        return false;
      }
      return containsNode(val, root.left);
    } else {
      if (root.right == null) {
        return false;
      }
      return containsNode(val, root.right);
    }
  }
}
