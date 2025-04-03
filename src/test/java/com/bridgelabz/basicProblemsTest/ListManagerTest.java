package com.bridgelabz.basicProblemsTest;


import com.bridgelabz.basicProblems.ListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp(){
        listManager = new ListManager();
        list=new ArrayList<>();
    }
    @Test
    public void shouldAddElementToTheList(){
        listManager.addElement(list,3);

        //Should match the size of list after adding the element
        Assertions.assertEquals(1, list.size());

        Assertions.assertTrue(list.contains(3));
    }


    @Test
    public void shouldRemoveElementFromTheList(){
        listManager.addElement(list, 2);
        listManager.addElement(list, 7);

        listManager.removeElement(list, 2);


        // Verify element is removed
        Assertions.assertFalse(list.contains(2));
        Assertions.assertEquals(1, list.size());


        boolean isPresent= listManager.removeElement(list, 6);
        Assertions.assertEquals(true, isPresent);
    }

    @Test
    public void shouldReturnTheSizeOfList(){
//        listManager.addElement(list, 1);
//        listManager.addElement(list, 2);
//        listManager.addElement(list, 3);

        // Verify correct size
        Assertions.assertEquals(0, listManager.getSize(list));
    }

}
