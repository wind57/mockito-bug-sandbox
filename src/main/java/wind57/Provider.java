package wind57;

import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

public final class Provider {

    static HttpClient clientOne() {
        return HttpClient.newBuilder()
                         .sslContext(contextOne())
                         .version(Version.HTTP_1_1)
                         .build();
    }

    static HttpClient clientTwo() {
        return HttpClient.newBuilder()
                         .sslContext(contextTwo())
                         .version(Version.HTTP_1_1)
                         .build();
    }


    private static SSLContext contextOne() {
        try {
            return SSLContext.getInstance("SSL");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException("just because");
        }
    }

    static SSLContext contextTwo() {
        try {
            return SSLContext.getInstance("SSL");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException("just because");
        }
    }

}
