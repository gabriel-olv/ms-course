package br.dev.gabrieldeoliveira.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.dev.gabrieldeoliveira.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Jonh", 235.0, days);
	}
}
