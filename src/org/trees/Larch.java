package org.trees;

import java.math.BigDecimal;

import static org.trees.Season.WINTER;

/**
 * Created by smaszno on 04/06/2017.
 */
public class Larch extends Conifer {

    public Larch(BigDecimal heightInMeters, Integer branchesCount, Integer leafCount) {
        super(heightInMeters, branchesCount, leafCount);
    }

    @Override
    public boolean hasLeavesInSeason(Season season) {
        return !(season == WINTER);
    }
}
