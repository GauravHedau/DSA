package graphProblem1;

import java.util.ArrayList;

class Graph {
	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

	int v;
	int inDeg[];

	// directed graph
	public Graph(int v) {
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
}

public class inDegreeOfDirectedGrp {

	public static void main(String[] args) {

		int v = 4;
		Graph graph = new Graph(v);

		graph.addEdge(0, 1);
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(0, 2);
		graph.addEdge(2, 3);

		graph.inDegree();

		for (int e : graph.inDeg) {
			System.out.println(e);
		}
	}

}
