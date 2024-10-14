// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class LegacyServiceUserParameter
    {
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterAbortDetachedQuery> AbortDetachedQueries;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterAutocommit> Autocommits;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterBinaryInputFormat> BinaryInputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterBinaryOutputFormat> BinaryOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientMemoryLimit> ClientMemoryLimits;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientMetadataRequestUseConnectionCtx> ClientMetadataRequestUseConnectionCtxes;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientPrefetchThread> ClientPrefetchThreads;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientResultChunkSize> ClientResultChunkSizes;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientResultColumnCaseInsensitive> ClientResultColumnCaseInsensitives;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientSessionKeepAliveHeartbeatFrequency> ClientSessionKeepAliveHeartbeatFrequencies;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientSessionKeepAlife> ClientSessionKeepAlives;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterClientTimestampTypeMapping> ClientTimestampTypeMappings;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterDateInputFormat> DateInputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterDateOutputFormat> DateOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterEnableUnloadPhysicalTypeOptimization> EnableUnloadPhysicalTypeOptimizations;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterEnableUnredactedQuerySyntaxError> EnableUnredactedQuerySyntaxErrors;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterErrorOnNondeterministicMerge> ErrorOnNondeterministicMerges;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterErrorOnNondeterministicUpdate> ErrorOnNondeterministicUpdates;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterGeographyOutputFormat> GeographyOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterGeometryOutputFormat> GeometryOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterJdbcTreatDecimalAsInt> JdbcTreatDecimalAsInts;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterJdbcTreatTimestampNtzAsUtc> JdbcTreatTimestampNtzAsUtcs;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterJdbcUseSessionTimezone> JdbcUseSessionTimezones;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterJsonIndent> JsonIndents;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterLockTimeout> LockTimeouts;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterLogLevel> LogLevels;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterMultiStatementCount> MultiStatementCounts;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterNetworkPolicy> NetworkPolicies;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterNoorderSequenceAsDefault> NoorderSequenceAsDefaults;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterOdbcTreatDecimalAsInt> OdbcTreatDecimalAsInts;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterPreventUnloadToInternalStage> PreventUnloadToInternalStages;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterQueryTag> QueryTags;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterQuotedIdentifiersIgnoreCase> QuotedIdentifiersIgnoreCases;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterRowsPerResultset> RowsPerResultsets;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterS3StageVpceDnsName> S3StageVpceDnsNames;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterSearchPath> SearchPaths;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterSimulatedDataSharingConsumer> SimulatedDataSharingConsumers;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterStatementQueuedTimeoutInSecond> StatementQueuedTimeoutInSeconds;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterStatementTimeoutInSecond> StatementTimeoutInSeconds;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterStrictJsonOutput> StrictJsonOutputs;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimeInputFormat> TimeInputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimeOutputFormat> TimeOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampDayIsAlways24h> TimestampDayIsAlways24hs;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampInputFormat> TimestampInputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampLtzOutputFormat> TimestampLtzOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampNtzOutputFormat> TimestampNtzOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampOutputFormat> TimestampOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampTypeMapping> TimestampTypeMappings;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimestampTzOutputFormat> TimestampTzOutputFormats;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTimezone> Timezones;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTraceLevel> TraceLevels;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTransactionAbortOnError> TransactionAbortOnErrors;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTransactionDefaultIsolationLevel> TransactionDefaultIsolationLevels;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterTwoDigitCenturyStart> TwoDigitCenturyStarts;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterUnsupportedDdlAction> UnsupportedDdlActions;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterUseCachedResult> UseCachedResults;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterWeekOfYearPolicy> WeekOfYearPolicies;
        public readonly ImmutableArray<Outputs.LegacyServiceUserParameterWeekStart> WeekStarts;

        [OutputConstructor]
        private LegacyServiceUserParameter(
            ImmutableArray<Outputs.LegacyServiceUserParameterAbortDetachedQuery> abortDetachedQueries,

            ImmutableArray<Outputs.LegacyServiceUserParameterAutocommit> autocommits,

            ImmutableArray<Outputs.LegacyServiceUserParameterBinaryInputFormat> binaryInputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterBinaryOutputFormat> binaryOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientMemoryLimit> clientMemoryLimits,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientMetadataRequestUseConnectionCtx> clientMetadataRequestUseConnectionCtxes,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientPrefetchThread> clientPrefetchThreads,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientResultChunkSize> clientResultChunkSizes,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientResultColumnCaseInsensitive> clientResultColumnCaseInsensitives,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientSessionKeepAliveHeartbeatFrequency> clientSessionKeepAliveHeartbeatFrequencies,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientSessionKeepAlife> clientSessionKeepAlives,

            ImmutableArray<Outputs.LegacyServiceUserParameterClientTimestampTypeMapping> clientTimestampTypeMappings,

            ImmutableArray<Outputs.LegacyServiceUserParameterDateInputFormat> dateInputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterDateOutputFormat> dateOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterEnableUnloadPhysicalTypeOptimization> enableUnloadPhysicalTypeOptimizations,

            ImmutableArray<Outputs.LegacyServiceUserParameterEnableUnredactedQuerySyntaxError> enableUnredactedQuerySyntaxErrors,

            ImmutableArray<Outputs.LegacyServiceUserParameterErrorOnNondeterministicMerge> errorOnNondeterministicMerges,

            ImmutableArray<Outputs.LegacyServiceUserParameterErrorOnNondeterministicUpdate> errorOnNondeterministicUpdates,

            ImmutableArray<Outputs.LegacyServiceUserParameterGeographyOutputFormat> geographyOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterGeometryOutputFormat> geometryOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterJdbcTreatDecimalAsInt> jdbcTreatDecimalAsInts,

            ImmutableArray<Outputs.LegacyServiceUserParameterJdbcTreatTimestampNtzAsUtc> jdbcTreatTimestampNtzAsUtcs,

            ImmutableArray<Outputs.LegacyServiceUserParameterJdbcUseSessionTimezone> jdbcUseSessionTimezones,

            ImmutableArray<Outputs.LegacyServiceUserParameterJsonIndent> jsonIndents,

            ImmutableArray<Outputs.LegacyServiceUserParameterLockTimeout> lockTimeouts,

            ImmutableArray<Outputs.LegacyServiceUserParameterLogLevel> logLevels,

            ImmutableArray<Outputs.LegacyServiceUserParameterMultiStatementCount> multiStatementCounts,

            ImmutableArray<Outputs.LegacyServiceUserParameterNetworkPolicy> networkPolicies,

            ImmutableArray<Outputs.LegacyServiceUserParameterNoorderSequenceAsDefault> noorderSequenceAsDefaults,

            ImmutableArray<Outputs.LegacyServiceUserParameterOdbcTreatDecimalAsInt> odbcTreatDecimalAsInts,

            ImmutableArray<Outputs.LegacyServiceUserParameterPreventUnloadToInternalStage> preventUnloadToInternalStages,

            ImmutableArray<Outputs.LegacyServiceUserParameterQueryTag> queryTags,

            ImmutableArray<Outputs.LegacyServiceUserParameterQuotedIdentifiersIgnoreCase> quotedIdentifiersIgnoreCases,

            ImmutableArray<Outputs.LegacyServiceUserParameterRowsPerResultset> rowsPerResultsets,

            ImmutableArray<Outputs.LegacyServiceUserParameterS3StageVpceDnsName> s3StageVpceDnsNames,

            ImmutableArray<Outputs.LegacyServiceUserParameterSearchPath> searchPaths,

            ImmutableArray<Outputs.LegacyServiceUserParameterSimulatedDataSharingConsumer> simulatedDataSharingConsumers,

            ImmutableArray<Outputs.LegacyServiceUserParameterStatementQueuedTimeoutInSecond> statementQueuedTimeoutInSeconds,

            ImmutableArray<Outputs.LegacyServiceUserParameterStatementTimeoutInSecond> statementTimeoutInSeconds,

            ImmutableArray<Outputs.LegacyServiceUserParameterStrictJsonOutput> strictJsonOutputs,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimeInputFormat> timeInputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimeOutputFormat> timeOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampDayIsAlways24h> timestampDayIsAlways24hs,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampInputFormat> timestampInputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampLtzOutputFormat> timestampLtzOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampNtzOutputFormat> timestampNtzOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampOutputFormat> timestampOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampTypeMapping> timestampTypeMappings,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimestampTzOutputFormat> timestampTzOutputFormats,

            ImmutableArray<Outputs.LegacyServiceUserParameterTimezone> timezones,

            ImmutableArray<Outputs.LegacyServiceUserParameterTraceLevel> traceLevels,

            ImmutableArray<Outputs.LegacyServiceUserParameterTransactionAbortOnError> transactionAbortOnErrors,

            ImmutableArray<Outputs.LegacyServiceUserParameterTransactionDefaultIsolationLevel> transactionDefaultIsolationLevels,

            ImmutableArray<Outputs.LegacyServiceUserParameterTwoDigitCenturyStart> twoDigitCenturyStarts,

            ImmutableArray<Outputs.LegacyServiceUserParameterUnsupportedDdlAction> unsupportedDdlActions,

            ImmutableArray<Outputs.LegacyServiceUserParameterUseCachedResult> useCachedResults,

            ImmutableArray<Outputs.LegacyServiceUserParameterWeekOfYearPolicy> weekOfYearPolicies,

            ImmutableArray<Outputs.LegacyServiceUserParameterWeekStart> weekStarts)
        {
            AbortDetachedQueries = abortDetachedQueries;
            Autocommits = autocommits;
            BinaryInputFormats = binaryInputFormats;
            BinaryOutputFormats = binaryOutputFormats;
            ClientMemoryLimits = clientMemoryLimits;
            ClientMetadataRequestUseConnectionCtxes = clientMetadataRequestUseConnectionCtxes;
            ClientPrefetchThreads = clientPrefetchThreads;
            ClientResultChunkSizes = clientResultChunkSizes;
            ClientResultColumnCaseInsensitives = clientResultColumnCaseInsensitives;
            ClientSessionKeepAliveHeartbeatFrequencies = clientSessionKeepAliveHeartbeatFrequencies;
            ClientSessionKeepAlives = clientSessionKeepAlives;
            ClientTimestampTypeMappings = clientTimestampTypeMappings;
            DateInputFormats = dateInputFormats;
            DateOutputFormats = dateOutputFormats;
            EnableUnloadPhysicalTypeOptimizations = enableUnloadPhysicalTypeOptimizations;
            EnableUnredactedQuerySyntaxErrors = enableUnredactedQuerySyntaxErrors;
            ErrorOnNondeterministicMerges = errorOnNondeterministicMerges;
            ErrorOnNondeterministicUpdates = errorOnNondeterministicUpdates;
            GeographyOutputFormats = geographyOutputFormats;
            GeometryOutputFormats = geometryOutputFormats;
            JdbcTreatDecimalAsInts = jdbcTreatDecimalAsInts;
            JdbcTreatTimestampNtzAsUtcs = jdbcTreatTimestampNtzAsUtcs;
            JdbcUseSessionTimezones = jdbcUseSessionTimezones;
            JsonIndents = jsonIndents;
            LockTimeouts = lockTimeouts;
            LogLevels = logLevels;
            MultiStatementCounts = multiStatementCounts;
            NetworkPolicies = networkPolicies;
            NoorderSequenceAsDefaults = noorderSequenceAsDefaults;
            OdbcTreatDecimalAsInts = odbcTreatDecimalAsInts;
            PreventUnloadToInternalStages = preventUnloadToInternalStages;
            QueryTags = queryTags;
            QuotedIdentifiersIgnoreCases = quotedIdentifiersIgnoreCases;
            RowsPerResultsets = rowsPerResultsets;
            S3StageVpceDnsNames = s3StageVpceDnsNames;
            SearchPaths = searchPaths;
            SimulatedDataSharingConsumers = simulatedDataSharingConsumers;
            StatementQueuedTimeoutInSeconds = statementQueuedTimeoutInSeconds;
            StatementTimeoutInSeconds = statementTimeoutInSeconds;
            StrictJsonOutputs = strictJsonOutputs;
            TimeInputFormats = timeInputFormats;
            TimeOutputFormats = timeOutputFormats;
            TimestampDayIsAlways24hs = timestampDayIsAlways24hs;
            TimestampInputFormats = timestampInputFormats;
            TimestampLtzOutputFormats = timestampLtzOutputFormats;
            TimestampNtzOutputFormats = timestampNtzOutputFormats;
            TimestampOutputFormats = timestampOutputFormats;
            TimestampTypeMappings = timestampTypeMappings;
            TimestampTzOutputFormats = timestampTzOutputFormats;
            Timezones = timezones;
            TraceLevels = traceLevels;
            TransactionAbortOnErrors = transactionAbortOnErrors;
            TransactionDefaultIsolationLevels = transactionDefaultIsolationLevels;
            TwoDigitCenturyStarts = twoDigitCenturyStarts;
            UnsupportedDdlActions = unsupportedDdlActions;
            UseCachedResults = useCachedResults;
            WeekOfYearPolicies = weekOfYearPolicies;
            WeekStarts = weekStarts;
        }
    }
}
