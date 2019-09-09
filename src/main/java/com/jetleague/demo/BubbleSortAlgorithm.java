package com.jetleague.demo;

import org.springframework.stereotype.Component;

import com.jetleague.demo.models.SortAlgorithm;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
    public int[] sort(int[] numbers) {
    	return numbers;
    }
    
}
