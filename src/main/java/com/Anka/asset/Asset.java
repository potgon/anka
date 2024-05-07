package com.Anka.asset;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "asset")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ticker", length = 20)
    private String ticker;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "sector", length = 50)
    private String sector;
    @Column(name = "asset_type", length = 50)
    private String asset_type;

}
