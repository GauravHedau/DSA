package graphProblem1;

import java.util.ArrayList;

public class connectedComp {

	static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
 
	int v;

	public connectedComp(int v) {
		this.v = v;
		for (int i = 0; i < v; i++) {
			a.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
		a.get(dest).add(src);
	}

	public static void dfs(int src, boolean vis[]) {
		vis[src] = true;
		System.out.print(src + " ");

		for (Integer neighbour : a.get(src)) {
			if (!vis[neighbour]) {
				dfs(neighbour, vis);
			}
		}
	}

	public static int connected(int v) {

		boolean vis[] = new boolean[v];
		int count = 0;
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				count++;
				dfs(i, vis);
			}
		}
		System.out.println();
		return count;
	}
	
	

	public static void main(String[] args) {

		int v = 8;

		connectedComp graph = new connectedComp(v);

		graph.addEdge(0, 1);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);

		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(4, 6);

		System.out.println(connected(v));

	}

}
