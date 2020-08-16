/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.repository;

import com.konecta.test.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Mazo
 */
@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    
}
