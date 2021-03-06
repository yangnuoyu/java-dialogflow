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
// source: google/cloud/dialogflow/v2/session_entity_type.proto

package com.google.cloud.dialogflow.v2;

public final class SessionEntityTypeProto {
  private SessionEntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SessionEntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SessionEntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteSessionEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteSessionEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/dialogflow/v2/session_ent"
          + "ity_type.proto\022\032google.cloud.dialogflow."
          + "v2\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032,g"
          + "oogle/cloud/dialogflow/v2/entity_type.pr"
          + "oto\032\033google/protobuf/empty.proto\032 google"
          + "/protobuf/field_mask.proto\"\300\004\n\021SessionEn"
          + "tityType\022\021\n\004name\030\001 \001(\tB\003\340A\002\022c\n\024entity_ov"
          + "erride_mode\030\002 \001(\0162@.google.cloud.dialogf"
          + "low.v2.SessionEntityType.EntityOverrideM"
          + "odeB\003\340A\002\022D\n\010entities\030\003 \003(\0132-.google.clou"
          + "d.dialogflow.v2.EntityType.EntityB\003\340A\002\"\202"
          + "\001\n\022EntityOverrideMode\022$\n ENTITY_OVERRIDE"
          + "_MODE_UNSPECIFIED\020\000\022!\n\035ENTITY_OVERRIDE_M"
          + "ODE_OVERRIDE\020\001\022#\n\037ENTITY_OVERRIDE_MODE_S"
          + "UPPLEMENT\020\002:\347\001\352A\343\001\n+dialogflow.googleapi"
          + "s.com/SessionEntityType\022Eprojects/{proje"
          + "ct}/agent/sessions/{session}/entityTypes"
          + "/{entity_type}\022mprojects/{project}/agent"
          + "/environments/{environment}/users/{user}"
          + "/sessions/{session}/entityTypes/{entity_"
          + "type}\"\225\001\n\035ListSessionEntityTypesRequest\022"
          + "C\n\006parent\030\001 \001(\tB3\340A\002\372A-\022+dialogflow.goog"
          + "leapis.com/SessionEntityType\022\026\n\tpage_siz"
          + "e\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\206\001"
          + "\n\036ListSessionEntityTypesResponse\022K\n\024sess"
          + "ion_entity_types\030\001 \003(\0132-.google.cloud.di"
          + "alogflow.v2.SessionEntityType\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"`\n\033GetSessionEntityTypeRe"
          + "quest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+dialogflow."
          + "googleapis.com/SessionEntityType\"\266\001\n\036Cre"
          + "ateSessionEntityTypeRequest\022C\n\006parent\030\001 "
          + "\001(\tB3\340A\002\372A-\022+dialogflow.googleapis.com/S"
          + "essionEntityType\022O\n\023session_entity_type\030"
          + "\002 \001(\0132-.google.cloud.dialogflow.v2.Sessi"
          + "onEntityTypeB\003\340A\002\"\247\001\n\036UpdateSessionEntit"
          + "yTypeRequest\022O\n\023session_entity_type\030\001 \001("
          + "\0132-.google.cloud.dialogflow.v2.SessionEn"
          + "tityTypeB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMaskB\003\340A\001\"c\n\036DeleteSes"
          + "sionEntityTypeRequest\022A\n\004name\030\001 \001(\tB3\340A\002"
          + "\372A-\n+dialogflow.googleapis.com/SessionEn"
          + "tityType2\322\r\n\022SessionEntityTypes\022\247\002\n\026List"
          + "SessionEntityTypes\0229.google.cloud.dialog"
          + "flow.v2.ListSessionEntityTypesRequest\032:."
          + "google.cloud.dialogflow.v2.ListSessionEn"
          + "tityTypesResponse\"\225\001\202\323\344\223\002\205\001\0224/v2/{parent"
          + "=projects/*/agent/sessions/*}/entityType"
          + "sZM\022K/v2/{parent=projects/*/agent/enviro"
          + "nments/*/users/*/sessions/*}/entityTypes"
          + "\332A\006parent\022\224\002\n\024GetSessionEntityType\0227.goo"
          + "gle.cloud.dialogflow.v2.GetSessionEntity"
          + "TypeRequest\032-.google.cloud.dialogflow.v2"
          + ".SessionEntityType\"\223\001\202\323\344\223\002\205\001\0224/v2/{name="
          + "projects/*/agent/sessions/*/entityTypes/"
          + "*}ZM\022K/v2/{name=projects/*/agent/environ"
          + "ments/*/users/*/sessions/*/entityTypes/*"
          + "}\332A\004name\022\332\002\n\027CreateSessionEntityType\022:.g"
          + "oogle.cloud.dialogflow.v2.CreateSessionE"
          + "ntityTypeRequest\032-.google.cloud.dialogfl"
          + "ow.v2.SessionEntityType\"\323\001\202\323\344\223\002\257\001\"4/v2/{"
          + "parent=projects/*/agent/sessions/*}/enti"
          + "tyTypes:\023session_entity_typeZb\"K/v2/{par"
          + "ent=projects/*/agent/environments/*/user"
          + "s/*/sessions/*}/entityTypes:\023session_ent"
          + "ity_type\332A\032parent,session_entity_type\022\235\003"
          + "\n\027UpdateSessionEntityType\022:.google.cloud"
          + ".dialogflow.v2.UpdateSessionEntityTypeRe"
          + "quest\032-.google.cloud.dialogflow.v2.Sessi"
          + "onEntityType\"\226\002\202\323\344\223\002\327\0012H/v2/{session_ent"
          + "ity_type.name=projects/*/agent/sessions/"
          + "*/entityTypes/*}:\023session_entity_typeZv2"
          + "_/v2/{session_entity_type.name=projects/"
          + "*/agent/environments/*/users/*/sessions/"
          + "*/entityTypes/*}:\023session_entity_type\332A\023"
          + "session_entity_type\332A\037session_entity_typ"
          + "e,update_mask\022\203\002\n\027DeleteSessionEntityTyp"
          + "e\022:.google.cloud.dialogflow.v2.DeleteSes"
          + "sionEntityTypeRequest\032\026.google.protobuf."
          + "Empty\"\223\001\202\323\344\223\002\205\001*4/v2/{name=projects/*/ag"
          + "ent/sessions/*/entityTypes/*}ZM*K/v2/{na"
          + "me=projects/*/agent/environments/*/users"
          + "/*/sessions/*/entityTypes/*}\332A\004name\032x\312A\031"
          + "dialogflow.googleapis.com\322AYhttps://www."
          + "googleapis.com/auth/cloud-platform,https"
          + "://www.googleapis.com/auth/dialogflowB\245\001"
          + "\n\036com.google.cloud.dialogflow.v2B\026Sessio"
          + "nEntityTypeProtoP\001ZDgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/dialogflow/v2;di"
          + "alogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogfl"
          + "ow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.EntityTypeProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_SessionEntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_SessionEntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SessionEntityType_descriptor,
            new java.lang.String[] {
              "Name", "EntityOverrideMode", "Entities",
            });
    internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListSessionEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "SessionEntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_CreateSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SessionEntityType",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "SessionEntityType", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteSessionEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteSessionEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteSessionEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2.EntityTypeProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
