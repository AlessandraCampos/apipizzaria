package pizzaria.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pizzaria.dtos.usuario.ConsultaUsuariosDTO;
import pizzaria.dtos.usuario.MapperUsuarioDto;
import pizzaria.dtos.usuario.RegistroUsuarioDTO;
import pizzaria.entities.Usuario;
import pizzaria.services.UsuarioService;


@CrossOrigin()
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	
	@Autowired
	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;

	}
	
	
	@RequestMapping(produces = "application/json")
	public ResponseEntity<Page<ConsultaUsuariosDTO>> listarUsuarios(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(usuarioService.findAll(pageable).map(MapperUsuarioDto:: fromEntity));
		
		
	}
	

  
	@PostMapping("/cadastrar")
	public ResponseEntity<ConsultaUsuariosDTO> salvarUsuario(@RequestBody @Valid RegistroUsuarioDTO usuarioDto) {

		Usuario usuario = usuarioService.salvarUsuario(MapperUsuarioDto.fromDTO(usuarioDto));

		return ResponseEntity.ok(MapperUsuarioDto.fromEntity(usuario));

	}
}
