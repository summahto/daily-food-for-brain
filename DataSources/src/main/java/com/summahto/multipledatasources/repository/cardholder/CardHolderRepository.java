package com.summahto.multipledatasources.repository.cardholder;

import com.summahto.multipledatasources.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
