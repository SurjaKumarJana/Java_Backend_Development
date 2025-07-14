
/**
 * author: Developer A
 *
 * this is a mock interface that Developer A created to work on his part
 * this is basically a dummy implementation that does nothing.
 */

package org.surja.keywordAnalyser;

import java.util.List;

public class MockKeywordAnalyserImp implements KeywordAnalyserInterface{
    @Override
    public void recordKeyword(String keyword) {

    }

    @Override
    public List<String> getKeyword() {
        return null;
    }


}
