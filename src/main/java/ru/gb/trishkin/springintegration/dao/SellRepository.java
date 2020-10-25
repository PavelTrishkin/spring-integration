package ru.gb.trishkin.springintegration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.trishkin.springintegration.domain.Sell;

public interface SellRepository extends JpaRepository<Sell, Long> {
}
