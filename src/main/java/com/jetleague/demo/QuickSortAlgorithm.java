package com.jetleague.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.jetleague.demo.models.SortAlgorithm;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	
    public int[] sort(int[] numbers) {
    	return numbers;
    }
    
}
