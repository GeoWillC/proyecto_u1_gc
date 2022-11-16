package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.agendar("123123", LocalDateTime.of(2022, 12,2,8,30), "Doctor Teran", "123456789", "santiago chango", "12345","TE");

	}

}
