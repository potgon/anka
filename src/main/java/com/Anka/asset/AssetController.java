package com.Anka.asset;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asset")
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService service) {
        this.assetService = service;
    }

    @GetMapping("/all")
    public List<Asset> getAllAssets() {
        return
    }
}
