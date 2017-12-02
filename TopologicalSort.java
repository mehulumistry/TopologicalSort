//package com.company;
//
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class TopologicalSort {
//
//
//    public static void main(String[] args) {
//
//
//        Graph graph = new Graph(6);
//        graph.addEdge(5,3);
//
//
//
//        System.out.println("First Ordering");
//        graph.topologicalSort();
//        System.out.println("Second Ordering");
//        graph.topologicalSort();
//
//
//    }
//
//
//
//}
//
//
//class Graph{
//
//
//    int vertex;
//    LinkedList<Integer> adj[];
//
//
//    Graph(int vertex){
//
//        adj = new LinkedList[vertex];
//
//        for(int i = 0; i< vertex;i++){
//
//
//            adj[i] = new LinkedList();
//
//        }
//
//
//    }
//
//    public void addEdge(int u,int v){
//
//        adj[u].add(v);
//
//    }
//
//
//    public void topologicalSort(){
//
//
//
//         boolean visited[] = new boolean[vertex];
//
//         for(int j = 0; j<vertex;j++){
//
//             visited[j] = false;
//
//         }
//
//        Stack stack = new Stack();
//
//
//         for(int i = 0; i< vertex;i++){
//
//             if(!visited[i]){
//                 toplogicalSortUtil(vertex,visited,stack);
//             }
//
//         }
//
//
//         while(!stack.empty()){
//
//             System.out.println(stack.pop());
//
//         }
//
//
//
//
//    }
//
//    public void toplogicalSortUtil(int v,boolean visit[],Stack stack){
//
//
//
//        visit[v] = true;
//
//
//
//
//
//
//
//
//
//        stack.push(v);
//
//
//    }
//
//
//
//
//
//}
//
//
