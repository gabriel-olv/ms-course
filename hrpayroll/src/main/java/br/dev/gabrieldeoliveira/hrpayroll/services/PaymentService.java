package br.dev.gabrieldeoliveira.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.gabrieldeoliveira.hrpayroll.entities.Payment;
import br.dev.gabrieldeoliveira.hrpayroll.entities.Worker;
import br.dev.gabrieldeoliveira.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = workerFeignClient.oneById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
