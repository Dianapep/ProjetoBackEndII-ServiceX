



package br.com.dianafigueiredo.demo.ordemservico.services;

import br.com.dianafigueiredo.demo.ordemservico.repositores.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;
}



