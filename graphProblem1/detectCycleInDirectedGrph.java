package graphProblem1;

import java.util.*;

public class detectCycleInDirectedGrph {

	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int v;

	int indeg[];

	// directed graph
	public detectCycleInDirectedGrph(int v) {
		this.v = v;
		for (int i = 0; i < v; i++) {
			a.add(new ArrayList<Integer>());
		}
		indeg = new int[v];
	}

	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
	}

	public boolean detectCycleInDirectedGraph() {
		boolean vis[] = new boolean[v];
		boolean recS[] = new boolean[v];

		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				if (dfsUtil(i, vis, recS))
					return true;
			}
		}

		return false;
	}

	public boolean dfsUtil(int u, boolean vis[], boolean recS[]) {
		vis[u] = true;
		recS[u] = true;

		for (int v : a.get(u)) {
			if (!vis[v]) {
				if (dfsUtil(v, vis, recS))
					return true;
			} else if (recS[v]) {
				return true;
			}
		}

		recS[u] = false;
		return false;
	}

	public static void main(String[] args) {

		int v = 5;
		detectCycleInDirectedGrph graph = new detectCycleInDirectedGrph(v);

		graph.addEdge(0, 4);
		graph.addEdge(1, 0);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(2, 1);

		System.out.println(graph.detectCycleInDirectedGraph());

	}

}
