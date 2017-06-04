package org.trees;

import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public abstract class AbstractTree implements Tree {

    private BigDecimal heightInMeters;
    private Integer branchesCount;
    private Integer leafCount;

    @Override
    public BigDecimal getHeightInMeters() {
        return heightInMeters;
    }

    @Override
    public Integer getBranchCount() {
        return branchesCount;
    }

    @Override
    public Integer getLeafCount() {
        return leafCount;
    }



    protected AbstractTree(BigDecimal heightInMeters, Integer branchesCount, Integer leafCount) {
        this.heightInMeters = heightInMeters;
        this.branchesCount = branchesCount;
        this.leafCount = leafCount;
    }
}
