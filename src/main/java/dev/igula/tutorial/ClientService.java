package dev.igula.tutorial;

import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public List<Client> allClients(){
        return clientRepository.findAll();
    }
    public Client saveClient(@NotNull Client client) {
        client.setClientId(sequenceGeneratorService.generateSequence("clients_sequence"));
        return clientRepository.save(client);
    }

    public Optional<Client> singleClint(ObjectId id){
        return clientRepository.findById(id);
    }
}

