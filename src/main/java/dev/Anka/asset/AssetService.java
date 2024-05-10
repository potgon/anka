package dev.Anka.asset;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    public AssetService(AssetRepository repository) {
        this.assetRepository = repository;
    }

    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

}
