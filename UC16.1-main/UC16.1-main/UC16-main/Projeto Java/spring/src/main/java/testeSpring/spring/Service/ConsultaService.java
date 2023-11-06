package testeSpring.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testeSpring.spring.Entity.Consulta;
import testeSpring.spring.Repository.ConsultaRepository;

@Service
public class ConsultaService {
	
	@Autowired
	private ConsultaRepository repository;
	
	public List<Consulta> findAll() {
		return repository.findAll();
	}
	
	public Consulta findById(Long id) {
		Optional<Consulta> obj =  repository.findById(id);
		return obj.get();
	}

}
