package br.edu.iftm.tspi.sd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: ClienteService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClienteServiceGrpc {

  private ClienteServiceGrpc() {}

  public static final String SERVICE_NAME = "br.edu.iftm.tspi.sd.grpc.ClienteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest,
      br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buscarClientePorId",
      requestType = br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest.class,
      responseType = br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest,
      br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod() {
    io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest, br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> getBuscarClientePorIdMethod;
    if ((getBuscarClientePorIdMethod = ClienteServiceGrpc.getBuscarClientePorIdMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getBuscarClientePorIdMethod = ClienteServiceGrpc.getBuscarClientePorIdMethod) == null) {
          ClienteServiceGrpc.getBuscarClientePorIdMethod = getBuscarClientePorIdMethod =
              io.grpc.MethodDescriptor.<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest, br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buscarClientePorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("buscarClientePorId"))
              .build();
        }
      }
    }
    return getBuscarClientePorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest,
      br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buscarClientesPorNome",
      requestType = br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest.class,
      responseType = br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest,
      br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod() {
    io.grpc.MethodDescriptor<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest, br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> getBuscarClientesPorNomeMethod;
    if ((getBuscarClientesPorNomeMethod = ClienteServiceGrpc.getBuscarClientesPorNomeMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getBuscarClientesPorNomeMethod = ClienteServiceGrpc.getBuscarClientesPorNomeMethod) == null) {
          ClienteServiceGrpc.getBuscarClientesPorNomeMethod = getBuscarClientesPorNomeMethod =
              io.grpc.MethodDescriptor.<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest, br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buscarClientesPorNome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("buscarClientesPorNome"))
              .build();
        }
      }
    }
    return getBuscarClientesPorNomeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClienteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceStub>() {
        @java.lang.Override
        public ClienteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceStub(channel, callOptions);
        }
      };
    return ClienteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClienteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceBlockingStub>() {
        @java.lang.Override
        public ClienteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceBlockingStub(channel, callOptions);
        }
      };
    return ClienteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClienteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClienteServiceFutureStub>() {
        @java.lang.Override
        public ClienteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClienteServiceFutureStub(channel, callOptions);
        }
      };
    return ClienteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void buscarClientePorId(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarClientePorIdMethod(), responseObserver);
    }

    /**
     */
    default void buscarClientesPorNome(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarClientesPorNomeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClienteService.
   */
  public static abstract class ClienteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClienteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClienteServiceStub> {
    private ClienteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceStub(channel, callOptions);
    }

    /**
     */
    public void buscarClientePorId(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarClientePorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buscarClientesPorNome(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest request,
        io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarClientesPorNomeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClienteService.
   */
  public static final class ClienteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClienteServiceBlockingStub> {
    private ClienteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse buscarClientePorId(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarClientePorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse buscarClientesPorNome(br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarClientesPorNomeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClienteService.
   */
  public static final class ClienteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClienteServiceFutureStub> {
    private ClienteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClienteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse> buscarClientePorId(
        br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarClientePorIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse> buscarClientesPorNome(
        br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarClientesPorNomeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BUSCAR_CLIENTE_POR_ID = 0;
  private static final int METHODID_BUSCAR_CLIENTES_POR_NOME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BUSCAR_CLIENTE_POR_ID:
          serviceImpl.buscarClientePorId((br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest) request,
              (io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse>) responseObserver);
          break;
        case METHODID_BUSCAR_CLIENTES_POR_NOME:
          serviceImpl.buscarClientesPorNome((br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest) request,
              (io.grpc.stub.StreamObserver<br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBuscarClientePorIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteRequest,
              br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClienteResponse>(
                service, METHODID_BUSCAR_CLIENTE_POR_ID)))
        .addMethod(
          getBuscarClientesPorNomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ClientePorNomeRequest,
              br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.ListaClientesResponse>(
                service, METHODID_BUSCAR_CLIENTES_POR_NOME)))
        .build();
  }

  private static abstract class ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClienteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.edu.iftm.tspi.sd.grpc.ClienteServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClienteService");
    }
  }

  private static final class ClienteServiceFileDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier {
    ClienteServiceFileDescriptorSupplier() {}
  }

  private static final class ClienteServiceMethodDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClienteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClienteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClienteServiceFileDescriptorSupplier())
              .addMethod(getBuscarClientePorIdMethod())
              .addMethod(getBuscarClientesPorNomeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
