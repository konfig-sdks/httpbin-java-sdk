# ResponseInspectionApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cacheControlSet**](ResponseInspectionApi.md#cacheControlSet) | **GET** /cache/{value} | Sets a Cache-Control header for n seconds. |
| [**getResponseHeaders**](ResponseInspectionApi.md#getResponseHeaders) | **POST** /response-headers | Returns a set of response headers from the query string. |
| [**notModifiedGet**](ResponseInspectionApi.md#notModifiedGet) | **GET** /cache | Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise. |
| [**queryHeadersGet**](ResponseInspectionApi.md#queryHeadersGet) | **GET** /response-headers | Returns a set of response headers from the query string. |
| [**resourceInspectionGet**](ResponseInspectionApi.md#resourceInspectionGet) | **GET** /etag/{etag} | Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately. |


<a name="cacheControlSet"></a>
# **cacheControlSet**
> cacheControlSet(value).execute();

Sets a Cache-Control header for n seconds.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResponseInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer value = 56;
    try {
      client
              .responseInspection
              .cacheControlSet(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#cacheControlSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .responseInspection
              .cacheControlSet(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#cacheControlSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **value** | **Integer**|  | |

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
| **200** | Cache control set |  -  |

<a name="getResponseHeaders"></a>
# **getResponseHeaders**
> getResponseHeaders().freeform(freeform).execute();

Returns a set of response headers from the query string.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResponseInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Map<String, String> freeform = new HashMap();
    try {
      client
              .responseInspection
              .getResponseHeaders()
              .freeform(freeform)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#getResponseHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .responseInspection
              .getResponseHeaders()
              .freeform(freeform)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#getResponseHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **freeform** | [**Map&lt;String, String&gt;**](String.md)|  | [optional] |

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
| **200** | Response headers |  -  |

<a name="notModifiedGet"></a>
# **notModifiedGet**
> notModifiedGet().ifModifiedSince(ifModifiedSince).ifNoneMatch(ifNoneMatch).execute();

Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResponseInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String ifModifiedSince = "ifModifiedSince_example";
    String ifNoneMatch = "ifNoneMatch_example";
    try {
      client
              .responseInspection
              .notModifiedGet()
              .ifModifiedSince(ifModifiedSince)
              .ifNoneMatch(ifNoneMatch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#notModifiedGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .responseInspection
              .notModifiedGet()
              .ifModifiedSince(ifModifiedSince)
              .ifNoneMatch(ifNoneMatch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#notModifiedGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ifModifiedSince** | **String**|  | [optional] |
| **ifNoneMatch** | **String**|  | [optional] |

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
| **200** | Cached response |  -  |
| **304** | Modified |  -  |

<a name="queryHeadersGet"></a>
# **queryHeadersGet**
> queryHeadersGet().freeform(freeform).execute();

Returns a set of response headers from the query string.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResponseInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Map<String, String> freeform = new HashMap();
    try {
      client
              .responseInspection
              .queryHeadersGet()
              .freeform(freeform)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#queryHeadersGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .responseInspection
              .queryHeadersGet()
              .freeform(freeform)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#queryHeadersGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **freeform** | [**Map&lt;String, String&gt;**](String.md)|  | [optional] |

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
| **200** | Response headers |  -  |

<a name="resourceInspectionGet"></a>
# **resourceInspectionGet**
> resourceInspectionGet().ifNoneMatch(ifNoneMatch).ifMatch(ifMatch).execute();

Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResponseInspectionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String ifNoneMatch = "ifNoneMatch_example";
    String ifMatch = "ifMatch_example";
    try {
      client
              .responseInspection
              .resourceInspectionGet()
              .ifNoneMatch(ifNoneMatch)
              .ifMatch(ifMatch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#resourceInspectionGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .responseInspection
              .resourceInspectionGet()
              .ifNoneMatch(ifNoneMatch)
              .ifMatch(ifMatch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResponseInspectionApi#resourceInspectionGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ifNoneMatch** | **String**|  | [optional] |
| **ifMatch** | **String**|  | [optional] |

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
| **200** | Normal response |  -  |
| **412** | match |  -  |

