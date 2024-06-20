// package com.sis324.citas.service;

// import java.util.ArrayList;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import com.sis324.citas.repository.ColaRepository;
// import com.sis324.citas.model.Cola;
// @Service

// public class ColaService {
//     @Autowired
//     ColaRepository colaRepos;


//     public ArrayList<Cola> getColas(){
//         return ((ArrayList<Cola>) colaRepos.findAll());
//     }

//     public Cola save(Cola cola){
//         return (colaRepos.save(cola));
//     }

//     public boolean delete(Long id){
// 		try {
// 			colaRepos.deleteById(id);
// 			return true;
// 		} catch (Exception e) {
// 			return false;
// 		}
// 	}
// }

