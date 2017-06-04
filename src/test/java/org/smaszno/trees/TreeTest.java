package org.smaszno.trees;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by smaszno on 04/06/2017.
 */
public class TreeTest {
    Tree tree;

    public void testTreeHeightIsNotNullAndPositiveValue() throws Exception
    {
        BigDecimal treeHeight = tree.getHeightInMeters();
        String treeName = tree.getClass().getSimpleName();
        assertTrue(treeName+" should have non-null height", treeHeight != null);
        assertTrue(treeName+" should have non-zero height", treeHeight.compareTo(BigDecimal.ZERO) != 0);
        assertFalse(treeName+" should not have a negative value for height", treeHeight.abs().compareTo(treeHeight) != 0);
    }

}
