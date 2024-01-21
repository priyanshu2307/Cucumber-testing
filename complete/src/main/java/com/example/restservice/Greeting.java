package com.example.restservice;

public record Greeting(long id, String content) {

	public String getContent() {
		return content;
	} }
