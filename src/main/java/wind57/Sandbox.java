package wind57;

import java.net.http.HttpClient;

public final class Sandbox {

    private final HttpClient httpClient;

    private Sandbox(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    private static final Sandbox ONE = new Sandbox(Provider.clientOne());
    private static final Sandbox TWO = new Sandbox(Provider.clientTwo());

    // irrelevant result
    public boolean go() {
        return true;
    }

}
