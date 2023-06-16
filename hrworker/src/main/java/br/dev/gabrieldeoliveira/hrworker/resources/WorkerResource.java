package br.dev.gabrieldeoliveira.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> all() {
		List<Worker> all = workerRepository.findAll();
		return ResponseEntity.ok(all);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> oneById(@PathVariable Long id) {
		Worker one = workerRepository.findById(id).orElse(null);
		return ResponseEntity.ok(one);
	}
	
}
