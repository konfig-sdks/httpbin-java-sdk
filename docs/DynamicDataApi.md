# DynamicDataApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**decodeBase64urlString**](DynamicDataApi.md#decodeBase64urlString) | **GET** /base64/{value} | Decodes base64url-encoded string. |
| [**delayedResponseDelete**](DynamicDataApi.md#delayedResponseDelete) | **DELETE** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**delayedResponseGet**](DynamicDataApi.md#delayedResponseGet) | **GET** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**dripDataOverDuration**](DynamicDataApi.md#dripDataOverDuration) | **GET** /drip | Drips data over a duration after an optional initial delay. |
| [**generatePageContainingLinks**](DynamicDataApi.md#generatePageContainingLinks) | **GET** /links/{n}/{offset} | Generate a page containing n links to other pages which do the same. |
| [**generateUuid**](DynamicDataApi.md#generateUuid) | **GET** /uuid | Return a UUID4. |
| [**getRandomBytes**](DynamicDataApi.md#getRandomBytes) | **GET** /bytes/{n} | Returns n random bytes generated with given seed |
| [**returnDelayedResponse**](DynamicDataApi.md#returnDelayedResponse) | **PUT** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**returnDelayedResponseTrace**](DynamicDataApi.md#returnDelayedResponseTrace) | **TRACE** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**returnDelayedResponse_0**](DynamicDataApi.md#returnDelayedResponse_0) | **POST** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**returnDelayedResponse_1**](DynamicDataApi.md#returnDelayedResponse_1) | **PATCH** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**streamJsonResponses**](DynamicDataApi.md#streamJsonResponses) | **GET** /stream/{n} | Stream n JSON responses |
| [**streamRandomBytes**](DynamicDataApi.md#streamRandomBytes) | **GET** /range/{numbytes} | Streams n random bytes generated with given seed, at given chunk size per packet. |
| [**streamRandomBytes_0**](DynamicDataApi.md#streamRandomBytes_0) | **GET** /stream-bytes/{n} | Streams n random bytes generated with given seed, at given chunk size per packet. |


<a name="decodeBase64urlString"></a>
# **decodeBase64urlString**
> decodeBase64urlString(value).execute();

Decodes base64url-encoded string.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String value = "SFRUUEJJTiBpcyBhd2Vzb21l";
    try {
      client
              .dynamicData
              .decodeBase64urlString(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#decodeBase64urlString");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .decodeBase64urlString(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#decodeBase64urlString");
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
| **value** | **String**|  | [default to SFRUUEJJTiBpcyBhd2Vzb21l] |

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
| **200** | Decoded base64 content. |  -  |

<a name="delayedResponseDelete"></a>
# **delayedResponseDelete**
> delayedResponseDelete(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .delayedResponseDelete(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#delayedResponseDelete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .delayedResponseDelete(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#delayedResponseDelete");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="delayedResponseGet"></a>
# **delayedResponseGet**
> delayedResponseGet(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .delayedResponseGet(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#delayedResponseGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .delayedResponseGet(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#delayedResponseGet");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="dripDataOverDuration"></a>
# **dripDataOverDuration**
> dripDataOverDuration().duration(duration).numbytes(numbytes).code(code).delay(delay).execute();

Drips data over a duration after an optional initial delay.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Double duration = 2D; // The amount of time (in seconds) over which to drip each byte
    Integer numbytes = 10; // The number of bytes to respond with
    Integer code = 200; // The response code that will be returned
    Double delay = 2D; // The amount of time (in seconds) to delay before responding
    try {
      client
              .dynamicData
              .dripDataOverDuration()
              .duration(duration)
              .numbytes(numbytes)
              .code(code)
              .delay(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#dripDataOverDuration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .dripDataOverDuration()
              .duration(duration)
              .numbytes(numbytes)
              .code(code)
              .delay(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#dripDataOverDuration");
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
| **duration** | **Double**| The amount of time (in seconds) over which to drip each byte | [optional] [default to 2] |
| **numbytes** | **Integer**| The number of bytes to respond with | [optional] [default to 10] |
| **code** | **Integer**| The response code that will be returned | [optional] [default to 200] |
| **delay** | **Double**| The amount of time (in seconds) to delay before responding | [optional] [default to 2] |

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
| **200** | A dripped response. |  -  |

<a name="generatePageContainingLinks"></a>
# **generatePageContainingLinks**
> generatePageContainingLinks(n, offset).execute();

Generate a page containing n links to other pages which do the same.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer n = 56;
    Integer offset = 56;
    try {
      client
              .dynamicData
              .generatePageContainingLinks(n, offset)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#generatePageContainingLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .generatePageContainingLinks(n, offset)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#generatePageContainingLinks");
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
| **offset** | [**Integer**](.md)|  | |

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
| **200** | HTML links. |  -  |

<a name="generateUuid"></a>
# **generateUuid**
> generateUuid().execute();

Return a UUID4.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
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
              .dynamicData
              .generateUuid()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#generateUuid");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .generateUuid()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#generateUuid");
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
| **200** | A UUID4. |  -  |

<a name="getRandomBytes"></a>
# **getRandomBytes**
> getRandomBytes(n).execute();

Returns n random bytes generated with given seed

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
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
              .dynamicData
              .getRandomBytes(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#getRandomBytes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .getRandomBytes(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#getRandomBytes");
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
| **200** | Bytes. |  -  |

<a name="returnDelayedResponse"></a>
# **returnDelayedResponse**
> returnDelayedResponse(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .returnDelayedResponse(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .returnDelayedResponse(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="returnDelayedResponseTrace"></a>
# **returnDelayedResponseTrace**
> returnDelayedResponseTrace(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .returnDelayedResponseTrace(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponseTrace");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .returnDelayedResponseTrace(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponseTrace");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="returnDelayedResponse_0"></a>
# **returnDelayedResponse_0**
> returnDelayedResponse_0(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .returnDelayedResponse_0(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .returnDelayedResponse_0(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse_0");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="returnDelayedResponse_1"></a>
# **returnDelayedResponse_1**
> returnDelayedResponse_1(delay).execute();

Returns a delayed response (max of 10 seconds).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer delay = 56;
    try {
      client
              .dynamicData
              .returnDelayedResponse_1(delay)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .returnDelayedResponse_1(delay)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#returnDelayedResponse_1");
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
| **delay** | [**Integer**](.md)|  | |

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
| **200** | A delayed response. |  -  |

<a name="streamJsonResponses"></a>
# **streamJsonResponses**
> streamJsonResponses(n).execute();

Stream n JSON responses

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
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
              .dynamicData
              .streamJsonResponses(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamJsonResponses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .streamJsonResponses(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamJsonResponses");
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
| **200** | Streamed JSON responses. |  -  |

<a name="streamRandomBytes"></a>
# **streamRandomBytes**
> streamRandomBytes(numbytes).execute();

Streams n random bytes generated with given seed, at given chunk size per packet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    Integer numbytes = 56;
    try {
      client
              .dynamicData
              .streamRandomBytes(numbytes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamRandomBytes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .streamRandomBytes(numbytes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamRandomBytes");
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
| **numbytes** | [**Integer**](.md)|  | |

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
| **200** | Bytes. |  -  |

<a name="streamRandomBytes_0"></a>
# **streamRandomBytes_0**
> streamRandomBytes_0(n).execute();

Streams n random bytes generated with given seed, at given chunk size per packet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DynamicDataApi;
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
              .dynamicData
              .streamRandomBytes_0(n)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamRandomBytes_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dynamicData
              .streamRandomBytes_0(n)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DynamicDataApi#streamRandomBytes_0");
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
| **200** | Bytes. |  -  |

