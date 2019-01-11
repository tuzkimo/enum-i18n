package com.example.enumi18n;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;
import java.util.ResourceBundle;

public enum Status {
    NEW, COMPLETED, CANCEL;

    @Override
    public String toString() {
        Locale locale = LocaleContextHolder.getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle("status", locale);
        return bundle.getString(this.name());
    }
}
