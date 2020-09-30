package com.idealista.domain.services;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Ad {

    private final AdIdentifer id;
    private final String typology;
    private final String description;
    private final List<Picture> pictures;
    private final Integer houseSize;
    private final Integer gardenSize;
    private final Integer score;
    private final Date irrelevantSince;

    public Ad(AdIdentifer id, String typology, String description, List<Picture> pictures, Integer houseSize, Integer gardenSize, Integer score, Date irrelevantSince) {
        this.id = id;
        this.typology = typology;
        this.description = description;
        this.pictures = Collections.unmodifiableList(pictures);
        this.houseSize = houseSize;
        this.gardenSize = gardenSize;
        this.score = score;
        this.irrelevantSince = irrelevantSince;
    }

    public AdIdentifer getId() {
        return id;
    }

    public String getTypology() {
        return typology;
    }

    public String getDescription() {
        return description;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public Integer getHouseSize() {
        return houseSize;
    }

    public Integer getGardenSize() {
        return gardenSize;
    }

    public Integer getScore() {
        return score;
    }

    public Date getIrrelevantSince() {
        return irrelevantSince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(id, ad.id) &&
                Objects.equals(typology, ad.typology) &&
                Objects.equals(description, ad.description) &&
                Objects.equals(pictures, ad.pictures) &&
                Objects.equals(houseSize, ad.houseSize) &&
                Objects.equals(gardenSize, ad.gardenSize) &&
                Objects.equals(score, ad.score) &&
                Objects.equals(irrelevantSince, ad.irrelevantSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typology, description, pictures, houseSize, gardenSize, score, irrelevantSince);
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", typology='" + typology + '\'' +
                ", description='" + description + '\'' +
                ", pictures=" + pictures +
                ", houseSize=" + houseSize +
                ", gardenSize=" + gardenSize +
                ", score=" + score +
                ", irrelevantSince=" + irrelevantSince +
                '}';
    }
}