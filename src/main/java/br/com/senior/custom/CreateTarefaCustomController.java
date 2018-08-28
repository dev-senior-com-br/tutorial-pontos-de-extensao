package br.com.senior.custom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateTarefaCustomController {
	
	@RequestMapping("/")
    public String index() {
        return "O aplicativo de customização está Online!";
    }

	@PostMapping(path="/tarefa")
	public ResponseEntity<Tarefa> customCreateTarefa(@RequestBody Tarefa tarefa, HttpServletRequest request ){
		
		String user = request.getHeader("x-senior-user");
		String tenant = request.getHeader("x-senior-tenant");
		
		
		tarefa.setDescription(tarefa.getDescription() + " - CUSTOMIZADO");
		return ResponseEntity.ok(tarefa);
	}
}
