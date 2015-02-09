/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifpb.persiste.dao.factory;

import com.br.ifpb.execoes.PersistenciaException;
import com.br.ifpb.persiste.dao.abstracao.EventoDaoIf;
import com.br.ifpb.persiste.dao.abstracao.SalaDaoIf;

/**
 *
 * @author Emanuel Batista da Silva Filho <emanuelbatista2011@gmail.com>
 */
public interface DaoFactoryIf {
    
    public SalaDaoIf createSalaDao() throws PersistenciaException;
    
    public EventoDaoIf createEventoDao() throws PersistenciaException;
    
}
