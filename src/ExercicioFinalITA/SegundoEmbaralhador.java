package ExercicioFinalITA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SegundoEmbaralhador implements Embaralhador{

	@Override
	public String embraralhar(String personagem) {
		List <Character> listaLetras = new ArrayList<Character>();
		for(int i = 0; i < personagem.length(); i++) {
			listaLetras.add(personagem.charAt(i));
		}
		Collections.shuffle(listaLetras);
		char[] letrasEmbaralhadas = new char[listaLetras.size()] ;
		for(int i = 0; i < personagem.length(); i++) {
			letrasEmbaralhadas[i] = listaLetras.get(i);
		}
		String palavraEmbaralhada = new String(letrasEmbaralhadas);
		return palavraEmbaralhada;
	}

}
