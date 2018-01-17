package br.com.senior.reference_app.custom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeforeCreateTarefa {
	
	private static String CUSTOM_STRING  = "CUSTOMIZADO - ";
	
	@RequestMapping(value="/", method= RequestMethod.GET)
    public ResponseEntity<?> index() {
		return ResponseEntity.ok("<h3>Customizacao da senior X platform!!</h3>");
    }
	
	@RequestMapping(value="/", method= RequestMethod.POST)
    public ResponseEntity<?> createTarefa(@RequestBody TarefaDTO payload, HttpServletRequest request) {
		//Obt�m os headers tenant usuario e timeout 
		String user = request.getHeader("x-senior-user");
		String tenant = request.getHeader("x-senior-tenant");
		String customHeader = request.getHeader("ecossistema");
		
		payload.setTitulo(CUSTOM_STRING+payload.getTitulo());
		payload.setDescription(String.format("Tenant: %s, Usuario: %s, Custom Header: %s - texto original: %s", tenant,user,customHeader, payload.getDescription()));
        return ResponseEntity.ok(payload);
    }

}
