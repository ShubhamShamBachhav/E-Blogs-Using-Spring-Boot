package com.eblog.demo;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eblog.demo.chatgpt.model.response.PlagReport;
import com.eblog.demo.chatgpt.model.response.TurnitinResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@SpringBootApplication
public class EblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(EblogApplication.class, args);
	}

	
}