package br.com.teste;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {

    private static Logger logger = Logger.getLogger(Teste.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Teste");

        Obj o = new Obj();

        if (Util.isNotNull(o.getTexto())) {
            logger.log(Level.INFO,"obj.texto = "+ o.getTexto());
        }

        List<Obj> lista = null;
        var rand = Math.random() * 5d;
        logger.log(Level.INFO,"rand = "+ rand);
        if (rand > 4d) {
            lista = new ArrayList<>();
            lista.add(new Obj());
        }

        if (Util.isNotEmpty(lista)) {
            logger.log(Level.INFO, "dentro do if");
            logger.log(Level.INFO,"lista.size by isEmpty testando = "+ lista.size());
        }
        //logger.log(Level.INFO,"lista.size sem isEmpty = "+ lista.size());



        logger.log(Level.INFO,"Fim");
    }

}
