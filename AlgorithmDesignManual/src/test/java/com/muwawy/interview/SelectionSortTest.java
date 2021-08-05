package com.muwawy.interview;

import com.muwawy.interview.sort.SelectionSort;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.pholser.junit.quickcheck.Property;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitQuickcheck.class)
public class SelectionSortTest {

    @Property
    public void SelectionSortWithMultipleInputs(int[] items) {
        // Arrange
        var sortedItems = SelectionSort.sort(items);

        // Act
        Arrays.sort(items);

        // Assert
        assertEquals(sortedItems, items);
    }
}