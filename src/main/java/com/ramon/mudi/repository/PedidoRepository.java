package com.ramon.mudi.repository;

import com.ramon.mudi.model.Pedido;
import com.ramon.mudi.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    public List<Pedido> findAll() ;
    List<Pedido> findByStatus(StatusPedido aguardando);

    }

