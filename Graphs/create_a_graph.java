/*
    Graphs conists of edges and vertices.
    1. Create an edge class to store information about source , destination and weight of the edge
    2. Create an array of ArrayLists<Edges> of size equal to no of vertices to store  all edges of each vertices in it. 
    3. Fill the vertices appropriately
    */

import java.util.*;
public class create_a_graph {

    static class Edge{
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String args[]){
        int vertices = 7;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        int edges = 8;
        Scanner scn = new Scanner(System.in);
        
        for(int i=0; i<vertices; i++){              //Initialise ArrayList at vertices
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<edges; i++){                 //Fill edges data
            int src = scn.nextInt();
            int nbr = scn.nextInt();
            int wt = scn.nextInt();
            graph[src].add(new Edge(src,nbr,wt));
            graph[nbr].add(new Edge(nbr,src,wt));
        }

        for(int i=0 ; i<vertices; i++){
            // System.out.println(graph[i]);
            int noEdge = graph[i].size();
            for(int j=0; j<noEdge; j++){
                Edge currEdge = graph[i].get(j);
                System.out.print(currEdge.src+"-->");
                System.out.print(currEdge.nbr);
                System.out.print(" Wt:" + currEdge.wt + ", ");
            }
            System.out.println();
        }

    }
}

/*  Dummy Input Data
    S N  W
    0 1 10
    1 2 10
    2 3 10
    0 3 10
    3 4 10
    4 5 10
    5 6 10
    4 6 10
*/
