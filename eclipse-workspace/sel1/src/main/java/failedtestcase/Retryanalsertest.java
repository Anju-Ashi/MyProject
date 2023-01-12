package failedtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalsertest implements IRetryAnalyzer{
int count=0;
int maxcount=2;

  public boolean retry(ITestResult result) {
	  if(count<maxcount)
	  {
		  System.out.printf("Retrying" ,result.getName(),  "again" ,+(count+1));
		  count++;
		  return true;
	  }
	  return false;
  }
}

