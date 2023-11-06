package testeSpring.spring.Resource;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testeSpring.spring.Entity.Paciente;
import testeSpring.spring.Service.PacienteService;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	
	
	@Autowired
	private PacienteService service;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> findAll() {
		List<Paciente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente> findById(@PathVariable Long id) {
		Paciente obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}

	
	
