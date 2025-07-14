package org.surja.keywordAnalyser;

import java.util.List;
import java.util.Map;
/*
this is the contract that is share between two developer
one is developing the search service
another one is taking care of implementation

 */


public interface KeywordAnalyserInterface {
    /*
     our search function will have mainly two functionality
        one is record the keyword
        another one is to get all the stored keyword
     */
    /*
    this method is to record the keyword
     */
    void recordKeyword(String keyword);
    /*
    this method is to get all the recorded Keywords
     */
    List<String> getKeyword();

    /*
    this is a default method
     */
    default Map<String, Long> getKeywordFrq(){
        return null;
    }
}
