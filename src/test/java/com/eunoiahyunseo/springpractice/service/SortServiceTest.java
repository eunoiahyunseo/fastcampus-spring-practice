package com.eunoiahyunseo.springpractice.service;

import com.eunoiahyunseo.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ihyeonseo
 */
class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}