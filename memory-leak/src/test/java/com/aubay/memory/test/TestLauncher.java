package com.aubay.memory.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class TestLauncher {

	@Test
	public void testThrowOutOfMemory() throws IOException, URISyntaxException {

		String str = "";
		System.out.println("mon fichier1");
		URLConnection conn = this.getClass().getClassLoader().getResource("fichier1.txt").openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
		String val = "";
		while ((val = br.readLine()) != null) {
			str = str.intern() + val.intern();
		}

		System.out.println("mon fichier2");
		URLConnection conn2 = this.getClass().getClassLoader().getResource("fichier2.txt").openConnection();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(conn2.getInputStream(), StandardCharsets.UTF_8));
		String val2 = "";
		while ((val2 = br2.readLine()) != null) {
			str = str.intern() + val2.intern();
		}

		System.out.println("mon fichier3");
		URLConnection conn3 = this.getClass().getClassLoader().getResource("fichier3.txt").openConnection();
		BufferedReader br3 = new BufferedReader(new InputStreamReader(conn3.getInputStream(), StandardCharsets.UTF_8));
		String val3 = "";
		while ((val3 = br3.readLine()) != null) {
			str = str.intern() + val3.intern();
		}

		System.out.println("mon fichier4");
		URLConnection conn4 = this.getClass().getClassLoader().getResource("fichier4.txt").openConnection();
		BufferedReader br4 = new BufferedReader(new InputStreamReader(conn4.getInputStream(), StandardCharsets.UTF_8));
		String val4 = "";
		while ((val4 = br4.readLine()) != null) {
			str = str.intern() + val4.intern();
		}
		
		assertNotEquals("", str);
	}

}
