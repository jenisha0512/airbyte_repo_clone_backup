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

import io.airbyte.api.client.model.generated.CheckConnectionRead;
import io.airbyte.api.client.model.generated.DestinationCloneRequestBody;
import io.airbyte.api.client.model.generated.DestinationCreate;
import io.airbyte.api.client.model.generated.DestinationIdRequestBody;
import io.airbyte.api.client.model.generated.DestinationRead;
import io.airbyte.api.client.model.generated.DestinationReadList;
import io.airbyte.api.client.model.generated.DestinationSearch;
import io.airbyte.api.client.model.generated.DestinationUpdate;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.WorkspaceIdRequestBody;

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
public class DestinationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public DestinationApi() {
    this(new ApiClient());
  }

  public DestinationApi(ApiClient apiClient) {
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
   * Check connection to the destination
   * 
   * @param destinationIdRequestBody  (required)
   * @return CheckConnectionRead
   * @throws ApiException if fails to make API call
   */
  public CheckConnectionRead checkConnectionToDestination(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    ApiResponse<CheckConnectionRead> localVarResponse = checkConnectionToDestinationWithHttpInfo(destinationIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Check connection to the destination
   * 
   * @param destinationIdRequestBody  (required)
   * @return ApiResponse&lt;CheckConnectionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CheckConnectionRead> checkConnectionToDestinationWithHttpInfo(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = checkConnectionToDestinationRequestBuilder(destinationIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("checkConnectionToDestination", localVarResponse);
        }
        return new ApiResponse<CheckConnectionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CheckConnectionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder checkConnectionToDestinationRequestBuilder(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    // verify the required parameter 'destinationIdRequestBody' is set
    if (destinationIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationIdRequestBody' when calling checkConnectionToDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/check_connection";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationIdRequestBody);
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
   * Check connection for a proposed update to a destination
   * 
   * @param destinationUpdate  (required)
   * @return CheckConnectionRead
   * @throws ApiException if fails to make API call
   */
  public CheckConnectionRead checkConnectionToDestinationForUpdate(DestinationUpdate destinationUpdate) throws ApiException {
    ApiResponse<CheckConnectionRead> localVarResponse = checkConnectionToDestinationForUpdateWithHttpInfo(destinationUpdate);
    return localVarResponse.getData();
  }

  /**
   * Check connection for a proposed update to a destination
   * 
   * @param destinationUpdate  (required)
   * @return ApiResponse&lt;CheckConnectionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CheckConnectionRead> checkConnectionToDestinationForUpdateWithHttpInfo(DestinationUpdate destinationUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = checkConnectionToDestinationForUpdateRequestBuilder(destinationUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("checkConnectionToDestinationForUpdate", localVarResponse);
        }
        return new ApiResponse<CheckConnectionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CheckConnectionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder checkConnectionToDestinationForUpdateRequestBuilder(DestinationUpdate destinationUpdate) throws ApiException {
    // verify the required parameter 'destinationUpdate' is set
    if (destinationUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationUpdate' when calling checkConnectionToDestinationForUpdate");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/check_connection_for_update";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationUpdate);
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
   * Clone destination
   * 
   * @param destinationCloneRequestBody  (required)
   * @return DestinationRead
   * @throws ApiException if fails to make API call
   */
  public DestinationRead cloneDestination(DestinationCloneRequestBody destinationCloneRequestBody) throws ApiException {
    ApiResponse<DestinationRead> localVarResponse = cloneDestinationWithHttpInfo(destinationCloneRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Clone destination
   * 
   * @param destinationCloneRequestBody  (required)
   * @return ApiResponse&lt;DestinationRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationRead> cloneDestinationWithHttpInfo(DestinationCloneRequestBody destinationCloneRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = cloneDestinationRequestBuilder(destinationCloneRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("cloneDestination", localVarResponse);
        }
        return new ApiResponse<DestinationRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder cloneDestinationRequestBuilder(DestinationCloneRequestBody destinationCloneRequestBody) throws ApiException {
    // verify the required parameter 'destinationCloneRequestBody' is set
    if (destinationCloneRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationCloneRequestBody' when calling cloneDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/clone";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationCloneRequestBody);
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
   * Create a destination
   * 
   * @param destinationCreate  (required)
   * @return DestinationRead
   * @throws ApiException if fails to make API call
   */
  public DestinationRead createDestination(DestinationCreate destinationCreate) throws ApiException {
    ApiResponse<DestinationRead> localVarResponse = createDestinationWithHttpInfo(destinationCreate);
    return localVarResponse.getData();
  }

  /**
   * Create a destination
   * 
   * @param destinationCreate  (required)
   * @return ApiResponse&lt;DestinationRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationRead> createDestinationWithHttpInfo(DestinationCreate destinationCreate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createDestinationRequestBuilder(destinationCreate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createDestination", localVarResponse);
        }
        return new ApiResponse<DestinationRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createDestinationRequestBuilder(DestinationCreate destinationCreate) throws ApiException {
    // verify the required parameter 'destinationCreate' is set
    if (destinationCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationCreate' when calling createDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationCreate);
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
   * Delete the destination
   * 
   * @param destinationIdRequestBody  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDestination(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    deleteDestinationWithHttpInfo(destinationIdRequestBody);
  }

  /**
   * Delete the destination
   * 
   * @param destinationIdRequestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteDestinationWithHttpInfo(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteDestinationRequestBuilder(destinationIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteDestination", localVarResponse);
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

  private HttpRequest.Builder deleteDestinationRequestBuilder(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    // verify the required parameter 'destinationIdRequestBody' is set
    if (destinationIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationIdRequestBody' when calling deleteDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/delete";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationIdRequestBody);
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
   * Get configured destination
   * 
   * @param destinationIdRequestBody  (required)
   * @return DestinationRead
   * @throws ApiException if fails to make API call
   */
  public DestinationRead getDestination(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    ApiResponse<DestinationRead> localVarResponse = getDestinationWithHttpInfo(destinationIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Get configured destination
   * 
   * @param destinationIdRequestBody  (required)
   * @return ApiResponse&lt;DestinationRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationRead> getDestinationWithHttpInfo(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDestinationRequestBuilder(destinationIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getDestination", localVarResponse);
        }
        return new ApiResponse<DestinationRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getDestinationRequestBuilder(DestinationIdRequestBody destinationIdRequestBody) throws ApiException {
    // verify the required parameter 'destinationIdRequestBody' is set
    if (destinationIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationIdRequestBody' when calling getDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/get";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationIdRequestBody);
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
   * List configured destinations for a workspace
   * 
   * @param workspaceIdRequestBody  (required)
   * @return DestinationReadList
   * @throws ApiException if fails to make API call
   */
  public DestinationReadList listDestinationsForWorkspace(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    ApiResponse<DestinationReadList> localVarResponse = listDestinationsForWorkspaceWithHttpInfo(workspaceIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * List configured destinations for a workspace
   * 
   * @param workspaceIdRequestBody  (required)
   * @return ApiResponse&lt;DestinationReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationReadList> listDestinationsForWorkspaceWithHttpInfo(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listDestinationsForWorkspaceRequestBuilder(workspaceIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listDestinationsForWorkspace", localVarResponse);
        }
        return new ApiResponse<DestinationReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listDestinationsForWorkspaceRequestBuilder(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    // verify the required parameter 'workspaceIdRequestBody' is set
    if (workspaceIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceIdRequestBody' when calling listDestinationsForWorkspace");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/list";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(workspaceIdRequestBody);
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
   * Search destinations
   * 
   * @param destinationSearch  (required)
   * @return DestinationReadList
   * @throws ApiException if fails to make API call
   */
  public DestinationReadList searchDestinations(DestinationSearch destinationSearch) throws ApiException {
    ApiResponse<DestinationReadList> localVarResponse = searchDestinationsWithHttpInfo(destinationSearch);
    return localVarResponse.getData();
  }

  /**
   * Search destinations
   * 
   * @param destinationSearch  (required)
   * @return ApiResponse&lt;DestinationReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationReadList> searchDestinationsWithHttpInfo(DestinationSearch destinationSearch) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = searchDestinationsRequestBuilder(destinationSearch);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("searchDestinations", localVarResponse);
        }
        return new ApiResponse<DestinationReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder searchDestinationsRequestBuilder(DestinationSearch destinationSearch) throws ApiException {
    // verify the required parameter 'destinationSearch' is set
    if (destinationSearch == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationSearch' when calling searchDestinations");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/search";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationSearch);
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
   * Update a destination
   * 
   * @param destinationUpdate  (required)
   * @return DestinationRead
   * @throws ApiException if fails to make API call
   */
  public DestinationRead updateDestination(DestinationUpdate destinationUpdate) throws ApiException {
    ApiResponse<DestinationRead> localVarResponse = updateDestinationWithHttpInfo(destinationUpdate);
    return localVarResponse.getData();
  }

  /**
   * Update a destination
   * 
   * @param destinationUpdate  (required)
   * @return ApiResponse&lt;DestinationRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DestinationRead> updateDestinationWithHttpInfo(DestinationUpdate destinationUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateDestinationRequestBuilder(destinationUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateDestination", localVarResponse);
        }
        return new ApiResponse<DestinationRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DestinationRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder updateDestinationRequestBuilder(DestinationUpdate destinationUpdate) throws ApiException {
    // verify the required parameter 'destinationUpdate' is set
    if (destinationUpdate == null) {
      throw new ApiException(400, "Missing the required parameter 'destinationUpdate' when calling updateDestination");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/destinations/update";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(destinationUpdate);
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
