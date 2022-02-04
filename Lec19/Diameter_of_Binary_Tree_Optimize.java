package Lec19;

import Lec19.Diameter_of_Binary_Tree.TreeNode;
import Lec19.Diameter_of_Binary_Tree_Optimize.DiaPair;

public class Diameter_of_Binary_Tree_Optimize {

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

	public class DiaPair {
		int d = 0;
		int h = -1;

	
	}

	class Solution {
		public int diameterOfBinaryTree(TreeNode root) {
            return diameterOfBT(root).d;
		}

		public DiaPair diameterOfBT(TreeNode root) {
			if(root==null) {
				return new DiaPair();
			}

			DiaPair ldp = diameterOfBT(root.left);
			DiaPair rdp = diameterOfBT(root.right);
			DiaPair sdp = new DiaPair();
			sdp.h = Math.max(ldp.h, rdp.h) + 1;
			int sd = ldp.h + rdp.h + 2;
			sdp.d=Math.max(sd, Math.max(rdp.d, ldp.d));
			return sdp;

		}

	}

}
