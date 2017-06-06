package org.smaszno.trees;

import org.junit.Assert;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public class TreeTest {
    Tree tree;

    public void testTreeHeightIsNotNullAndPositiveValue() throws Exception
    {
        BigDecimal treeHeight = tree.getHeightInMeters();
        String treeName = tree.getClass().getSimpleName();
        Assert.assertTrue(treeName+" should have non-null height", treeHeight != null);
        Assert.assertTrue(treeName+" should have non-zero height", treeHeight.compareTo(BigDecimal.ZERO) != 0);
        Assert.assertFalse(treeName+" should not have a negative value for height", treeHeight.abs().compareTo(treeHeight) != 0);
    }

}
