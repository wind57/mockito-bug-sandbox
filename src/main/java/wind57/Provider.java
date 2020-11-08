package wind57;

import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import javax.net.ssl.SSLContext;

public final class Provider {

    static HttpClient clientOne() {
        return HttpClient.newBuilder()
                         .sslContext(contextTwo())
                         .version(Version.HTTP_1_1)
                         .build();
    }

    static HttpClient clientTwo() {
        return HttpClient.newBuilder()
                         .sslContext(contextOne())
                         .version(Version.HTTP_1_1)
                         .build();
    }


    private static SSLContext contextOne() {
        return null;
    }

    static SSLContext contextTwo() {
        return null;
    }

}
