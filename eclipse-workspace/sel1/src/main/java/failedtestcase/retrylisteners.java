package failedtestcase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class retrylisteners implements IAnnotationTransformer {
public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method tesMethod) {
	annotation.setRetryAnalyzer(Retryanalsertest.class );
}
}
