package Lec30;

import java.util.ArrayList;

public class HashMap {

	public class Node {
		String key;
		int value;
		Node next;

		public Node(String key, int value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

	}

	private ArrayList<Node> buktarray;
	int size = 0;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		this.buktarray = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			this.buktarray.add(null);
		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(String key, int value) {

		int bn = hashfunction(key);
		Node temp = this.buktarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}
		Node nn = new Node(key, value);
		temp = this.buktarray.get(bn);
		nn.next = temp;
		this.buktarray.set(bn, nn);
		this.size++;
		double thf = 2.0;
		double lf = (1.0 * this.size) / this.buktarray.size();
		if (lf > thf) {
			rehasing();
		}

	}

	private void rehasing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * this.buktarray.size(); i++) {
			nba.add(null);

		}
		ArrayList<Node> oba = this.buktarray;
		this.size = 0;
		this.buktarray = nba;
		for (Node temp : oba) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;

			}
		}

	}

	public Integer get(String key) {
		int bn = hashfunction(key);
		Node temp = this.buktarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;

		}
		return null;

	}

	public boolean ContainsKey(String key) {
		int bn = hashfunction(key);
		Node temp = this.buktarray.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	public Integer remove(String key) {
		int bn = hashfunction(key);
		Node temp = this.buktarray.get(bn);
		Node prev = null;
		while (temp != null) {
			if (temp.key.equals(key)) {

				break;
			}

			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			return null;
		}
		if (prev == null) {
			this.buktarray.set(bn, temp.next);
			temp.next = null;
		} else {
			prev.next = temp.next;
			temp.next = null;
		}
		this.size--;
		return temp.value;

	}

	public int hashfunction(String key) {

		int hv = key.hashCode() % this.buktarray.size();
		if (hv < 0) {
			hv += this.buktarray.size();
		}

		return hv;

	}

	public String toString() {
		String str = "{";
		for (Node temp : this.buktarray) {
			while (temp != null) {
				str = str + temp.key + "," + temp.value + ", ";
				temp = temp.next;
			}

		}
		return str + "}";

	}

	public int size() {
		return this.size;
	}

}
