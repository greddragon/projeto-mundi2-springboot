package br.com.alura.mvc.mudi.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.interceptor.InterceptorDeAcessos;
import br.com.alura.mvc.mudi.interceptor.InterceptorDeAcessos.Acesso;

@RestController
@RequestMapping("/acessos")
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos(){
		
		return InterceptorDeAcessos.acessos;
	}
}
