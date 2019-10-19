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

import org.junit.Assert;
import org.junit.Test;

/**
 * @author manjunath.m
 *
 */
public class NeckLaceTest {

	@Test
	public void testNeclaceForInput1() {
		NeckLace neckLace = new NeckLace();
		int[] inputBeadsArray = { 1, 2, 3, 4, 5 };
		Assert.assertEquals(6, neckLace.solutionToFindNeclaceWithMaxBeads(inputBeadsArray));

	}

	@Test
	public void testNeclaceForInput2() {
		NeckLace neckLace = new NeckLace();
		int[] inputBeadsArray = { 5, 4, 0, 3, 1, 6, 2 };
		Assert.assertEquals(4l, neckLace.solutionToFindNeclaceWithMaxBeads(inputBeadsArray));
	}

}
