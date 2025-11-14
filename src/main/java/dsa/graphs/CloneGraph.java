package dsa.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Title: Clone Graph (LeetCode 133)   Topic: Graphs   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/clone-graph/description/
 *
 * <p>
 * Problem:
 * Given a reference of a node in a connected undirected graph.
 * <p>
 * Return a deep copy (clone) of the graph.
 * <p>
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 */
public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> nodeMap = new HashMap<>();
        return dfs(node, nodeMap);
    }

    private Node dfs(Node node, Map<Node, Node> nodeMap) {
        if (nodeMap.containsKey(node))
            return nodeMap.get(node);

        Node clone = new Node(node.val);
        nodeMap.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, nodeMap));
        }

        return clone;
    }

    public Node cloneGraphBFS(Node node) {
        if (node == null) return null;

        Map<Node, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();

        Node clone = new Node(node.val);
        nodeMap.put(node, clone);
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (Node neighbor : current.neighbors) {
                if (!nodeMap.containsKey(neighbor)) {
                    nodeMap.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                nodeMap.get(current).neighbors.add(nodeMap.get(neighbor));
            }
        }

        return clone;
    }

    private static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}


