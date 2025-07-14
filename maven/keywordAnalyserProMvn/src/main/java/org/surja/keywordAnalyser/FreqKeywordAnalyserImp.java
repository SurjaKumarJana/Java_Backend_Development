/**
 * Author : Developer B
 *
 * this is the actual implementation that will be used in the search service
 * this maintains unique keyword with frequency
 */
package org.surja.keywordAnalyser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FreqKeywordAnalyserImp  implements  KeywordAnalyserInterface{
    private  Map<String, Long> dataSet;

    public FreqKeywordAnalyserImp() {
        this.dataSet = new LinkedHashMap<>();
    }

    @Override
    public void recordKeyword(String keyword) {
        dataSet.put(keyword,dataSet.getOrDefault(keyword,0L)+1);

    }

    @Override
    public List<String> getKeyword() {
        return dataSet.keySet().stream().toList();
    }

    @Override
    public Map<String, Long> getKeywordFrq() {
        return dataSet;
    }
}
