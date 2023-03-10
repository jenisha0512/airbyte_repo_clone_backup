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

import io.airbyte.api.client.model.generated.ConnectionIdRequestBody;
import io.airbyte.api.client.model.generated.ConnectionStateType;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.WebBackendCheckUpdatesRead;
import io.airbyte.api.client.model.generated.WebBackendConnectionCreate;
import io.airbyte.api.client.model.generated.WebBackendConnectionListRequestBody;
import io.airbyte.api.client.model.generated.WebBackendConnectionRead;
import io.airbyte.api.client.model.generated.WebBackendConnectionReadList;
import io.airbyte.api.client.model.generated.WebBackendConnectionRequestBody;
import io.airbyte.api.client.model.generated.WebBackendConnectionUpdate;
import io.airbyte.api.client.model.generated.WebBackendGeographiesListResult;
import io.airbyte.api.client.model.generated.WebBackendWorkspaceState;
import io.airbyte.api.client.model.generated.WebBackendWorkspaceStateResult;

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
public class WebBackendApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public WebBackendApi() {
    this(new ApiClient());
  }

  public WebBackendApi(ApiClient apiClient) {
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
   * Fetch the current state type for a connection.
   * 
   * @param connectionIdRequestBody  (required)
   * @return ConnectionStateType
   * @throws ApiException if fails to make API call
   */
  public ConnectionStateType getStateType(ConnectionIdRequestBody connectionIdRequestBody) throws ApiException {
    ApiResponse<ConnectionStateType> localVarResponse = getStateTypeWithHttpInfo(connectionIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Fetch the current state type for a connection.
   * 
   * @param connectionIdRequestBody  (required)
   * @return ApiResponse&lt;ConnectionStateType&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ConnectionStateType> getStateTypeWithHttpInfo(ConnectionIdRequestBody connectionIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getStateTypeRequestBuilder(connectionIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getStateType", localVarResponse);
        }
        return new ApiResponse<ConnectionStateType>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ConnectionStateType>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getStateTypeRequestBuilder(ConnectionIdRequestBody connectionIdRequestBody) throws ApiException {
    // verify the required parameter 'connectionIdRequestBody' is set
    if (connectionIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionIdRequestBody' when calling getStateType");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/state/get_type";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(connectionIdRequestBody);
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
   * Returns a summary of source and destination definitions that could be updated.
   * 
   * @return WebBackendCheckUpdatesRead
   * @throws ApiException if fails to make API call
   */
  public WebBackendCheckUpdatesRead webBackendCheckUpdates() throws ApiException {
    ApiResponse<WebBackendCheckUpdatesRead> localVarResponse = webBackendCheckUpdatesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Returns a summary of source and destination definitions that could be updated.
   * 
   * @return ApiResponse&lt;WebBackendCheckUpdatesRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendCheckUpdatesRead> webBackendCheckUpdatesWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendCheckUpdatesRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendCheckUpdates", localVarResponse);
        }
        return new ApiResponse<WebBackendCheckUpdatesRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendCheckUpdatesRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendCheckUpdatesRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/check_updates";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Create a connection
   * 
   * @param webBackendConnectionCreate  (required)
   * @return WebBackendConnectionRead
   * @throws ApiException if fails to make API call
   */
  public WebBackendConnectionRead webBackendCreateConnection(WebBackendConnectionCreate webBackendConnectionCreate) throws ApiException {
    ApiResponse<WebBackendConnectionRead> localVarResponse = webBackendCreateConnectionWithHttpInfo(webBackendConnectionCreate);
    return localVarResponse.getData();
  }

  /**
   * Create a connection
   * 
   * @param webBackendConnectionCreate  (required)
   * @return ApiResponse&lt;WebBackendConnectionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendConnectionRead> webBackendCreateConnectionWithHttpInfo(WebBackendConnectionCreate webBackendConnectionCreate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendCreateConnectionRequestBuilder(webBackendConnectionCreate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendCreateConnection", localVarResponse);
        }
        return new ApiResponse<WebBackendConnectionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendConnectionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendCreateConnectionRequestBuilder(WebBackendConnectionCreate webBackendConnectionCreate) throws ApiException {
    // verify the required parameter 'webBackendConnectionCreate' is set
    if (webBackendConnectionCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'webBackendConnectionCreate' when calling webBackendCreateConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/connections/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webBackendConnectionCreate);
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
   * Get a connection
   * 
   * @param webBackendConnectionRequestBody  (required)
   * @return WebBackendConnectionRead
   * @throws ApiException if fails to make API call
   */
  public WebBackendConnectionRead webBackendGetConnection(WebBackendConnectionRequestBody webBackendConnectionRequestBody) throws ApiException {
    ApiResponse<WebBackendConnectionRead> localVarResponse = webBackendGetConnectionWithHttpInfo(webBackendConnectionRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Get a connection
   * 
   * @param webBackendConnectionRequestBody  (required)
   * @return ApiResponse&lt;WebBackendConnectionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendConnectionRead> webBackendGetConnectionWithHttpInfo(WebBackendConnectionRequestBody webBackendConnectionRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendGetConnectionRequestBuilder(webBackendConnectionRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendGetConnection", localVarResponse);
        }
        return new ApiResponse<WebBackendConnectionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendConnectionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendGetConnectionRequestBuilder(WebBackendConnectionRequestBody webBackendConnectionRequestBody) throws ApiException {
    // verify the required parameter 'webBackendConnectionRequestBody' is set
    if (webBackendConnectionRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webBackendConnectionRequestBody' when calling webBackendGetConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/connections/get";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webBackendConnectionRequestBody);
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
   * Returns the current state of a workspace
   * 
   * @param webBackendWorkspaceState  (optional)
   * @return WebBackendWorkspaceStateResult
   * @throws ApiException if fails to make API call
   */
  public WebBackendWorkspaceStateResult webBackendGetWorkspaceState(WebBackendWorkspaceState webBackendWorkspaceState) throws ApiException {
    ApiResponse<WebBackendWorkspaceStateResult> localVarResponse = webBackendGetWorkspaceStateWithHttpInfo(webBackendWorkspaceState);
    return localVarResponse.getData();
  }

  /**
   * Returns the current state of a workspace
   * 
   * @param webBackendWorkspaceState  (optional)
   * @return ApiResponse&lt;WebBackendWorkspaceStateResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendWorkspaceStateResult> webBackendGetWorkspaceStateWithHttpInfo(WebBackendWorkspaceState webBackendWorkspaceState) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendGetWorkspaceStateRequestBuilder(webBackendWorkspaceState);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendGetWorkspaceState", localVarResponse);
        }
        return new ApiResponse<WebBackendWorkspaceStateResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendWorkspaceStateResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendGetWorkspaceStateRequestBuilder(WebBackendWorkspaceState webBackendWorkspaceState) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/workspace/state";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webBackendWorkspaceState);
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
   * Returns all non-deleted connections for a workspace.
   * 
   * @param webBackendConnectionListRequestBody  (required)
   * @return WebBackendConnectionReadList
   * @throws ApiException if fails to make API call
   */
  public WebBackendConnectionReadList webBackendListConnectionsForWorkspace(WebBackendConnectionListRequestBody webBackendConnectionListRequestBody) throws ApiException {
    ApiResponse<WebBackendConnectionReadList> localVarResponse = webBackendListConnectionsForWorkspaceWithHttpInfo(webBackendConnectionListRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Returns all non-deleted connections for a workspace.
   * 
   * @param webBackendConnectionListRequestBody  (required)
   * @return ApiResponse&lt;WebBackendConnectionReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendConnectionReadList> webBackendListConnectionsForWorkspaceWithHttpInfo(WebBackendConnectionListRequestBody webBackendConnectionListRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendListConnectionsForWorkspaceRequestBuilder(webBackendConnectionListRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendListConnectionsForWorkspace", localVarResponse);
        }
        return new ApiResponse<WebBackendConnectionReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendConnectionReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendListConnectionsForWorkspaceRequestBuilder(WebBackendConnectionListRequestBody webBackendConnectionListRequestBody) throws ApiException {
    // verify the required parameter 'webBackendConnectionListRequestBody' is set
    if (webBackendConnectionListRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'webBackendConnectionListRequestBody' when calling webBackendListConnectionsForWorkspace");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/connections/list";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webBackendConnectionListRequestBody);
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
   * Returns available geographies can be selected to run data syncs in a particular geography. The &#39;auto&#39; entry indicates that the sync will be automatically assigned to a geography according to the platform default behavior. Entries other than &#39;auto&#39; are two-letter country codes that follow the ISO 3166-1 alpha-2 standard. 
   * Returns all available geographies in which a data sync can run.
   * @return WebBackendGeographiesListResult
   * @throws ApiException if fails to make API call
   */
  public WebBackendGeographiesListResult webBackendListGeographies() throws ApiException {
    ApiResponse<WebBackendGeographiesListResult> localVarResponse = webBackendListGeographiesWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Returns available geographies can be selected to run data syncs in a particular geography. The &#39;auto&#39; entry indicates that the sync will be automatically assigned to a geography according to the platform default behavior. Entries other than &#39;auto&#39; are two-letter country codes that follow the ISO 3166-1 alpha-2 standard. 
   * Returns all available geographies in which a data sync can run.
   * @return ApiResponse&lt;WebBackendGeographiesListResult&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendGeographiesListResult> webBackendListGeographiesWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendListGeographiesRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendListGeographies", localVarResponse);
        }
        return new ApiResponse<WebBackendGeographiesListResult>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendGeographiesListResult>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendListGeographiesRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/geographies/list";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update a connection
   * Apply a patch-style update to a connection. Only fields present on the update request body will be updated. Any operations that lack an ID will be created. Then, the newly created operationId will be applied to the connection along with the rest of the operationIds in the request body. Apply a patch-style update to a connection. Only fields present on the update request body will be updated. Note that if a catalog is present in the request body, the connection&#39;s entire catalog will be replaced with the catalog from the request. This means that to modify a single stream, the entire new catalog containing the updated stream needs to be sent. 
   * @param webBackendConnectionUpdate  (required)
   * @return WebBackendConnectionRead
   * @throws ApiException if fails to make API call
   */
  public WebBackendConnectionRead webBackendUpdateConnection(WebBackendConnectionUpdate webBackendConnectionUpdate) throws ApiException {
    ApiResponse<WebBackendConnectionRead> localVarResponse = webBackendUpdateConnectionWithHttpInfo(webBackendConnectionUpdate);
    return localVarResponse.getData();
  }

  /**
   * Update a connection
   * Apply a patch-style update to a connection. Only fields present on the update request body will be updated. Any operations that lack an ID will be created. Then, the newly created operationId will be applied to the connection along with the rest of the operationIds in the request body. Apply a patch-style update to a connection. Only fields present on the update request body will be updated. Note that if a catalog is present in the request body, the connection&#39;s entire catalog will be replaced with the catalog from the request. This means that to modify a single stream, the entire new catalog containing the updated stream needs to be sent. 
   * @param webBackendConnectionUpdate  (required)
   * @return ApiResponse&lt;WebBackendConnectionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebBackendConnectionRead> webBackendUpdateConnectionWithHttpInfo(WebBackendConnectionUpdate webBackendConnectionUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = webBackendUpdateConnectionRequestBuilder(webBackendConnectionUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("webBackendUpdateConnection", localVarResponse);
        }
        return new ApiResponse<WebBackendConnectionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<WebBackendConnectionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder webBackendUpdateConnectionRequestBuilder(WebBackendConnectionUpdate webBackendConnectionUpdate) throws ApiException {
    // verify the required parameter 'webBackendConnectionUpdate' is set
    if (webBackendConnectionUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'webBackendConnectionUpdate' when calling webBackendUpdateConnection");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/web_backend/connections/update";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webBackendConnectionUpdate);
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
