package sosdigital;

import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class DiretorChamado {
    
    public Chamado chamaPolicia(int protocolo, String chave, SimpleDateFormat data, String descricao){
        Chamado novoChamado = new ChamadoPolicia();
        
        ChamadoPoliciaBuilder chamadoBuilder = new ChamadoPoliciaBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
    
    public Chamado chamaSamu(int protocolo, String chave, SimpleDateFormat data, String descricao){
        Chamado novoChamado = new ChamadoSamu();
        
        ChamadoSamuBuilder chamadoBuilder = new ChamadoSamuBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
    public Chamado chamaBombeiro(int protocolo, String chave, SimpleDateFormat data, String descricao){
        Chamado novoChamado = new ChamadoBombeiros();
        
        ChamadoBombeiroBuilder chamadoBuilder = new ChamadoBombeiroBuilder(novoChamado);
        chamadoBuilder.adicionarProtocolo(protocolo);
        chamadoBuilder.adicionarChave(chave);
        chamadoBuilder.adicionarData(data);
        chamadoBuilder.adicionarDescricao(descricao);
        novoChamado.transferirChamado();
        
        return novoChamado;
    }
}