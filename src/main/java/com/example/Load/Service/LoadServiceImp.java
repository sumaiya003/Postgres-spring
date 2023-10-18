package com.example.Load.Service;
import com.example.Load.Model.Load_class;
import com.example.Load.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadServiceImp implements LoadService{

     @Autowired
     private Repo repo;
     @Override
     public Load_class savedata(Load_class loadClass){
          return  repo.save(loadClass);
     }
     @Override
     public Load_class getById(int id){
          return repo.findById(id).orElseThrow(()-> new RuntimeException("Invalid Id"));
     }
     @Override
     public Load_class update(int id , Load_class payload){
          Load_class updatedLoad = repo.findById(id).orElseThrow(()-> new RuntimeException("Invalid id"));
          updatedLoad.setLoadingPoint(payload.getLoadingPoint());
          updatedLoad.setUnloadingPoint(payload.getUnloadingPoint());
          updatedLoad.setProductType(payload.getProductType());
          updatedLoad.setTruckType(payload.getTruckType());
          updatedLoad.setNoOfTrucks(payload.getNoOfTrucks());
          updatedLoad.setWeight(payload.getWeight());
          updatedLoad.setComment(payload.getComment());
          updatedLoad.setDate(payload.getDate());
          return  repo.save(updatedLoad);
     }
     @Override
     public void delete(int id){
          repo.deleteById(id);
     }

}
