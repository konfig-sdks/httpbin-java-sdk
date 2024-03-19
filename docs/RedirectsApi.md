# RedirectsApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**absolutelyRedirectsN**](RedirectsApi.md#absolutelyRedirectsN) | **GET** /absolute-redirect/{n} | Absolutely 302 Redirects n times. |
| [**call302redirectsN**](RedirectsApi.md#call302redirectsN) | **GET** /redirect/{n} | 302 Redirects n times. |
| [**givenUrlPutRedirect**](RedirectsApi.md#givenUrlPutRedirect) | **PUT** /redirect-to | 302/3XX Redirects to the given URL. |
| [**relatively302RedirectsN**](RedirectsApi.md#relatively302RedirectsN) | **GET** /relative-redirect/{n} | Relatively 302 Redirects n times. |
| [**toGivenUrlDelete**](RedirectsApi.md#toGivenUrlDelete) | **DELETE** /redirect-to | 302/3XX Redirects to the given URL. |
| [**toGivenUrlGet**](RedirectsApi.md#toGivenUrlGet) | **GET** /redirect-to | 302/3XX Redirects to the given URL. |
| [**toGivenUrlPatch**](RedirectsApi.md#toGivenUrlPatch) | **PATCH** /redirect-to | 302/3XX Redirects to the given URL. |
| [**toGivenUrlPost**](RedirectsApi.md#toGivenUrlPost) | **POST** /redirect-to | 302/3XX Redirects to the given URL. |
| [**toGivenUrlTrace**](RedirectsApi.md#toGivenUrlTrace) | **TRACE** /redirect-to | 302/3XX Redirects to the given URL. |


<a name="absolutelyRedirectsN"></a>
# **absolutelyRedirectsN**
> absolutelyRedirectsN(n).execute();

Absolutely 302 Redirects n times.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer n = 56;
    try {
      client
              .redirects
              .absolutelyRedirectsN(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#absolutelyRedirectsN");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .absolutelyRedirectsN(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#absolutelyRedirectsN");
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
| **n** | [**Integer**](.md)|  | |

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
| **0** | A redirection. |  -  |

<a name="call302redirectsN"></a>
# **call302redirectsN**
> call302redirectsN(n).execute();

302 Redirects n times.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer n = 56;
    try {
      client
              .redirects
              .call302redirectsN(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#call302redirectsN");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .call302redirectsN(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#call302redirectsN");
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
| **n** | [**Integer**](.md)|  | |

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
| **0** | A redirection. |  -  |

<a name="givenUrlPutRedirect"></a>
# **givenUrlPutRedirect**
> givenUrlPutRedirect(redirectsToGivenUrlPostRequest).execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String url = "url_example";
    Integer statusCode = 56;
    try {
      client
              .redirects
              .givenUrlPutRedirect(url)
              .statusCode(statusCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#givenUrlPutRedirect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .givenUrlPutRedirect(url)
              .statusCode(statusCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#givenUrlPutRedirect");
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
| **redirectsToGivenUrlPostRequest** | [**RedirectsToGivenUrlPostRequest**](RedirectsToGivenUrlPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | A redirection. |  -  |

<a name="relatively302RedirectsN"></a>
# **relatively302RedirectsN**
> relatively302RedirectsN(n).execute();

Relatively 302 Redirects n times.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer n = 56;
    try {
      client
              .redirects
              .relatively302RedirectsN(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#relatively302RedirectsN");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .relatively302RedirectsN(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#relatively302RedirectsN");
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
| **n** | [**Integer**](.md)|  | |

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
| **0** | A redirection. |  -  |

<a name="toGivenUrlDelete"></a>
# **toGivenUrlDelete**
> toGivenUrlDelete().execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
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
              .redirects
              .toGivenUrlDelete()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .toGivenUrlDelete()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlDelete");
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
| **0** | A redirection. |  -  |

<a name="toGivenUrlGet"></a>
# **toGivenUrlGet**
> toGivenUrlGet(url).statusCode(statusCode).execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String url = "url_example";
    Integer statusCode = 56;
    try {
      client
              .redirects
              .toGivenUrlGet(url)
              .statusCode(statusCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .toGivenUrlGet(url)
              .statusCode(statusCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlGet");
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
| **url** | **String**|  | |
| **statusCode** | [**Integer**](.md)|  | [optional] |

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
| **0** | A redirection. |  -  |

<a name="toGivenUrlPatch"></a>
# **toGivenUrlPatch**
> toGivenUrlPatch().execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
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
              .redirects
              .toGivenUrlPatch()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlPatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .toGivenUrlPatch()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlPatch");
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
| **0** | A redirection. |  -  |

<a name="toGivenUrlPost"></a>
# **toGivenUrlPost**
> toGivenUrlPost(redirectsToGivenUrlPostRequest).execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String url = "url_example";
    Integer statusCode = 56;
    try {
      client
              .redirects
              .toGivenUrlPost(url)
              .statusCode(statusCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .toGivenUrlPost(url)
              .statusCode(statusCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlPost");
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
| **redirectsToGivenUrlPostRequest** | [**RedirectsToGivenUrlPostRequest**](RedirectsToGivenUrlPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | A redirection. |  -  |

<a name="toGivenUrlTrace"></a>
# **toGivenUrlTrace**
> toGivenUrlTrace().execute();

302/3XX Redirects to the given URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RedirectsApi;
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
              .redirects
              .toGivenUrlTrace()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlTrace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .redirects
              .toGivenUrlTrace()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RedirectsApi#toGivenUrlTrace");
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
| **0** | A redirection. |  -  |

