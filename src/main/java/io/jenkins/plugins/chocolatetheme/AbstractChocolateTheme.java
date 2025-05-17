package io.jenkins.plugins.chocolatetheme;

import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import java.util.Collections;

public abstract class AbstractChocolateTheme extends ThemeManagerFactory {

    @Override
    public Theme getTheme() {
        return Theme.builder()
                .withCssUrls(Collections.singletonList(getCssUrl()))
                .build();
    }
}
