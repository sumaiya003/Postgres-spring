package com.example.Load.Service;

import com.example.Load.Model.Load_class;

import java.util.List;


public interface LoadService {
    public Load_class savedata(Load_class loadClass);
    public Load_class getById(int id);
    public Load_class update(int id, Load_class payload);
    public void delete(int id);
}
