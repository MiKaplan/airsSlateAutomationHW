package selenium;

import org.openqa.selenium.support.decorators.Decorated;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LoggingWebDriverEventListener extends EventFiringDecorator {

    public LoggingWebDriverEventListener(WebDriverListener... listeners) {
        super(listeners);
    }

    public LoggingWebDriverEventListener(Class targetClass, WebDriverListener... listeners) {
        super(targetClass, listeners);
    }

    @Override
    public void beforeCall(Decorated target, Method method, Object[] args) {
        super.beforeCall(target, method, args);
    }

    @Override
    public void afterCall(Decorated target, Method method, Object[] args, Object result) {
        super.afterCall(target, method, args, result);
    }

    @Override
    public Object onError(Decorated target, Method method, Object[] args, InvocationTargetException e) throws Throwable {
        return super.onError(target, method, args, e);
    }

}
