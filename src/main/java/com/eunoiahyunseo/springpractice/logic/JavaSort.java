package com.eunoiahyunseo.springpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ihyeonseo
 */

@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }

}