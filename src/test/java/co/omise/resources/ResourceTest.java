package co.omise.resources;

import co.omise.OmiseTest;
import co.omise.testutils.TestInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Before;

public abstract class ResourceTest extends OmiseTest {
    private TestInterceptor interceptor;

    @Before
    public void setup() throws Exception {
        interceptor = new TestInterceptor(this);
    }

    Request lastRequest() {
        return interceptor.lastRequest();
    }

    protected OkHttpClient testClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
    }

    protected void assertRequested(String method, String path, int code) {
        Request request = interceptor.lastRequest();
        assertNotNull(request);
        assertEquals(method, request.method());
        assertEquals(path, request.url().encodedPath());

        Response response = interceptor.lastResponse();
        assertNotNull(response);
        assertEquals(code, response.code());
    }
}