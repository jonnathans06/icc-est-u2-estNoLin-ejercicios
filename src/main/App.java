package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBST;
import main.Ejercicio_03_listLeves.ListLevelsBST;
import main.Ejercicio_04_depth.MaxDepthBST;
import main.Materia.Models.Node;
import utils.StudentValidator;

import javax.crypto.spec.PSource;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("\nEjercicio 01: Inserción en un Árbol Binario de Búsqueda (BST)\n");

        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        System.out.println("Árbol binario:");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        InsertBST bst = new InsertBST();
        Node root = null;
        for (int valor : valores) {
            root = bst.insert(root, valor);
        }

        System.out.println("\nRecorrido en orden:");
        inOrder(root);

        System.out.println("\n\nEjercicio 02: Inversión de un Árbol Binario\n");

        System.out.println("Árbol binario original:");
        inOrder(root);
        System.out.println();
        InvertBST invertBST = new InvertBST();
        Node invertedRoot = invertBST.invertTree(root);
        System.out.println("Árbol binario invertido:");
        inOrder(invertedRoot);
        System.out.println();

        System.out.println("\nEjercicio 03: Listar Niveles en Listas Enlazadas\n");

        ListLevelsBST listLevelsBST = new ListLevelsBST();
        List<LinkedList<Integer>> niveles = listLevelsBST.listLevels(root);

        int nivel = 0;
        for (LinkedList<Integer> lista : niveles) {
            System.out.print("Nivel " + nivel++ + ": ");
            for (int val : lista) {
                System.out.print(val + " -> ");
            }
            System.out.println("null");
        }

        System.out.println("\nEjercicio 04: Calcular la Profundidad Máxima del Árbol\n");

        MaxDepthBST depthCalculator = new MaxDepthBST();
        int profundidad = depthCalculator.maxDepth(root);

        System.out.println("Profundidad máxima del árbol: " + profundidad);
        System.out.println("----------------------------------------");

    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrder(root.getRight());
        }
    }




}