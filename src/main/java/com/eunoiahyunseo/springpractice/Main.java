package com.eunoiahyunseo.springpractice;

import com.eunoiahyunseo.springpractice.config.Config;
import com.eunoiahyunseo.springpractice.logic.JavaSort;
import com.eunoiahyunseo.springpractice.logic.Sort;
import com.eunoiahyunseo.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author ihyeonseo
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        // Sort<String> sort = context.getBean(Sort.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] " + sortService.doSort((Arrays.asList(args))));
    }
}