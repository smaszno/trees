package org.trees.tests;

import org.junit.Before;
import org.junit.Test;
import org.trees.Larch;
import org.trees.Season;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by smaszno on 04/06/2017.
 */
public class LarchTest extends TreeTest {



    @Test
    public void testLarchHasNoLeavesInWinter() throws Exception {
        assertFalse("Larch should loose leaves in winter", tree.hasLeavesInSeason(Season.WINTER));
    }

    @Test
    public void testLarchHasLeavesInSeasonsOtherThanWinter() throws Exception {
        for (Season season : Season.values())
        {
            if (season != Season.WINTER)
                assertTrue("Larch should have leaves in "+season.name().toLowerCase(), tree.hasLeavesInSeason(season));
        }
    }

    @Test
    public void testLarchHeightIsNotNullAndPositiveValue() throws Exception
    {
        testTreeHeightIsNotNullAndPositiveValue();
    }

    @Before
    public void setUp() throws Exception {
        tree = new Larch(new BigDecimal("-12.53"), new Integer(30), new Integer(4000));
    }


}