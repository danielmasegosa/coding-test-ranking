package com.idealista.domain;

public interface ExtractScoreValues {

    int getCompleteAdScore();

    int getSpecialWordScore();

    int getHDPictureScore();

    int getSDPictureScore();

    int getNotPictureScore();

    int getHasDescriptionScore();

    int getShortDescriptionScore();

    int getLongDescriptionForFlatScore();

    int getLongDescriptionForChaletScore();
}