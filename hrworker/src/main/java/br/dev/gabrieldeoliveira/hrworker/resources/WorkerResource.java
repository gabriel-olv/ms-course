package br.dev.gabrieldeoliveira.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.gabrieldeoliveira.hrworker.entities.Worker;
import br.dev.gabrieldeoliveira.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
	
	private Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;

	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> all() {
		List<Worker> all = workerRepository.findAll();
		return ResponseEntity.ok(all);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> oneById(@PathVariable Long id) {
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Worker one = workerRepository.findById(id).orElse(null);
		return ResponseEntity.ok(one);
	}
	
}
