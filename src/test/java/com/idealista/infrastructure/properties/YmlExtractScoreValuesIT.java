package com.idealista.infrastructure.properties;

import com.idealista.domain.ExtractScoreValues;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class YmlExtractScoreValuesIT {

    @Autowired
    private ExtractScoreValues extractScoreValues;

    @Test
    void shouldExtractCompleteAdScoreValuesFromPropertyFile() {
        //when
        final int completeAdScore = extractScoreValues.getCompleteAdScore();

        //then
        assertEquals(40, completeAdScore);
    }

    @Test
    void shouldExtractSpecialWordScoreValuesFromPropertyFile() {
        //when
        final int specialWordScore = extractScoreValues.getSpecialWordScore();

        //then
        assertEquals(5, specialWordScore);
    }

    @Test
    void shouldExtractHDPictureScoreValuesFromPropertyFile() {
        //when
        final int hdPictureScore = extractScoreValues.getHDPictureScore();

        //then
        assertEquals(20, hdPictureScore);
    }

    @Test
    void shouldExtractSDPictureScoreValuesFromPropertyFile() {
        //when
        final int sdPictureScore = extractScoreValues.getSDPictureScore();

        //then
        assertEquals(10, sdPictureScore);
    }

    @Test
    void shouldExtractHasDescriptionScoreValuesFromPropertyFile() {
        //when
        final int hasDescriptionScore = extractScoreValues.getHasDescriptionScore();

        //then
        assertEquals(5, hasDescriptionScore);
    }

    @Test
    void shouldExtractShorDescriptionScoreValuesFromPropertyFile() {
        //when
        final int shortDescriptionScore = extractScoreValues.getShortDescriptionScore();

        //then
        assertEquals(10, shortDescriptionScore);
    }

    @Test
    void shouldExtractLongDescriptionForFlatScoreValuesFromPropertyFile() {
        //when
        final int longDescriptionForFlatScore = extractScoreValues.getLongDescriptionForFlatScore();

        //then
        assertEquals(30, longDescriptionForFlatScore);
    }

    @Test
    void shouldExtractNotPictureScoreValuesFromPropertyFile() {
        //when
        final int longDescriptionForChaletScore = extractScoreValues.getLongDescriptionForChaletScore();

        //then
        assertEquals(20, longDescriptionForChaletScore);
    }

    @Test
    void shouldExtractSpecialWordsValuesFromPropertyFile() {
        //when
        final List<String> longDescriptionForChaletScore = extractScoreValues.getSpecialWords();

        //then
        assertNotNull(longDescriptionForChaletScore);

        assertThat(longDescriptionForChaletScore, hasSize(5));
        assertThat(longDescriptionForChaletScore.get(0), is("Luminoso"));
        assertThat(longDescriptionForChaletScore.get(1), is("Nuevo"));
        assertThat(longDescriptionForChaletScore.get(2), is("Céntrico"));
        assertThat(longDescriptionForChaletScore.get(3), is("Reformado"));
        assertThat(longDescriptionForChaletScore.get(4), is("Ático"));
    }
}
