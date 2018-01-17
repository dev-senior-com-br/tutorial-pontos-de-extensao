package br.com.senior.reference_app.custom;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReferenceAppCustomTarefa {
	
	@RequestMapping(value="/", method= RequestMethod.POST)
    public ResponseEntity<?> index(@RequestBody TarefaDto titulo) {
		
		titulo.setTitulo("CUSTOMIZADO "+titulo.getTitulo());
		
        return ResponseEntity.ok(titulo);
    }
	
	//@RequestMapping(value="/tarefaRapida", method= RequestMethod.POST)
    public ResponseEntity<?> tarefaRapida(@RequestBody TarefaRapidaDTO titulo) {
		
		titulo.setTitulo("CUSTOMIZADO "+titulo.getTitulo());
		
        return ResponseEntity.ok(titulo);
    }

}
