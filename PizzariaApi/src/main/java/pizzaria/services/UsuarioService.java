package pizzaria.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pizzaria.entities.Usuario;
import pizzaria.repositories.UsuarioRepository;


@Service
public class UsuarioService implements UserDetailsService{

	public final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario finduserByEmail( String email) {
		
		Optional<Usuario> optional = usuarioRepository.findByEmail(email);
		
		if( optional.isEmpty()) {
			throw new UsernameNotFoundException ("Usuário não encontrado");
		}
		
		return optional.get();
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	
		return finduserByEmail(email);
	}

	public Usuario finduserById(Long idUsuario) {
		Optional<Usuario> optional  = usuarioRepository.findById(idUsuario);
		
		if(optional.isEmpty()) {
			throw new RuntimeException("Usuario nao encontrado");
		}
		return optional.get();
	}
	
	public Page<Usuario> findAll(Pageable pageable) {
		
		return usuarioRepository.findAll(pageable);
		
	}

	public Usuario salvarUsuario(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	
	

}
