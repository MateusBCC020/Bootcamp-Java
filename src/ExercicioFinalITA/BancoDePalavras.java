package ExercicioFinalITA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	
	public static String retornaPersonagem() throws IOException {
		Random aleatorio = new Random();
		File arquivo = new File("/home/mateus/git/Bootcamp-Java/src/ExercicioFinalITA/Arquivos/Naruto.txt");
		FileReader fr = new FileReader( arquivo );
		BufferedReader br = new BufferedReader( fr );
		List<String> listaPersonagens = new ArrayList<String>();
		while( br.ready() ){
			listaPersonagens.add(br.readLine());
		}
		br.close();
		fr.close();
		return listaPersonagens.get(aleatorio.nextInt(listaPersonagens.size()));
	}
	
}
