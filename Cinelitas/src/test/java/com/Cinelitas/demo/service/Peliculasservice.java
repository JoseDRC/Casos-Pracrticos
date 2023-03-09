/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.demo.service;

import com.Cinelitas.demo.repository.Pelicularepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Jose Daniel
 */
@Service
public class Peliculasservice implements IPeliculasservice {
    
    @Autowired
    private Pelicularepository pelicularepository;

          }
    
  
    
    

