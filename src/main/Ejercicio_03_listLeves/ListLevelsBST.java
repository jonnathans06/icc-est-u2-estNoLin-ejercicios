package main.Ejercicio_03_listLeves;
import main.Materia.Models.Node;

import java.util.*;


public class ListLevelsBST {
    public List<LinkedList<Integer>> listLevels(Node root) {
        List<LinkedList<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                currentLevel.add(current.getValue());

                if (current.getLeft() != null) queue.offer(current.getLeft());
                if (current.getRight() != null) queue.offer(current.getRight());
            }

            result.add(currentLevel);
        }

        return result;
    }

}