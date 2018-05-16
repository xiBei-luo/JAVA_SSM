package com.langsin.reflection;

import java.lang.reflect.Proxy;

public class RunDebugTest
{
    public static void main(String[] args)
    {
        try
        {
            // Create the real interface implementation
            TestInterface target = new TestTarget();

            // Create a proxy to wrap the original implementation
            DebugProxy proxy = new DebugProxy(target);

            // Get a reference to the proxy through the TestInterface interface

            TestInterface test = (TestInterface) Proxy.newProxyInstance(TestInterface.class.getClassLoader(),
                    new Class[] { TestInterface.class }, proxy);

            // Invoke some methods on the test interface
            System.out.println(test.doTest1("This is test ", 1));
            test.doTest2(new String[] { "foo", "bar", "baz" });
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }
}
