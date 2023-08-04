package io.github.luizimcpi.asynccontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
public class AsyncContextApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(AsyncContextApplication.class, args)
				.getBean(DispatcherServlet.class)
				.setThreadContextInheritable(true);
	}
}
