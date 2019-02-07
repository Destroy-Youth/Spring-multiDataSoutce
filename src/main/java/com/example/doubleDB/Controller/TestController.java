package com.example.doubleDB.Controller;

import com.example.doubleDB.caminos.domain.User;
import com.example.doubleDB.caminos.repo.UserRepository;
import com.example.doubleDB.siarp.domain.Pais;
import com.example.doubleDB.siarp.repo.PaisRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {

  @Autowired
  private PaisRepository paisRepository;
  @Autowired
  private UserRepository userRepository;

  @GetMapping
  @RequestMapping("paises")
  public ArrayList<Pais> getPaises(){
    return (ArrayList<Pais>) paisRepository.findAll();
  }


  @GetMapping
  @RequestMapping("users")
  public ArrayList<User> getUsers(){
    return (ArrayList<User>) userRepository.findAll();
  }

}
