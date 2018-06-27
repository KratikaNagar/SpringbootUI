package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Partner;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {

}
