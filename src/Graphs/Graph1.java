package Graphs;

import java.util.HashMap;

public class Graph1 {
    private class Vertex{
        HashMap<String,Integer> nbrs = new HashMap<>();
    }
    HashMap<String,Vertex> vtces;
  public Graph1(){
      vtces = new HashMap<>();
  }
}
