package Lec24;

public class Delete_Node_in_a_BST {
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
		public TreeNode deleteNode(TreeNode root, int key) {
			return delete(root, key);
		}

		private TreeNode delete(TreeNode root, int key) {
			// TODO Auto-generated method stub
			if(root==null) {
				return null;
			}
			if (root.val < key) {
				root.right = delete(root.right, key);
			}
			else if(root.val> key) {
				root.left = delete(root.left, key);
			}
			else {
				// 1 and 0 chlid exits 
				if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				else {
					
					int max= max(root.left);
					root.left=delete(root.left, max);
					root.val=max;
					
					
				}
			}
			return root;

		}
		
		public int max(TreeNode root) {
			if(root==null) {
				return Integer.MIN_VALUE;
			}
			
			int max= max(root.right);// -2^31
			return Math.max(max, root.val);
			
			
			
		}
	}
}
