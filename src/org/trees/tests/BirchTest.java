package org.trees.tests;

import org.junit.Before;
import org.junit.Test;
import org.trees.Birch;
import org.trees.Season;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by smaszno on 04/06/2017.
 */
public class BirchTest extends TreeTest {
    @Test
    public void testBirchHasNoLeavesInWinter() throws Exception {
        assertFalse("Birch should loose leaves in winter", tree.hasLeavesInSeason(Season.WINTER));
    }

    @Test
    public void testBirchHasLeavesInSeasonsOtherThanWinter() throws Exception {
        for (Season season : Season.values())
        {
            if (season != Season.WINTER)
                assertTrue("Birch should have leaves in "+season.name().toLowerCase(), tree.hasLeavesInSeason(season));
        }
    }

    @Test
    public void testBirchHeightIsNotNullAndPositiveValue() throws Exception
    {
        testTreeHeightIsNotNullAndPositiveValue();
    }

    @Before
    public void setUp() throws Exception {
        tree = new Birch(new BigDecimal("12.53"), new Integer(30), new Integer(4000));
    }


}