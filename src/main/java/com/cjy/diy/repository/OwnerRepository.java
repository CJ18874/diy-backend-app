package com.cjy.dmg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjy.dmg.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository <Owner, Integer>{

}
