import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TreeTest {
    @Test
    public void test() {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(17);
        tree.insert(90);
        tree.insert(95);
        tree.insert(100);
        tree.insert(105);
        tree.insert(150);
        tree.insert(155);
        tree.insert(160);
        tree.insert(165);
        tree.insert(170);
        tree.insert(175);
        tree.insert(260);

        tree.deleteKey(260);

        tree.inorder();

        System.out.println("\nSearching for key: " + 10);
        if (tree.search(10))
            System.out.println("Key found");
        else
            System.out.println("Key not found");
        System.out.println("\nSearching for key: " + 260);
        if (tree.search(260))
            System.out.println("Key found");
        else
            System.out.println("Key not found");

    }

//    @Test
//    public void inOrderTest(){
//        Tree testTree = new Tree();
//            testTree.insert(15);
//            testTree.insert(20);
//            testTree.insert(25);
//            testTree.insert(10);
//            testTree.insert(7);
//            testTree.inorder(testTree.root);
//
//
//    }

    @Test
    public void testMinimumValue(){
        Tree testTree = new Tree();

        testTree.insert(15);
            testTree.insert(20);
            testTree.insert(25);
            testTree.insert(10);
            testTree.insert(7);
         assertEquals(7,testTree.minValue(testTree.root));

    }


    @Test
    public void testSearch(){
        Tree testTree = new Tree();
        testTree.insert(15);
        testTree.insert(20);
        testTree.insert(25);
        testTree.insert(10);
        testTree.insert(7);
        assertEquals(20,testTree.search(20));

    }

    @Test
    public void testDelete(){
        Tree testTree = new Tree();
        testTree.insert(15);
        testTree.insert(20);
        testTree.insert(25);
        testTree.insert(10);
        testTree.insert(7);
        testTree.deleteKey(15);
        assertNull(testTree.search(15));

    }

}




