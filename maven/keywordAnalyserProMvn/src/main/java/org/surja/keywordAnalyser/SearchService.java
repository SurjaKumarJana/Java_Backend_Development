/**
 * author: Developer A
 *practice program...
 *
 * this is the search service which is used to provide the search functionality
 *
 */
package org.surja.keywordAnalyser;

public class SearchService {

    public static void main(String[] args) {

        //dummy implementation
        //KeywordAnalyserInterface keywordAnalyser  = new MockKeywordAnalyserImp();

        // this implementation doesn't maintain order
        //KeywordAnalyserInterface keywordAnalyser = new DefaultKeywordAnalyserImp();

        //this implementation maintain order but doesn't give the frequency
        //KeywordAnalyserInterface keywordAnalyser  = new UniqueKeywordAnalyserImp();

        // this implementation also takes care of frequency
        KeywordAnalyserInterface keywordAnalyser  = new FreqKeywordAnalyserImp();


        // adding keywords
        keywordAnalyser.recordKeyword("Laptop");
        keywordAnalyser.recordKeyword("Tab");
        keywordAnalyser.recordKeyword("Mobile");
        keywordAnalyser.recordKeyword("Watch");
        keywordAnalyser.recordKeyword("Mobile");


        // accessing all the listed keyword
        System.out.println(keywordAnalyser.getKeywordFrq());
    }
}
