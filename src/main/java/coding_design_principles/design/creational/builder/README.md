
## Builder Pattern

> The Builder Design Pattern is a creational pattern that lets you construct complex objects step-by-step, separating the construction logic from the final representation.

It’s particularly useful in situations where:

- An object requires many optional fields, and not all of them are needed every time.
- You want to avoid telescoping constructors or large constructors with multiple parameters.
- The object construction process involves multiple steps that need to happen in a particular order.

Example:

```java
public class HttpRequestBuilderPattern {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest.Builder("https://api.example.com/data")
            .build();

        HttpRequest request2 = new HttpRequest.Builder("https://api.example.com/submit")
            .method("POST")
            .body("{\"key\":\"value\"}")
            .timeout(15000)
            .build();

        HttpRequest request3 = new HttpRequest.Builder("https://api.example.com/config")
            .method("PUT")
            .addHeader("X-API-Key", "secret")
            .addQueryParam("env", "prod")
            .body("{\"key\":\"value\"}")
            .timeout(5000)
            .build();

        System.out.println(request1);
        System.out.println(request2);
        System.out.println(request3);
    }
}
```