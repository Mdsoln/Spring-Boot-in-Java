package com.management.database.Dhis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DhisRepository extends JpaRepository<DhisMembers,Long> {

}
