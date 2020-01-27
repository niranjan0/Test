package com.datastructure.StanFordCoursera.Graph;

public class GraphDriver {

    public static void main(String args[]) {

       Graph graph = new Graph(7);
        graph.addEdge(0,6);
        graph.addEdge(0,5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(6,4);
        graph.addEdge(4,3);
        graph.addEdge(4,5);
        graph.addEdge(3,5);
       // System.out.println(graph);
        System.out.println(graph.V());
      /*  Iterable iter = graph.adj(3);
        for(Object ele : iter){

      //   System.out.println("here");
         System.out.print(ele+" ");
        }*/

        DepthFirstPaths depthFirstPaths = new DepthFirstPaths(graph,2);
    //   depthFirstPaths.dfs(graph,5);
        //depthFirstPaths.hasPathTo(1);
      //  System.out.println();
       Iterable<Integer> integers = depthFirstPaths.pathTo(2);
       for(Integer ele : integers){
            //System.out.println("coming");
            System.out.print(ele+" ");
        }

       // depthFirstPaths.pathTo(1);
       // System.out.println(depthFirstPaths);*/

    }
}
