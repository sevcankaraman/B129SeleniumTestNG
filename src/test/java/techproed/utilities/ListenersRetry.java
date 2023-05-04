package techproed.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersRetry implements IRetryAnalyzer {
    //bu class fail olan tesleri tekrar calıstırır
    private int retryCount = 0;

    private static final int maxRetryCount = 1;//maxRetryCount => fail sonrası tekrar sayısı
    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}