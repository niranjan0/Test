package com.datastructure.StanFordCoursera.Graph;

import java.util.Stack;

public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;

    public DepthFirstPaths(Graph g,int s) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.s=s;

    }

    public void dfs(Graph g, int s) {
        marked[s] = true;
        System.out.print(s+" ");
        for(int w : g.adj(s)) {
            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = s;

            }
        }
    }

    public boolean hasPathTo(int v)
    { return marked[v]; }
    public Iterable<Integer> pathTo(int v)
    {
        System.out.println(" here s is +++"+s);
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}
