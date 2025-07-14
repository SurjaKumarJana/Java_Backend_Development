/**
 * Author : Developer B
 *
 * this is the actual implementation that will be used in the search service
 * this maintains unique keyword
 */

package org.surja.keywordAnalyser;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueKeywordAnalyserImp implements KeywordAnalyserInterface{
    private Set<String> dataSet;

    public UniqueKeywordAnalyserImp() {
        //this.dataSet = new HashSet<>();// this will not maintain the order
        this.dataSet = new LinkedHashSet<>();// this will also maintain the order
    }

    @Override
    public void recordKeyword(String keyword) {
        dataSet.add(keyword);
    }

    @Override
    public List<String> getKeyword() {
        return dataSet.stream().toList();
    }

}
