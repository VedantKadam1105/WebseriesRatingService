package com.netflix.viewers.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netflix.viewers.entities.Viewer;
@Repository
@Transactional
public interface ViewerRepository extends JpaRepository<Viewer,String>
{
	
}
