package br.com.senior.custom;

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
	public ResponseEntity<Tarefa> customCreateTarefa(@RequestBody Tarefa tarefa ){
		tarefa.setDescription(tarefa.getDescription() + " - CUSTOMIZADO");
		return ResponseEntity.ok(tarefa);
	}
}
