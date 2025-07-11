// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class UserParameterArgs : global::Pulumi.ResourceArgs
    {
        [Input("abortDetachedQueries")]
        private InputList<Inputs.UserParameterAbortDetachedQueryArgs>? _abortDetachedQueries;
        public InputList<Inputs.UserParameterAbortDetachedQueryArgs> AbortDetachedQueries
        {
            get => _abortDetachedQueries ?? (_abortDetachedQueries = new InputList<Inputs.UserParameterAbortDetachedQueryArgs>());
            set => _abortDetachedQueries = value;
        }

        [Input("autocommits")]
        private InputList<Inputs.UserParameterAutocommitArgs>? _autocommits;
        public InputList<Inputs.UserParameterAutocommitArgs> Autocommits
        {
            get => _autocommits ?? (_autocommits = new InputList<Inputs.UserParameterAutocommitArgs>());
            set => _autocommits = value;
        }

        [Input("binaryInputFormats")]
        private InputList<Inputs.UserParameterBinaryInputFormatArgs>? _binaryInputFormats;
        public InputList<Inputs.UserParameterBinaryInputFormatArgs> BinaryInputFormats
        {
            get => _binaryInputFormats ?? (_binaryInputFormats = new InputList<Inputs.UserParameterBinaryInputFormatArgs>());
            set => _binaryInputFormats = value;
        }

        [Input("binaryOutputFormats")]
        private InputList<Inputs.UserParameterBinaryOutputFormatArgs>? _binaryOutputFormats;
        public InputList<Inputs.UserParameterBinaryOutputFormatArgs> BinaryOutputFormats
        {
            get => _binaryOutputFormats ?? (_binaryOutputFormats = new InputList<Inputs.UserParameterBinaryOutputFormatArgs>());
            set => _binaryOutputFormats = value;
        }

        [Input("clientMemoryLimits")]
        private InputList<Inputs.UserParameterClientMemoryLimitArgs>? _clientMemoryLimits;
        public InputList<Inputs.UserParameterClientMemoryLimitArgs> ClientMemoryLimits
        {
            get => _clientMemoryLimits ?? (_clientMemoryLimits = new InputList<Inputs.UserParameterClientMemoryLimitArgs>());
            set => _clientMemoryLimits = value;
        }

        [Input("clientMetadataRequestUseConnectionCtxes")]
        private InputList<Inputs.UserParameterClientMetadataRequestUseConnectionCtxArgs>? _clientMetadataRequestUseConnectionCtxes;
        public InputList<Inputs.UserParameterClientMetadataRequestUseConnectionCtxArgs> ClientMetadataRequestUseConnectionCtxes
        {
            get => _clientMetadataRequestUseConnectionCtxes ?? (_clientMetadataRequestUseConnectionCtxes = new InputList<Inputs.UserParameterClientMetadataRequestUseConnectionCtxArgs>());
            set => _clientMetadataRequestUseConnectionCtxes = value;
        }

        [Input("clientPrefetchThreads")]
        private InputList<Inputs.UserParameterClientPrefetchThreadArgs>? _clientPrefetchThreads;
        public InputList<Inputs.UserParameterClientPrefetchThreadArgs> ClientPrefetchThreads
        {
            get => _clientPrefetchThreads ?? (_clientPrefetchThreads = new InputList<Inputs.UserParameterClientPrefetchThreadArgs>());
            set => _clientPrefetchThreads = value;
        }

        [Input("clientResultChunkSizes")]
        private InputList<Inputs.UserParameterClientResultChunkSizeArgs>? _clientResultChunkSizes;
        public InputList<Inputs.UserParameterClientResultChunkSizeArgs> ClientResultChunkSizes
        {
            get => _clientResultChunkSizes ?? (_clientResultChunkSizes = new InputList<Inputs.UserParameterClientResultChunkSizeArgs>());
            set => _clientResultChunkSizes = value;
        }

        [Input("clientResultColumnCaseInsensitives")]
        private InputList<Inputs.UserParameterClientResultColumnCaseInsensitiveArgs>? _clientResultColumnCaseInsensitives;
        public InputList<Inputs.UserParameterClientResultColumnCaseInsensitiveArgs> ClientResultColumnCaseInsensitives
        {
            get => _clientResultColumnCaseInsensitives ?? (_clientResultColumnCaseInsensitives = new InputList<Inputs.UserParameterClientResultColumnCaseInsensitiveArgs>());
            set => _clientResultColumnCaseInsensitives = value;
        }

        [Input("clientSessionKeepAliveHeartbeatFrequencies")]
        private InputList<Inputs.UserParameterClientSessionKeepAliveHeartbeatFrequencyArgs>? _clientSessionKeepAliveHeartbeatFrequencies;
        public InputList<Inputs.UserParameterClientSessionKeepAliveHeartbeatFrequencyArgs> ClientSessionKeepAliveHeartbeatFrequencies
        {
            get => _clientSessionKeepAliveHeartbeatFrequencies ?? (_clientSessionKeepAliveHeartbeatFrequencies = new InputList<Inputs.UserParameterClientSessionKeepAliveHeartbeatFrequencyArgs>());
            set => _clientSessionKeepAliveHeartbeatFrequencies = value;
        }

        [Input("clientSessionKeepAlives")]
        private InputList<Inputs.UserParameterClientSessionKeepAlifeArgs>? _clientSessionKeepAlives;
        public InputList<Inputs.UserParameterClientSessionKeepAlifeArgs> ClientSessionKeepAlives
        {
            get => _clientSessionKeepAlives ?? (_clientSessionKeepAlives = new InputList<Inputs.UserParameterClientSessionKeepAlifeArgs>());
            set => _clientSessionKeepAlives = value;
        }

        [Input("clientTimestampTypeMappings")]
        private InputList<Inputs.UserParameterClientTimestampTypeMappingArgs>? _clientTimestampTypeMappings;
        public InputList<Inputs.UserParameterClientTimestampTypeMappingArgs> ClientTimestampTypeMappings
        {
            get => _clientTimestampTypeMappings ?? (_clientTimestampTypeMappings = new InputList<Inputs.UserParameterClientTimestampTypeMappingArgs>());
            set => _clientTimestampTypeMappings = value;
        }

        [Input("dateInputFormats")]
        private InputList<Inputs.UserParameterDateInputFormatArgs>? _dateInputFormats;
        public InputList<Inputs.UserParameterDateInputFormatArgs> DateInputFormats
        {
            get => _dateInputFormats ?? (_dateInputFormats = new InputList<Inputs.UserParameterDateInputFormatArgs>());
            set => _dateInputFormats = value;
        }

        [Input("dateOutputFormats")]
        private InputList<Inputs.UserParameterDateOutputFormatArgs>? _dateOutputFormats;
        public InputList<Inputs.UserParameterDateOutputFormatArgs> DateOutputFormats
        {
            get => _dateOutputFormats ?? (_dateOutputFormats = new InputList<Inputs.UserParameterDateOutputFormatArgs>());
            set => _dateOutputFormats = value;
        }

        [Input("enableUnloadPhysicalTypeOptimizations")]
        private InputList<Inputs.UserParameterEnableUnloadPhysicalTypeOptimizationArgs>? _enableUnloadPhysicalTypeOptimizations;
        public InputList<Inputs.UserParameterEnableUnloadPhysicalTypeOptimizationArgs> EnableUnloadPhysicalTypeOptimizations
        {
            get => _enableUnloadPhysicalTypeOptimizations ?? (_enableUnloadPhysicalTypeOptimizations = new InputList<Inputs.UserParameterEnableUnloadPhysicalTypeOptimizationArgs>());
            set => _enableUnloadPhysicalTypeOptimizations = value;
        }

        [Input("enableUnredactedQuerySyntaxErrors")]
        private InputList<Inputs.UserParameterEnableUnredactedQuerySyntaxErrorArgs>? _enableUnredactedQuerySyntaxErrors;
        public InputList<Inputs.UserParameterEnableUnredactedQuerySyntaxErrorArgs> EnableUnredactedQuerySyntaxErrors
        {
            get => _enableUnredactedQuerySyntaxErrors ?? (_enableUnredactedQuerySyntaxErrors = new InputList<Inputs.UserParameterEnableUnredactedQuerySyntaxErrorArgs>());
            set => _enableUnredactedQuerySyntaxErrors = value;
        }

        [Input("errorOnNondeterministicMerges")]
        private InputList<Inputs.UserParameterErrorOnNondeterministicMergeArgs>? _errorOnNondeterministicMerges;
        public InputList<Inputs.UserParameterErrorOnNondeterministicMergeArgs> ErrorOnNondeterministicMerges
        {
            get => _errorOnNondeterministicMerges ?? (_errorOnNondeterministicMerges = new InputList<Inputs.UserParameterErrorOnNondeterministicMergeArgs>());
            set => _errorOnNondeterministicMerges = value;
        }

        [Input("errorOnNondeterministicUpdates")]
        private InputList<Inputs.UserParameterErrorOnNondeterministicUpdateArgs>? _errorOnNondeterministicUpdates;
        public InputList<Inputs.UserParameterErrorOnNondeterministicUpdateArgs> ErrorOnNondeterministicUpdates
        {
            get => _errorOnNondeterministicUpdates ?? (_errorOnNondeterministicUpdates = new InputList<Inputs.UserParameterErrorOnNondeterministicUpdateArgs>());
            set => _errorOnNondeterministicUpdates = value;
        }

        [Input("geographyOutputFormats")]
        private InputList<Inputs.UserParameterGeographyOutputFormatArgs>? _geographyOutputFormats;
        public InputList<Inputs.UserParameterGeographyOutputFormatArgs> GeographyOutputFormats
        {
            get => _geographyOutputFormats ?? (_geographyOutputFormats = new InputList<Inputs.UserParameterGeographyOutputFormatArgs>());
            set => _geographyOutputFormats = value;
        }

        [Input("geometryOutputFormats")]
        private InputList<Inputs.UserParameterGeometryOutputFormatArgs>? _geometryOutputFormats;
        public InputList<Inputs.UserParameterGeometryOutputFormatArgs> GeometryOutputFormats
        {
            get => _geometryOutputFormats ?? (_geometryOutputFormats = new InputList<Inputs.UserParameterGeometryOutputFormatArgs>());
            set => _geometryOutputFormats = value;
        }

        [Input("jdbcTreatDecimalAsInts")]
        private InputList<Inputs.UserParameterJdbcTreatDecimalAsIntArgs>? _jdbcTreatDecimalAsInts;
        public InputList<Inputs.UserParameterJdbcTreatDecimalAsIntArgs> JdbcTreatDecimalAsInts
        {
            get => _jdbcTreatDecimalAsInts ?? (_jdbcTreatDecimalAsInts = new InputList<Inputs.UserParameterJdbcTreatDecimalAsIntArgs>());
            set => _jdbcTreatDecimalAsInts = value;
        }

        [Input("jdbcTreatTimestampNtzAsUtcs")]
        private InputList<Inputs.UserParameterJdbcTreatTimestampNtzAsUtcArgs>? _jdbcTreatTimestampNtzAsUtcs;
        public InputList<Inputs.UserParameterJdbcTreatTimestampNtzAsUtcArgs> JdbcTreatTimestampNtzAsUtcs
        {
            get => _jdbcTreatTimestampNtzAsUtcs ?? (_jdbcTreatTimestampNtzAsUtcs = new InputList<Inputs.UserParameterJdbcTreatTimestampNtzAsUtcArgs>());
            set => _jdbcTreatTimestampNtzAsUtcs = value;
        }

        [Input("jdbcUseSessionTimezones")]
        private InputList<Inputs.UserParameterJdbcUseSessionTimezoneArgs>? _jdbcUseSessionTimezones;
        public InputList<Inputs.UserParameterJdbcUseSessionTimezoneArgs> JdbcUseSessionTimezones
        {
            get => _jdbcUseSessionTimezones ?? (_jdbcUseSessionTimezones = new InputList<Inputs.UserParameterJdbcUseSessionTimezoneArgs>());
            set => _jdbcUseSessionTimezones = value;
        }

        [Input("jsonIndents")]
        private InputList<Inputs.UserParameterJsonIndentArgs>? _jsonIndents;
        public InputList<Inputs.UserParameterJsonIndentArgs> JsonIndents
        {
            get => _jsonIndents ?? (_jsonIndents = new InputList<Inputs.UserParameterJsonIndentArgs>());
            set => _jsonIndents = value;
        }

        [Input("lockTimeouts")]
        private InputList<Inputs.UserParameterLockTimeoutArgs>? _lockTimeouts;
        public InputList<Inputs.UserParameterLockTimeoutArgs> LockTimeouts
        {
            get => _lockTimeouts ?? (_lockTimeouts = new InputList<Inputs.UserParameterLockTimeoutArgs>());
            set => _lockTimeouts = value;
        }

        [Input("logLevels")]
        private InputList<Inputs.UserParameterLogLevelArgs>? _logLevels;
        public InputList<Inputs.UserParameterLogLevelArgs> LogLevels
        {
            get => _logLevels ?? (_logLevels = new InputList<Inputs.UserParameterLogLevelArgs>());
            set => _logLevels = value;
        }

        [Input("multiStatementCounts")]
        private InputList<Inputs.UserParameterMultiStatementCountArgs>? _multiStatementCounts;
        public InputList<Inputs.UserParameterMultiStatementCountArgs> MultiStatementCounts
        {
            get => _multiStatementCounts ?? (_multiStatementCounts = new InputList<Inputs.UserParameterMultiStatementCountArgs>());
            set => _multiStatementCounts = value;
        }

        [Input("networkPolicies")]
        private InputList<Inputs.UserParameterNetworkPolicyArgs>? _networkPolicies;
        public InputList<Inputs.UserParameterNetworkPolicyArgs> NetworkPolicies
        {
            get => _networkPolicies ?? (_networkPolicies = new InputList<Inputs.UserParameterNetworkPolicyArgs>());
            set => _networkPolicies = value;
        }

        [Input("noorderSequenceAsDefaults")]
        private InputList<Inputs.UserParameterNoorderSequenceAsDefaultArgs>? _noorderSequenceAsDefaults;
        public InputList<Inputs.UserParameterNoorderSequenceAsDefaultArgs> NoorderSequenceAsDefaults
        {
            get => _noorderSequenceAsDefaults ?? (_noorderSequenceAsDefaults = new InputList<Inputs.UserParameterNoorderSequenceAsDefaultArgs>());
            set => _noorderSequenceAsDefaults = value;
        }

        [Input("odbcTreatDecimalAsInts")]
        private InputList<Inputs.UserParameterOdbcTreatDecimalAsIntArgs>? _odbcTreatDecimalAsInts;
        public InputList<Inputs.UserParameterOdbcTreatDecimalAsIntArgs> OdbcTreatDecimalAsInts
        {
            get => _odbcTreatDecimalAsInts ?? (_odbcTreatDecimalAsInts = new InputList<Inputs.UserParameterOdbcTreatDecimalAsIntArgs>());
            set => _odbcTreatDecimalAsInts = value;
        }

        [Input("preventUnloadToInternalStages")]
        private InputList<Inputs.UserParameterPreventUnloadToInternalStageArgs>? _preventUnloadToInternalStages;
        public InputList<Inputs.UserParameterPreventUnloadToInternalStageArgs> PreventUnloadToInternalStages
        {
            get => _preventUnloadToInternalStages ?? (_preventUnloadToInternalStages = new InputList<Inputs.UserParameterPreventUnloadToInternalStageArgs>());
            set => _preventUnloadToInternalStages = value;
        }

        [Input("queryTags")]
        private InputList<Inputs.UserParameterQueryTagArgs>? _queryTags;
        public InputList<Inputs.UserParameterQueryTagArgs> QueryTags
        {
            get => _queryTags ?? (_queryTags = new InputList<Inputs.UserParameterQueryTagArgs>());
            set => _queryTags = value;
        }

        [Input("quotedIdentifiersIgnoreCases")]
        private InputList<Inputs.UserParameterQuotedIdentifiersIgnoreCaseArgs>? _quotedIdentifiersIgnoreCases;
        public InputList<Inputs.UserParameterQuotedIdentifiersIgnoreCaseArgs> QuotedIdentifiersIgnoreCases
        {
            get => _quotedIdentifiersIgnoreCases ?? (_quotedIdentifiersIgnoreCases = new InputList<Inputs.UserParameterQuotedIdentifiersIgnoreCaseArgs>());
            set => _quotedIdentifiersIgnoreCases = value;
        }

        [Input("rowsPerResultsets")]
        private InputList<Inputs.UserParameterRowsPerResultsetArgs>? _rowsPerResultsets;
        public InputList<Inputs.UserParameterRowsPerResultsetArgs> RowsPerResultsets
        {
            get => _rowsPerResultsets ?? (_rowsPerResultsets = new InputList<Inputs.UserParameterRowsPerResultsetArgs>());
            set => _rowsPerResultsets = value;
        }

        [Input("s3StageVpceDnsNames")]
        private InputList<Inputs.UserParameterS3StageVpceDnsNameArgs>? _s3StageVpceDnsNames;
        public InputList<Inputs.UserParameterS3StageVpceDnsNameArgs> S3StageVpceDnsNames
        {
            get => _s3StageVpceDnsNames ?? (_s3StageVpceDnsNames = new InputList<Inputs.UserParameterS3StageVpceDnsNameArgs>());
            set => _s3StageVpceDnsNames = value;
        }

        [Input("searchPaths")]
        private InputList<Inputs.UserParameterSearchPathArgs>? _searchPaths;
        public InputList<Inputs.UserParameterSearchPathArgs> SearchPaths
        {
            get => _searchPaths ?? (_searchPaths = new InputList<Inputs.UserParameterSearchPathArgs>());
            set => _searchPaths = value;
        }

        [Input("simulatedDataSharingConsumers")]
        private InputList<Inputs.UserParameterSimulatedDataSharingConsumerArgs>? _simulatedDataSharingConsumers;
        public InputList<Inputs.UserParameterSimulatedDataSharingConsumerArgs> SimulatedDataSharingConsumers
        {
            get => _simulatedDataSharingConsumers ?? (_simulatedDataSharingConsumers = new InputList<Inputs.UserParameterSimulatedDataSharingConsumerArgs>());
            set => _simulatedDataSharingConsumers = value;
        }

        [Input("statementQueuedTimeoutInSeconds")]
        private InputList<Inputs.UserParameterStatementQueuedTimeoutInSecondArgs>? _statementQueuedTimeoutInSeconds;
        public InputList<Inputs.UserParameterStatementQueuedTimeoutInSecondArgs> StatementQueuedTimeoutInSeconds
        {
            get => _statementQueuedTimeoutInSeconds ?? (_statementQueuedTimeoutInSeconds = new InputList<Inputs.UserParameterStatementQueuedTimeoutInSecondArgs>());
            set => _statementQueuedTimeoutInSeconds = value;
        }

        [Input("statementTimeoutInSeconds")]
        private InputList<Inputs.UserParameterStatementTimeoutInSecondArgs>? _statementTimeoutInSeconds;
        public InputList<Inputs.UserParameterStatementTimeoutInSecondArgs> StatementTimeoutInSeconds
        {
            get => _statementTimeoutInSeconds ?? (_statementTimeoutInSeconds = new InputList<Inputs.UserParameterStatementTimeoutInSecondArgs>());
            set => _statementTimeoutInSeconds = value;
        }

        [Input("strictJsonOutputs")]
        private InputList<Inputs.UserParameterStrictJsonOutputArgs>? _strictJsonOutputs;
        public InputList<Inputs.UserParameterStrictJsonOutputArgs> StrictJsonOutputs
        {
            get => _strictJsonOutputs ?? (_strictJsonOutputs = new InputList<Inputs.UserParameterStrictJsonOutputArgs>());
            set => _strictJsonOutputs = value;
        }

        [Input("timeInputFormats")]
        private InputList<Inputs.UserParameterTimeInputFormatArgs>? _timeInputFormats;
        public InputList<Inputs.UserParameterTimeInputFormatArgs> TimeInputFormats
        {
            get => _timeInputFormats ?? (_timeInputFormats = new InputList<Inputs.UserParameterTimeInputFormatArgs>());
            set => _timeInputFormats = value;
        }

        [Input("timeOutputFormats")]
        private InputList<Inputs.UserParameterTimeOutputFormatArgs>? _timeOutputFormats;
        public InputList<Inputs.UserParameterTimeOutputFormatArgs> TimeOutputFormats
        {
            get => _timeOutputFormats ?? (_timeOutputFormats = new InputList<Inputs.UserParameterTimeOutputFormatArgs>());
            set => _timeOutputFormats = value;
        }

        [Input("timestampDayIsAlways24hs")]
        private InputList<Inputs.UserParameterTimestampDayIsAlways24hArgs>? _timestampDayIsAlways24hs;
        public InputList<Inputs.UserParameterTimestampDayIsAlways24hArgs> TimestampDayIsAlways24hs
        {
            get => _timestampDayIsAlways24hs ?? (_timestampDayIsAlways24hs = new InputList<Inputs.UserParameterTimestampDayIsAlways24hArgs>());
            set => _timestampDayIsAlways24hs = value;
        }

        [Input("timestampInputFormats")]
        private InputList<Inputs.UserParameterTimestampInputFormatArgs>? _timestampInputFormats;
        public InputList<Inputs.UserParameterTimestampInputFormatArgs> TimestampInputFormats
        {
            get => _timestampInputFormats ?? (_timestampInputFormats = new InputList<Inputs.UserParameterTimestampInputFormatArgs>());
            set => _timestampInputFormats = value;
        }

        [Input("timestampLtzOutputFormats")]
        private InputList<Inputs.UserParameterTimestampLtzOutputFormatArgs>? _timestampLtzOutputFormats;
        public InputList<Inputs.UserParameterTimestampLtzOutputFormatArgs> TimestampLtzOutputFormats
        {
            get => _timestampLtzOutputFormats ?? (_timestampLtzOutputFormats = new InputList<Inputs.UserParameterTimestampLtzOutputFormatArgs>());
            set => _timestampLtzOutputFormats = value;
        }

        [Input("timestampNtzOutputFormats")]
        private InputList<Inputs.UserParameterTimestampNtzOutputFormatArgs>? _timestampNtzOutputFormats;
        public InputList<Inputs.UserParameterTimestampNtzOutputFormatArgs> TimestampNtzOutputFormats
        {
            get => _timestampNtzOutputFormats ?? (_timestampNtzOutputFormats = new InputList<Inputs.UserParameterTimestampNtzOutputFormatArgs>());
            set => _timestampNtzOutputFormats = value;
        }

        [Input("timestampOutputFormats")]
        private InputList<Inputs.UserParameterTimestampOutputFormatArgs>? _timestampOutputFormats;
        public InputList<Inputs.UserParameterTimestampOutputFormatArgs> TimestampOutputFormats
        {
            get => _timestampOutputFormats ?? (_timestampOutputFormats = new InputList<Inputs.UserParameterTimestampOutputFormatArgs>());
            set => _timestampOutputFormats = value;
        }

        [Input("timestampTypeMappings")]
        private InputList<Inputs.UserParameterTimestampTypeMappingArgs>? _timestampTypeMappings;
        public InputList<Inputs.UserParameterTimestampTypeMappingArgs> TimestampTypeMappings
        {
            get => _timestampTypeMappings ?? (_timestampTypeMappings = new InputList<Inputs.UserParameterTimestampTypeMappingArgs>());
            set => _timestampTypeMappings = value;
        }

        [Input("timestampTzOutputFormats")]
        private InputList<Inputs.UserParameterTimestampTzOutputFormatArgs>? _timestampTzOutputFormats;
        public InputList<Inputs.UserParameterTimestampTzOutputFormatArgs> TimestampTzOutputFormats
        {
            get => _timestampTzOutputFormats ?? (_timestampTzOutputFormats = new InputList<Inputs.UserParameterTimestampTzOutputFormatArgs>());
            set => _timestampTzOutputFormats = value;
        }

        [Input("timezones")]
        private InputList<Inputs.UserParameterTimezoneArgs>? _timezones;
        public InputList<Inputs.UserParameterTimezoneArgs> Timezones
        {
            get => _timezones ?? (_timezones = new InputList<Inputs.UserParameterTimezoneArgs>());
            set => _timezones = value;
        }

        [Input("traceLevels")]
        private InputList<Inputs.UserParameterTraceLevelArgs>? _traceLevels;
        public InputList<Inputs.UserParameterTraceLevelArgs> TraceLevels
        {
            get => _traceLevels ?? (_traceLevels = new InputList<Inputs.UserParameterTraceLevelArgs>());
            set => _traceLevels = value;
        }

        [Input("transactionAbortOnErrors")]
        private InputList<Inputs.UserParameterTransactionAbortOnErrorArgs>? _transactionAbortOnErrors;
        public InputList<Inputs.UserParameterTransactionAbortOnErrorArgs> TransactionAbortOnErrors
        {
            get => _transactionAbortOnErrors ?? (_transactionAbortOnErrors = new InputList<Inputs.UserParameterTransactionAbortOnErrorArgs>());
            set => _transactionAbortOnErrors = value;
        }

        [Input("transactionDefaultIsolationLevels")]
        private InputList<Inputs.UserParameterTransactionDefaultIsolationLevelArgs>? _transactionDefaultIsolationLevels;
        public InputList<Inputs.UserParameterTransactionDefaultIsolationLevelArgs> TransactionDefaultIsolationLevels
        {
            get => _transactionDefaultIsolationLevels ?? (_transactionDefaultIsolationLevels = new InputList<Inputs.UserParameterTransactionDefaultIsolationLevelArgs>());
            set => _transactionDefaultIsolationLevels = value;
        }

        [Input("twoDigitCenturyStarts")]
        private InputList<Inputs.UserParameterTwoDigitCenturyStartArgs>? _twoDigitCenturyStarts;
        public InputList<Inputs.UserParameterTwoDigitCenturyStartArgs> TwoDigitCenturyStarts
        {
            get => _twoDigitCenturyStarts ?? (_twoDigitCenturyStarts = new InputList<Inputs.UserParameterTwoDigitCenturyStartArgs>());
            set => _twoDigitCenturyStarts = value;
        }

        [Input("unsupportedDdlActions")]
        private InputList<Inputs.UserParameterUnsupportedDdlActionArgs>? _unsupportedDdlActions;
        public InputList<Inputs.UserParameterUnsupportedDdlActionArgs> UnsupportedDdlActions
        {
            get => _unsupportedDdlActions ?? (_unsupportedDdlActions = new InputList<Inputs.UserParameterUnsupportedDdlActionArgs>());
            set => _unsupportedDdlActions = value;
        }

        [Input("useCachedResults")]
        private InputList<Inputs.UserParameterUseCachedResultArgs>? _useCachedResults;
        public InputList<Inputs.UserParameterUseCachedResultArgs> UseCachedResults
        {
            get => _useCachedResults ?? (_useCachedResults = new InputList<Inputs.UserParameterUseCachedResultArgs>());
            set => _useCachedResults = value;
        }

        [Input("weekOfYearPolicies")]
        private InputList<Inputs.UserParameterWeekOfYearPolicyArgs>? _weekOfYearPolicies;
        public InputList<Inputs.UserParameterWeekOfYearPolicyArgs> WeekOfYearPolicies
        {
            get => _weekOfYearPolicies ?? (_weekOfYearPolicies = new InputList<Inputs.UserParameterWeekOfYearPolicyArgs>());
            set => _weekOfYearPolicies = value;
        }

        [Input("weekStarts")]
        private InputList<Inputs.UserParameterWeekStartArgs>? _weekStarts;
        public InputList<Inputs.UserParameterWeekStartArgs> WeekStarts
        {
            get => _weekStarts ?? (_weekStarts = new InputList<Inputs.UserParameterWeekStartArgs>());
            set => _weekStarts = value;
        }

        public UserParameterArgs()
        {
        }
        public static new UserParameterArgs Empty => new UserParameterArgs();
    }
}
