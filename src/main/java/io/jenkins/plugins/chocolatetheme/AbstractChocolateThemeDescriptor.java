package io.jenkins.plugins.chocolatetheme;

import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;

public abstract class AbstractChocolateThemeDescriptor extends ThemeManagerFactoryDescriptor {

    public static final String ID = "chocolate";

    @Override
    public String getThemeId() {
        return ID;
    }

    @Override
    public boolean isNamespaced() {
        return true;
    }
}
