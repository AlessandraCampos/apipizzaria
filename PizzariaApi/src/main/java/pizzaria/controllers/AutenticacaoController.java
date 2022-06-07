package pizzaria.controllers;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizzaria.security.AutenticacaoForm;
import pizzaria.services.AutenticacaoService;

@CrossOrigin()
@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
	
	
	
	@PostMapping
	public ResponseEntity<AutenticacaoForm> autenticar(@RequestBody AutenticacaoForm authForm) throws AuthenticationException{
		String token = autenticacaoService.autenticar(authForm);
		authForm.setToken(token);
		return ResponseEntity.ok(authForm);
				
				
		
		
	}

}

