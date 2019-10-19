/*
 * Copyright (c) Rakuten Edy Inc., Ltd. All Rights Reserved.
 *
 * This program is the information assets which are handled
 * as "Strictly Confidential".
 * Permission of Use is only admitted in Rakuten Edy Inc., Ltd.
 * If you don't have permission, MUST not be published,
 * broadcast, rewritten for broadcast or publication
 * or redistributed directly or indirectly in any medium.
 *
 */
package com.mirchi.interview.necklace;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author manjunath.m
 *
 */
public class NeckLace {

	/**
	 * 
	 * @param inputBeadsArray
	 * @return
	 */
	public int solutionToFindNeclaceWithMaxBeads(int[] inputBeadsArray) {
		List<Set<Integer>> listOfNecklaces = new CopyOnWriteArrayList<>();
		if (inputBeadsArray == null || inputBeadsArray.length == 0) {
			return 0;
		}
		for (int i = 0; i < inputBeadsArray.length; i++) {
			int currentValue = inputBeadsArray[i];
			int currentIndex = i;
			if (listOfNecklaces.isEmpty()) {
				Set<Integer> listOfBeads = new HashSet<>();
				listOfBeads.add(currentIndex);
				listOfBeads.add(inputBeadsArray[currentIndex]);
				listOfNecklaces.add(listOfBeads);
			} else {
				listOfNecklaces.stream().forEach(neckLace -> {
					if (neckLace.contains(currentValue) || neckLace.contains(currentIndex)) {
						neckLace.add(currentValue);
					} else {
						Set<Integer> list = new HashSet<>();
						list.add(currentIndex);
						list.add(inputBeadsArray[currentIndex]);
						listOfNecklaces.add(list);
					}

				});
			}
		}
		return listOfNecklaces.stream().mapToInt(necklace -> necklace.size()).max().getAsInt();
	}

}
