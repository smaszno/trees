package org.trees;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public abstract class DecidousTree extends AbstractTree{

    @Override
    public boolean hasLeavesInSeason(Season season)
    {
        switch(season) {
            case WINTER:
                return false;
            default:
                return true;
        }
    }

    protected DecidousTree(BigDecimal heightInMeters, Integer branchesCount, Integer leafCount) {
        super(heightInMeters, branchesCount, leafCount);
    }
}
