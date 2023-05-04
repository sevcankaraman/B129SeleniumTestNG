package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //bu class ListenersRetry class ı xml dosyasıyla test sınıflarıyla ilişkilendirilimediği için olusturuldu.
    //bu class ile ListenersRetry classını XML dosyayası ıle ilişkilendirebileceğiz
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setRetryAnalyzer(ListenersRetry.class);

    }
}
