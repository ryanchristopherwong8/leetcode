package MST;

import java.util.HashSet;

public class MST {

    public void getMSTPrism(int[][] graph, int vertices) {
        // create visited hash set (keep track of visited nodes
        // create array to store minimum weights (index = vertices)
        // create array to store parent (index = vertices)

        /*
        0) initialize data structures above
        1) set starting node by setting min weight to 0
        2) find minimum known weight
           !!! make sure to find min weight from not visited nodes
        3) add to visited set
        4) loop through all adjacent nodes and update min weight array if found
           !!!! make sure to find min weight from not visited nodes
        5) repeat steps 1-3 until all nodes are visited
        6) loop through parent array from node 1 to get edges and weight
        */

        HashSet<Integer> visited = new HashSet<>();
        int[] minimumWeight = new int[vertices];
        int[] parent = new int[vertices];

        for(int i = 0; i < vertices; i++) { // initialize min weight array
            minimumWeight[i] = Integer.MAX_VALUE;
        }

        minimumWeight[0] = 0; // set starting point

        while(visited.size() < vertices) {
            int index = findMinimumIndex(minimumWeight, visited); // find node with known minimum weight
            visited.add(index);

            for(int i = 0; i < vertices; i++) {
                if(graph[index][i] != 0 && !visited.contains(i) && graph[index][i] < minimumWeight[i]) {
                    minimumWeight[i] = graph[index][i]; // set minimum weight
                    parent[i] = index; // set parent
                }
            }
        }
    }

    private int findMinimumIndex(int[] minWeight, HashSet<Integer> visited) {
        int currentMin = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < minWeight.length; i++) {
            if (minWeight[i] < currentMin && !visited.contains(i)) {
                currentMin = minWeight[i];
                index = i;
            }
        }
        return index;
    }
}
