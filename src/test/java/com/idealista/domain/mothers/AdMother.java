package com.idealista.domain.mothers;

import com.idealista.domain.services.Ad;
import com.idealista.domain.services.AdIdentifer;
import com.idealista.domain.services.Picture;

import java.util.Collections;

import static java.util.Arrays.asList;

public class AdMother {

    public static Ad createAdWithASingleHDPicture() {
        return new Ad(new AdIdentifer(1), "FLAT", null, Collections.singletonList(new Picture(1, "http://this-is-a-url.com", "HD")), null, null, null, null);
    }

    public static Ad createAdWithASingleSDPicture() {
        return new Ad(new AdIdentifer(1), "FLAT", null, Collections.singletonList(new Picture(1, "http://this-is-a-url.com", "SD")), null, null, null, null);
    }

    public static Ad createAdWithAThreeHDPictures() {
        return new Ad(new AdIdentifer(1), "FLAT", null, asList(new Picture(1, "http://this-is-a-url.com", "HD"),
                new Picture(2, "http://this-is-a-url.com", "HD"), new Picture(3, "http://this-is-a-url.com", "HD")), null, null, null, null);
    }
}
