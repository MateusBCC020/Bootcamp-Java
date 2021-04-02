package ExercicioFinalITA;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeiroEmbaralhador implements Embaralhador{

	@Override
	public String embraralhar(String personagem) {
		List<Character> letters = personagem.chars().boxed().map(c -> (char) c.intValue()).collect(Collectors.toList());
	    Collections.shuffle(letters);
	    StringBuilder t = new StringBuilder(personagem.length());
	    letters.forEach(t::append);
	    return t.toString();
	}

}
