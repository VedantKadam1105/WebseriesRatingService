package com.netflix.viewers.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.viewers.entities.Viewer;
import com.netflix.viewers.exceptions.ResourceNotFoundException;
import com.netflix.viewers.repositories.ViewerRepository;
@Service
public class ViewerServiceImpl implements ViewerService {
	@Autowired
	private ViewerRepository viewerRepository;
	@Override
	public Viewer saveViewer(Viewer viewer) {
		// TODO Auto-generated method stub
	
		return viewerRepository.save(viewer);
	}

	@Override
	public List<Viewer> getAllViewers() {
		// TODO Auto-generated method stub
		return viewerRepository.findAll();
	}

	@Override
	public Viewer getViewer(String viewerId) {
		// TODO Auto-generated method stub
		return viewerRepository.findById(viewerId).orElseThrow(()->new ResourceNotFoundException("Viewer with given id is not found on server!!: "+viewerId));
	}

	@Override
	public void deleteViewer(String viewerId) {
		// TODO Auto-generated method stub
		viewerRepository.deleteById(viewerId);
	}

}
