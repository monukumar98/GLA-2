package Lec16;


public class Mid_Of_LinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          
          while(fast!=null && fast.next!=null) {
        	  
        	  fast=fast.next.next;
        	  slow=slow.next;
          }
          
          return slow;
          
          
		}
		public ListNode middleNodeFristmid(ListNode head) {
	          ListNode slow = head;
	          ListNode fast = head;
	          
	          while(fast.next!=null && fast.next.next!=null) {
	        	  
	        	  fast=fast.next.next;
	        	  slow=slow.next;
	          }
	          
	          return slow;
	          
	          
			}
	}

}
