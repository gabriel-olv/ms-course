package br.dev.gabrieldeoliveira.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.gabrieldeoliveira.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
