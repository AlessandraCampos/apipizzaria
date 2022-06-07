package pizzaria.dtos.usuario;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import pizzaria.entities.Perfil;
import pizzaria.entities.Usuario;

public class MapperUsuarioDto {

		 public static Usuario fromDTO(RegistroUsuarioDTO dto ) {
			 Perfil perfil = new Perfil();
			 perfil.setId(dto.getPerfilId());
			 
			 
			 return new Usuario(dto.getCpf(),dto.getNome(),dto.getEmail(),new BCryptPasswordEncoder().encode(dto.getSenha()),perfil);
		 }
		
		
		 public static ConsultaUsuariosDTO fromEntity(Usuario usuario ) {
			 
			 return new ConsultaUsuariosDTO(usuario.getEmail(),usuario.getPerfil().getNome());
			 
			 
		 }
	}


