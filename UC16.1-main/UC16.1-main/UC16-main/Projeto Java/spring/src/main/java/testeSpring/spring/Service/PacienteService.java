package testeSpring.spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testeSpring.spring.Entity.Paciente;
import testeSpring.spring.Repository.UsersRepository;

@Service
public class PacienteService {
	
	@Autowired
	private UsersRepository repository;
	
	public List<Paciente> findAll() {
		return repository.findAll();
	}
	
	public Paciente findById(Long id) {
		Optional<Paciente> obj =  repository.findById(id);
		return obj.get();
	}

}
