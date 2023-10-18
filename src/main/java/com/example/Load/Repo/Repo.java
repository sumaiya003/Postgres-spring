package com.example.Load.Repo;
import com.example.Load.Model.Load_class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
public interface Repo extends JpaRepository<Load_class ,Integer> {
   @Query(value = "select * from load_info where shipper_id = ?" ,nativeQuery = true)
    List<Load_class> getLoadsByShipperId(int shipperId);
}
