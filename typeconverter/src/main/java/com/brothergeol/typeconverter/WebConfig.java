package com.brothergeol.typeconverter;import com.brothergeol.typeconverter.converter.IntegerToStringConverter;import com.brothergeol.typeconverter.converter.IpPortToStringConverter;import com.brothergeol.typeconverter.converter.StringToIntegerConverter;import com.brothergeol.typeconverter.converter.StringToIpPortConverter;import org.springframework.context.annotation.Configuration;import org.springframework.format.FormatterRegistry;import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;@Configurationpublic class WebConfig implements WebMvcConfigurer {    @Override    public void addFormatters(FormatterRegistry registry) {        registry.addConverter(new IntegerToStringConverter());        registry.addConverter(new StringToIntegerConverter());        registry.addConverter(new StringToIpPortConverter());        registry.addConverter(new IpPortToStringConverter());    }}