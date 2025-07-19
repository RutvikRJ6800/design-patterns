package builder;

public class HttpApp {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest.Builder("https://example.com")
                .method("POST")
                .body("{\"key\":\"value\"}")
                .timeout(1500)
                .build();
        System.out.println(request);

        HttpRequest request1 = new HttpRequest.Builder("https://example.com")
                .method("POST")
                .addHeader("X-API-Key", "secret")
                .addQueryParams("env", "prod")
                .timeout(1000)
                .build();
        System.out.println(request1);
    }
}
