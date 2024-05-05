package com.Anka.asset;

public record Asset(
        Integer id,
        String ticker,
        String name,
        String sector,
        String asset_type
) {
}
