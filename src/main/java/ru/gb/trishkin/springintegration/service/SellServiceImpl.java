package ru.gb.trishkin.springintegration.service;

import org.springframework.stereotype.Service;
import ru.gb.trishkin.springintegration.dao.SellRepository;
import ru.gb.trishkin.springintegration.domain.Sell;

import javax.transaction.Transactional;

@Service
public class SellServiceImpl implements SellService {
    private final SellRepository sellRepository;

    public SellServiceImpl(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }

    @Override
    @Transactional
    public void save(Sell sell) {
        sellRepository.save(sell);
    }
}
