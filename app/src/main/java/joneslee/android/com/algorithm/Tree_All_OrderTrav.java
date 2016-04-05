package joneslee.android.com.algorithm;

import java.util.Stack;

/**
 * Description:树的先中后序排序，非递归
 * Reference：http://biaobiaoqi.github.io/blog/2013/04/27/travsal-binary-tree/
 *
 * @author lizhenhua9@wanda.cn (lzh)
 * @date 16/4/5 16:53
 */
public class Tree_All_OrderTrav {
    private TreeNode root;

    public static void main(String[] args) {
        Tree_All_OrderTrav tree = new Tree_All_OrderTrav();
        tree.preOrderTrav(tree.root);
        System.out.println();
        tree.preOrderTravNoRecur(tree.root);
    }

    public Tree_All_OrderTrav() {
        root = initTree();
    }

    /*
     * 构建二叉树
     *   1
     *  / \
     * 3   4
     * \   /\
     * 2  7  6
     *   /
     *  9         */
    private TreeNode initTree() {
        TreeNode root = new TreeNode(1);
        root.mLeftNode = new TreeNode(3);
        root.mRightNode = new TreeNode(4);
        //===============
        root.mLeftNode.mRightNode = new TreeNode(2);
        root.mRightNode.mLeftNode = new TreeNode(7);
        root.mRightNode.mRightNode = new TreeNode(6);
        //===============
        root.mRightNode.mLeftNode.mLeftNode = new TreeNode(9);
        return root;
    }

    /**
     * 前序遍历，递归
     * @param root
     */
    private void preOrderTrav(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.value + " ");
        preOrderTrav(root.mLeftNode);
        preOrderTrav(root.mRightNode);
    }

    private void preOrderTravNoRecur(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (root != null | !s.empty()){
            while (root!=null ){
                System.out.print(root.value + " ");
                s.add(root);
                root = root.mLeftNode;
            }
            root = s.pop();
            root = root.mRightNode;
        }
        System.out.println();
    }

    /**
     * 二叉树数据结构
     */
    public class TreeNode {
        int value;
        TreeNode mLeftNode;
        TreeNode mRightNode;

        public TreeNode(int i) {
            value = i;
        }
    }
}
