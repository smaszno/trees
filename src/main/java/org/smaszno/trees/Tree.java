package org.smaszno.trees;


import java.math.BigDecimal;

/**
 * Created by smaszno on 04/06/2017.
 */
public interface Tree {

    BigDecimal getHeightInMeters();
    Integer getBranchCount();
    Integer getLeafCount();
    boolean hasLeavesInSeason(Season season);
}
