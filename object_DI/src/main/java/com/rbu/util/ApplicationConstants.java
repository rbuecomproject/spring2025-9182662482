package com.rbu.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConstants {
	public ApplicationConstants() {
		System.out.println("ApplicationConstants object");

	}

	@Value("${success}")
	private String SUCCESS;
	@Value("${fail}")
	private String FAIL;
	@Value("${500}")
	private String HTTP_500;
	@Value("${400}")
	private String HTTP_400;
	@Value("${300}")
	private String HTTP_300;
	@Value("${fruitlist}")
	private List<String> fruits;
	@Value("${cricketers}")
	private Set<String> cricketers;

//	@Value("${stateCap}")
//	private Map<String, String> stateCap;
	@Override
	public String toString() {
		return "ApplicationConstants [SUCCESS=" + SUCCESS + ", FAIL=" + FAIL + ", HTTP_500=" + HTTP_500 + ", HTTP_400="
				+ HTTP_400 + ", HTTP_300=" + HTTP_300 + ", fruits=" + fruits + ", cricketers=" + cricketers + "]";
	}

}
