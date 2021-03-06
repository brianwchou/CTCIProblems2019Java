package com.chapter.two;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import com.chapter.two.util.LLNode;

import org.junit.jupiter.api.Test;

public class RemoveDupsTest {
    
    @Test
    public void removeDups() {
        LLNode head = new LLNode(8);
        LLNode node1 = new LLNode(0);
        LLNode node2 = new LLNode(7);
        LLNode node3 = new LLNode(8);
        LLNode node4 = new LLNode(9);
        LLNode node5 = new LLNode(8);
        LLNode node6 = new LLNode(8);
        LLNode node7 = new LLNode(11);
        LLNode node8 = new LLNode(8);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        
        RemoveDups.removeDups(head);
        
        ArrayList<Integer> solution = new ArrayList<Integer>(Arrays.asList(8,0,7,9,11));
        ArrayList<Integer> myAnswer = head.toArrayList();

        assertTrue(
            solution.equals(myAnswer), 
            String.format("given: %s, actual: %s", myAnswer, solution));
    }
}