package org.hps;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

public final class Api {
  private Api() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\tapi.proto\"\"\n\013RateRequest\022\023\n\013ratereques" +
      "t\030\001 \001(\t\"$\n\014RateResponse\022\024\n\014rateresponse\030" +
      "\001 \001(\t24\n\013RateService\022%\n\004Rate\022\014.RateReque" +
      "st\032\r.RateResponse\"\000B\013\n\007org.hpsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RateRequest_descriptor,
        new String[] { "Raterequest", });
    internal_static_RateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RateResponse_descriptor,
        new String[] { "Rateresponse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}