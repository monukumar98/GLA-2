package Lec20;

public class Build_Tree_Using_Preorder_and_Inorder_Traversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return createTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);

		}

		private TreeNode createTree(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi) {
			// TODO Auto-generated method stub
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(preorder[plo]);
			int i = search(inorder, preorder[plo], ilo, ihi);
			int nel = i - ilo;
			node.left = createTree(preorder, inorder, ilo, i - 1, plo + 1, plo + nel);
			node.right = createTree(preorder, inorder, i + 1, ihi, plo + nel + 1, phi);
			return node;

		}

		public int search(int[] inorder, int item, int si, int ei) {

			for (int i = si; i <= ei; i++) {
				if (inorder[i] == item) {
					return i;
				}

			}
			return 0;

		}
	}

}
