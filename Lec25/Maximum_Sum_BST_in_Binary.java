package Lec25;



public class Maximum_Sum_BST_in_Binary {

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

	public class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int sum = 0;// bt sum
		int ans = 0;// bst sum

	}

	class Solution {
		public int maxSumBST(TreeNode root) {
			return valid(root).ans;

		}

		public BstPair valid(TreeNode node) {
			if (node == null) {
				return new BstPair();
			}

			BstPair lbstp = valid(node.left);
			BstPair rbstp = valid(node.right);
			BstPair sbstp = new BstPair();
			sbstp.min = Math.min(lbstp.min, Math.min(rbstp.min, node.val));
			sbstp.max = Math.max(lbstp.max, Math.max(rbstp.max, node.val));
			sbstp.sum = lbstp.sum + rbstp.sum + node.val;
			if (lbstp.isbst && rbstp.isbst && (lbstp.max < node.val && rbstp.min > node.val)) {

				sbstp.ans = Math.max(sbstp.sum, Math.max(lbstp.ans, rbstp.ans));
				sbstp.isbst = true;
				return sbstp;
			}

			sbstp.ans = Math.max(lbstp.ans, rbstp.ans);
			sbstp.isbst = false;

			return sbstp;

		}

	}
}
