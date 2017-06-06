package org.smaszno.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public class LarchTest extends TreeTest {



    @Test
    public void testLarchHasNoLeavesInWinter() throws Exception {
        Assert.assertFalse("Larch should loose leaves in winter", tree.hasLeavesInSeason(Season.WINTER));
    }

    @Test
    public void testLarchHasLeavesInSeasonsOtherThanWinter() throws Exception {
        for (Season season : Season.values())
        {
            if (season != Season.WINTER)
                Assert.assertTrue("Larch should have leaves in "+season.name().toLowerCase(), tree.hasLeavesInSeason(season));
        }
    }

    @Test
    public void testLarchHeightIsNotNullAndPositiveValue() throws Exception
    {
        testTreeHeightIsNotNullAndPositiveValue();
    }

    @Before
    public void setUp() throws Exception {
        tree = new Larch(new BigDecimal("12.53"), new Integer(30), new Integer(4000));
    }


}