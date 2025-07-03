package io.jenkins.plugins.chocolatetheme;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class ChocolateTheme extends AbstractChocolateTheme {

    public static final String CSS = "chocolate.css";

    @DataBoundConstructor
    public ChocolateTheme() {
        // Stapler
    }

    @Extension
    @Symbol("chocolate")
    public static class DescriptorImpl extends AbstractChocolateThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "chocolate";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new ChocolateTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Chocolate";
        }

        @Override
        public String getIconClassName() {
            return "symbol-chocolate plugin-chocolate-theme";
        }
    }
}
