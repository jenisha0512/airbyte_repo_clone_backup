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

import io.airbyte.api.client.model.generated.CustomSourceDefinitionCreate;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.PrivateSourceDefinitionRead;
import io.airbyte.api.client.model.generated.PrivateSourceDefinitionReadList;
import io.airbyte.api.client.model.generated.SourceDefinitionIdRequestBody;
import io.airbyte.api.client.model.generated.SourceDefinitionIdWithWorkspaceId;
import io.airbyte.api.client.model.generated.SourceDefinitionRead;
import io.airbyte.api.client.model.generated.SourceDefinitionReadList;
import io.airbyte.api.client.model.generated.SourceDefinitionUpdate;
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
public class SourceDefinitionApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SourceDefinitionApi() {
    this(new ApiClient());
  }

  public SourceDefinitionApi(ApiClient apiClient) {
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
   * Creates a custom sourceDefinition for the given workspace
   * 
   * @param customSourceDefinitionCreate  (optional)
   * @return SourceDefinitionRead
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionRead createCustomSourceDefinition(CustomSourceDefinitionCreate customSourceDefinitionCreate) throws ApiException {
    ApiResponse<SourceDefinitionRead> localVarResponse = createCustomSourceDefinitionWithHttpInfo(customSourceDefinitionCreate);
    return localVarResponse.getData();
  }

  /**
   * Creates a custom sourceDefinition for the given workspace
   * 
   * @param customSourceDefinitionCreate  (optional)
   * @return ApiResponse&lt;SourceDefinitionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionRead> createCustomSourceDefinitionWithHttpInfo(CustomSourceDefinitionCreate customSourceDefinitionCreate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createCustomSourceDefinitionRequestBuilder(customSourceDefinitionCreate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createCustomSourceDefinition", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createCustomSourceDefinitionRequestBuilder(CustomSourceDefinitionCreate customSourceDefinitionCreate) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/create_custom";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(customSourceDefinitionCreate);
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
   * Delete a source definition
   * 
   * @param sourceDefinitionIdRequestBody  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSourceDefinition(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    deleteSourceDefinitionWithHttpInfo(sourceDefinitionIdRequestBody);
  }

  /**
   * Delete a source definition
   * 
   * @param sourceDefinitionIdRequestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteSourceDefinitionWithHttpInfo(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteSourceDefinitionRequestBuilder(sourceDefinitionIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteSourceDefinition", localVarResponse);
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

  private HttpRequest.Builder deleteSourceDefinitionRequestBuilder(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    // verify the required parameter 'sourceDefinitionIdRequestBody' is set
    if (sourceDefinitionIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceDefinitionIdRequestBody' when calling deleteSourceDefinition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/delete";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionIdRequestBody);
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
   * Get source
   * 
   * @param sourceDefinitionIdRequestBody  (required)
   * @return SourceDefinitionRead
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionRead getSourceDefinition(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    ApiResponse<SourceDefinitionRead> localVarResponse = getSourceDefinitionWithHttpInfo(sourceDefinitionIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * Get source
   * 
   * @param sourceDefinitionIdRequestBody  (required)
   * @return ApiResponse&lt;SourceDefinitionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionRead> getSourceDefinitionWithHttpInfo(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSourceDefinitionRequestBuilder(sourceDefinitionIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSourceDefinition", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getSourceDefinitionRequestBuilder(SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody) throws ApiException {
    // verify the required parameter 'sourceDefinitionIdRequestBody' is set
    if (sourceDefinitionIdRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceDefinitionIdRequestBody' when calling getSourceDefinition");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/get";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionIdRequestBody);
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
   * Get a sourceDefinition that is configured for the given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @return SourceDefinitionRead
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionRead getSourceDefinitionForWorkspace(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    ApiResponse<SourceDefinitionRead> localVarResponse = getSourceDefinitionForWorkspaceWithHttpInfo(sourceDefinitionIdWithWorkspaceId);
    return localVarResponse.getData();
  }

  /**
   * Get a sourceDefinition that is configured for the given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @return ApiResponse&lt;SourceDefinitionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionRead> getSourceDefinitionForWorkspaceWithHttpInfo(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSourceDefinitionForWorkspaceRequestBuilder(sourceDefinitionIdWithWorkspaceId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSourceDefinitionForWorkspace", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getSourceDefinitionForWorkspaceRequestBuilder(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    // verify the required parameter 'sourceDefinitionIdWithWorkspaceId' is set
    if (sourceDefinitionIdWithWorkspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceDefinitionIdWithWorkspaceId' when calling getSourceDefinitionForWorkspace");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/get_for_workspace";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionIdWithWorkspaceId);
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
   * grant a private, non-custom sourceDefinition to a given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @return PrivateSourceDefinitionRead
   * @throws ApiException if fails to make API call
   */
  public PrivateSourceDefinitionRead grantSourceDefinitionToWorkspace(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    ApiResponse<PrivateSourceDefinitionRead> localVarResponse = grantSourceDefinitionToWorkspaceWithHttpInfo(sourceDefinitionIdWithWorkspaceId);
    return localVarResponse.getData();
  }

  /**
   * grant a private, non-custom sourceDefinition to a given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @return ApiResponse&lt;PrivateSourceDefinitionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateSourceDefinitionRead> grantSourceDefinitionToWorkspaceWithHttpInfo(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = grantSourceDefinitionToWorkspaceRequestBuilder(sourceDefinitionIdWithWorkspaceId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("grantSourceDefinitionToWorkspace", localVarResponse);
        }
        return new ApiResponse<PrivateSourceDefinitionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PrivateSourceDefinitionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder grantSourceDefinitionToWorkspaceRequestBuilder(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    // verify the required parameter 'sourceDefinitionIdWithWorkspaceId' is set
    if (sourceDefinitionIdWithWorkspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceDefinitionIdWithWorkspaceId' when calling grantSourceDefinitionToWorkspace");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/grant_definition";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionIdWithWorkspaceId);
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
   * List the latest sourceDefinitions Airbyte supports
   * Guaranteed to retrieve the latest information on supported sources.
   * @return SourceDefinitionReadList
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionReadList listLatestSourceDefinitions() throws ApiException {
    ApiResponse<SourceDefinitionReadList> localVarResponse = listLatestSourceDefinitionsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List the latest sourceDefinitions Airbyte supports
   * Guaranteed to retrieve the latest information on supported sources.
   * @return ApiResponse&lt;SourceDefinitionReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionReadList> listLatestSourceDefinitionsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listLatestSourceDefinitionsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listLatestSourceDefinitions", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listLatestSourceDefinitionsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/list_latest";

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
   * List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace&#39;s grants.
   * 
   * @param workspaceIdRequestBody  (optional)
   * @return PrivateSourceDefinitionReadList
   * @throws ApiException if fails to make API call
   */
  public PrivateSourceDefinitionReadList listPrivateSourceDefinitions(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    ApiResponse<PrivateSourceDefinitionReadList> localVarResponse = listPrivateSourceDefinitionsWithHttpInfo(workspaceIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace&#39;s grants.
   * 
   * @param workspaceIdRequestBody  (optional)
   * @return ApiResponse&lt;PrivateSourceDefinitionReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateSourceDefinitionReadList> listPrivateSourceDefinitionsWithHttpInfo(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listPrivateSourceDefinitionsRequestBuilder(workspaceIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listPrivateSourceDefinitions", localVarResponse);
        }
        return new ApiResponse<PrivateSourceDefinitionReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PrivateSourceDefinitionReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listPrivateSourceDefinitionsRequestBuilder(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/list_private";

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
   * List all the sourceDefinitions the current Airbyte deployment is configured to use
   * 
   * @return SourceDefinitionReadList
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionReadList listSourceDefinitions() throws ApiException {
    ApiResponse<SourceDefinitionReadList> localVarResponse = listSourceDefinitionsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List all the sourceDefinitions the current Airbyte deployment is configured to use
   * 
   * @return ApiResponse&lt;SourceDefinitionReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionReadList> listSourceDefinitionsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listSourceDefinitionsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listSourceDefinitions", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listSourceDefinitionsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/list";

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
   * List all the sourceDefinitions the given workspace is configured to use
   * 
   * @param workspaceIdRequestBody  (optional)
   * @return SourceDefinitionReadList
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionReadList listSourceDefinitionsForWorkspace(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    ApiResponse<SourceDefinitionReadList> localVarResponse = listSourceDefinitionsForWorkspaceWithHttpInfo(workspaceIdRequestBody);
    return localVarResponse.getData();
  }

  /**
   * List all the sourceDefinitions the given workspace is configured to use
   * 
   * @param workspaceIdRequestBody  (optional)
   * @return ApiResponse&lt;SourceDefinitionReadList&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionReadList> listSourceDefinitionsForWorkspaceWithHttpInfo(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listSourceDefinitionsForWorkspaceRequestBuilder(workspaceIdRequestBody);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listSourceDefinitionsForWorkspace", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionReadList>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionReadList>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder listSourceDefinitionsForWorkspaceRequestBuilder(WorkspaceIdRequestBody workspaceIdRequestBody) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/list_for_workspace";

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
   * revoke a grant to a private, non-custom sourceDefinition from a given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @throws ApiException if fails to make API call
   */
  public void revokeSourceDefinitionFromWorkspace(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    revokeSourceDefinitionFromWorkspaceWithHttpInfo(sourceDefinitionIdWithWorkspaceId);
  }

  /**
   * revoke a grant to a private, non-custom sourceDefinition from a given workspace
   * 
   * @param sourceDefinitionIdWithWorkspaceId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> revokeSourceDefinitionFromWorkspaceWithHttpInfo(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = revokeSourceDefinitionFromWorkspaceRequestBuilder(sourceDefinitionIdWithWorkspaceId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("revokeSourceDefinitionFromWorkspace", localVarResponse);
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

  private HttpRequest.Builder revokeSourceDefinitionFromWorkspaceRequestBuilder(SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId) throws ApiException {
    // verify the required parameter 'sourceDefinitionIdWithWorkspaceId' is set
    if (sourceDefinitionIdWithWorkspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceDefinitionIdWithWorkspaceId' when calling revokeSourceDefinitionFromWorkspace");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/revoke_definition";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionIdWithWorkspaceId);
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
   * Update a sourceDefinition
   * 
   * @param sourceDefinitionUpdate  (optional)
   * @return SourceDefinitionRead
   * @throws ApiException if fails to make API call
   */
  public SourceDefinitionRead updateSourceDefinition(SourceDefinitionUpdate sourceDefinitionUpdate) throws ApiException {
    ApiResponse<SourceDefinitionRead> localVarResponse = updateSourceDefinitionWithHttpInfo(sourceDefinitionUpdate);
    return localVarResponse.getData();
  }

  /**
   * Update a sourceDefinition
   * 
   * @param sourceDefinitionUpdate  (optional)
   * @return ApiResponse&lt;SourceDefinitionRead&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SourceDefinitionRead> updateSourceDefinitionWithHttpInfo(SourceDefinitionUpdate sourceDefinitionUpdate) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateSourceDefinitionRequestBuilder(sourceDefinitionUpdate);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateSourceDefinition", localVarResponse);
        }
        return new ApiResponse<SourceDefinitionRead>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SourceDefinitionRead>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder updateSourceDefinitionRequestBuilder(SourceDefinitionUpdate sourceDefinitionUpdate) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/source_definitions/update";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sourceDefinitionUpdate);
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
