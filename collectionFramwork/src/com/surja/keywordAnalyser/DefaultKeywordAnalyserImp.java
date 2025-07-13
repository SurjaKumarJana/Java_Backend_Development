/**
 * Author : Developer B
 *
 * this is the actual implementation that will be used in the search service
 */


package com.surja.keywordAnalyser;

import java.util.ArrayList;
import java.util.List;

public class DefaultKeywordAnalyserImp implements KeywordAnalyserInterface{
    private List<String> dataSet;

    public DefaultKeywordAnalyserImp() {
        this.dataSet = new ArrayList<String>();
    }

    /*
    record the keyword
     */
    @Override
    public void recordKeyword(String keyword) {
        dataSet.add(keyword);
    }

    /*
    return all the keywords
     */
    @Override
    public List<String> getKeyword() {
        return dataSet;
    }
}
