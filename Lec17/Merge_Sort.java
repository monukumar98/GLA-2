package Lec17;

import Lec17.Merge_Two_Sorted_List.ListNode;

public class Merge_Sort {

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
		public ListNode sortList(ListNode head) {

			ListNode midnode = Mid(head);
			ListNode midnext = midnode.next;
			midnode.next = null;
			ListNode l1 = sortList(head);
			ListNode l2 = sortList(midnext);
			return mergeTwoLists(l1, l2);

		}
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Dummy = new ListNode();
			ListNode ans = Dummy;
			while (list1 != null && list2 != null) {
				if (list1.val <= list2.val) {
					Dummy.next = list1;
					list1 = list1.next;
					Dummy = Dummy.next;
				} else {
					Dummy.next = list2;
					list2 = list2.next;
					Dummy = Dummy.next;
				}
			}

			if (list1 != null) {
				Dummy.next = list1;
			}
			if (list2 != null) {
				Dummy.next = list2;
			}
			return ans.next;

		}

		public ListNode Mid(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {

				fast = fast.next.next;
				slow = slow.next;
			}
			return slow;

		}
	}

}
