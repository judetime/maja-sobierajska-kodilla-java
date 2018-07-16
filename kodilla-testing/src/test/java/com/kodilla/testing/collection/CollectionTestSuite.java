package com.kodilla.testing.collection;
import javafx.beans.binding.When;
import org.junit.*;
import java.util.*;
import org.junit.rules.*;

import static org.junit.Assert.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Rule
    public final TestName name = new TestName();

    @Test
    public void testOddNumbersExterminatorEmptyList ()
    {
        //wyswietl
        System.out.println(name.getMethodName());
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> actuallList = OddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(emptyList, actuallList);

    }
    @Rule
    public final TestName name2 = new TestName();

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //wyswietl
        System.out.println(name2.getMethodName());
        //Given
        ArrayList<Integer> oddAndEvenList = new ArrayList<Integer>();
        oddAndEvenList.add(9);
        oddAndEvenList.add(10);
        //When
        ArrayList<Integer> actuallList = OddNumbersExterminator.exterminate(oddAndEvenList);
        //Then
        Assert.assertEquals(oddAndEvenList, actuallList);
    }




}
