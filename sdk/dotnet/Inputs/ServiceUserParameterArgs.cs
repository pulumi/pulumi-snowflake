// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ServiceUserParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("abortDetachedQueries")]
        private InputList<Inputs.ServiceUserParameterAbortDetachedQueryArgs>? _abortDetachedQueries;
        public InputList<Inputs.ServiceUserParameterAbortDetachedQueryArgs> AbortDetachedQueries
        {
            get => _abortDetachedQueries ?? (_abortDetachedQueries = new InputList<Inputs.ServiceUserParameterAbortDetachedQueryArgs>());
            set => _abortDetachedQueries = value;
        }

        [Input("autocommits")]
        private InputList<Inputs.ServiceUserParameterAutocommitArgs>? _autocommits;
        public InputList<Inputs.ServiceUserParameterAutocommitArgs> Autocommits
        {
            get => _autocommits ?? (_autocommits = new InputList<Inputs.ServiceUserParameterAutocommitArgs>());
            set => _autocommits = value;
        }

        [Input("binaryInputFormats")]
        private InputList<Inputs.ServiceUserParameterBinaryInputFormatArgs>? _binaryInputFormats;
        public InputList<Inputs.ServiceUserParameterBinaryInputFormatArgs> BinaryInputFormats
        {
            get => _binaryInputFormats ?? (_binaryInputFormats = new InputList<Inputs.ServiceUserParameterBinaryInputFormatArgs>());
            set => _binaryInputFormats = value;
        }

        [Input("binaryOutputFormats")]
        private InputList<Inputs.ServiceUserParameterBinaryOutputFormatArgs>? _binaryOutputFormats;
        public InputList<Inputs.ServiceUserParameterBinaryOutputFormatArgs> BinaryOutputFormats
        {
            get => _binaryOutputFormats ?? (_binaryOutputFormats = new InputList<Inputs.ServiceUserParameterBinaryOutputFormatArgs>());
            set => _binaryOutputFormats = value;
        }

        [Input("clientMemoryLimits")]
        private InputList<Inputs.ServiceUserParameterClientMemoryLimitArgs>? _clientMemoryLimits;
        public InputList<Inputs.ServiceUserParameterClientMemoryLimitArgs> ClientMemoryLimits
        {
            get => _clientMemoryLimits ?? (_clientMemoryLimits = new InputList<Inputs.ServiceUserParameterClientMemoryLimitArgs>());
            set => _clientMemoryLimits = value;
        }

        [Input("clientMetadataRequestUseConnectionCtxes")]
        private InputList<Inputs.ServiceUserParameterClientMetadataRequestUseConnectionCtxArgs>? _clientMetadataRequestUseConnectionCtxes;
        public InputList<Inputs.ServiceUserParameterClientMetadataRequestUseConnectionCtxArgs> ClientMetadataRequestUseConnectionCtxes
        {
            get => _clientMetadataRequestUseConnectionCtxes ?? (_clientMetadataRequestUseConnectionCtxes = new InputList<Inputs.ServiceUserParameterClientMetadataRequestUseConnectionCtxArgs>());
            set => _clientMetadataRequestUseConnectionCtxes = value;
        }

        [Input("clientPrefetchThreads")]
        private InputList<Inputs.ServiceUserParameterClientPrefetchThreadArgs>? _clientPrefetchThreads;
        public InputList<Inputs.ServiceUserParameterClientPrefetchThreadArgs> ClientPrefetchThreads
        {
            get => _clientPrefetchThreads ?? (_clientPrefetchThreads = new InputList<Inputs.ServiceUserParameterClientPrefetchThreadArgs>());
            set => _clientPrefetchThreads = value;
        }

        [Input("clientResultChunkSizes")]
        private InputList<Inputs.ServiceUserParameterClientResultChunkSizeArgs>? _clientResultChunkSizes;
        public InputList<Inputs.ServiceUserParameterClientResultChunkSizeArgs> ClientResultChunkSizes
        {
            get => _clientResultChunkSizes ?? (_clientResultChunkSizes = new InputList<Inputs.ServiceUserParameterClientResultChunkSizeArgs>());
            set => _clientResultChunkSizes = value;
        }

        [Input("clientResultColumnCaseInsensitives")]
        private InputList<Inputs.ServiceUserParameterClientResultColumnCaseInsensitiveArgs>? _clientResultColumnCaseInsensitives;
        public InputList<Inputs.ServiceUserParameterClientResultColumnCaseInsensitiveArgs> ClientResultColumnCaseInsensitives
        {
            get => _clientResultColumnCaseInsensitives ?? (_clientResultColumnCaseInsensitives = new InputList<Inputs.ServiceUserParameterClientResultColumnCaseInsensitiveArgs>());
            set => _clientResultColumnCaseInsensitives = value;
        }

        [Input("clientSessionKeepAliveHeartbeatFrequencies")]
        private InputList<Inputs.ServiceUserParameterClientSessionKeepAliveHeartbeatFrequencyArgs>? _clientSessionKeepAliveHeartbeatFrequencies;
        public InputList<Inputs.ServiceUserParameterClientSessionKeepAliveHeartbeatFrequencyArgs> ClientSessionKeepAliveHeartbeatFrequencies
        {
            get => _clientSessionKeepAliveHeartbeatFrequencies ?? (_clientSessionKeepAliveHeartbeatFrequencies = new InputList<Inputs.ServiceUserParameterClientSessionKeepAliveHeartbeatFrequencyArgs>());
            set => _clientSessionKeepAliveHeartbeatFrequencies = value;
        }

        [Input("clientSessionKeepAlives")]
        private InputList<Inputs.ServiceUserParameterClientSessionKeepAlifeArgs>? _clientSessionKeepAlives;
        public InputList<Inputs.ServiceUserParameterClientSessionKeepAlifeArgs> ClientSessionKeepAlives
        {
            get => _clientSessionKeepAlives ?? (_clientSessionKeepAlives = new InputList<Inputs.ServiceUserParameterClientSessionKeepAlifeArgs>());
            set => _clientSessionKeepAlives = value;
        }

        [Input("clientTimestampTypeMappings")]
        private InputList<Inputs.ServiceUserParameterClientTimestampTypeMappingArgs>? _clientTimestampTypeMappings;
        public InputList<Inputs.ServiceUserParameterClientTimestampTypeMappingArgs> ClientTimestampTypeMappings
        {
            get => _clientTimestampTypeMappings ?? (_clientTimestampTypeMappings = new InputList<Inputs.ServiceUserParameterClientTimestampTypeMappingArgs>());
            set => _clientTimestampTypeMappings = value;
        }

        [Input("dateInputFormats")]
        private InputList<Inputs.ServiceUserParameterDateInputFormatArgs>? _dateInputFormats;
        public InputList<Inputs.ServiceUserParameterDateInputFormatArgs> DateInputFormats
        {
            get => _dateInputFormats ?? (_dateInputFormats = new InputList<Inputs.ServiceUserParameterDateInputFormatArgs>());
            set => _dateInputFormats = value;
        }

        [Input("dateOutputFormats")]
        private InputList<Inputs.ServiceUserParameterDateOutputFormatArgs>? _dateOutputFormats;
        public InputList<Inputs.ServiceUserParameterDateOutputFormatArgs> DateOutputFormats
        {
            get => _dateOutputFormats ?? (_dateOutputFormats = new InputList<Inputs.ServiceUserParameterDateOutputFormatArgs>());
            set => _dateOutputFormats = value;
        }

        [Input("enableUnloadPhysicalTypeOptimizations")]
        private InputList<Inputs.ServiceUserParameterEnableUnloadPhysicalTypeOptimizationArgs>? _enableUnloadPhysicalTypeOptimizations;
        public InputList<Inputs.ServiceUserParameterEnableUnloadPhysicalTypeOptimizationArgs> EnableUnloadPhysicalTypeOptimizations
        {
            get => _enableUnloadPhysicalTypeOptimizations ?? (_enableUnloadPhysicalTypeOptimizations = new InputList<Inputs.ServiceUserParameterEnableUnloadPhysicalTypeOptimizationArgs>());
            set => _enableUnloadPhysicalTypeOptimizations = value;
        }

        [Input("enableUnredactedQuerySyntaxErrors")]
        private InputList<Inputs.ServiceUserParameterEnableUnredactedQuerySyntaxErrorArgs>? _enableUnredactedQuerySyntaxErrors;
        public InputList<Inputs.ServiceUserParameterEnableUnredactedQuerySyntaxErrorArgs> EnableUnredactedQuerySyntaxErrors
        {
            get => _enableUnredactedQuerySyntaxErrors ?? (_enableUnredactedQuerySyntaxErrors = new InputList<Inputs.ServiceUserParameterEnableUnredactedQuerySyntaxErrorArgs>());
            set => _enableUnredactedQuerySyntaxErrors = value;
        }

        [Input("errorOnNondeterministicMerges")]
        private InputList<Inputs.ServiceUserParameterErrorOnNondeterministicMergeArgs>? _errorOnNondeterministicMerges;
        public InputList<Inputs.ServiceUserParameterErrorOnNondeterministicMergeArgs> ErrorOnNondeterministicMerges
        {
            get => _errorOnNondeterministicMerges ?? (_errorOnNondeterministicMerges = new InputList<Inputs.ServiceUserParameterErrorOnNondeterministicMergeArgs>());
            set => _errorOnNondeterministicMerges = value;
        }

        [Input("errorOnNondeterministicUpdates")]
        private InputList<Inputs.ServiceUserParameterErrorOnNondeterministicUpdateArgs>? _errorOnNondeterministicUpdates;
        public InputList<Inputs.ServiceUserParameterErrorOnNondeterministicUpdateArgs> ErrorOnNondeterministicUpdates
        {
            get => _errorOnNondeterministicUpdates ?? (_errorOnNondeterministicUpdates = new InputList<Inputs.ServiceUserParameterErrorOnNondeterministicUpdateArgs>());
            set => _errorOnNondeterministicUpdates = value;
        }

        [Input("geographyOutputFormats")]
        private InputList<Inputs.ServiceUserParameterGeographyOutputFormatArgs>? _geographyOutputFormats;
        public InputList<Inputs.ServiceUserParameterGeographyOutputFormatArgs> GeographyOutputFormats
        {
            get => _geographyOutputFormats ?? (_geographyOutputFormats = new InputList<Inputs.ServiceUserParameterGeographyOutputFormatArgs>());
            set => _geographyOutputFormats = value;
        }

        [Input("geometryOutputFormats")]
        private InputList<Inputs.ServiceUserParameterGeometryOutputFormatArgs>? _geometryOutputFormats;
        public InputList<Inputs.ServiceUserParameterGeometryOutputFormatArgs> GeometryOutputFormats
        {
            get => _geometryOutputFormats ?? (_geometryOutputFormats = new InputList<Inputs.ServiceUserParameterGeometryOutputFormatArgs>());
            set => _geometryOutputFormats = value;
        }

        [Input("jdbcTreatDecimalAsInts")]
        private InputList<Inputs.ServiceUserParameterJdbcTreatDecimalAsIntArgs>? _jdbcTreatDecimalAsInts;
        public InputList<Inputs.ServiceUserParameterJdbcTreatDecimalAsIntArgs> JdbcTreatDecimalAsInts
        {
            get => _jdbcTreatDecimalAsInts ?? (_jdbcTreatDecimalAsInts = new InputList<Inputs.ServiceUserParameterJdbcTreatDecimalAsIntArgs>());
            set => _jdbcTreatDecimalAsInts = value;
        }

        [Input("jdbcTreatTimestampNtzAsUtcs")]
        private InputList<Inputs.ServiceUserParameterJdbcTreatTimestampNtzAsUtcArgs>? _jdbcTreatTimestampNtzAsUtcs;
        public InputList<Inputs.ServiceUserParameterJdbcTreatTimestampNtzAsUtcArgs> JdbcTreatTimestampNtzAsUtcs
        {
            get => _jdbcTreatTimestampNtzAsUtcs ?? (_jdbcTreatTimestampNtzAsUtcs = new InputList<Inputs.ServiceUserParameterJdbcTreatTimestampNtzAsUtcArgs>());
            set => _jdbcTreatTimestampNtzAsUtcs = value;
        }

        [Input("jdbcUseSessionTimezones")]
        private InputList<Inputs.ServiceUserParameterJdbcUseSessionTimezoneArgs>? _jdbcUseSessionTimezones;
        public InputList<Inputs.ServiceUserParameterJdbcUseSessionTimezoneArgs> JdbcUseSessionTimezones
        {
            get => _jdbcUseSessionTimezones ?? (_jdbcUseSessionTimezones = new InputList<Inputs.ServiceUserParameterJdbcUseSessionTimezoneArgs>());
            set => _jdbcUseSessionTimezones = value;
        }

        [Input("jsonIndents")]
        private InputList<Inputs.ServiceUserParameterJsonIndentArgs>? _jsonIndents;
        public InputList<Inputs.ServiceUserParameterJsonIndentArgs> JsonIndents
        {
            get => _jsonIndents ?? (_jsonIndents = new InputList<Inputs.ServiceUserParameterJsonIndentArgs>());
            set => _jsonIndents = value;
        }

        [Input("lockTimeouts")]
        private InputList<Inputs.ServiceUserParameterLockTimeoutArgs>? _lockTimeouts;
        public InputList<Inputs.ServiceUserParameterLockTimeoutArgs> LockTimeouts
        {
            get => _lockTimeouts ?? (_lockTimeouts = new InputList<Inputs.ServiceUserParameterLockTimeoutArgs>());
            set => _lockTimeouts = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.ServiceUserParameterLogLevelArgs>? _logLevels;
        public InputList<Inputs.ServiceUserParameterLogLevelArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.ServiceUserParameterLogLevelArgs>());
            set => _logLevels = value;
        }

        [Input("multiStatementCounts")]
        private InputList<Inputs.ServiceUserParameterMultiStatementCountArgs>? _multiStatementCounts;
        public InputList<Inputs.ServiceUserParameterMultiStatementCountArgs> MultiStatementCounts
        {
            get => _multiStatementCounts ?? (_multiStatementCounts = new InputList<Inputs.ServiceUserParameterMultiStatementCountArgs>());
            set => _multiStatementCounts = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.ServiceUserParameterNetworkPolicyArgs>? _networkPolicies;
        public InputList<Inputs.ServiceUserParameterNetworkPolicyArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.ServiceUserParameterNetworkPolicyArgs>());
            set => _networkPolicies = value;
        }

        [Input("noorderSequenceAsDefaults")]
        private InputList<Inputs.ServiceUserParameterNoorderSequenceAsDefaultArgs>? _noorderSequenceAsDefaults;
        public InputList<Inputs.ServiceUserParameterNoorderSequenceAsDefaultArgs> NoorderSequenceAsDefaults
        {
            get => _noorderSequenceAsDefaults ?? (_noorderSequenceAsDefaults = new InputList<Inputs.ServiceUserParameterNoorderSequenceAsDefaultArgs>());
            set => _noorderSequenceAsDefaults = value;
        }

        [Input("odbcTreatDecimalAsInts")]
        private InputList<Inputs.ServiceUserParameterOdbcTreatDecimalAsIntArgs>? _odbcTreatDecimalAsInts;
        public InputList<Inputs.ServiceUserParameterOdbcTreatDecimalAsIntArgs> OdbcTreatDecimalAsInts
        {
            get => _odbcTreatDecimalAsInts ?? (_odbcTreatDecimalAsInts = new InputList<Inputs.ServiceUserParameterOdbcTreatDecimalAsIntArgs>());
            set => _odbcTreatDecimalAsInts = value;
        }

        [Input("preventUnloadToInternalStages")]
        private InputList<Inputs.ServiceUserParameterPreventUnloadToInternalStageArgs>? _preventUnloadToInternalStages;
        public InputList<Inputs.ServiceUserParameterPreventUnloadToInternalStageArgs> PreventUnloadToInternalStages
        {
            get => _preventUnloadToInternalStages ?? (_preventUnloadToInternalStages = new InputList<Inputs.ServiceUserParameterPreventUnloadToInternalStageArgs>());
            set => _preventUnloadToInternalStages = value;
        }

        [Input("queryTags")]
        private InputList<Inputs.ServiceUserParameterQueryTagArgs>? _queryTags;
        public InputList<Inputs.ServiceUserParameterQueryTagArgs> QueryTags
        {
            get => _queryTags ?? (_queryTags = new InputList<Inputs.ServiceUserParameterQueryTagArgs>());
            set => _queryTags = value;
        }

        [Input("quotedIdentifiersIgnoreCases")]
        private InputList<Inputs.ServiceUserParameterQuotedIdentifiersIgnoreCaseArgs>? _quotedIdentifiersIgnoreCases;
        public InputList<Inputs.ServiceUserParameterQuotedIdentifiersIgnoreCaseArgs> QuotedIdentifiersIgnoreCases
        {
            get => _quotedIdentifiersIgnoreCases ?? (_quotedIdentifiersIgnoreCases = new InputList<Inputs.ServiceUserParameterQuotedIdentifiersIgnoreCaseArgs>());
            set => _quotedIdentifiersIgnoreCases = value;
        }

        [Input("rowsPerResultsets")]
        private InputList<Inputs.ServiceUserParameterRowsPerResultsetArgs>? _rowsPerResultsets;
        public InputList<Inputs.ServiceUserParameterRowsPerResultsetArgs> RowsPerResultsets
        {
            get => _rowsPerResultsets ?? (_rowsPerResultsets = new InputList<Inputs.ServiceUserParameterRowsPerResultsetArgs>());
            set => _rowsPerResultsets = value;
        }

        [Input("s3StageVpceDnsNames")]
        private InputList<Inputs.ServiceUserParameterS3StageVpceDnsNameArgs>? _s3StageVpceDnsNames;
        public InputList<Inputs.ServiceUserParameterS3StageVpceDnsNameArgs> S3StageVpceDnsNames
        {
            get => _s3StageVpceDnsNames ?? (_s3StageVpceDnsNames = new InputList<Inputs.ServiceUserParameterS3StageVpceDnsNameArgs>());
            set => _s3StageVpceDnsNames = value;
        }

        [Input("searchPaths")]
        private InputList<Inputs.ServiceUserParameterSearchPathArgs>? _searchPaths;
        public InputList<Inputs.ServiceUserParameterSearchPathArgs> SearchPaths
        {
            get => _searchPaths ?? (_searchPaths = new InputList<Inputs.ServiceUserParameterSearchPathArgs>());
            set => _searchPaths = value;
        }

        [Input("simulatedDataSharingConsumers")]
        private InputList<Inputs.ServiceUserParameterSimulatedDataSharingConsumerArgs>? _simulatedDataSharingConsumers;
        public InputList<Inputs.ServiceUserParameterSimulatedDataSharingConsumerArgs> SimulatedDataSharingConsumers
        {
            get => _simulatedDataSharingConsumers ?? (_simulatedDataSharingConsumers = new InputList<Inputs.ServiceUserParameterSimulatedDataSharingConsumerArgs>());
            set => _simulatedDataSharingConsumers = value;
        }

        [Input("statementQueuedTimeoutInSeconds")]
        private InputList<Inputs.ServiceUserParameterStatementQueuedTimeoutInSecondArgs>? _statementQueuedTimeoutInSeconds;
        public InputList<Inputs.ServiceUserParameterStatementQueuedTimeoutInSecondArgs> StatementQueuedTimeoutInSeconds
        {
            get => _statementQueuedTimeoutInSeconds ?? (_statementQueuedTimeoutInSeconds = new InputList<Inputs.ServiceUserParameterStatementQueuedTimeoutInSecondArgs>());
            set => _statementQueuedTimeoutInSeconds = value;
        }

        [Input("statementTimeoutInSeconds")]
        private InputList<Inputs.ServiceUserParameterStatementTimeoutInSecondArgs>? _statementTimeoutInSeconds;
        public InputList<Inputs.ServiceUserParameterStatementTimeoutInSecondArgs> StatementTimeoutInSeconds
        {
            get => _statementTimeoutInSeconds ?? (_statementTimeoutInSeconds = new InputList<Inputs.ServiceUserParameterStatementTimeoutInSecondArgs>());
            set => _statementTimeoutInSeconds = value;
        }

        [Input("strictJsonOutputs")]
        private InputList<Inputs.ServiceUserParameterStrictJsonOutputArgs>? _strictJsonOutputs;
        public InputList<Inputs.ServiceUserParameterStrictJsonOutputArgs> StrictJsonOutputs
        {
            get => _strictJsonOutputs ?? (_strictJsonOutputs = new InputList<Inputs.ServiceUserParameterStrictJsonOutputArgs>());
            set => _strictJsonOutputs = value;
        }

        [Input("timeInputFormats")]
        private InputList<Inputs.ServiceUserParameterTimeInputFormatArgs>? _timeInputFormats;
        public InputList<Inputs.ServiceUserParameterTimeInputFormatArgs> TimeInputFormats
        {
            get => _timeInputFormats ?? (_timeInputFormats = new InputList<Inputs.ServiceUserParameterTimeInputFormatArgs>());
            set => _timeInputFormats = value;
        }

        [Input("timeOutputFormats")]
        private InputList<Inputs.ServiceUserParameterTimeOutputFormatArgs>? _timeOutputFormats;
        public InputList<Inputs.ServiceUserParameterTimeOutputFormatArgs> TimeOutputFormats
        {
            get => _timeOutputFormats ?? (_timeOutputFormats = new InputList<Inputs.ServiceUserParameterTimeOutputFormatArgs>());
            set => _timeOutputFormats = value;
        }

        [Input("timestampDayIsAlways24hs")]
        private InputList<Inputs.ServiceUserParameterTimestampDayIsAlways24hArgs>? _timestampDayIsAlways24hs;
        public InputList<Inputs.ServiceUserParameterTimestampDayIsAlways24hArgs> TimestampDayIsAlways24hs
        {
            get => _timestampDayIsAlways24hs ?? (_timestampDayIsAlways24hs = new InputList<Inputs.ServiceUserParameterTimestampDayIsAlways24hArgs>());
            set => _timestampDayIsAlways24hs = value;
        }

        [Input("timestampInputFormats")]
        private InputList<Inputs.ServiceUserParameterTimestampInputFormatArgs>? _timestampInputFormats;
        public InputList<Inputs.ServiceUserParameterTimestampInputFormatArgs> TimestampInputFormats
        {
            get => _timestampInputFormats ?? (_timestampInputFormats = new InputList<Inputs.ServiceUserParameterTimestampInputFormatArgs>());
            set => _timestampInputFormats = value;
        }

        [Input("timestampLtzOutputFormats")]
        private InputList<Inputs.ServiceUserParameterTimestampLtzOutputFormatArgs>? _timestampLtzOutputFormats;
        public InputList<Inputs.ServiceUserParameterTimestampLtzOutputFormatArgs> TimestampLtzOutputFormats
        {
            get => _timestampLtzOutputFormats ?? (_timestampLtzOutputFormats = new InputList<Inputs.ServiceUserParameterTimestampLtzOutputFormatArgs>());
            set => _timestampLtzOutputFormats = value;
        }

        [Input("timestampNtzOutputFormats")]
        private InputList<Inputs.ServiceUserParameterTimestampNtzOutputFormatArgs>? _timestampNtzOutputFormats;
        public InputList<Inputs.ServiceUserParameterTimestampNtzOutputFormatArgs> TimestampNtzOutputFormats
        {
            get => _timestampNtzOutputFormats ?? (_timestampNtzOutputFormats = new InputList<Inputs.ServiceUserParameterTimestampNtzOutputFormatArgs>());
            set => _timestampNtzOutputFormats = value;
        }

        [Input("timestampOutputFormats")]
        private InputList<Inputs.ServiceUserParameterTimestampOutputFormatArgs>? _timestampOutputFormats;
        public InputList<Inputs.ServiceUserParameterTimestampOutputFormatArgs> TimestampOutputFormats
        {
            get => _timestampOutputFormats ?? (_timestampOutputFormats = new InputList<Inputs.ServiceUserParameterTimestampOutputFormatArgs>());
            set => _timestampOutputFormats = value;
        }

        [Input("timestampTypeMappings")]
        private InputList<Inputs.ServiceUserParameterTimestampTypeMappingArgs>? _timestampTypeMappings;
        public InputList<Inputs.ServiceUserParameterTimestampTypeMappingArgs> TimestampTypeMappings
        {
            get => _timestampTypeMappings ?? (_timestampTypeMappings = new InputList<Inputs.ServiceUserParameterTimestampTypeMappingArgs>());
            set => _timestampTypeMappings = value;
        }

        [Input("timestampTzOutputFormats")]
        private InputList<Inputs.ServiceUserParameterTimestampTzOutputFormatArgs>? _timestampTzOutputFormats;
        public InputList<Inputs.ServiceUserParameterTimestampTzOutputFormatArgs> TimestampTzOutputFormats
        {
            get => _timestampTzOutputFormats ?? (_timestampTzOutputFormats = new InputList<Inputs.ServiceUserParameterTimestampTzOutputFormatArgs>());
            set => _timestampTzOutputFormats = value;
        }

        [Input("timezones")]
        private InputList<Inputs.ServiceUserParameterTimezoneArgs>? _timezones;
        public InputList<Inputs.ServiceUserParameterTimezoneArgs> Timezones
        {
            get => _timezones ?? (_timezones = new InputList<Inputs.ServiceUserParameterTimezoneArgs>());
            set => _timezones = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.ServiceUserParameterTraceLevelArgs>? _traceLevels;
        public InputList<Inputs.ServiceUserParameterTraceLevelArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.ServiceUserParameterTraceLevelArgs>());
            set => _traceLevels = value;
        }

        [Input("transactionAbortOnErrors")]
        private InputList<Inputs.ServiceUserParameterTransactionAbortOnErrorArgs>? _transactionAbortOnErrors;
        public InputList<Inputs.ServiceUserParameterTransactionAbortOnErrorArgs> TransactionAbortOnErrors
        {
            get => _transactionAbortOnErrors ?? (_transactionAbortOnErrors = new InputList<Inputs.ServiceUserParameterTransactionAbortOnErrorArgs>());
            set => _transactionAbortOnErrors = value;
        }

        [Input("transactionDefaultIsolationLevels")]
        private InputList<Inputs.ServiceUserParameterTransactionDefaultIsolationLevelArgs>? _transactionDefaultIsolationLevels;
        public InputList<Inputs.ServiceUserParameterTransactionDefaultIsolationLevelArgs> TransactionDefaultIsolationLevels
        {
            get => _transactionDefaultIsolationLevels ?? (_transactionDefaultIsolationLevels = new InputList<Inputs.ServiceUserParameterTransactionDefaultIsolationLevelArgs>());
            set => _transactionDefaultIsolationLevels = value;
        }

        [Input("twoDigitCenturyStarts")]
        private InputList<Inputs.ServiceUserParameterTwoDigitCenturyStartArgs>? _twoDigitCenturyStarts;
        public InputList<Inputs.ServiceUserParameterTwoDigitCenturyStartArgs> TwoDigitCenturyStarts
        {
            get => _twoDigitCenturyStarts ?? (_twoDigitCenturyStarts = new InputList<Inputs.ServiceUserParameterTwoDigitCenturyStartArgs>());
            set => _twoDigitCenturyStarts = value;
        }

        [Input("unsupportedDdlActions")]
        private InputList<Inputs.ServiceUserParameterUnsupportedDdlActionArgs>? _unsupportedDdlActions;
        public InputList<Inputs.ServiceUserParameterUnsupportedDdlActionArgs> UnsupportedDdlActions
        {
            get => _unsupportedDdlActions ?? (_unsupportedDdlActions = new InputList<Inputs.ServiceUserParameterUnsupportedDdlActionArgs>());
            set => _unsupportedDdlActions = value;
        }

        [Input("useCachedResults")]
        private InputList<Inputs.ServiceUserParameterUseCachedResultArgs>? _useCachedResults;
        public InputList<Inputs.ServiceUserParameterUseCachedResultArgs> UseCachedResults
        {
            get => _useCachedResults ?? (_useCachedResults = new InputList<Inputs.ServiceUserParameterUseCachedResultArgs>());
            set => _useCachedResults = value;
        }

        [Input("weekOfYearPolicies")]
        private InputList<Inputs.ServiceUserParameterWeekOfYearPolicyArgs>? _weekOfYearPolicies;
        public InputList<Inputs.ServiceUserParameterWeekOfYearPolicyArgs> WeekOfYearPolicies
        {
            get => _weekOfYearPolicies ?? (_weekOfYearPolicies = new InputList<Inputs.ServiceUserParameterWeekOfYearPolicyArgs>());
            set => _weekOfYearPolicies = value;
        }

        [Input("weekStarts")]
        private InputList<Inputs.ServiceUserParameterWeekStartArgs>? _weekStarts;
        public InputList<Inputs.ServiceUserParameterWeekStartArgs> WeekStarts
        {
            get => _weekStarts ?? (_weekStarts = new InputList<Inputs.ServiceUserParameterWeekStartArgs>());
            set => _weekStarts = value;
        }

        public ServiceUserParameterArgs()
        {
        }
        public static new ServiceUserParameterArgs Empty => new ServiceUserParameterArgs();
    }
}
