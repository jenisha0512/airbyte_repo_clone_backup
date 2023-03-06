package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final AppenderLibraryAccessors laccForAppenderLibraryAccessors = new AppenderLibraryAccessors(owner);
    private final AssertjLibraryAccessors laccForAssertjLibraryAccessors = new AssertjLibraryAccessors(owner);
    private final AwsLibraryAccessors laccForAwsLibraryAccessors = new AwsLibraryAccessors(owner);
    private final CommonsLibraryAccessors laccForCommonsLibraryAccessors = new CommonsLibraryAccessors(owner);
    private final ConnectorsLibraryAccessors laccForConnectorsLibraryAccessors = new ConnectorsLibraryAccessors(owner);
    private final DatadogLibraryAccessors laccForDatadogLibraryAccessors = new DatadogLibraryAccessors(owner);
    private final FindsecbugsLibraryAccessors laccForFindsecbugsLibraryAccessors = new FindsecbugsLibraryAccessors(owner);
    private final FlywayLibraryAccessors laccForFlywayLibraryAccessors = new FlywayLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final H2LibraryAccessors laccForH2LibraryAccessors = new H2LibraryAccessors(owner);
    private final HibernateLibraryAccessors laccForHibernateLibraryAccessors = new HibernateLibraryAccessors(owner);
    private final JacksonLibraryAccessors laccForJacksonLibraryAccessors = new JacksonLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final JavaLibraryAccessors laccForJavaLibraryAccessors = new JavaLibraryAccessors(owner);
    private final JavaxLibraryAccessors laccForJavaxLibraryAccessors = new JavaxLibraryAccessors(owner);
    private final JclLibraryAccessors laccForJclLibraryAccessors = new JclLibraryAccessors(owner);
    private final JmhLibraryAccessors laccForJmhLibraryAccessors = new JmhLibraryAccessors(owner);
    private final JooqLibraryAccessors laccForJooqLibraryAccessors = new JooqLibraryAccessors(owner);
    private final JulLibraryAccessors laccForJulLibraryAccessors = new JulLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final Log4jLibraryAccessors laccForLog4jLibraryAccessors = new Log4jLibraryAccessors(owner);
    private final MicrometerLibraryAccessors laccForMicrometerLibraryAccessors = new MicrometerLibraryAccessors(owner);
    private final MicronautLibraryAccessors laccForMicronautLibraryAccessors = new MicronautLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final OtelLibraryAccessors laccForOtelLibraryAccessors = new OtelLibraryAccessors(owner);
    private final PlatformLibraryAccessors laccForPlatformLibraryAccessors = new PlatformLibraryAccessors(owner);
    private final QuartzLibraryAccessors laccForQuartzLibraryAccessors = new QuartzLibraryAccessors(owner);
    private final ReactorLibraryAccessors laccForReactorLibraryAccessors = new ReactorLibraryAccessors(owner);
    private final Slf4jLibraryAccessors laccForSlf4jLibraryAccessors = new Slf4jLibraryAccessors(owner);
    private final SpotbugsLibraryAccessors laccForSpotbugsLibraryAccessors = new SpotbugsLibraryAccessors(owner);
    private final TemporalLibraryAccessors laccForTemporalLibraryAccessors = new TemporalLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects) {
        super(config, providers, objects);
    }

        /**
         * Creates a dependency provider for fasterxml (com.fasterxml.jackson:jackson-bom)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getFasterxml() { return create("fasterxml"); }

        /**
         * Creates a dependency provider for glassfish (org.glassfish.jersey:jackson-bom)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getGlassfish() { return create("glassfish"); }

        /**
         * Creates a dependency provider for guava (com.google.guava:guava)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getGuava() { return create("guava"); }

        /**
         * Creates a dependency provider for hikaricp (com.zaxxer:HikariCP)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getHikaricp() { return create("hikaricp"); }

        /**
         * Creates a dependency provider for launchdarkly (com.launchdarkly:launchdarkly-java-server-sdk)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getLaunchdarkly() { return create("launchdarkly"); }

        /**
         * Creates a dependency provider for lombok (org.projectlombok:lombok)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getLombok() { return create("lombok"); }

        /**
         * Creates a dependency provider for mockk (io.mockk:mockk)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockk() { return create("mockk"); }

        /**
         * Creates a dependency provider for postgresql (org.postgresql:postgresql)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getPostgresql() { return create("postgresql"); }

        /**
         * Creates a dependency provider for s3 (software.amazon.awssdk:s3)
         * This dependency was declared in catalog deps.toml
         */
        public Provider<MinimalExternalModuleDependency> getS3() { return create("s3"); }

    /**
     * Returns the group of libraries at apache
     */
    public ApacheLibraryAccessors getApache() { return laccForApacheLibraryAccessors; }

    /**
     * Returns the group of libraries at appender
     */
    public AppenderLibraryAccessors getAppender() { return laccForAppenderLibraryAccessors; }

    /**
     * Returns the group of libraries at assertj
     */
    public AssertjLibraryAccessors getAssertj() { return laccForAssertjLibraryAccessors; }

    /**
     * Returns the group of libraries at aws
     */
    public AwsLibraryAccessors getAws() { return laccForAwsLibraryAccessors; }

    /**
     * Returns the group of libraries at commons
     */
    public CommonsLibraryAccessors getCommons() { return laccForCommonsLibraryAccessors; }

    /**
     * Returns the group of libraries at connectors
     */
    public ConnectorsLibraryAccessors getConnectors() { return laccForConnectorsLibraryAccessors; }

    /**
     * Returns the group of libraries at datadog
     */
    public DatadogLibraryAccessors getDatadog() { return laccForDatadogLibraryAccessors; }

    /**
     * Returns the group of libraries at findsecbugs
     */
    public FindsecbugsLibraryAccessors getFindsecbugs() { return laccForFindsecbugsLibraryAccessors; }

    /**
     * Returns the group of libraries at flyway
     */
    public FlywayLibraryAccessors getFlyway() { return laccForFlywayLibraryAccessors; }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() { return laccForGoogleLibraryAccessors; }

    /**
     * Returns the group of libraries at h2
     */
    public H2LibraryAccessors getH2() { return laccForH2LibraryAccessors; }

    /**
     * Returns the group of libraries at hibernate
     */
    public HibernateLibraryAccessors getHibernate() { return laccForHibernateLibraryAccessors; }

    /**
     * Returns the group of libraries at jackson
     */
    public JacksonLibraryAccessors getJackson() { return laccForJacksonLibraryAccessors; }

    /**
     * Returns the group of libraries at jakarta
     */
    public JakartaLibraryAccessors getJakarta() { return laccForJakartaLibraryAccessors; }

    /**
     * Returns the group of libraries at java
     */
    public JavaLibraryAccessors getJava() { return laccForJavaLibraryAccessors; }

    /**
     * Returns the group of libraries at javax
     */
    public JavaxLibraryAccessors getJavax() { return laccForJavaxLibraryAccessors; }

    /**
     * Returns the group of libraries at jcl
     */
    public JclLibraryAccessors getJcl() { return laccForJclLibraryAccessors; }

    /**
     * Returns the group of libraries at jmh
     */
    public JmhLibraryAccessors getJmh() { return laccForJmhLibraryAccessors; }

    /**
     * Returns the group of libraries at jooq
     */
    public JooqLibraryAccessors getJooq() { return laccForJooqLibraryAccessors; }

    /**
     * Returns the group of libraries at jul
     */
    public JulLibraryAccessors getJul() { return laccForJulLibraryAccessors; }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() { return laccForJunitLibraryAccessors; }

    /**
     * Returns the group of libraries at log4j
     */
    public Log4jLibraryAccessors getLog4j() { return laccForLog4jLibraryAccessors; }

    /**
     * Returns the group of libraries at micrometer
     */
    public MicrometerLibraryAccessors getMicrometer() { return laccForMicrometerLibraryAccessors; }

    /**
     * Returns the group of libraries at micronaut
     */
    public MicronautLibraryAccessors getMicronaut() { return laccForMicronautLibraryAccessors; }

    /**
     * Returns the group of libraries at mockito
     */
    public MockitoLibraryAccessors getMockito() { return laccForMockitoLibraryAccessors; }

    /**
     * Returns the group of libraries at otel
     */
    public OtelLibraryAccessors getOtel() { return laccForOtelLibraryAccessors; }

    /**
     * Returns the group of libraries at platform
     */
    public PlatformLibraryAccessors getPlatform() { return laccForPlatformLibraryAccessors; }

    /**
     * Returns the group of libraries at quartz
     */
    public QuartzLibraryAccessors getQuartz() { return laccForQuartzLibraryAccessors; }

    /**
     * Returns the group of libraries at reactor
     */
    public ReactorLibraryAccessors getReactor() { return laccForReactorLibraryAccessors; }

    /**
     * Returns the group of libraries at slf4j
     */
    public Slf4jLibraryAccessors getSlf4j() { return laccForSlf4jLibraryAccessors; }

    /**
     * Returns the group of libraries at spotbugs
     */
    public SpotbugsLibraryAccessors getSpotbugs() { return laccForSpotbugsLibraryAccessors; }

    /**
     * Returns the group of libraries at temporal
     */
    public TemporalLibraryAccessors getTemporal() { return laccForTemporalLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {
        private final ApacheCommonsLibraryAccessors laccForApacheCommonsLibraryAccessors = new ApacheCommonsLibraryAccessors(owner);

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at apache.commons
         */
        public ApacheCommonsLibraryAccessors getCommons() { return laccForApacheCommonsLibraryAccessors; }

    }

    public static class ApacheCommonsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ApacheCommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for commons (org.apache.commons:commons-compress)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("apache.commons"); }

            /**
             * Creates a dependency provider for lang (org.apache.commons:commons-lang3)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getLang() { return create("apache.commons.lang"); }

    }

    public static class AppenderLibraryAccessors extends SubDependencyFactory {

        public AppenderLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for log4j2 (com.therealvan:appender-log4j2)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getLog4j2() { return create("appender.log4j2"); }

    }

    public static class AssertjLibraryAccessors extends SubDependencyFactory {

        public AssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.assertj:assertj-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("assertj.core"); }

    }

    public static class AwsLibraryAccessors extends SubDependencyFactory {
        private final AwsJavaLibraryAccessors laccForAwsJavaLibraryAccessors = new AwsJavaLibraryAccessors(owner);

        public AwsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at aws.java
         */
        public AwsJavaLibraryAccessors getJava() { return laccForAwsJavaLibraryAccessors; }

    }

    public static class AwsJavaLibraryAccessors extends SubDependencyFactory {
        private final AwsJavaSdkLibraryAccessors laccForAwsJavaSdkLibraryAccessors = new AwsJavaSdkLibraryAccessors(owner);

        public AwsJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at aws.java.sdk
         */
        public AwsJavaSdkLibraryAccessors getSdk() { return laccForAwsJavaSdkLibraryAccessors; }

    }

    public static class AwsJavaSdkLibraryAccessors extends SubDependencyFactory {

        public AwsJavaSdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for s3 (com.amazonaws:aws-java-sdk-s3)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getS3() { return create("aws.java.sdk.s3"); }

    }

    public static class CommonsLibraryAccessors extends SubDependencyFactory {

        public CommonsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for io (commons-io:commons-io)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getIo() { return create("commons.io"); }

    }

    public static class ConnectorsLibraryAccessors extends SubDependencyFactory {
        private final ConnectorsDestinationLibraryAccessors laccForConnectorsDestinationLibraryAccessors = new ConnectorsDestinationLibraryAccessors(owner);
        private final ConnectorsSourceLibraryAccessors laccForConnectorsSourceLibraryAccessors = new ConnectorsSourceLibraryAccessors(owner);
        private final ConnectorsTestcontainersLibraryAccessors laccForConnectorsTestcontainersLibraryAccessors = new ConnectorsTestcontainersLibraryAccessors(owner);

        public ConnectorsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at connectors.destination
         */
        public ConnectorsDestinationLibraryAccessors getDestination() { return laccForConnectorsDestinationLibraryAccessors; }

        /**
         * Returns the group of libraries at connectors.source
         */
        public ConnectorsSourceLibraryAccessors getSource() { return laccForConnectorsSourceLibraryAccessors; }

        /**
         * Returns the group of libraries at connectors.testcontainers
         */
        public ConnectorsTestcontainersLibraryAccessors getTestcontainers() { return laccForConnectorsTestcontainersLibraryAccessors; }

    }

    public static class ConnectorsDestinationLibraryAccessors extends SubDependencyFactory {
        private final ConnectorsDestinationTestcontainersLibraryAccessors laccForConnectorsDestinationTestcontainersLibraryAccessors = new ConnectorsDestinationTestcontainersLibraryAccessors(owner);

        public ConnectorsDestinationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at connectors.destination.testcontainers
         */
        public ConnectorsDestinationTestcontainersLibraryAccessors getTestcontainers() { return laccForConnectorsDestinationTestcontainersLibraryAccessors; }

    }

    public static class ConnectorsDestinationTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final ConnectorsDestinationTestcontainersOracleLibraryAccessors laccForConnectorsDestinationTestcontainersOracleLibraryAccessors = new ConnectorsDestinationTestcontainersOracleLibraryAccessors(owner);

        public ConnectorsDestinationTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for clickhouse (org.testcontainers:clickhouse)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getClickhouse() { return create("connectors.destination.testcontainers.clickhouse"); }

        /**
         * Returns the group of libraries at connectors.destination.testcontainers.oracle
         */
        public ConnectorsDestinationTestcontainersOracleLibraryAccessors getOracle() { return laccForConnectorsDestinationTestcontainersOracleLibraryAccessors; }

    }

    public static class ConnectorsDestinationTestcontainersOracleLibraryAccessors extends SubDependencyFactory {

        public ConnectorsDestinationTestcontainersOracleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xe (org.testcontainers:oracle-xe)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getXe() { return create("connectors.destination.testcontainers.oracle.xe"); }

    }

    public static class ConnectorsSourceLibraryAccessors extends SubDependencyFactory {
        private final ConnectorsSourceTestcontainersLibraryAccessors laccForConnectorsSourceTestcontainersLibraryAccessors = new ConnectorsSourceTestcontainersLibraryAccessors(owner);

        public ConnectorsSourceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at connectors.source.testcontainers
         */
        public ConnectorsSourceTestcontainersLibraryAccessors getTestcontainers() { return laccForConnectorsSourceTestcontainersLibraryAccessors; }

    }

    public static class ConnectorsSourceTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final ConnectorsSourceTestcontainersOracleLibraryAccessors laccForConnectorsSourceTestcontainersOracleLibraryAccessors = new ConnectorsSourceTestcontainersOracleLibraryAccessors(owner);

        public ConnectorsSourceTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for clickhouse (org.testcontainers:clickhouse)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getClickhouse() { return create("connectors.source.testcontainers.clickhouse"); }

        /**
         * Returns the group of libraries at connectors.source.testcontainers.oracle
         */
        public ConnectorsSourceTestcontainersOracleLibraryAccessors getOracle() { return laccForConnectorsSourceTestcontainersOracleLibraryAccessors; }

    }

    public static class ConnectorsSourceTestcontainersOracleLibraryAccessors extends SubDependencyFactory {

        public ConnectorsSourceTestcontainersOracleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xe (org.testcontainers:oracle-xe)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getXe() { return create("connectors.source.testcontainers.oracle.xe"); }

    }

    public static class ConnectorsTestcontainersLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ConnectorsTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for testcontainers (org.testcontainers:testcontainers)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("connectors.testcontainers"); }

            /**
             * Creates a dependency provider for cassandra (org.testcontainers:cassandra)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCassandra() { return create("connectors.testcontainers.cassandra"); }

            /**
             * Creates a dependency provider for cockroachdb (org.testcontainers:cockroachdb)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCockroachdb() { return create("connectors.testcontainers.cockroachdb"); }

            /**
             * Creates a dependency provider for db2 (org.testcontainers:db2)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDb2() { return create("connectors.testcontainers.db2"); }

            /**
             * Creates a dependency provider for elasticsearch (org.testcontainers:elasticsearch)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getElasticsearch() { return create("connectors.testcontainers.elasticsearch"); }

            /**
             * Creates a dependency provider for jdbc (org.testcontainers:jdbc)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdbc() { return create("connectors.testcontainers.jdbc"); }

            /**
             * Creates a dependency provider for kafka (org.testcontainers:kafka)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getKafka() { return create("connectors.testcontainers.kafka"); }

            /**
             * Creates a dependency provider for mariadb (org.testcontainers:mariadb)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getMariadb() { return create("connectors.testcontainers.mariadb"); }

            /**
             * Creates a dependency provider for mongodb (org.testcontainers:mongodb)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getMongodb() { return create("connectors.testcontainers.mongodb"); }

            /**
             * Creates a dependency provider for mssqlserver (org.testcontainers:mssqlserver)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getMssqlserver() { return create("connectors.testcontainers.mssqlserver"); }

            /**
             * Creates a dependency provider for mysql (org.testcontainers:mysql)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getMysql() { return create("connectors.testcontainers.mysql"); }

            /**
             * Creates a dependency provider for postgresql (org.testcontainers:postgresql)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getPostgresql() { return create("connectors.testcontainers.postgresql"); }

            /**
             * Creates a dependency provider for pulsar (org.testcontainers:pulsar)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getPulsar() { return create("connectors.testcontainers.pulsar"); }

            /**
             * Creates a dependency provider for scylla (org.testcontainers:testcontainers)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getScylla() { return create("connectors.testcontainers.scylla"); }

            /**
             * Creates a dependency provider for tidb (org.testcontainers:testcontainers)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTidb() { return create("connectors.testcontainers.tidb"); }

    }

    public static class DatadogLibraryAccessors extends SubDependencyFactory {
        private final DatadogTraceLibraryAccessors laccForDatadogTraceLibraryAccessors = new DatadogTraceLibraryAccessors(owner);

        public DatadogLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at datadog.trace
         */
        public DatadogTraceLibraryAccessors getTrace() { return laccForDatadogTraceLibraryAccessors; }

    }

    public static class DatadogTraceLibraryAccessors extends SubDependencyFactory {

        public DatadogTraceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (com.datadoghq:dd-trace-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("datadog.trace.api"); }

            /**
             * Creates a dependency provider for ot (com.datadoghq:dd-trace-ot)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getOt() { return create("datadog.trace.ot"); }

    }

    public static class FindsecbugsLibraryAccessors extends SubDependencyFactory {

        public FindsecbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.h3xstream.findsecbugs:findsecbugs-plugin)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("findsecbugs.plugin"); }

    }

    public static class FlywayLibraryAccessors extends SubDependencyFactory {

        public FlywayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.flywaydb:flyway-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("flyway.core"); }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleCloudLibraryAccessors laccForGoogleCloudLibraryAccessors = new GoogleCloudLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at google.cloud
         */
        public GoogleCloudLibraryAccessors getCloud() { return laccForGoogleCloudLibraryAccessors; }

    }

    public static class GoogleCloudLibraryAccessors extends SubDependencyFactory {

        public GoogleCloudLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for storage (com.google.cloud:google-cloud-storage)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getStorage() { return create("google.cloud.storage"); }

    }

    public static class H2LibraryAccessors extends SubDependencyFactory {

        public H2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for database (com.h2database:h2)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabase() { return create("h2.database"); }

    }

    public static class HibernateLibraryAccessors extends SubDependencyFactory {

        public HibernateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for types (com.vladmihalcea:hibernate-types-52)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTypes() { return create("hibernate.types"); }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.fasterxml.jackson.core:jackson-annotations)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("jackson.annotations"); }

            /**
             * Creates a dependency provider for databind (com.fasterxml.jackson.core:jackson-databind)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabind() { return create("jackson.databind"); }

            /**
             * Creates a dependency provider for dataformat (com.fasterxml.jackson.dataformat:jackson-dataformat-yaml)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDataformat() { return create("jackson.dataformat"); }

            /**
             * Creates a dependency provider for datatype (com.fasterxml.jackson.datatype:jackson-datatype-jsr310)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatatype() { return create("jackson.datatype"); }

            /**
             * Creates a dependency provider for kotlin (com.fasterxml.jackson.module:jackson-module-kotlin)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("jackson.kotlin"); }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for inject (jakarta.annotation:jakarta.annotation-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getInject() { return create("jakarta.inject"); }

    }

    public static class JavaLibraryAccessors extends SubDependencyFactory {
        private final JavaDogstatsdLibraryAccessors laccForJavaDogstatsdLibraryAccessors = new JavaDogstatsdLibraryAccessors(owner);

        public JavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at java.dogstatsd
         */
        public JavaDogstatsdLibraryAccessors getDogstatsd() { return laccForJavaDogstatsdLibraryAccessors; }

    }

    public static class JavaDogstatsdLibraryAccessors extends SubDependencyFactory {

        public JavaDogstatsdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (com.datadoghq:java-dogstatsd-client)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient() { return create("java.dogstatsd.client"); }

    }

    public static class JavaxLibraryAccessors extends SubDependencyFactory {

        public JavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for databind (javax.xml.bind:jaxb-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabind() { return create("javax.databind"); }

            /**
             * Creates a dependency provider for transaction (javax.transaction:javax.transaction-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTransaction() { return create("javax.transaction"); }

    }

    public static class JclLibraryAccessors extends SubDependencyFactory {
        private final JclOverLibraryAccessors laccForJclOverLibraryAccessors = new JclOverLibraryAccessors(owner);

        public JclLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jcl.over
         */
        public JclOverLibraryAccessors getOver() { return laccForJclOverLibraryAccessors; }

    }

    public static class JclOverLibraryAccessors extends SubDependencyFactory {

        public JclOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:jcl-over-slf4j)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("jcl.over.slf4j"); }

    }

    public static class JmhLibraryAccessors extends SubDependencyFactory {

        public JmhLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.openjdk.jmh:jmh-generator-annprocess)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("jmh.annotations"); }

            /**
             * Creates a dependency provider for core (org.openjdk.jmh:jmh-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("jmh.core"); }

    }

    public static class JooqLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JooqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jooq (org.jooq:jooq)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("jooq"); }

            /**
             * Creates a dependency provider for codegen (org.jooq:jooq-codegen)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCodegen() { return create("jooq.codegen"); }

            /**
             * Creates a dependency provider for meta (org.jooq:jooq-meta)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getMeta() { return create("jooq.meta"); }

    }

    public static class JulLibraryAccessors extends SubDependencyFactory {
        private final JulToLibraryAccessors laccForJulToLibraryAccessors = new JulToLibraryAccessors(owner);

        public JulLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jul.to
         */
        public JulToLibraryAccessors getTo() { return laccForJulToLibraryAccessors; }

    }

    public static class JulToLibraryAccessors extends SubDependencyFactory {

        public JulToLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:jul-to-slf4j)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("jul.to.slf4j"); }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {
        private final JunitJupiterLibraryAccessors laccForJunitJupiterLibraryAccessors = new JunitJupiterLibraryAccessors(owner);

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for pioneer (org.junit-pioneer:junit-pioneer)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getPioneer() { return create("junit.pioneer"); }

        /**
         * Returns the group of libraries at junit.jupiter
         */
        public JunitJupiterLibraryAccessors getJupiter() { return laccForJunitJupiterLibraryAccessors; }

    }

    public static class JunitJupiterLibraryAccessors extends SubDependencyFactory {
        private final JunitJupiterSystemLibraryAccessors laccForJunitJupiterSystemLibraryAccessors = new JunitJupiterSystemLibraryAccessors(owner);

        public JunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.junit.jupiter:junit-jupiter-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("junit.jupiter.api"); }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() { return create("junit.jupiter.engine"); }

            /**
             * Creates a dependency provider for params (org.junit.jupiter:junit-jupiter-params)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getParams() { return create("junit.jupiter.params"); }

        /**
         * Returns the group of libraries at junit.jupiter.system
         */
        public JunitJupiterSystemLibraryAccessors getSystem() { return laccForJunitJupiterSystemLibraryAccessors; }

    }

    public static class JunitJupiterSystemLibraryAccessors extends SubDependencyFactory {

        public JunitJupiterSystemLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stubs (uk.org.webcompere:system-stubs-jupiter)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getStubs() { return create("junit.jupiter.system.stubs"); }

    }

    public static class Log4jLibraryAccessors extends SubDependencyFactory {
        private final Log4jOverLibraryAccessors laccForLog4jOverLibraryAccessors = new Log4jOverLibraryAccessors(owner);

        public Log4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.apache.logging.log4j:log4j-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("log4j.api"); }

            /**
             * Creates a dependency provider for core (org.apache.logging.log4j:log4j-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("log4j.core"); }

            /**
             * Creates a dependency provider for impl (org.apache.logging.log4j:log4j-slf4j-impl)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getImpl() { return create("log4j.impl"); }

            /**
             * Creates a dependency provider for web (org.apache.logging.log4j:log4j-web)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getWeb() { return create("log4j.web"); }

        /**
         * Returns the group of libraries at log4j.over
         */
        public Log4jOverLibraryAccessors getOver() { return laccForLog4jOverLibraryAccessors; }

    }

    public static class Log4jOverLibraryAccessors extends SubDependencyFactory {

        public Log4jOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:log4j-over-slf4j)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() { return create("log4j.over.slf4j"); }

    }

    public static class MicrometerLibraryAccessors extends SubDependencyFactory {

        public MicrometerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for statsd (io.micrometer:micrometer-registry-statsd)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getStatsd() { return create("micrometer.statsd"); }

    }

    public static class MicronautLibraryAccessors extends SubDependencyFactory {
        private final MicronautCacheLibraryAccessors laccForMicronautCacheLibraryAccessors = new MicronautCacheLibraryAccessors(owner);
        private final MicronautDataLibraryAccessors laccForMicronautDataLibraryAccessors = new MicronautDataLibraryAccessors(owner);
        private final MicronautHttpLibraryAccessors laccForMicronautHttpLibraryAccessors = new MicronautHttpLibraryAccessors(owner);
        private final MicronautInjectLibraryAccessors laccForMicronautInjectLibraryAccessors = new MicronautInjectLibraryAccessors(owner);
        private final MicronautJaxrsLibraryAccessors laccForMicronautJaxrsLibraryAccessors = new MicronautJaxrsLibraryAccessors(owner);
        private final MicronautJdbcLibraryAccessors laccForMicronautJdbcLibraryAccessors = new MicronautJdbcLibraryAccessors(owner);
        private final MicronautTestLibraryAccessors laccForMicronautTestLibraryAccessors = new MicronautTestLibraryAccessors(owner);

        public MicronautLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (io.micronaut:micronaut-bom)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("micronaut.bom"); }

            /**
             * Creates a dependency provider for flyway (io.micronaut.flyway:micronaut-flyway)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getFlyway() { return create("micronaut.flyway"); }

            /**
             * Creates a dependency provider for jooq (io.micronaut.sql:micronaut-jooq)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJooq() { return create("micronaut.jooq"); }

            /**
             * Creates a dependency provider for management (io.micronaut:micronaut-management)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getManagement() { return create("micronaut.management"); }

            /**
             * Creates a dependency provider for runtime (io.micronaut:micronaut-runtime)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("micronaut.runtime"); }

            /**
             * Creates a dependency provider for security (io.micronaut.security:micronaut-security)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSecurity() { return create("micronaut.security"); }

            /**
             * Creates a dependency provider for validation (io.micronaut:micronaut-validation)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getValidation() { return create("micronaut.validation"); }

        /**
         * Returns the group of libraries at micronaut.cache
         */
        public MicronautCacheLibraryAccessors getCache() { return laccForMicronautCacheLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.data
         */
        public MicronautDataLibraryAccessors getData() { return laccForMicronautDataLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.http
         */
        public MicronautHttpLibraryAccessors getHttp() { return laccForMicronautHttpLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.inject
         */
        public MicronautInjectLibraryAccessors getInject() { return laccForMicronautInjectLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.jaxrs
         */
        public MicronautJaxrsLibraryAccessors getJaxrs() { return laccForMicronautJaxrsLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.jdbc
         */
        public MicronautJdbcLibraryAccessors getJdbc() { return laccForMicronautJdbcLibraryAccessors; }

        /**
         * Returns the group of libraries at micronaut.test
         */
        public MicronautTestLibraryAccessors getTest() { return laccForMicronautTestLibraryAccessors; }

    }

    public static class MicronautCacheLibraryAccessors extends SubDependencyFactory {

        public MicronautCacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for caffeine (io.micronaut.cache:micronaut-cache-caffeine)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCaffeine() { return create("micronaut.cache.caffeine"); }

    }

    public static class MicronautDataLibraryAccessors extends SubDependencyFactory {

        public MicronautDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for processor (io.micronaut.data:micronaut-data-processor)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getProcessor() { return create("micronaut.data.processor"); }

            /**
             * Creates a dependency provider for tx (io.micronaut.data:micronaut-data-tx)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTx() { return create("micronaut.data.tx"); }

    }

    public static class MicronautHttpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final MicronautHttpServerLibraryAccessors laccForMicronautHttpServerLibraryAccessors = new MicronautHttpServerLibraryAccessors(owner);

        public MicronautHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for http (io.micronaut:micronaut-http)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("micronaut.http"); }

            /**
             * Creates a dependency provider for client (io.micronaut:micronaut-http-client)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient() { return create("micronaut.http.client"); }

        /**
         * Returns the group of libraries at micronaut.http.server
         */
        public MicronautHttpServerLibraryAccessors getServer() { return laccForMicronautHttpServerLibraryAccessors; }

    }

    public static class MicronautHttpServerLibraryAccessors extends SubDependencyFactory {

        public MicronautHttpServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for netty (io.micronaut:micronaut-http-server-netty)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getNetty() { return create("micronaut.http.server.netty"); }

    }

    public static class MicronautInjectLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MicronautInjectLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for inject (io.micronaut:micronaut-inject)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("micronaut.inject"); }

            /**
             * Creates a dependency provider for java (io.micronaut:micronaut-inject-java)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava() { return create("micronaut.inject.java"); }

    }

    public static class MicronautJaxrsLibraryAccessors extends SubDependencyFactory {

        public MicronautJaxrsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for processor (io.micronaut.jaxrs:micronaut-jaxrs-processor)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getProcessor() { return create("micronaut.jaxrs.processor"); }

            /**
             * Creates a dependency provider for server (io.micronaut.jaxrs:micronaut-jaxrs-server)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getServer() { return create("micronaut.jaxrs.server"); }

    }

    public static class MicronautJdbcLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MicronautJdbcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdbc (io.micronaut.sql:micronaut-jdbc)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("micronaut.jdbc"); }

            /**
             * Creates a dependency provider for hikari (io.micronaut.sql:micronaut-jdbc-hikari)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getHikari() { return create("micronaut.jdbc.hikari"); }

    }

    public static class MicronautTestLibraryAccessors extends SubDependencyFactory {

        public MicronautTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.micronaut.test:micronaut-test-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("micronaut.test.core"); }

            /**
             * Creates a dependency provider for junit5 (io.micronaut.test:micronaut-test-junit5)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit5() { return create("micronaut.test.junit5"); }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {
        private final MockitoJunitLibraryAccessors laccForMockitoJunitLibraryAccessors = new MockitoJunitLibraryAccessors(owner);

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mockito.junit
         */
        public MockitoJunitLibraryAccessors getJunit() { return laccForMockitoJunitLibraryAccessors; }

    }

    public static class MockitoJunitLibraryAccessors extends SubDependencyFactory {

        public MockitoJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jupiter (org.mockito:mockito-junit-jupiter)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJupiter() { return create("mockito.junit.jupiter"); }

    }

    public static class OtelLibraryAccessors extends SubDependencyFactory {
        private final OtelSdkLibraryAccessors laccForOtelSdkLibraryAccessors = new OtelSdkLibraryAccessors(owner);

        public OtelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (io.opentelemetry:opentelemetry-bom)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("otel.bom"); }

            /**
             * Creates a dependency provider for semconv (io.opentelemetry:opentelemetry-semconv)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSemconv() { return create("otel.semconv"); }

        /**
         * Returns the group of libraries at otel.sdk
         */
        public OtelSdkLibraryAccessors getSdk() { return laccForOtelSdkLibraryAccessors; }

    }

    public static class OtelSdkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OtelSdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sdk (io.opentelemetry:opentelemetry-sdk-metrics)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("otel.sdk"); }

            /**
             * Creates a dependency provider for testing (io.opentelemetry:opentelemetry-sdk-metrics-testing)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("otel.sdk.testing"); }

    }

    public static class PlatformLibraryAccessors extends SubDependencyFactory {
        private final PlatformTestcontainersLibraryAccessors laccForPlatformTestcontainersLibraryAccessors = new PlatformTestcontainersLibraryAccessors(owner);

        public PlatformLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at platform.testcontainers
         */
        public PlatformTestcontainersLibraryAccessors getTestcontainers() { return laccForPlatformTestcontainersLibraryAccessors; }

    }

    public static class PlatformTestcontainersLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public PlatformTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for testcontainers (org.testcontainers:testcontainers)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("platform.testcontainers"); }

            /**
             * Creates a dependency provider for cockroachdb (org.testcontainers:cockroachdb)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCockroachdb() { return create("platform.testcontainers.cockroachdb"); }

            /**
             * Creates a dependency provider for jdbc (org.testcontainers:jdbc)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdbc() { return create("platform.testcontainers.jdbc"); }

            /**
             * Creates a dependency provider for postgresql (org.testcontainers:postgresql)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getPostgresql() { return create("platform.testcontainers.postgresql"); }

    }

    public static class QuartzLibraryAccessors extends SubDependencyFactory {

        public QuartzLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for scheduler (org.quartz-scheduler:quartz)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getScheduler() { return create("quartz.scheduler"); }

    }

    public static class ReactorLibraryAccessors extends SubDependencyFactory {

        public ReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.projectreactor:reactor-core)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("reactor.core"); }

            /**
             * Creates a dependency provider for test (io.projectreactor:reactor-test)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("reactor.test"); }

    }

    public static class Slf4jLibraryAccessors extends SubDependencyFactory {

        public Slf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.slf4j:slf4j-api)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("slf4j.api"); }

    }

    public static class SpotbugsLibraryAccessors extends SubDependencyFactory {

        public SpotbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.github.spotbugs:spotbugs-annotations)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("spotbugs.annotations"); }

    }

    public static class TemporalLibraryAccessors extends SubDependencyFactory {

        public TemporalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sdk (io.temporal:temporal-sdk)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getSdk() { return create("temporal.sdk"); }

            /**
             * Creates a dependency provider for serviceclient (io.temporal:temporal-serviceclient)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getServiceclient() { return create("temporal.serviceclient"); }

            /**
             * Creates a dependency provider for testing (io.temporal:temporal-testing)
             * This dependency was declared in catalog deps.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("temporal.testing"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final CommonsVersionAccessors vaccForCommonsVersionAccessors = new CommonsVersionAccessors(providers, config);
        private final ConnectorsVersionAccessors vaccForConnectorsVersionAccessors = new ConnectorsVersionAccessors(providers, config);
        private final DatadogVersionAccessors vaccForDatadogVersionAccessors = new DatadogVersionAccessors(providers, config);
        private final FasterxmlVersionAccessors vaccForFasterxmlVersionAccessors = new FasterxmlVersionAccessors(providers, config);
        private final GlassfishVersionAccessors vaccForGlassfishVersionAccessors = new GlassfishVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final MicronautVersionAccessors vaccForMicronautVersionAccessors = new MicronautVersionAccessors(providers, config);
        private final PlatformVersionAccessors vaccForPlatformVersionAccessors = new PlatformVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: flyway (7.14.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getFlyway() { return getVersion("flyway"); }

            /**
             * Returns the version associated to this alias: hikaricp (5.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getHikaricp() { return getVersion("hikaricp"); }

            /**
             * Returns the version associated to this alias: jmh (1.36)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getJmh() { return getVersion("jmh"); }

            /**
             * Returns the version associated to this alias: jooq (3.13.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getJooq() { return getVersion("jooq"); }

            /**
             * Returns the version associated to this alias: log4j (2.17.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getLog4j() { return getVersion("log4j"); }

            /**
             * Returns the version associated to this alias: lombok (1.18.24)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getLombok() { return getVersion("lombok"); }

            /**
             * Returns the version associated to this alias: postgresql (42.3.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getPostgresql() { return getVersion("postgresql"); }

            /**
             * Returns the version associated to this alias: reactor (3.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getReactor() { return getVersion("reactor"); }

            /**
             * Returns the version associated to this alias: slf4j (1.7.36)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getSlf4j() { return getVersion("slf4j"); }

            /**
             * Returns the version associated to this alias: temporal (1.17.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getTemporal() { return getVersion("temporal"); }

        /**
         * Returns the group of versions at versions.commons
         */
        public CommonsVersionAccessors getCommons() { return vaccForCommonsVersionAccessors; }

        /**
         * Returns the group of versions at versions.connectors
         */
        public ConnectorsVersionAccessors getConnectors() { return vaccForConnectorsVersionAccessors; }

        /**
         * Returns the group of versions at versions.datadog
         */
        public DatadogVersionAccessors getDatadog() { return vaccForDatadogVersionAccessors; }

        /**
         * Returns the group of versions at versions.fasterxml
         */
        public FasterxmlVersionAccessors getFasterxml() { return vaccForFasterxmlVersionAccessors; }

        /**
         * Returns the group of versions at versions.glassfish
         */
        public GlassfishVersionAccessors getGlassfish() { return vaccForGlassfishVersionAccessors; }

        /**
         * Returns the group of versions at versions.junit
         */
        public JunitVersionAccessors getJunit() { return vaccForJunitVersionAccessors; }

        /**
         * Returns the group of versions at versions.micronaut
         */
        public MicronautVersionAccessors getMicronaut() { return vaccForMicronautVersionAccessors; }

        /**
         * Returns the group of versions at versions.platform
         */
        public PlatformVersionAccessors getPlatform() { return vaccForPlatformVersionAccessors; }

    }

    public static class CommonsVersionAccessors extends VersionFactory  {

        public CommonsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: commons.io (2.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getIo() { return getVersion("commons.io"); }

    }

    public static class ConnectorsVersionAccessors extends VersionFactory  {

        private final ConnectorsDestinationVersionAccessors vaccForConnectorsDestinationVersionAccessors = new ConnectorsDestinationVersionAccessors(providers, config);
        private final ConnectorsSourceVersionAccessors vaccForConnectorsSourceVersionAccessors = new ConnectorsSourceVersionAccessors(providers, config);
        private final ConnectorsTestcontainersVersionAccessors vaccForConnectorsTestcontainersVersionAccessors = new ConnectorsTestcontainersVersionAccessors(providers, config);
        public ConnectorsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.connectors.destination
         */
        public ConnectorsDestinationVersionAccessors getDestination() { return vaccForConnectorsDestinationVersionAccessors; }

        /**
         * Returns the group of versions at versions.connectors.source
         */
        public ConnectorsSourceVersionAccessors getSource() { return vaccForConnectorsSourceVersionAccessors; }

        /**
         * Returns the group of versions at versions.connectors.testcontainers
         */
        public ConnectorsTestcontainersVersionAccessors getTestcontainers() { return vaccForConnectorsTestcontainersVersionAccessors; }

    }

    public static class ConnectorsDestinationVersionAccessors extends VersionFactory  {

        private final ConnectorsDestinationTestcontainersVersionAccessors vaccForConnectorsDestinationTestcontainersVersionAccessors = new ConnectorsDestinationTestcontainersVersionAccessors(providers, config);
        public ConnectorsDestinationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.connectors.destination.testcontainers
         */
        public ConnectorsDestinationTestcontainersVersionAccessors getTestcontainers() { return vaccForConnectorsDestinationTestcontainersVersionAccessors; }

    }

    public static class ConnectorsDestinationTestcontainersVersionAccessors extends VersionFactory  {

        private final ConnectorsDestinationTestcontainersOracleVersionAccessors vaccForConnectorsDestinationTestcontainersOracleVersionAccessors = new ConnectorsDestinationTestcontainersOracleVersionAccessors(providers, config);
        public ConnectorsDestinationTestcontainersVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: connectors.destination.testcontainers.clickhouse (1.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getClickhouse() { return getVersion("connectors.destination.testcontainers.clickhouse"); }

            /**
             * Returns the version associated to this alias: connectors.destination.testcontainers.elasticsearch (1.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getElasticsearch() { return getVersion("connectors.destination.testcontainers.elasticsearch"); }

        /**
         * Returns the group of versions at versions.connectors.destination.testcontainers.oracle
         */
        public ConnectorsDestinationTestcontainersOracleVersionAccessors getOracle() { return vaccForConnectorsDestinationTestcontainersOracleVersionAccessors; }

    }

    public static class ConnectorsDestinationTestcontainersOracleVersionAccessors extends VersionFactory  {

        public ConnectorsDestinationTestcontainersOracleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: connectors.destination.testcontainers.oracle.xe (1.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getXe() { return getVersion("connectors.destination.testcontainers.oracle.xe"); }

    }

    public static class ConnectorsSourceVersionAccessors extends VersionFactory  {

        private final ConnectorsSourceTestcontainersVersionAccessors vaccForConnectorsSourceTestcontainersVersionAccessors = new ConnectorsSourceTestcontainersVersionAccessors(providers, config);
        public ConnectorsSourceVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.connectors.source.testcontainers
         */
        public ConnectorsSourceTestcontainersVersionAccessors getTestcontainers() { return vaccForConnectorsSourceTestcontainersVersionAccessors; }

    }

    public static class ConnectorsSourceTestcontainersVersionAccessors extends VersionFactory  {

        public ConnectorsSourceTestcontainersVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: connectors.source.testcontainers.clickhouse (1.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getClickhouse() { return getVersion("connectors.source.testcontainers.clickhouse"); }

    }

    public static class ConnectorsTestcontainersVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ConnectorsTestcontainersVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: connectors.testcontainers (1.15.3)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog deps.toml
         */
        public Provider<String> asProvider() { return getVersion("connectors.testcontainers"); }

            /**
             * Returns the version associated to this alias: connectors.testcontainers.cassandra (1.16.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getCassandra() { return getVersion("connectors.testcontainers.cassandra"); }

            /**
             * Returns the version associated to this alias: connectors.testcontainers.mariadb (1.16.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getMariadb() { return getVersion("connectors.testcontainers.mariadb"); }

            /**
             * Returns the version associated to this alias: connectors.testcontainers.pulsar (1.16.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getPulsar() { return getVersion("connectors.testcontainers.pulsar"); }

            /**
             * Returns the version associated to this alias: connectors.testcontainers.scylla (1.16.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getScylla() { return getVersion("connectors.testcontainers.scylla"); }

            /**
             * Returns the version associated to this alias: connectors.testcontainers.tidb (1.16.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getTidb() { return getVersion("connectors.testcontainers.tidb"); }

    }

    public static class DatadogVersionAccessors extends VersionFactory  {

        public DatadogVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: datadog.version (0.111.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getVersion() { return getVersion("datadog.version"); }

    }

    public static class FasterxmlVersionAccessors extends VersionFactory  {

        public FasterxmlVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: fasterxml.version (2.14.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getVersion() { return getVersion("fasterxml.version"); }

    }

    public static class GlassfishVersionAccessors extends VersionFactory  {

        public GlassfishVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: glassfish.version (2.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getVersion() { return getVersion("glassfish.version"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: junit.jupiter (5.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getJupiter() { return getVersion("junit.jupiter"); }

    }

    public static class MicronautVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public MicronautVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: micronaut (3.8.3)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog deps.toml
         */
        public Provider<String> asProvider() { return getVersion("micronaut"); }

            /**
             * Returns the version associated to this alias: micronaut.data (3.9.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getData() { return getVersion("micronaut.data"); }

            /**
             * Returns the version associated to this alias: micronaut.jaxrs (3.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getJaxrs() { return getVersion("micronaut.jaxrs"); }

            /**
             * Returns the version associated to this alias: micronaut.security (3.9.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getSecurity() { return getVersion("micronaut.security"); }

            /**
             * Returns the version associated to this alias: micronaut.test (3.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getTest() { return getVersion("micronaut.test"); }

    }

    public static class PlatformVersionAccessors extends VersionFactory  {

        public PlatformVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: platform.testcontainers (1.17.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog deps.toml
             */
            public Provider<String> getTestcontainers() { return getVersion("platform.testcontainers"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final MicronautBundleAccessors baccForMicronautBundleAccessors = new MicronautBundleAccessors(objects, providers, config);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config) { super(objects, providers, config); }

            /**
             * Creates a dependency bundle provider for apache which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.apache.commons:commons-compress</li>
             *    <li>org.apache.commons:commons-lang3</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getApache() { return createBundle("apache"); }

            /**
             * Creates a dependency bundle provider for datadog which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.datadoghq:dd-trace-api</li>
             *    <li>com.datadoghq:dd-trace-ot</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getDatadog() { return createBundle("datadog"); }

            /**
             * Creates a dependency bundle provider for jackson which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.fasterxml.jackson.core:jackson-databind</li>
             *    <li>com.fasterxml.jackson.core:jackson-annotations</li>
             *    <li>com.fasterxml.jackson.dataformat:jackson-dataformat-yaml</li>
             *    <li>com.fasterxml.jackson.datatype:jackson-datatype-jsr310</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getJackson() { return createBundle("jackson"); }

            /**
             * Creates a dependency bundle provider for junit which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.junit.jupiter:junit-jupiter-api</li>
             *    <li>org.junit.jupiter:junit-jupiter-params</li>
             *    <li>org.mockito:mockito-junit-jupiter</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getJunit() { return createBundle("junit"); }

            /**
             * Creates a dependency bundle provider for log4j which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.apache.logging.log4j:log4j-api</li>
             *    <li>org.apache.logging.log4j:log4j-core</li>
             *    <li>org.apache.logging.log4j:log4j-slf4j-impl</li>
             *    <li>org.apache.logging.log4j:log4j-web</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLog4j() { return createBundle("log4j"); }

            /**
             * Creates a dependency bundle provider for slf4j which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.slf4j:jul-to-slf4j</li>
             *    <li>org.slf4j:jcl-over-slf4j</li>
             *    <li>org.slf4j:log4j-over-slf4j</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getSlf4j() { return createBundle("slf4j"); }

            /**
             * Creates a dependency bundle provider for temporal which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.temporal:temporal-sdk</li>
             *    <li>io.temporal:temporal-serviceclient</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTemporal() { return createBundle("temporal"); }

        /**
         * Returns the group of bundles at bundles.micronaut
         */
        public MicronautBundleAccessors getMicronaut() { return baccForMicronautBundleAccessors; }

    }

    public static class MicronautBundleAccessors extends BundleFactory  implements BundleNotationSupplier{
        private final MicronautAnnotationBundleAccessors baccForMicronautAnnotationBundleAccessors = new MicronautAnnotationBundleAccessors(objects, providers, config);
        private final MicronautTestBundleAccessors baccForMicronautTestBundleAccessors = new MicronautTestBundleAccessors(objects, providers, config);

        public MicronautBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config) { super(objects, providers, config); }

            /**
             * Creates a dependency bundle provider for micronaut which is an aggregate for the following dependencies:
             * <ul>
             *    <li>jakarta.annotation:jakarta.annotation-api</li>
             *    <li>javax.transaction:javax.transaction-api</li>
             *    <li>io.micronaut:micronaut-http-server-netty</li>
             *    <li>io.micronaut:micronaut-http-client</li>
             *    <li>io.micronaut:micronaut-inject</li>
             *    <li>io.micronaut:micronaut-validation</li>
             *    <li>io.micronaut:micronaut-runtime</li>
             *    <li>io.micronaut:micronaut-management</li>
             *    <li>io.micronaut.security:micronaut-security</li>
             *    <li>io.micronaut.jaxrs:micronaut-jaxrs-server</li>
             *    <li>io.micronaut.flyway:micronaut-flyway</li>
             *    <li>io.micronaut.sql:micronaut-jdbc-hikari</li>
             *    <li>io.micronaut.sql:micronaut-jooq</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> asProvider() { return createBundle("micronaut"); }

            /**
             * Creates a dependency bundle provider for micronaut.server which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.micronaut.jaxrs:micronaut-jaxrs-processor</li>
             *    <li>io.micronaut.jaxrs:micronaut-jaxrs-server</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getServer() { return createBundle("micronaut.server"); }

        /**
         * Returns the group of bundles at bundles.micronaut.annotation
         */
        public MicronautAnnotationBundleAccessors getAnnotation() { return baccForMicronautAnnotationBundleAccessors; }

        /**
         * Returns the group of bundles at bundles.micronaut.test
         */
        public MicronautTestBundleAccessors getTest() { return baccForMicronautTestBundleAccessors; }

    }

    public static class MicronautAnnotationBundleAccessors extends BundleFactory  implements BundleNotationSupplier{

        public MicronautAnnotationBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config) { super(objects, providers, config); }

            /**
             * Creates a dependency bundle provider for micronaut.annotation which is an aggregate for the following dependencies:
             * <ul>
             *    <li>jakarta.annotation:jakarta.annotation-api</li>
             *    <li>io.micronaut:micronaut-inject-java</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> asProvider() { return createBundle("micronaut.annotation"); }

            /**
             * Creates a dependency bundle provider for micronaut.annotation.processor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.micronaut:micronaut-inject-java</li>
             *    <li>io.micronaut:micronaut-management</li>
             *    <li>io.micronaut:micronaut-validation</li>
             *    <li>io.micronaut.data:micronaut-data-processor</li>
             *    <li>io.micronaut.jaxrs:micronaut-jaxrs-processor</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getProcessor() { return createBundle("micronaut.annotation.processor"); }

    }

    public static class MicronautTestBundleAccessors extends BundleFactory  implements BundleNotationSupplier{
        private final MicronautTestAnnotationBundleAccessors baccForMicronautTestAnnotationBundleAccessors = new MicronautTestAnnotationBundleAccessors(objects, providers, config);

        public MicronautTestBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config) { super(objects, providers, config); }

            /**
             * Creates a dependency bundle provider for micronaut.test which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.micronaut.test:micronaut-test-core</li>
             *    <li>io.micronaut.test:micronaut-test-junit5</li>
             *    <li>com.h2database:h2</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> asProvider() { return createBundle("micronaut.test"); }

        /**
         * Returns the group of bundles at bundles.micronaut.test.annotation
         */
        public MicronautTestAnnotationBundleAccessors getAnnotation() { return baccForMicronautTestAnnotationBundleAccessors; }

    }

    public static class MicronautTestAnnotationBundleAccessors extends BundleFactory {

        public MicronautTestAnnotationBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config) { super(objects, providers, config); }

            /**
             * Creates a dependency bundle provider for micronaut.test.annotation.processor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.micronaut:micronaut-inject-java</li>
             * </ul>
             * This bundle was declared in catalog deps.toml
             */
            public Provider<ExternalModuleDependencyBundle> getProcessor() { return createBundle("micronaut.test.annotation.processor"); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
