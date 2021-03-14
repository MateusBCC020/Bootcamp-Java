package Exercicio07ITA;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AntesDepois {
    List <String> empty;
    @BeforeEach public void initialize() {
       empty= new ArrayList<>();
       System.out.println("@Before");
       empty.add("Mateus");
    }
    @Test public void size() {
    	System.out.println("Teste 1");
    	System.out.println(empty.get(0));
    }
    @Test public void remove() {
       System.out.println("Teste 2");
    }
 }