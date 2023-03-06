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


package io.airbyte.api.client.model.generated;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.api.client.model.generated.DbMigrationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbMigrationRead
 */
@JsonPropertyOrder({
  DbMigrationRead.JSON_PROPERTY_MIGRATION_TYPE,
  DbMigrationRead.JSON_PROPERTY_MIGRATION_VERSION,
  DbMigrationRead.JSON_PROPERTY_MIGRATION_DESCRIPTION,
  DbMigrationRead.JSON_PROPERTY_MIGRATION_STATE,
  DbMigrationRead.JSON_PROPERTY_MIGRATED_BY,
  DbMigrationRead.JSON_PROPERTY_MIGRATED_AT,
  DbMigrationRead.JSON_PROPERTY_MIGRATION_SCRIPT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class DbMigrationRead {
  public static final String JSON_PROPERTY_MIGRATION_TYPE = "migrationType";
  private String migrationType;

  public static final String JSON_PROPERTY_MIGRATION_VERSION = "migrationVersion";
  private String migrationVersion;

  public static final String JSON_PROPERTY_MIGRATION_DESCRIPTION = "migrationDescription";
  private String migrationDescription;

  public static final String JSON_PROPERTY_MIGRATION_STATE = "migrationState";
  private DbMigrationState migrationState;

  public static final String JSON_PROPERTY_MIGRATED_BY = "migratedBy";
  private String migratedBy;

  public static final String JSON_PROPERTY_MIGRATED_AT = "migratedAt";
  private Long migratedAt;

  public static final String JSON_PROPERTY_MIGRATION_SCRIPT = "migrationScript";
  private String migrationScript;

  public DbMigrationRead() { 
  }

  public DbMigrationRead migrationType(String migrationType) {
    this.migrationType = migrationType;
    return this;
  }

   /**
   * Get migrationType
   * @return migrationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMigrationType() {
    return migrationType;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMigrationType(String migrationType) {
    this.migrationType = migrationType;
  }


  public DbMigrationRead migrationVersion(String migrationVersion) {
    this.migrationVersion = migrationVersion;
    return this;
  }

   /**
   * Get migrationVersion
   * @return migrationVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMigrationVersion() {
    return migrationVersion;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMigrationVersion(String migrationVersion) {
    this.migrationVersion = migrationVersion;
  }


  public DbMigrationRead migrationDescription(String migrationDescription) {
    this.migrationDescription = migrationDescription;
    return this;
  }

   /**
   * Get migrationDescription
   * @return migrationDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMigrationDescription() {
    return migrationDescription;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMigrationDescription(String migrationDescription) {
    this.migrationDescription = migrationDescription;
  }


  public DbMigrationRead migrationState(DbMigrationState migrationState) {
    this.migrationState = migrationState;
    return this;
  }

   /**
   * Get migrationState
   * @return migrationState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbMigrationState getMigrationState() {
    return migrationState;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigrationState(DbMigrationState migrationState) {
    this.migrationState = migrationState;
  }


  public DbMigrationRead migratedBy(String migratedBy) {
    this.migratedBy = migratedBy;
    return this;
  }

   /**
   * Get migratedBy
   * @return migratedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMigratedBy() {
    return migratedBy;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigratedBy(String migratedBy) {
    this.migratedBy = migratedBy;
  }


  public DbMigrationRead migratedAt(Long migratedAt) {
    this.migratedAt = migratedAt;
    return this;
  }

   /**
   * Get migratedAt
   * @return migratedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMigratedAt() {
    return migratedAt;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigratedAt(Long migratedAt) {
    this.migratedAt = migratedAt;
  }


  public DbMigrationRead migrationScript(String migrationScript) {
    this.migrationScript = migrationScript;
    return this;
  }

   /**
   * Get migrationScript
   * @return migrationScript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIGRATION_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMigrationScript() {
    return migrationScript;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigrationScript(String migrationScript) {
    this.migrationScript = migrationScript;
  }


  /**
   * Return true if this DbMigrationRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbMigrationRead dbMigrationRead = (DbMigrationRead) o;
    return Objects.equals(this.migrationType, dbMigrationRead.migrationType) &&
        Objects.equals(this.migrationVersion, dbMigrationRead.migrationVersion) &&
        Objects.equals(this.migrationDescription, dbMigrationRead.migrationDescription) &&
        Objects.equals(this.migrationState, dbMigrationRead.migrationState) &&
        Objects.equals(this.migratedBy, dbMigrationRead.migratedBy) &&
        Objects.equals(this.migratedAt, dbMigrationRead.migratedAt) &&
        Objects.equals(this.migrationScript, dbMigrationRead.migrationScript);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationType, migrationVersion, migrationDescription, migrationState, migratedBy, migratedAt, migrationScript);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbMigrationRead {\n");
    sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
    sb.append("    migrationVersion: ").append(toIndentedString(migrationVersion)).append("\n");
    sb.append("    migrationDescription: ").append(toIndentedString(migrationDescription)).append("\n");
    sb.append("    migrationState: ").append(toIndentedString(migrationState)).append("\n");
    sb.append("    migratedBy: ").append(toIndentedString(migratedBy)).append("\n");
    sb.append("    migratedAt: ").append(toIndentedString(migratedAt)).append("\n");
    sb.append("    migrationScript: ").append(toIndentedString(migrationScript)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
