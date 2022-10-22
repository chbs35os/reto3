package com.usa.misiontic.masterclass3.service;
import com.usa.misiontic.masterclass3.entities.Message;
import com.usa.misiontic.masterclass3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository ;

    public List<Message> getALL(){
        return messageRepository.getAll();
    }
    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }
    public Message save(Message p) {
        if (p.getIdMessage() == null) {
            return messageRepository.save(p);
        } else {
            Optional<Message> e = getMessage(p.getIdMessage());
            if(e.isPresent()) {
                return p;
            }else {
                return messageRepository.save(p);
            }
        }
    }
    public Message update(Message p){
        if(p.getIdMessage()!=null){
            Optional<Message> q =messageRepository.getMessage(p.getIdMessage());
            if (q.isPresent()){

                messageRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }

        }else{
            return p;
        }
    }
    public boolean deleteMessage (int id){
        Boolean d = getMessage(id).map(message -> {
            messageRepository.delete(message);
            return true;
        }).orElse(false);
        return d;
    }
}
