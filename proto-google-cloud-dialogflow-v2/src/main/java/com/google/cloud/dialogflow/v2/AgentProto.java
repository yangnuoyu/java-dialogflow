/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/dialogflow/v2/agent.proto"
          + "\022\032google.cloud.dialogflow.v2\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\0322google/cloud/di"
          + "alogflow/v2/validation_result.proto\032#goo"
          + "gle/longrunning/operations.proto\032\033google"
          + "/protobuf/empty.proto\032 google/protobuf/f"
          + "ield_mask.proto\"\360\006\n\005Agent\022C\n\006parent\030\001 \001("
          + "\tB3\340A\002\372A-\n+cloudresourcemanager.googleap"
          + "is.com/Project\022\031\n\014display_name\030\002 \001(\tB\003\340A"
          + "\002\022\"\n\025default_language_code\030\003 \001(\tB\003\340A\002\022%\n"
          + "\030supported_language_codes\030\004 \003(\tB\003\340A\001\022\026\n\t"
          + "time_zone\030\005 \001(\tB\003\340A\002\022\030\n\013description\030\006 \001("
          + "\tB\003\340A\001\022\027\n\navatar_uri\030\007 \001(\tB\003\340A\001\022\033\n\016enabl"
          + "e_logging\030\010 \001(\010B\003\340A\001\022D\n\nmatch_mode\030\t \001(\016"
          + "2+.google.cloud.dialogflow.v2.Agent.Matc"
          + "hModeB\003\340A\001\022%\n\030classification_threshold\030\n"
          + " \001(\002B\003\340A\001\022F\n\013api_version\030\016 \001(\0162,.google."
          + "cloud.dialogflow.v2.Agent.ApiVersionB\003\340A"
          + "\001\0229\n\004tier\030\017 \001(\0162&.google.cloud.dialogflo"
          + "w.v2.Agent.TierB\003\340A\001\"V\n\tMatchMode\022\032\n\026MAT"
          + "CH_MODE_UNSPECIFIED\020\000\022\025\n\021MATCH_MODE_HYBR"
          + "ID\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020\002\"l\n\nApiVersi"
          + "on\022\033\n\027API_VERSION_UNSPECIFIED\020\000\022\022\n\016API_V"
          + "ERSION_V1\020\001\022\022\n\016API_VERSION_V2\020\002\022\031\n\025API_V"
          + "ERSION_V2_BETA_1\020\003\"^\n\004Tier\022\024\n\020TIER_UNSPE"
          + "CIFIED\020\000\022\021\n\rTIER_STANDARD\020\001\022\023\n\017TIER_ENTE"
          + "RPRISE\020\002\022\030\n\024TIER_ENTERPRISE_PLUS\020\003:>\352A;\n"
          + "\037dialogflow.googleapis.com/Agent\022\030projec"
          + "ts/{project}/agent\"V\n\017GetAgentRequest\022C\n"
          + "\006parent\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcemana"
          + "ger.googleapis.com/Project\"~\n\017SetAgentRe"
          + "quest\0225\n\005agent\030\001 \001(\0132!.google.cloud.dial"
          + "ogflow.v2.AgentB\003\340A\002\0224\n\013update_mask\030\002 \001("
          + "\0132\032.google.protobuf.FieldMaskB\003\340A\001\"Y\n\022De"
          + "leteAgentRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-"
          + "\n+cloudresourcemanager.googleapis.com/Pr"
          + "oject\"\206\001\n\023SearchAgentsRequest\022C\n\006parent\030"
          + "\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager.goog"
          + "leapis.com/Project\022\026\n\tpage_size\030\002 \001(\005B\003\340"
          + "A\001\022\022\n\npage_token\030\003 \001(\t\"b\n\024SearchAgentsRe"
          + "sponse\0221\n\006agents\030\001 \003(\0132!.google.cloud.di"
          + "alogflow.v2.Agent\022\027\n\017next_page_token\030\002 \001"
          + "(\t\"X\n\021TrainAgentRequest\022C\n\006parent\030\001 \001(\tB"
          + "3\340A\002\372A-\n+cloudresourcemanager.googleapis"
          + ".com/Project\"q\n\022ExportAgentRequest\022C\n\006pa"
          + "rent\030\001 \001(\tB3\340A\002\372A-\n+cloudresourcemanager"
          + ".googleapis.com/Project\022\026\n\tagent_uri\030\002 \001"
          + "(\tB\003\340A\002\"L\n\023ExportAgentResponse\022\023\n\tagent_"
          + "uri\030\001 \001(\tH\000\022\027\n\ragent_content\030\002 \001(\014H\000B\007\n\005"
          + "agent\"\220\001\n\022ImportAgentRequest\022C\n\006parent\030\001"
          + " \001(\tB3\340A\002\372A-\n+cloudresourcemanager.googl"
          + "eapis.com/Project\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027"
          + "\n\ragent_content\030\003 \001(\014H\000B\007\n\005agent\"\221\001\n\023Res"
          + "toreAgentRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-"
          + "\n+cloudresourcemanager.googleapis.com/Pr"
          + "oject\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\ragent_cont"
          + "ent\030\003 \001(\014H\000B\007\n\005agent\"}\n\032GetValidationRes"
          + "ultRequest\022C\n\006parent\030\001 \001(\tB3\340A\002\372A-\n+clou"
          + "dresourcemanager.googleapis.com/Project\022"
          + "\032\n\rlanguage_code\030\003 \001(\tB\003\340A\0012\305\r\n\006Agents\022\212"
          + "\001\n\010GetAgent\022+.google.cloud.dialogflow.v2"
          + ".GetAgentRequest\032!.google.cloud.dialogfl"
          + "ow.v2.Agent\".\202\323\344\223\002\037\022\035/v2/{parent=project"
          + "s/*}/agent\332A\006parent\022\226\001\n\010SetAgent\022+.googl"
          + "e.cloud.dialogflow.v2.SetAgentRequest\032!."
          + "google.cloud.dialogflow.v2.Agent\":\202\323\344\223\002,"
          + "\"#/v2/{agent.parent=projects/*}/agent:\005a"
          + "gent\332A\005agent\022\205\001\n\013DeleteAgent\022..google.cl"
          + "oud.dialogflow.v2.DeleteAgentRequest\032\026.g"
          + "oogle.protobuf.Empty\".\202\323\344\223\002\037*\035/v2/{paren"
          + "t=projects/*}/agent\332A\006parent\022\250\001\n\014SearchA"
          + "gents\022/.google.cloud.dialogflow.v2.Searc"
          + "hAgentsRequest\0320.google.cloud.dialogflow"
          + ".v2.SearchAgentsResponse\"5\202\323\344\223\002&\022$/v2/{p"
          + "arent=projects/*}/agent:search\332A\006parent\022"
          + "\305\001\n\nTrainAgent\022-.google.cloud.dialogflow"
          + ".v2.TrainAgentRequest\032\035.google.longrunni"
          + "ng.Operation\"i\202\323\344\223\002(\"#/v2/{parent=projec"
          + "ts/*}/agent:train:\001*\332A\006parent\312A/\n\025google"
          + ".protobuf.Empty\022\026google.protobuf.Struct\022"
          + "\342\001\n\013ExportAgent\022..google.cloud.dialogflo"
          + "w.v2.ExportAgentRequest\032\035.google.longrun"
          + "ning.Operation\"\203\001\202\323\344\223\002)\"$/v2/{parent=pro"
          + "jects/*}/agent:export:\001*\332A\006parent\312AH\n.go"
          + "ogle.cloud.dialogflow.v2.ExportAgentResp"
          + "onse\022\026google.protobuf.Struct\022\277\001\n\013ImportA"
          + "gent\022..google.cloud.dialogflow.v2.Import"
          + "AgentRequest\032\035.google.longrunning.Operat"
          + "ion\"a\202\323\344\223\002)\"$/v2/{parent=projects/*}/age"
          + "nt:import:\001*\312A/\n\025google.protobuf.Empty\022\026"
          + "google.protobuf.Struct\022\302\001\n\014RestoreAgent\022"
          + "/.google.cloud.dialogflow.v2.RestoreAgen"
          + "tRequest\032\035.google.longrunning.Operation\""
          + "b\202\323\344\223\002*\"%/v2/{parent=projects/*}/agent:r"
          + "estore:\001*\312A/\n\025google.protobuf.Empty\022\026goo"
          + "gle.protobuf.Struct\022\263\001\n\023GetValidationRes"
          + "ult\0226.google.cloud.dialogflow.v2.GetVali"
          + "dationResultRequest\032,.google.cloud.dialo"
          + "gflow.v2.ValidationResult\"6\202\323\344\223\0020\022./v2/{"
          + "parent=projects/*}/agent/validationResul"
          + "t\032x\312A\031dialogflow.googleapis.com\322AYhttps:"
          + "//www.googleapis.com/auth/cloud-platform"
          + ",https://www.googleapis.com/auth/dialogf"
          + "lowB\231\001\n\036com.google.cloud.dialogflow.v2B\n"
          + "AgentProtoP\001ZDgoogle.golang.org/genproto"
          + "/googleapis/cloud/dialogflow/v2;dialogfl"
          + "ow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.ValidationResultProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_Agent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Agent_descriptor,
            new java.lang.String[] {
              "Parent",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "EnableLogging",
              "MatchMode",
              "ClassificationThreshold",
              "ApiVersion",
              "Tier",
            });
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_SetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SetAgentRequest_descriptor,
            new java.lang.String[] {
              "Agent", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SearchAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SearchAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TrainAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ImportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ValidationResultProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
