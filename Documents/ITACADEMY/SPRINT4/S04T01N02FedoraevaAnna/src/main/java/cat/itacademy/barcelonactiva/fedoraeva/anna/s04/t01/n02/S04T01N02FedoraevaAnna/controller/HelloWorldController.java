package cat.itacademy.barcelonactiva.fedoraeva.anna.s04.t01.n02.S04T01N02FedoraevaAnna.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
	public ResponseEntity<?> saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return new ResponseEntity<>("Hola, " + nom + ". Est�s executant un projecte Gradle.", HttpStatus.OK);

	}

	@RequestMapping(value = { "/HelloWorld2", "/HelloWorld2/{nom}" })
	public ResponseEntity<?> saluda2(@PathVariable(required = false) String nom) {
		if (nom != null) {
			return new ResponseEntity<>("Hola, " + nom + ". Est�s executant un projecte Gradle.", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Hola. Est�s executant un projecte Gradle.", HttpStatus.OK);
		}
	}

}
