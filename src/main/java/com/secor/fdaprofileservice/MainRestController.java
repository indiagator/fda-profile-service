package com.secor.fdaprofileservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainRestController
{
    @Autowired
    UserdetailRepository userdetailRepository;

    @Autowired
    Producer producer = new Producer();

    @PostMapping("update/user/details") // URIs SERVE CHUNKS OF DATA UNLIKE URLs WHICH SERVE PAGES
    public ResponseEntity<String> updateUserDetails(@RequestBody Userdetail userdetail) throws JsonProcessingException {
        userdetailRepository.save(userdetail);
        producer.pubUpdateUserDetailsMessage(userdetail.getUsername(), "USER DETAILS UPDATED SUCCESSFULLY");
        return ResponseEntity.ok("Details Updated Successfully");
    }

    //@GetMapping("get/restros")
    //public ResponseEntity<?> getRestros() throws InterruptedException
    //{
    //    Thread.sleep(1000);
     //   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

    //}
}
