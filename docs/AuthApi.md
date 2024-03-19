# AuthApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**digestAuthPrompt**](AuthApi.md#digestAuthPrompt) | **GET** /digest-auth/{qop}/{user}/{passwd} | Prompts the user for authorization using Digest Auth. |
| [**promptAuthorization**](AuthApi.md#promptAuthorization) | **GET** /bearer | Prompts the user for authorization using bearer authentication. |
| [**promptAuthorizationUsingDigest**](AuthApi.md#promptAuthorizationUsingDigest) | **GET** /digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after} | Prompts the user for authorization using Digest Auth + Algorithm. |
| [**promptAuthorizationUsingHttpGet**](AuthApi.md#promptAuthorizationUsingHttpGet) | **GET** /basic-auth/{user}/{passwd} | Prompts the user for authorization using HTTP Basic Auth. |
| [**promptUserAuthorization**](AuthApi.md#promptUserAuthorization) | **GET** /hidden-basic-auth/{user}/{passwd} | Prompts the user for authorization using HTTP Basic Auth. |
| [**userAuthorizationDigest**](AuthApi.md#userAuthorizationDigest) | **GET** /digest-auth/{qop}/{user}/{passwd}/{algorithm} | Prompts the user for authorization using Digest Auth + Algorithm. |


<a name="digestAuthPrompt"></a>
# **digestAuthPrompt**
> digestAuthPrompt(qop, user, passwd).execute();

Prompts the user for authorization using Digest Auth.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String qop = "qop_example"; // auth or auth-int
    String user = "user_example";
    String passwd = "passwd_example";
    try {
      client
              .auth
              .digestAuthPrompt(qop, user, passwd)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#digestAuthPrompt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .digestAuthPrompt(qop, user, passwd)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#digestAuthPrompt");
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
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| **passwd** | **String**|  | |

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
| **200** | Sucessful authentication. |  -  |
| **401** | Unsuccessful authentication. |  -  |

<a name="promptAuthorization"></a>
# **promptAuthorization**
> promptAuthorization().authorization(authorization).execute();

Prompts the user for authorization using bearer authentication.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String authorization = "authorization_example";
    try {
      client
              .auth
              .promptAuthorization()
              .authorization(authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .promptAuthorization()
              .authorization(authorization)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorization");
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
| **authorization** | **String**|  | [optional] |

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
| **200** | Sucessful authentication. |  -  |
| **401** | Unsuccessful authentication. |  -  |

<a name="promptAuthorizationUsingDigest"></a>
# **promptAuthorizationUsingDigest**
> promptAuthorizationUsingDigest(qop, user, passwd, algorithm, staleAfter).execute();

Prompts the user for authorization using Digest Auth + Algorithm.

allow settings the stale_after argument. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String qop = "qop_example"; // auth or auth-int
    String user = "user_example";
    String passwd = "passwd_example";
    String algorithm = "MD5"; // MD5, SHA-256, SHA-512
    String staleAfter = "never";
    try {
      client
              .auth
              .promptAuthorizationUsingDigest(qop, user, passwd, algorithm, staleAfter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorizationUsingDigest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .promptAuthorizationUsingDigest(qop, user, passwd, algorithm, staleAfter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorizationUsingDigest");
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
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| **passwd** | **String**|  | |
| **algorithm** | **String**| MD5, SHA-256, SHA-512 | [default to MD5] |
| **staleAfter** | **String**|  | [default to never] |

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
| **200** | Sucessful authentication. |  -  |
| **401** | Unsuccessful authentication. |  -  |

<a name="promptAuthorizationUsingHttpGet"></a>
# **promptAuthorizationUsingHttpGet**
> promptAuthorizationUsingHttpGet(user, passwd).execute();

Prompts the user for authorization using HTTP Basic Auth.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String user = "user_example";
    String passwd = "passwd_example";
    try {
      client
              .auth
              .promptAuthorizationUsingHttpGet(user, passwd)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorizationUsingHttpGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .promptAuthorizationUsingHttpGet(user, passwd)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptAuthorizationUsingHttpGet");
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
| **user** | **String**|  | |
| **passwd** | **String**|  | |

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
| **200** | Sucessful authentication. |  -  |
| **401** | Unsuccessful authentication. |  -  |

<a name="promptUserAuthorization"></a>
# **promptUserAuthorization**
> promptUserAuthorization(user, passwd).execute();

Prompts the user for authorization using HTTP Basic Auth.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String user = "user_example";
    String passwd = "passwd_example";
    try {
      client
              .auth
              .promptUserAuthorization(user, passwd)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptUserAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .promptUserAuthorization(user, passwd)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#promptUserAuthorization");
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
| **user** | **String**|  | |
| **passwd** | **String**|  | |

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
| **200** | Sucessful authentication. |  -  |
| **404** | Unsuccessful authentication. |  -  |

<a name="userAuthorizationDigest"></a>
# **userAuthorizationDigest**
> userAuthorizationDigest(qop, user, passwd, algorithm).execute();

Prompts the user for authorization using Digest Auth + Algorithm.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Httpbin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://httpbin.org";
    Httpbin client = new Httpbin(configuration);
    String qop = "qop_example"; // auth or auth-int
    String user = "user_example";
    String passwd = "passwd_example";
    String algorithm = "MD5"; // MD5, SHA-256, SHA-512
    try {
      client
              .auth
              .userAuthorizationDigest(qop, user, passwd, algorithm)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#userAuthorizationDigest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .auth
              .userAuthorizationDigest(qop, user, passwd, algorithm)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#userAuthorizationDigest");
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
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| **passwd** | **String**|  | |
| **algorithm** | **String**| MD5, SHA-256, SHA-512 | [default to MD5] |

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
| **200** | Sucessful authentication. |  -  |
| **401** | Unsuccessful authentication. |  -  |

