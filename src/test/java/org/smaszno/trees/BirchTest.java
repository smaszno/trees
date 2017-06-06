package org.smaszno.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public class BirchTest extends TreeTest {
    @Test
    public void testBirchHasNoLeavesInWinter() throws Exception {
        Assert.assertFalse("Birch should loose leaves in winter", tree.hasLeavesInSeason(Season.WINTER));
    }

    @Test
    public void testBirchHasLeavesInSeasonsOtherThanWinter() throws Exception {
        for (Season season : Season.values())
        {
            if (season != Season.WINTER)
                Assert.assertTrue("Birch should have leaves in "+season.name().toLowerCase(), tree.hasLeavesInSeason(season));
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