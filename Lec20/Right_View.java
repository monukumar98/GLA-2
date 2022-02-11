package Lec20;

import java.util.*;

public class Right_View {

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
		int maxdepth = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			rightview(root, 0, ll);
			return ll;
			
			
		}

		public void rightview(TreeNode root, int curr_level,List<Integer> ll) {
			if(root==null) {
				return ;
			}

			if (maxdepth < curr_level) {
				ll.add(root.val);
				maxdepth = curr_level;
			}

			rightview(root.right, curr_level + 1,ll);
			rightview(root.left, curr_level + 1,ll);

		}
	}

}
