package com.summahto.multipledatasources.repository.card;

import com.summahto.multipledatasources.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardRepository extends JpaRepository<Card, Long> {
}
