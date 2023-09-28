package br.com.gustavo.cadastro_de_pessoa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavo.cadastro_de_pessoa.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
