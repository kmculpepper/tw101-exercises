package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left,
                 right;


    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if(name.compareToIgnoreCase(nameOfNewNode) > 0){
            if(left == null){
                left = new Node(nameOfNewNode);
            }
            else{
                left.add(nameOfNewNode);
            }
        }
        else if(name.compareToIgnoreCase(nameOfNewNode) < 0){
            if(right == null){
                right = new Node(nameOfNewNode);
            }
            else{
                right.add(nameOfNewNode);
            }
        }
        else{
            System.err.println("Duplicate strings are not allowed.");
        }
    }

    public List<String> names() {
        List<String> listOfNames = new ArrayList<>();
        if(left != null){
            for(String nodeName : left.names()){
                listOfNames.add(nodeName);
            }
        }
        listOfNames.add(name);
        if(right != null){
            for(String nodeName : right.names()){
                listOfNames.add(nodeName);
            }
        }

        return listOfNames;
    }
}
