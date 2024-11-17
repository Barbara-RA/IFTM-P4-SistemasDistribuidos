import java.util.ArrayList;
import java.util.List;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.Cliente;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClientePorNomeRequest;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteRequest;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ClienteResponse;
import br.edu.iftm.tspi.sd.ClienteServiceOuterClass.ListaClientesResponse;
import io.grpc.stub.StreamObserver;

public class ClienteServiceImpl extends ClienteServiceGrpc.ClienteServiceImplBase {
    @Override
    public void buscarClientePorId(ClienteRequest request, StreamObserver<ClienteResponse> responseObserver) {
        Cliente cliente = Cliente.newBuilder()
            .setId(request.getId())
            .setNome("Carlos Eduardo " + request.getId())
            .build();
    
        ClienteResponse response = ClienteResponse.newBuilder()
            .setCliente(cliente)
            .build();
    
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
public void buscarClientesPorNome(ClientePorNomeRequest request, StreamObserver<ListaClientesResponse> responseObserver) {
    List<Cliente> clientes = new ArrayList<>();
    for (int i = 1; i <= 3; i++) {
        Cliente cliente = Cliente.newBuilder()
            .setId(i)
            .setNome(request.getNome() + " " + i)
            .build();
        clientes.add(cliente);
    }

    ListaClientesResponse response = ListaClientesResponse.newBuilder()
        .addAllClientes(clientes)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
}

}
