package graphProblem1;

import java.util.ArrayList;

public class detectCycleInUnidirectedGraph {

	static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

	int v;

	public detectCycleInUnidirectedGraph(int v) {
		this.v = v;
		for (int i = 0; i < v; i++) {
			a.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
		a.get(dest).add(src);
	}

	
	public static boolean isCyclePresent(int src, boolean vis[], int parent) {


		vis[src] = true;

		for (Integer neighbour : a.get(src)) {
			if (!vis[neighbour]) {
				if (isCyclePresent(neighbour, vis, src)) {
					return true;
				}

			} else if (neighbour != parent) {
				return true;

			}
		}
		return false;
	}

	public static void main(String[] args) {

		int v =6;
		
		detectCycleInUnidirectedGraph graph = new detectCycleInUnidirectedGraph(v);
		
		graph.addEdge(0, 4);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 5);
		graph.addEdge(2, 5);
		
		boolean vis[] = new boolean[v];

		for(int i = 0; i<v; i++) {
			if(!vis[i]) {
				if(isCyclePresent(i, vis, -1)) {
					System.out.println("cycle found");
					break;
				}
			}
		}

		
	}

}
