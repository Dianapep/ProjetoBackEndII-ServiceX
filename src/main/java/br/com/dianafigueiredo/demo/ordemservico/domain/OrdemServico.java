
package br.com.dianafigueiredo.demo.ordemservico.domain;

import br.com.dianafigueiredo.demo.pagamento.domain.Pagamento;
import br.com.dianafigueiredo.demo.servico.domain.Servico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table
public class OrdemServico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOS;
    @Column(name = "DATA_SOLICITACAO")

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataSolicitacao;
    @Column (name = "VALORES_OS")
    private double valorOS;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "ordemservico")
    private Pagamento pagamento;
    @ManyToMany
    @JoinTable(name = "SERVICO_OS",
    joinColumns = @JoinColumn(name = "ID_OS"),
    inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;


}
