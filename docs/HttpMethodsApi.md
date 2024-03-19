# HttpMethodsApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRequestParameters**](HttpMethodsApi.md#deleteRequestParameters) | **DELETE** /delete | The request&#39;s DELETE parameters. |
| [**postRequestParameters**](HttpMethodsApi.md#postRequestParameters) | **POST** /post | The request&#39;s POST parameters. |
| [**putRequestParameters**](HttpMethodsApi.md#putRequestParameters) | **PUT** /put | The request&#39;s PUT parameters. |
| [**requestQueryParametersGet**](HttpMethodsApi.md#requestQueryParametersGet) | **GET** /get | The request&#39;s query parameters. |
| [**updateRequestParameters**](HttpMethodsApi.md#updateRequestParameters) | **PATCH** /patch | The request&#39;s PATCH parameters. |


<a name="deleteRequestParameters"></a>
# **deleteRequestParameters**
> deleteRequestParameters().execute();

The request&#39;s DELETE parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpMethodsApi;
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
              .httpMethods
              .deleteRequestParameters()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#deleteRequestParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpMethods
              .deleteRequestParameters()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#deleteRequestParameters");
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
| **200** | The request&#39;s DELETE parameters. |  -  |

<a name="postRequestParameters"></a>
# **postRequestParameters**
> postRequestParameters().execute();

The request&#39;s POST parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpMethodsApi;
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
              .httpMethods
              .postRequestParameters()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#postRequestParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpMethods
              .postRequestParameters()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#postRequestParameters");
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
| **200** | The request&#39;s POST parameters. |  -  |

<a name="putRequestParameters"></a>
# **putRequestParameters**
> putRequestParameters().execute();

The request&#39;s PUT parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpMethodsApi;
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
              .httpMethods
              .putRequestParameters()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#putRequestParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpMethods
              .putRequestParameters()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#putRequestParameters");
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
| **200** | The request&#39;s PUT parameters. |  -  |

<a name="requestQueryParametersGet"></a>
# **requestQueryParametersGet**
> requestQueryParametersGet().execute();

The request&#39;s query parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpMethodsApi;
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
              .httpMethods
              .requestQueryParametersGet()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#requestQueryParametersGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpMethods
              .requestQueryParametersGet()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#requestQueryParametersGet");
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
| **200** | The request&#39;s query parameters. |  -  |

<a name="updateRequestParameters"></a>
# **updateRequestParameters**
> updateRequestParameters().execute();

The request&#39;s PATCH parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpMethodsApi;
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
              .httpMethods
              .updateRequestParameters()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#updateRequestParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpMethods
              .updateRequestParameters()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpMethodsApi#updateRequestParameters");
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
| **200** | The request&#39;s PATCH parameters. |  -  |

