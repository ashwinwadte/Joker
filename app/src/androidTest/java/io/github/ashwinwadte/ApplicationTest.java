package io.github.ashwinwadte;

import android.app.Application;
import android.support.test.InstrumentationRegistry;
import android.test.ApplicationTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void checkAsyncTask() throws InterruptedException, ExecutionException, TimeoutException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(InstrumentationRegistry.getTargetContext());
        endpointsAsyncTask.execute();
        String result = endpointsAsyncTask.get(10, TimeUnit.SECONDS);
        assertNotNull(result);
    }
}