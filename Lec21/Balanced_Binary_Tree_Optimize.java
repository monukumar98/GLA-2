package Lec21;

import Lec21.BalancedBinaryTree.TreeNode;

public class Balanced_Binary_Tree_Optimize {
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

	public class BalancePair {
		boolean isbal = true;
		int ht = -1;

	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return isbalnce(root).isbal;
		}

		public BalancePair isbalnce(TreeNode root) {

			if (root == null) {
				return new BalancePair();
			}
			BalancePair lbp = isbalnce(root.left);
			BalancePair rbp = isbalnce(root.right);
			BalancePair sbp = new BalancePair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			int bf = Math.abs(lbp.ht - rbp.ht);
			sbp.isbal = lbp.isbal && rbp.isbal && bf <= 1;

			return sbp;

		}
	}
}
