package com.example.android_unit_test_stub.app;

import android.os.AsyncTask;

public class ExampleAsyncTask extends AsyncTask<String, Void, String>
{
    @Override
    protected String doInBackground( String... params )
    {
        return "OK";
    }
}
