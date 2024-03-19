# CookiesApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRedirectToCookieList**](CookiesApi.md#deleteRedirectToCookieList) | **GET** /cookies/delete | Deletes cookie(s) as provided by the query string and redirects to cookie list. |
| [**getData**](CookiesApi.md#getData) | **GET** /cookies | Returns cookie data. |
| [**setCookieRedirect**](CookiesApi.md#setCookieRedirect) | **GET** /cookies/set/{name}/{value} | Sets a cookie and redirects to cookie list. |
| [**setRedirect**](CookiesApi.md#setRedirect) | **GET** /cookies/set | Sets cookie(s) as provided by the query string and redirects to cookie list. |


<a name="deleteRedirectToCookieList"></a>
# **deleteRedirectToCookieList**
> deleteRedirectToCookieList().freeform(freeform).execute();

Deletes cookie(s) as provided by the query string and redirects to cookie list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CookiesApi;
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
              .cookies
              .deleteRedirectToCookieList()
              .freeform(freeform)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#deleteRedirectToCookieList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cookies
              .deleteRedirectToCookieList()
              .freeform(freeform)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#deleteRedirectToCookieList");
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
| **200** | Redirect to cookie list |  -  |

<a name="getData"></a>
# **getData**
> getData().execute();

Returns cookie data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CookiesApi;
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
              .cookies
              .getData()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cookies
              .getData()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#getData");
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
| **200** | Set cookies. |  -  |

<a name="setCookieRedirect"></a>
# **setCookieRedirect**
> setCookieRedirect(name, value).execute();

Sets a cookie and redirects to cookie list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CookiesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String name = "name_example";
    String value = "value_example";
    try {
      client
              .cookies
              .setCookieRedirect(name, value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#setCookieRedirect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cookies
              .setCookieRedirect(name, value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#setCookieRedirect");
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
| **name** | **String**|  | |
| **value** | **String**|  | |

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
| **200** | Set cookies and redirects to cookie list. |  -  |

<a name="setRedirect"></a>
# **setRedirect**
> setRedirect().freeform(freeform).execute();

Sets cookie(s) as provided by the query string and redirects to cookie list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CookiesApi;
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
              .cookies
              .setRedirect()
              .freeform(freeform)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#setRedirect");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cookies
              .setRedirect()
              .freeform(freeform)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CookiesApi#setRedirect");
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
| **200** | Redirect to cookie list |  -  |

