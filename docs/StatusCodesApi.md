# StatusCodesApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**returnRandomCode**](StatusCodesApi.md#returnRandomCode) | **GET** /status/{codes} | Return status code or random status code if more than one are given |
| [**returnRandomCode_0**](StatusCodesApi.md#returnRandomCode_0) | **PUT** /status/{codes} | Return status code or random status code if more than one are given |
| [**returnRandomCode_1**](StatusCodesApi.md#returnRandomCode_1) | **POST** /status/{codes} | Return status code or random status code if more than one are given |
| [**returnRandomCode_2**](StatusCodesApi.md#returnRandomCode_2) | **DELETE** /status/{codes} | Return status code or random status code if more than one are given |
| [**returnRandomCode_3**](StatusCodesApi.md#returnRandomCode_3) | **PATCH** /status/{codes} | Return status code or random status code if more than one are given |
| [**returnRandomCode_4**](StatusCodesApi.md#returnRandomCode_4) | **TRACE** /status/{codes} | Return status code or random status code if more than one are given |


<a name="returnRandomCode"></a>
# **returnRandomCode**
> returnRandomCode(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

<a name="returnRandomCode_0"></a>
# **returnRandomCode_0**
> returnRandomCode_0(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode_0(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode_0(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_0");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

<a name="returnRandomCode_1"></a>
# **returnRandomCode_1**
> returnRandomCode_1(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode_1(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode_1(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_1");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

<a name="returnRandomCode_2"></a>
# **returnRandomCode_2**
> returnRandomCode_2(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode_2(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_2");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode_2(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_2");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

<a name="returnRandomCode_3"></a>
# **returnRandomCode_3**
> returnRandomCode_3(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode_3(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_3");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode_3(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_3");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

<a name="returnRandomCode_4"></a>
# **returnRandomCode_4**
> returnRandomCode_4(codes).execute();

Return status code or random status code if more than one are given

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusCodesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String codes = "codes_example";
    try {
      client
              .statusCodes
              .returnRandomCode_4(codes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_4");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .statusCodes
              .returnRandomCode_4(codes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusCodesApi#returnRandomCode_4");
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
| **codes** | **String**|  | |

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
| **100** | Informational responses |  -  |
| **200** | Success |  -  |
| **300** | Redirection |  -  |
| **400** | Client Errors |  -  |
| **500** | Server Errors |  -  |

