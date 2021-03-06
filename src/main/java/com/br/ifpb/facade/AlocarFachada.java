package com.br.ifpb.facade;

import com.br.ifpb.business.object.GerenciarEvento;
import com.br.ifpb.business.object.GerenciarSala;
import com.br.ifpb.execoes.PersistenciaException;
import com.br.ifpb.value.object.Evento;
import com.br.ifpb.value.object.Sala;
import java.util.List;

/**
 * Classe que representa uma fachada para Alocar um Evento em uma Sala
 * @author Emanuel Batista da Silva Filho <emanuelbatista2011@gmail.com>
 * @date 01/03/2015 às 19:59:01
 */
public class AlocarFachada {

    /**
     * Aloca os Eventos em um Sala, onde os Eventos são passados por parâmetro 
     * e o ID da sala é passados também por parâmetro
     * @param eventos
     * @param idSala
     * @throws PersistenciaException 
     */
    public void alocar(List<Evento> eventos, Integer idSala) throws PersistenciaException {
        if (eventos != null) {
            GerenciarSala gerenciarSala = new GerenciarSala();
            Sala sala = gerenciarSala.getSala(idSala);
            GerenciarEvento evento = new GerenciarEvento();
            if (eventos.get(0).getId() == null) {
                for (int i = 0; i < eventos.size(); i++) {
                    eventos.get(i).setSala(sala);
                    eventos.get(i).setStatus(Evento.STATUS_ALOCADO);
                }
                evento.adicionar(eventos.toArray(new Evento[0]));
            } else {
                evento.alocar(idSala, eventos.toArray(new Evento[0]));
            }
        }
    }
}
