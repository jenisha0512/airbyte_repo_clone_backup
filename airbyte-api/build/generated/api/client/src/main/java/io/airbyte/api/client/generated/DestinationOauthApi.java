/*
 * Airbyte Configuration API
 * Airbyte Configuration API [https://airbyte.io](https://airbyte.io).  This API is a collection of HTTP RPC-style methods. While it is not a REST API, those familiar with REST should find the conventions of this API recognizable.  Here are some conventions that this API follows: * All endpoints are http POST methods. * All endpoints accept data via `application/json` request bodies. The API does not accept any data via query params. * The naming convention for endpoints is: localhost:8000/{VERSION}/{METHOD_FAMILY}/{METHOD_NAME} e.g. `localhost:8000/v1/connections/create`. * For all `update` methods, the whole object must be passed in, even the fields that did not change.  Authentication (OSS): * When authenticating to the Configuration API, you must use Basic Authentication by setting the Authentication Header to Basic and base64 encoding the username and password (which are `airbyte` and `password` by default - so base64 encoding `airbyte:password` results in `YWlyYnl0ZTpwYXNzd29yZA==`). So the full header reads `'Authorization': \"Basic YWlyYnl0ZTpwYXNzd29yZA==\"` 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@airbyte.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.airbyte.api.client.generated;

import io.airbyte.api.client.invoker.generated.ApiClient;
import io.airbyte.api.client.invoker.generated.ApiException;
import io.airbyte.api.client.invoker.generated.ApiResponse;
import io.airbyte.api.client.invoker.generated.Pair;

import io.airbyte.api.client.model.generated.CompleteDestinationOAuthRequest;
import io.airbyte.api.client.model.generated.DestinationOauthConsentRequest;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.KnownExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.OAuthConsentRead;
import io.airbyte.api.client.model.generated.SetInstancewideDestinationOauthParamsRequestBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class DestinationOauthApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public DestinationOauthApi() {
    this(new ApiClient());
  }

  public DestinationOauthApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Given a destination def ID generate an access/refresh token etc.
   * 
   * @param completeDestinationOAuthRequest  (required)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> completeDestinationOAuth(CompleteDestinationOAuthRequest completeDestinationOAuthRequest) throws ApiException {
    ApiResponse<Map<String, Object>> localVarResponse = completeDestinationOAuthWithHttpInfo(completeDestinationOAuthRequest);
    return localVarResponse.getData();
  }

  /**
   * Given a destination def ID generate an access/refresh token etc.
   * 
   * @param completeDestinationOAuthRequest  (required)
   * @return ApiResponse&lt;Map&lt;String, Object&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Map<String, Object>> completeDestinationOAuthWithHttpInfo(CompleteDestinationOAuthRequest completeDestinationOAuthRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = completeDestinationOAuthRequestBuilder(completeDestinationOAuthRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("completeDestinationOAuth", localVarResponse);
        }
        return new ApiResponse<Map<String, Object>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Map<String, Object>>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder completeDestinationOAuthRequestBuilder(CompleteDestinationOAuthRequest completeDestinationOAuthRequest) throws ApiException {
    // verify the required parameter 'completeDestinationOAuthRequest' is set
    if (completeDestinationOAuthRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'completeDestinationOAuthRequest' when calling completeDestinationOAuth");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destination_oauths/complete_oauth";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(completeDestinationOAuthRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
   * 
   * @param destinationOauthConsentRequest  (required)
   * @return OAuthConsentRead
   * @throws ApiException if fails to make API call
   */
  public OAuthConsentRead getDestinationOAuthConsent(DestinationOauthConsentRequest destinationOauthConsentRequest) throws ApiException {
    ApiResponse<OAuthConsentRead> localVarResponse = getDestinationOAuthConsentWithHttpInfo(destinationOauthConsentRequest);
    return localVarResponse.getData();
  }

  /**
   * Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
   * 
   * @param destinationOauthConsentRequest  (required)
   * @return ApiResponse&lt;OAuthConsentRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OAuthConsentRead> getDestinationOAuthConsentWithHttpInfo(DestinationOauthConsentRequest destinationOauthConsentRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDestinationOAuthConsentRequestBuilder(destinationOauthConsentRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getDestinationOAuthConsent", localVarResponse);
        }
        return new ApiResponse<OAuthConsentRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OAuthConsentRead>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getDestinationOAuthConsentRequestBuilder(DestinationOauthConsentRequest destinationOauthConsentRequest) throws ApiException {
    // verify the required parameter 'destinationOauthConsentRequest' is set
    if (destinationOauthConsentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationOauthConsentRequest' when calling getDestinationOAuthConsent");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destination_oauths/get_consent_url";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationOauthConsentRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector&#39;s configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company&#39;s Google Ads developer_token, client_id, and client_secret without the user having to know about these variables. 
   * 
   * @param setInstancewideDestinationOauthParamsRequestBody  (required)
   * @throws ApiException if fails to make API call
   */
  public void setInstancewideDestinationOauthParams(SetInstancewideDestinationOauthParamsRequestBody setInstancewideDestinationOauthParamsRequestBody) throws ApiException {
    setInstancewideDestinationOauthParamsWithHttpInfo(setInstancewideDestinationOauthParamsRequestBody);
  }

  /**
   * Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector&#39;s configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company&#39;s Google Ads developer_token, client_id, and client_secret without the user having to know about these variables. 
   * 
   * @param setInstancewideDestinationOauthParamsRequestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> setInstancewideDestinationOauthParamsWithHttpInfo(SetInstancewideDestinationOauthParamsRequestBody setInstancewideDestinationOauthParamsRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = setInstancewideDestinationOauthParamsRequestBuilder(setInstancewideDestinationOauthParamsRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("setInstancewideDestinationOauthParams", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder setInstancewideDestinationOauthParamsRequestBuilder(SetInstancewideDestinationOauthParamsRequestBody setInstancewideDestinationOauthParamsRequestBody) throws ApiException {
    // verify the required parameter 'setInstancewideDestinationOauthParamsRequestBody' is set
    if (setInstancewideDestinationOauthParamsRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'setInstancewideDestinationOauthParamsRequestBody' when calling setInstancewideDestinationOauthParams");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destination_oauths/oauth_params/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(setInstancewideDestinationOauthParamsRequestBody);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
