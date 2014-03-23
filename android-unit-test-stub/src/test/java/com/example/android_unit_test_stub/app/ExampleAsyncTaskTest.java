package com.example.android_unit_test_stub.app;

import junit.framework.TestCase;

public class ExampleAsyncTaskTest extends TestCase
{
    public void testExampleAsyncTask() throws InterruptedException
    {
        new ExampleAsyncTask().execute();
        assertTrue( true );
    }
}
