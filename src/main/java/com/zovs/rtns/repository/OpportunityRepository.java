package com.zovs.rtns.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zovs.rtns.enties.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {

}
