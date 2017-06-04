package org.trees;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public abstract class Conifer extends AbstractTree {

    @Override
    public boolean hasLeavesInSeason(Season season)
    {
        return true;
    }

    protected Conifer(BigDecimal heightInMeters, Integer branchesCount, Integer leafCount) {
        super(heightInMeters, branchesCount, leafCount);
    }
}
