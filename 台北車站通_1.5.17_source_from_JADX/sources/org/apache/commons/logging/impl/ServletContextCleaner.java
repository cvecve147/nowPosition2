package org.apache.commons.logging.impl;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.LogFactory;

public class ServletContextCleaner implements ServletContextListener {
    private static final Class[] RELEASE_SIGNATURE;
    static /* synthetic */ Class class$java$lang$ClassLoader;

    static {
        Class[] clsArr = new Class[1];
        Class cls = class$java$lang$ClassLoader;
        if (cls == null) {
            cls = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = cls;
        }
        clsArr[0] = cls;
        RELEASE_SIGNATURE = clsArr;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        String str;
        PrintStream printStream;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class<?> loadClass = classLoader.loadClass(LogFactory.FACTORY_PROPERTY);
                loadClass.getMethod("release", RELEASE_SIGNATURE).invoke((Object) null, objArr);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                classLoader = null;
            } catch (NoSuchMethodException unused2) {
                printStream = System.err;
                str = "LogFactory instance found which does not support release method!";
                printStream.println(str);
                classLoader = null;
            } catch (IllegalAccessException unused3) {
                printStream = System.err;
                str = "LogFactory instance found which is not accessable!";
                printStream.println(str);
                classLoader = null;
            } catch (InvocationTargetException unused4) {
                printStream = System.err;
                str = "LogFactory instance release method failed!";
                printStream.println(str);
                classLoader = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
