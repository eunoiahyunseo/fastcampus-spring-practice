package com.eunoiahyunseo.springpractice.service;

import com.eunoiahyunseo.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ihyeonseo
 */

// roll as service bean
@Service
public class SortService {

    private final Sort<String> sort;


    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }

}