package dev.igula.tutorial;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> allClients(){
        return clientRepository.findAll();
    }

    public Optional<Client> singleClint(ObjectId id){
        return clientRepository.findById(id);
    }
}

