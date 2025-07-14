/**
 * this is a dummy program just to perform the dependency injection
 *
 * this is our project where we use maven as a build tool
 * maven helps to manage the dependencies
 *
 * in this project we have added our own dependency using the pom.xml file and maven
 *
 */

package org.surja;

import org.surja.keywordAnalyser.DefaultKeywordAnalyserImp;
import org.surja.keywordAnalyser.KeywordAnalyserInterface;
import org.surja.keywordAnalyser.NewKeywordAnalyserImp;

public class SearchByName {
    public static void main(String[] args) {


        KeywordAnalyserInterface keywordAnalyser = new DefaultKeywordAnalyserImp();
        KeywordAnalyserInterface keywordAnalyser2 = new NewKeywordAnalyserImp();

    }
}
