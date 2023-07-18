package graphProblem1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class detectCycleInDirGraUsingKahnAlgo {

	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

	int v;
	int inDeg[];

	// directed graph
	public detectCycleInDirGraUsingKahnAlgo(int v) {
		this.v = v;
		for (int i = 0; i < v; i++) {
			a.add(new ArrayList<Integer>());
		}
		inDeg = new int[v];
	}

	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
	}

	void inDegree() {
		for (ArrayList<Integer> adjacent : a) {
			for (Integer neighbour : adjacent) {
				inDeg[neighbour]++;
			}
		}
	}

	void detectUsingkahnAlgo() {
		inDegree();
		int count = 0;

		ArrayDeque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < v; i++) {
			if (inDeg[i] == 0) {
				q.add(i);
				count++;

			}
		}

		ArrayList<Integer> ans = new ArrayList<>();
		while (!q.isEmpty()) {
			int cur = q.poll();
			ans.add(cur);

			for (Integer neighbour : a.get(cur)) {
				inDeg[neighbour]--;
				if (inDeg[neighbour] == 0) {
					q.add(neighbour);
					count++;
				}
			}
		}
		if (count < v) {
			System.out.println("cycle is present, invalid topological sort possible");
		} else {
			for (Integer e : ans) {
				System.out.print(e + " ");
			}
		}
	}

	public static void main(String[] args) {
		int v = 6;
		detectCycleInDirGraUsingKahnAlgo graph = new detectCycleInDirGraUsingKahnAlgo(v);

		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(0, 2); 
		graph.addEdge(5, 3);
//		graph.addEdge(3, 5);
		graph.addEdge(4, 5);

		graph.detectUsingkahnAlgo();
	}
}
