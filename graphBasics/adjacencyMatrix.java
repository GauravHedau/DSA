package graphBasics;

public class adjacencyMatrix {

	int a[][];
	int v;

	public adjacencyMatrix(int v) {
		this.v = v;
		a = new int[v][v];

	}

	public void addEdge(int src, int dest) {
		a[src][dest] = 1;
		a[dest][src] = 1;
	}

	public static void main(String[] args) {

		int v = 4;
		adjacencyMatrix graph = new adjacencyMatrix(v);

		// 3-2
		// | |
		// 0-1

		graph.addEdge(0, 1);
		graph.addEdge(2, 3);
		graph.addEdge(0, 3);
		graph.addEdge(2, 1);

	}

}
