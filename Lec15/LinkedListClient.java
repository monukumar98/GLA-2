package Lec15;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		//ll.Display();
		ll.addLast(5);
		ll.addFirst(4);
		ll.addLast(8);
		//ll.Display();
		ll.Addatindex(3, 90);
		ll.Display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLAst());
//		System.out.println(ll.getatinedx(1));
//		System.out.println(ll.removeFirst());
//		ll.Display();
//		System.out.println(ll.removelast());
//		ll.Display();
		System.out.println(ll.removeatindex(4));
		ll.Display();

	}

}
