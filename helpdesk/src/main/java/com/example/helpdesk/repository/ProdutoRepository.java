package com.example.helpdesk.repository;

import com.example.helpdesk.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    Optional <ProdutoModel> findByCodigoProduto (String codigoProduto);

}
