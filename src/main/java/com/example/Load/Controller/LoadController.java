package com.example.Load.Controller;

import com.example.Load.Model.Load_class;
import com.example.Load.Repo.Repo;
import com.example.Load.Service.LoadServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LoadController {

    @Autowired
    private LoadServiceImp serviceImp ;
    @Autowired
    private Repo repo;
    Logger logger = LoggerFactory.getLogger(LoadController.class);
     @PostMapping("/load")
    public ResponseEntity<String> post(@RequestBody Load_class loadClass){
         serviceImp.savedata(loadClass);
         return new ResponseEntity<>("loads details added successfully", HttpStatus.CREATED);
     }
     @GetMapping("/load")
    public ResponseEntity<List<Load_class>> getDetailsById(@RequestParam("shipper_id") int shipperId){
         List<Load_class> list= repo.getLoadsByShipperId(shipperId);
         return new ResponseEntity<>(list, HttpStatus.OK);
     }
     @GetMapping("/load/{loadId}")
     public ResponseEntity<Load_class> getAllLoads(@PathVariable int loadId){
         Load_class newLoads = serviceImp.getById(loadId);
         return new ResponseEntity<>(newLoads, HttpStatus.OK);
     }
     @PutMapping("/load/{loadId}")
    public ResponseEntity<Load_class> updateById(@PathVariable int loadId, @RequestBody Load_class newPayload){
         Load_class loadClass =serviceImp.update(loadId, newPayload);
         return new ResponseEntity<>(loadClass, HttpStatus.OK);
     }
     @DeleteMapping("/load/{loadId}")
    public ResponseEntity<String> deleteById(@PathVariable int loadId)
     {
         serviceImp.delete(loadId);
         return new ResponseEntity<>("deleted", HttpStatus.OK);
     }
}
