package hashmapInternalWorking;

import java.util.*;

public class hashMapCode {

	static class HashMap<K, V> {
		public class Node {
			K key;
			V values;

			public Node(K key, V value) {
				this.key = key;
				this.values = value;
			}
		}

		private int n;
		private int N;

		private int a[];
		private LinkedList<Node> buckets[];

		@SuppressWarnings("unchecked")
		public HashMap() {
			this.N = 4;
			this.buckets = new LinkedList[4];
			for (int i = 0; i < 4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}

		private int hashFunction(K key) { // bucket index should be 0 to N-1
			int bucketIndx = key.hashCode();
			return Math.abs(bucketIndx) % N;
		}

		private int searchInLinkedList(K key, int bucketIndx) {
			LinkedList<Node> ll = buckets[bucketIndx];

			for (int i = 0; i < ll.size(); i++) {
				if (ll.get(i).key == key) {
					return i; // data index
				}
			}
			return -1;
		}

		@SuppressWarnings("unchecked")
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets;
			buckets = new LinkedList[N * 2];

			for (int i = 0; i < N * 2; i++) {
				buckets[i] = new LinkedList<>();
			}
			for (int i = 0; i < oldBucket.length; i++) {
				LinkedList<Node> ll = oldBucket[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.get(j);
					put(node.key, node.values);
				}
			}
		}

		public void put(K key, V value) {
			int bucketIndx = hashFunction(key);
			int dataIndx = searchInLinkedList(key, bucketIndx); // dataIndex = -1

			if (dataIndx == -1) { // key doesn't exist
				buckets[bucketIndx].add(new Node(key, value));
				n++;
			} else { // key exist
				Node data = buckets[bucketIndx].get(dataIndx);
				data.values = value;
			}

			double lambda = (double) n / N;
			if (lambda > 2.0) {
				rehash();
			}
		}

		public boolean ContainsKey(K key) {
			int bucketIndx = hashFunction(key);
			int dataIndx = searchInLinkedList(key, bucketIndx); // dataIndex = -1

			if (dataIndx == -1) { // key doesn't exist
				return false;
			} else { // key exist
				return true;
			}
		}

		public V remove(K key) {
			int bucketIndx = hashFunction(key);
			int dataIndx = searchInLinkedList(key, bucketIndx); // dataIndex = -1

			if (dataIndx == -1) { // key doesn't exist
				return null;
			} else { // key exist
				Node node = buckets[bucketIndx].remove(dataIndx);
				return node.values;
			}
		}

		public V get(K key) {
			int bucketIndx = hashFunction(key);
			int dataIndx = searchInLinkedList(key, bucketIndx); // dataIndex = -1

			if (dataIndx == -1) { // key doesn't exist
				return null;
			} else { // key exist
				Node node = buckets[bucketIndx].get(dataIndx);
				return node.values;
			}
		}

		public ArrayList<K> keySet() {
			ArrayList<K> keys = new ArrayList<>();

			for (int i = 0; i < buckets.length; i++) {
				LinkedList<Node> ll = buckets[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}

		public boolean isEmpty() {
			return n == 0;
		}
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 190);
		map.put("China", 300);
		map.put("Us", 50);

		ArrayList<String> keys = map.keySet();
		for (int i = 0; i < keys.size(); i++) {
			System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
		}

		map.remove("India");
		System.out.println(map.get("India"));

	}

}