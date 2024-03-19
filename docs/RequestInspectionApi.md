# RequestInspectionApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**incomingHeadersGet**](RequestInspectionApi.md#incomingHeadersGet) | **GET** /headers | Return the incoming request&#39;s HTTP headers. |
| [**ipAddressGet**](RequestInspectionApi.md#ipAddressGet) | **GET** /ip | Returns the requester&#39;s IP Address. |
| [**userAgentGet**](RequestInspectionApi.md#userAgentGet) | **GET** /user-agent | Return the incoming requests&#39;s User-Agent header. |


<a name="incomingHeadersGet"></a>
# **incomingHeadersGet**
> incomingHeadersGet().execute();

Return the incoming request&#39;s HTTP headers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequestInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    try {
      client
              .requestInspection
              .incomingHeadersGet()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#incomingHeadersGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .requestInspection
              .incomingHeadersGet()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#incomingHeadersGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request&#39;s headers. |  -  |

<a name="ipAddressGet"></a>
# **ipAddressGet**
> ipAddressGet().execute();

Returns the requester&#39;s IP Address.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequestInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    try {
      client
              .requestInspection
              .ipAddressGet()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#ipAddressGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .requestInspection
              .ipAddressGet()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#ipAddressGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Requester&#39;s IP Address. |  -  |

<a name="userAgentGet"></a>
# **userAgentGet**
> userAgentGet().execute();

Return the incoming requests&#39;s User-Agent header.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RequestInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    try {
      client
              .requestInspection
              .userAgentGet()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#userAgentGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .requestInspection
              .userAgentGet()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RequestInspectionApi#userAgentGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request&#39;s User-Agent header. |  -  |

