package tRie;

import java.util.*;

public class Trie {

	TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	class TrieNode {

		Map<Character, TrieNode> map;

		boolean isEndOfWord;

		public TrieNode() {
			map = new HashMap<>();
		}

	}

	void insert(String s) {
		if (s == null || s.length() == 0)
			return;

		TrieNode cur = root;

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);

			if (!cur.map.containsKey(letter)) {

				TrieNode newNode = new TrieNode();
				cur.map.put(letter, newNode);
			}
			cur = cur.map.get(letter);
		}
		cur.isEndOfWord = true;
	}

	boolean search(String s) {
		if (s == null || s.length() == 0)
			return false;

		TrieNode cur = root;

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);

			if (!cur.map.containsKey(letter)) {
				return false;
			}
			cur = cur.map.get(letter);
		}
		return cur.isEndOfWord;
	}

	boolean delete(String s) {

		if (s == null || s.length() == 0)
			return false;

		TrieNode cur = root;
		TrieNode nodeToDelete = null;

		char charToDelete = '\0';

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (!cur.map.containsKey(letter)) {
				return false;
			}
			if (cur.map.size() > 1 || cur.isEndOfWord) {
				nodeToDelete = cur;
				charToDelete = letter;
			}
			cur = cur.map.get(letter);
		}

		if (!cur.isEndOfWord)
			return false;

		if (cur.map.isEmpty()) {
			nodeToDelete.map.remove(charToDelete);
		} else {
			cur.isEndOfWord = false;
		}
		return true;
	}

	public static void main(String[] args) {

		Trie obj = new Trie();

		String dictionary[] = { "Apple", "Apply", "App", "Ball", "Bat", "Bass" };

		for (String word : dictionary) {
			obj.insert(word);
		}

		System.out.println(obj.search("Ball"));
//		System.out.println(obj.search("Roy"));
		
		obj.delete("App");
		System.out.println(obj.search("App"));

	}

}
