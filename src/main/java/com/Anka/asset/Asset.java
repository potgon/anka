package com.Anka.asset;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assets")
public record Asset(
        @Id Integer id,
        String ticker,
        String name,
        String sector,
        String asset_type
) {
}
