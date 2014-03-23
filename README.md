android-unit-test-stub
======================

Run "gradle test" and get following error:

```
java.lang.RuntimeException: Stub!
    at android.os.AsyncTask.<init>(AsyncTask.java:10)
    at com.example.android_unit_test_stub.app.ExampleAsyncTask.<init>(ExampleAsyncTask.java:5)
    at com.example.android_unit_test_stub.app.ExampleAsyncTaskTest.testExampleAsyncTask(ExampleAsyncTaskTest.java:9)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:606)
    at junit.framework.TestCase.runTest(TestCase.java:168)
    at junit.framework.TestCase.runBare(TestCase.java:134)
    at junit.framework.TestResult$1.protect(TestResult.java:110)
    at junit.framework.TestResult.runProtected(TestResult.java:128)
    at junit.framework.TestResult.run(TestResult.java:113)
    at junit.framework.TestCase.run(TestCase.java:124)
    at junit.framework.TestSuite.runTest(TestSuite.java:243)
    at junit.framework.TestSuite.run(TestSuite.java:238)
    at org.junit.internal.runners.JUnit38ClassRunner.run(JUnit38ClassRunner.java:83)
...
```
