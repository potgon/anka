package com.Anka.asset;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository repository) {
        this.assetRepository = repository;
    }

    public List<Asset> findAllAssetNames() {
        return assetRepository.findAll();
    }

}
