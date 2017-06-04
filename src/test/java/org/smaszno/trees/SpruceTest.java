package org.smaszno.trees;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Created by smaszno on 04/06/2017.
 */
public class SpruceTest extends TreeTest {





    @Test
    public void testSpruceHasLeavesInAllSeasons() throws Exception {
        for (Season season : Season.values())
        {
                assertTrue("Spruce should have leaves in "+season.name().toLowerCase(), tree.hasLeavesInSeason(season));
        }
    }


    @Test
    public void testSpruceHeightIsNotNullAndPositiveValue() throws Exception
    {
        testTreeHeightIsNotNullAndPositiveValue();
    }

    @Before
    public void setUp() throws Exception {
        tree = new Spruce(new BigDecimal("15"), new Integer(30), new Integer(4000));
    }

}