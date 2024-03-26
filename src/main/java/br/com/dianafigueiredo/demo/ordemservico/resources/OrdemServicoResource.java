/*
package br.com.dianafigueiredo.demo.ordemservico.resources;
import br.com.dianafigueiredo.demo.ordemservico.domain.OrdemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/ordemservicos")
public class OrdemServicoResource {
    @Autowired
    private OrdemServico ordemServicoService;

    @PostMapping
    public ResponseEntity<OrdemServico> criarOS(@ResponseBody OrdemServico ordemServico){
        ordemServico.criarOS(ordemServico);

    }

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(ordemServicoService.getIdOrdemServico())
}
*/