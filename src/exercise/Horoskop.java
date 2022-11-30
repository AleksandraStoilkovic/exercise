package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Horoskop {

	public static void main(String[] args) {
		ArrayList<String> znakovi = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite dan rodjenja: ");
		int dan = s.nextInt();

		System.out.print("Unesite mesec rodjenja(broj): ");
		int mesec = s.nextInt();

		System.out.print("Unesite sat rodjenja(24h format): ");
		int sat = s.nextInt();

		System.out.print("Unesite minut rodjenja: ");
		int minut = s.nextInt();
		s.nextLine();
		znakovi.add("Ovan");
		znakovi.add("Bik");
		znakovi.add("Blizanci");
		znakovi.add("Rak");
		znakovi.add("Lav");
		znakovi.add("Devica");
		znakovi.add("Vaga");
		znakovi.add("Skorpija");
		znakovi.add("Strelac");
		znakovi.add("Jarac");
		znakovi.add("Vodolija");
		znakovi.add("Ribe");
		
	
		String uvodZnak= "Vas znak je: ";
		String uvodPodznak = "Vas podznak je: ";
		if ((mesec == 3 && dan >= 21) || (mesec == 4 && dan <= 20)) {
			System.out.println(uvodZnak + znakovi.get(0));
		} else if ((mesec == 4 && dan >= 21) || (mesec == 5 && dan <= 21)) {
			System.out.println(uvodZnak + znakovi.get(1));
		} else if ((mesec == 5 && dan >= 22) || (mesec == 6 && dan <= 21)) {
			System.out.println(uvodZnak + znakovi.get(2));
		} else if ((mesec == 6 && dan >= 22) || (mesec == 7 && dan <= 22)) {
			System.out.println(uvodZnak + znakovi.get(3));
		} else if ((mesec == 7 && dan >= 23) || (mesec == 8 && dan <= 22)) {
			System.out.println(uvodZnak + znakovi.get(4));
		} else if ((mesec == 8 && dan >= 23) || (mesec == 9 && dan <= 22)) {
			System.out.println(uvodZnak + znakovi.get(5));
		} else if ((mesec == 9 && dan >= 23) || (mesec == 10 && dan <= 23)) {
			System.out.println(uvodZnak + znakovi.get(6));
		} else if ((mesec == 10 && dan >= 24) || (mesec == 11 && dan <= 22)) {
			System.out.println(uvodZnak + znakovi.get(7));
		} else if ((mesec == 11 && dan >= 23) || (mesec == 12 && dan <= 21)) {
			System.out.println(uvodZnak + znakovi.get(8));
		} else if ((mesec == 12 && dan >= 22) || (mesec == 1 && dan <= 20)) {
			System.out.println(uvodZnak + znakovi.get(9));
		} else if ((mesec == 1 && dan >= 21) || (mesec == 2 && dan <= 19)) {
			System.out.println(uvodZnak + znakovi.get(10));
		} else if ((mesec == 2 && dan >= 20) || (mesec == 3 && dan <= 20)) {
			System.out.println(uvodZnak + znakovi.get(11));
		}

		if (mesec == 1 && dan <= 10) {
			if ((sat == 11 && minut >= 50) || (sat == 12 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if ((sat == 12 && minut > 25 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 12 && minut >= 45) || (sat == 13 && minut <= 30)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 13 && minut > 30 && minut < 55)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 13 && minut >= 55) || (sat == 14 || (sat == 15 && minut <= 10))) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 15 && minut > 10 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 15 && minut >= 50) || (sat == 16 || (sat == 17 && minut <= 30))) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 17 && minut > 30) || (sat == 18 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 18 && minut >= 20) || (sat == 19 || (sat == 20 && minut <= 15))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 20 && minut > 15)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 21 && minut >= 0) || (sat == 22 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 22 && minut > 55) || (sat == 23 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 23 && minut >= 50) || (sat == 0 || (sat == 1 && minut <= 45))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 1 && minut > 45) || (sat == 2 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if((sat == 2 && minut >= 30) || (sat == 3 || (sat == 4 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 4 && minut > 25) || (sat == 5 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 5 && minut >= 20) || (sat == 6 || (sat == 7 && minut <= 0))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 7 && minut > 0) || (sat == 7 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 7 && minut >= 50) || (sat == 8 || (sat == 9 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if((sat == 9 && minut > 5) || (sat == 9 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 9 && minut >= 40) || (sat == 10 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if (sat == 10 && minut > 25) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if ((sat == 11 && minut >= 0) || (sat == 11 && minut <= 35)) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if ((sat == 11 && minut > 35) || (sat == 11 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(12));
			}
		}
		if (mesec == 1 && dan > 10 && dan <= 20) {
			if ((sat == 11 && minut >= 10) || (sat == 11 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if (sat == 11 && minut > 45) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if (sat == 12 && minut <= 50) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 12 && minut > 50) || (sat == 13 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 13 && minut >= 20) || (sat == 14 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 14 && minut > 25) || (sat == 15 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 15 && minut >= 10) || (sat == 16 && minut <= 50)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 16 && minut > 50) || (sat == 17 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 17 && minut >= 40) || (sat == 18 || (sat == 19 && minut <= 35))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 19 && minut > 35) || (sat == 20 && minut <= 20)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 20 && minut >= 20) || (sat == 21 || (sat == 22 && minut <= 15))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 22 && minut > 15) || (sat == 23 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 23 && minut >= 10) || (sat == 0 || (sat == 1 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if (sat == 1 && minut > 5 && minut < 50) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 1 && minut >= 50) || (sat == 2 || (sat == 3 && minut <= 45))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 3 && minut > 45) || (sat == 4 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 4 && minut >= 40) || (sat == 5 || (sat == 6 && minut <= 20))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 6 && minut > 20) || (sat == 7 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 7 && minut >= 10) || (sat == 8 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if (sat == 8 && minut > 25) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if (sat == 9 && minut >= 0 && minut <= 40) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if ((sat == 9 && minut > 40) || (sat == 10 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if (sat == 10 && minut >= 15 && minut <= 50) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if ((sat == 10 && minut > 50) || (sat == 11 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 1 && dan > 20) {
			if ((sat == 10 && minut >= 30) || (sat == 11 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if (sat == 11 && minut > 5 && minut < 20) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 11 && minut >= 20) || (sat == 12 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if (sat == 12 && minut > 5 && minut < 35) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 12 && minut >= 35) || (sat == 13 && minut <= 50)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 13 && minut > 50) || (sat == 14 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 14 && minut >= 30) || (sat == 16 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if (sat == 16 && minut > 10) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if (sat == 17 || (sat == 18 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 18 && minut > 55) || (sat == 19 && minut <= 40)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 19 && minut >= 40) || (sat == 20 || (sat == 21 && minut <= 35))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 21 && minut > 35) || (sat == 22 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 22 && minut >= 30) || (sat == 23 || (sat == 0 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 0 && minut > 25) || (sat == 1 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 1 && minut >= 10) || (sat == 2 || (sat == 3 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if (sat == 3 && minut > 5) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 4 && minut >= 0) || (sat == 5 && minut <= 40)) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 5 && minut > 40) || (sat == 6 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			}else if ((sat == 6 && minut >= 30) || (sat == 7 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if ((sat == 7 && minut > 45) || (sat == 8 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 8 && minut >= 20) || (sat == 9 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if (sat == 9 && minut > 5 && minut < 35) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if ((sat == 9 && minut >= 35) || (sat == 10 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if (sat == 10 && minut > 15 && minut < 30) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 2 && dan <= 10) {
			if ((sat == 9 && minut >= 50) || (sat == 10 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if ((sat == 10 && minut > 25 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 10 && minut >= 45) || (sat == 11 && minut <= 30)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 11 && minut > 30 && minut < 55)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 11 && minut >= 55) || (sat == 12 || (sat == 13 && minut <= 10))) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 13 && minut > 10 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 13 && minut >= 50) || (sat == 14 || (sat == 15 && minut <= 30))) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 15 && minut > 30) || (sat == 16 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 16 && minut >= 20) || (sat == 17 || (sat == 18 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 18 && minut > 25)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 19 && minut >= 0) || (sat == 20 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 20 && minut > 55) || (sat == 21 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 21 && minut >= 50) || (sat == 22 || (sat == 23 && minut <= 45))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 23 && minut > 45) || (sat == 0 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 0 && minut >= 30) || (sat == 1 || (sat == 2 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 2 && minut > 25) || (sat == 3 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 3 && minut >= 20) || (sat == 4 || (sat == 5 && minut <= 0))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 5 && minut > 0) || (sat == 5 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 5 && minut >= 50) || (sat == 6 || (sat == 7 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if ((sat == 7 && minut > 5) || (sat == 7 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 7 && minut >= 40) || (sat == 8 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if (sat == 8 && minut > 25) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if ((sat == 9 && minut >= 0) || (sat == 9 && minut <= 35)) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if ((sat == 9 && minut > 35) || (sat == 9 && minut < 50)) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 2 && dan > 10 && dan <= 20) {
			if ((sat == 9 && minut >= 10) || (sat == 9 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if (sat == 9 && minut > 45) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if (sat == 10 && minut <= 45) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 10 && minut > 45) || (sat == 11 && minut < 15)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 11 && minut >= 15) || (sat == 12 && minut <= 30)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 12 && minut > 30) || (sat == 13 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 13 && minut >= 10) || (sat == 14 && minut <= 50)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 14 && minut > 50) || (sat == 15 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 15 && minut >= 40) || (sat == 16 || (sat == 17 && minut <= 35))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 17 && minut > 35) || (sat == 18 && minut <= 20)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 18 && minut >= 20) || (sat == 19 || (sat == 20 && minut <= 15))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 20 && minut > 15) || (sat == 21 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 21 && minut >= 10) || (sat == 22 || (sat == 23 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if (sat == 23 && minut > 5 && minut < 50) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 23 && minut >= 50) || (sat == 0 || (sat == 1 && minut <= 45))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 1 && minut > 45) || (sat == 2 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 2 && minut >= 40) || (sat == 3 || (sat == 4 && minut <= 20))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 4 && minut > 20) || (sat == 5 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 5 && minut >= 10) || (sat == 6 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if (sat == 6 && minut > 25) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if (sat == 7 && minut >= 0 && minut <= 40) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if ((sat == 7 && minut > 40) || (sat == 8 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if (sat == 8 && minut >= 15 && minut <= 50) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if((sat == 8 && minut > 50) || (sat == 9 && minut < 10)) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 2 && dan > 20) {
			if ((sat == 8 && minut >= 30) || (sat == 9 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if (sat == 9 && minut > 10 && minut < 30) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 9 && minut >= 30) || (sat == 10 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if (sat == 10 && minut > 10 && minut < 35) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 10 && minut >= 35) || (sat == 11 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 11 && minut > 55) || (sat == 12 && minut < 40)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 12 && minut >= 40) || (sat == 15 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if (sat == 15 && minut > 10) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 15 && minut >= 10) || (sat == 16)) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if (sat == 17 && minut < 45) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 17 && minut >= 45) || (sat == 18 || (sat == 19 && minut <= 35))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 19 && minut > 35) || (sat == 20 && minut < 30)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 20 && minut >= 30) || (sat == 21 || (sat == 22 && minut <= 30))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 22 && minut > 30) || (sat == 23 && minut <= 20)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 23 && minut >= 20) || (sat == 0 || (sat == 1 && minut <= 10))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 1 && minut > 10) || (sat == 2 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if((sat == 2 && minut >= 5) || (sat == 3 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 3 && minut > 45) || (sat == 4 && minut < 35)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 4 && minut >= 35) || (sat == 5 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if ((sat == 5 && minut > 45) || (sat == 6 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 6 && minut >= 20) || (sat == 7 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if (sat == 7 && minut > 10 && minut < 45) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if ((sat == 7 && minut >= 45) || (sat == 8 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if (sat == 8 && minut > 15 && minut < 30) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 3 && dan <= 10) {
			if ((sat == 7 && minut >= 55) || (sat == 8 && minut <=30)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if ((sat == 8 && minut > 30 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 8 && minut >= 45) || (sat == 9 && minut <= 35)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 9 && minut > 35)  || (sat == 10 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 10 && minut >= 5) || (sat == 11 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if (sat == 11 && minut >= 15 && minut <= 55) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 11 && minut >= 55) || (sat == 12 || (sat == 13 && minut <= 35))) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 13 && minut >= 35) || (sat == 14 && minut <= 25)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 14 && minut >= 25) || (sat == 15 || (sat == 16 && minut <= 20))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 16 && minut > 20|| (sat == 17 && minut <= 5)))  {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 17 && minut >= 5) || sat == 18 ) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if (sat == 19 && minut > 0 && minut < 55) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 19 && minut >= 55) || (sat == 20 || (sat == 21 && minut <= 50))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 21 && minut > 50) || (sat == 22 && minut < 35)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 22 && minut >= 35) || (sat == 23 || (sat == 0 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 0 && minut > 25) || (sat == 1 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 1 && minut >= 20) || (sat == 2 || (sat == 3 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if (sat == 3 && minut > 5 && minut < 55) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 3 && minut >= 55) || (sat == 4 || (sat == 5 && minut <= 10))) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if ((sat == 5 && minut > 10) || (sat == 5 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 5 && minut >= 45) || (sat == 6 && minut <= 30)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if ((sat == 6 && minut > 30)|| (sat == 7 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if (sat == 7 && minut >= 5 && minut <= 40) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if (sat == 7 && minut > 40 && minut < 55) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 3 && dan > 10 && dan <= 20) {
			if (sat == 7 && minut >= 15 && minut <= 50) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if ((sat == 7 && minut > 50) || (sat == 8 && minut < 5)) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if (sat == 8 && minut >=5 && minut<=50) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if ((sat == 8 && minut > 50) || (sat == 9 && minut < 20)) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 9 && minut >= 20) || (sat == 10 && minut <= 35)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 10 && minut > 35) || (sat == 11 && minut < 15)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 11 && minut >= 15) || (sat == 12 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 12 && minut > 55) || (sat == 13 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 13 && minut >= 45) || (sat == 14 || (sat == 15 && minut <= 40))) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if ((sat == 15 && minut > 40) || (sat == 16 && minut <= 30)) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 16 && minut >= 30) || (sat == 17 || (sat == 18 && minut <= 20))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 18 && minut > 20) || (sat == 19 && minut < 15)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 19 && minut >= 15) || (sat == 20 || (sat == 21 && minut <= 10))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if (sat == 21 && minut > 10 && minut < 55) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 21 && minut >= 55) || (sat == 22 || (sat == 23 && minut <= 50))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 23 && minut > 50) || (sat == 0 && minut < 45)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if ((sat == 0 && minut >= 45) || (sat == 1 || (sat == 2 && minut <= 25))) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 2 && minut > 25) || (sat == 3 && minut < 15)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 3 && minut >= 15) || (sat == 4 && minut <= 40)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if ((sat == 4 && minut >= 40) || (sat == 5 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if (sat == 5 && minut >= 5 && minut <= 50) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if ((sat == 5 && minut > 50) || (sat == 6 && minut <= 20)) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if (sat == 6 && minut >= 20 && minut <= 55) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if((sat == 6 && minut > 55) || (sat == 7 && minut < 15)) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
		if (mesec == 3 && dan > 20) {
			if ((sat == 6 && minut >= 35) || (sat == 7 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(0));
			} else if (sat == 7 && minut > 10 && minut < 25) {
				System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
			} else if ((sat == 7 && minut >= 25) || (sat == 8 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(1));
			} else if (sat == 8 && minut > 15 && minut < 40) {
				System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
			} else if ((sat == 8 && minut >= 40) || (sat == 9 && minut <= 55)) {
				System.out.println(uvodPodznak + znakovi.get(2));
			} else if ((sat == 9 && minut > 55) || (sat == 10 && minut < 35)) {
				System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
			} else if ((sat == 10 && minut >= 35) || (sat == 12 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(3));
			} else if ((sat == 12 && minut > 15) || (sat == 13 && minut < 5)) {
				System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
			} else if ((sat == 13 && minut >= 5) || sat == 14 || sat == 15) {
				System.out.println(uvodPodznak + znakovi.get(4));
			} else if (sat == 15 && minut < 45) {
				System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
			} else if ((sat == 15 && minut >= 45) || (sat == 16 || (sat == 17 && minut <= 50))) {
				System.out.println(uvodPodznak + znakovi.get(5));
			} else if ((sat == 17 && minut > 50) || (sat == 18 && minut < 35)) {
				System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
			} else if ((sat == 18 && minut >= 35) || (sat == 19 || (sat == 20 && minut <= 30))) {
				System.out.println(uvodPodznak + znakovi.get(6));
			} else if ((sat == 20 && minut > 30) || (sat == 21 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
			} else if ((sat == 21 && minut >= 15) || (sat == 22 || (sat == 23 && minut <= 5))) {
				System.out.println(uvodPodznak + znakovi.get(7));
			} else if ((sat == 23 && minut > 5) || (sat == 0 && minut <= 5)) {
				System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
			} else if((sat == 0 && minut >= 5) || (sat == 1 && minut <= 45)) {
				System.out.println(uvodPodznak + znakovi.get(8));
			} else if ((sat == 1 && minut > 45) || (sat == 2 && minut < 35)) {
				System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
			} else if ((sat == 2 && minut >= 35) || (sat == 4 && minut <= 15)) {
				System.out.println(uvodPodznak + znakovi.get(9));
			} else if (sat == 4 && minut > 15 && minut < 25) {
				System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
			} else if ((sat == 4 && minut >= 25) || (sat == 5 && minut <= 10)) {
				System.out.println(uvodPodznak + znakovi.get(10));
			} else if (sat == 5 && minut > 10 && minut < 45) {
				System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
			} else if ((sat == 5 && minut >= 45) || (sat == 6 && minut <= 20)) {
				System.out.println(uvodPodznak + znakovi.get(11));
			} else if (sat == 6 && minut > 20 && minut < 35) {
				System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
			}
		}
			if (mesec == 4 && dan <= 10) {
				if ((sat == 5 && minut >= 55) || (sat == 6 && minut <=30)) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if ((sat == 6 && minut > 30 && minut < 45)) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if ((sat == 6 && minut >= 45) || (sat == 7 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if (sat == 7 && minut > 35)  {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 8 && minut >= 0) || (sat == 9 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if (sat == 9 && minut > 15 && minut <= 55) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 9 && minut == 55) || sat == 10 || (sat == 11 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 11 && minut >= 35) || (sat == 12 && minut < 25)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 12 && minut >= 25) || (sat == 13 || (sat == 14 && minut <= 15))) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if ((sat == 14 && minut > 15|| (sat == 15 && minut < 5)))  {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 15 && minut >= 5) || sat == 16 ) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if (sat == 17 && minut > 0 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 17 && minut >= 55) || sat == 18 || (sat == 19 && minut <= 50)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if ((sat == 19 && minut > 50) || (sat == 20 && minut < 35)) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 20 && minut >= 35) || sat == 21 || (sat == 22 && minut <= 25)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 22 && minut > 25) || (sat == 23 && minut < 32)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if ((sat == 23 && minut >= 32) || sat == 0 || (sat == 1 && minut <= 5)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if (sat == 1 && minut > 5 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 1 && minut >= 55) || sat == 2 || (sat == 3 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if ((sat == 3 && minut > 10) || (sat == 3 && minut < 45)) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if ((sat == 3 && minut >= 45) || (sat == 4 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if ((sat == 4 && minut > 30)|| (sat == 5 && minut <5)) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if (sat == 5 && minut >= 5 && minut <= 40) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if (sat == 5 && minut > 40 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
			if (mesec == 4 && dan > 10 && dan <= 20) {
				if (sat == 5 && minut >= 15 && minut <= 50) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if ((sat == 5 && minut > 50) || (sat == 6 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if (sat == 6 && minut >=5 && minut<=50) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if ((sat == 6 && minut > 50) || (sat == 7 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 7 && minut >= 20) || (sat == 8 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if ((sat == 8 && minut > 35) || (sat == 9 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 9 && minut >= 15) || (sat == 10 && minut <= 50)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 10 && minut > 50) || (sat == 11 && minut < 40)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 11 && minut >= 40) || sat == 12 || (sat == 13 && minut <= 40)) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if ((sat == 13 && minut > 40) || (sat == 14 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 14 && minut >= 30) || sat == 15 || (sat == 16 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if ((sat == 16 && minut > 20) || (sat == 17 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 17 && minut >= 15) || sat == 18 || (sat == 19 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if (sat == 19 && minut > 10 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 19 && minut >= 55) || sat == 20 || (sat == 21 && minut <= 55)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 21 && minut > 55) || (sat == 22 && minut < 45)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if ((sat == 22 && minut >= 45) || sat == 23 || (sat == 0 && minut <= 25)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if ((sat == 0 && minut > 25) || (sat == 1 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 1 && minut >= 15) || (sat == 2 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if ((sat == 2 && minut >= 30) || (sat == 3 && minut <= 5)) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if (sat == 3 && minut >= 5 && minut <= 50) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if ((sat == 3 && minut > 50) || (sat == 4 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if (sat == 4 && minut >= 20 && minut <= 55) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if((sat == 4 && minut > 55) || (sat == 5 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
			if (mesec == 4 && dan > 20) {
				if ((sat == 4 && minut >= 30) || (sat == 5 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if (sat == 5 && minut > 10 && minut < 30) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if ((sat == 5 && minut >= 30) || (sat == 6 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if (sat == 6 && minut > 10 && minut < 35) {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 6 && minut >= 35) || (sat == 7 && minut <= 55)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if ((sat == 7 && minut > 55) || (sat == 8 && minut < 40)) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 8 && minut >= 40) || sat == 9 || (sat == 10 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 10 && minut > 20) || (sat == 11 && minut < 10)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 11 && minut >= 10) || sat == 12 || sat == 13) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if (sat == 13 && minut < 45) {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 13 && minut >= 45) || sat == 14 || (sat == 15 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if ((sat == 15 && minut > 35) || (sat == 16 && minut < 30)) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 16 && minut >= 30) || sat == 17 || (sat == 18 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if ((sat == 18 && minut > 30) || (sat == 19 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 19 && minut >= 20) || sat == 20 || (sat == 21 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 21 && minut > 10) || (sat == 22 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if((sat == 22 && minut >= 5) || (sat == 23 && minut <= 45)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if ((sat == 23 && minut > 45) || (sat == 0 && minut < 35)) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 0 && minut >= 35) || (sat == 1 && minut <= 45)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if (sat == 1 && minut > 45 || (sat == 2 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if ((sat == 2 && minut >= 20) || (sat == 3 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if (sat == 3 && minut > 10 && minut < 45) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if ((sat == 3 && minut >= 45) || (sat == 4 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if (sat == 4 && minut > 15 && minut < 30) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
			if (mesec == 5 && dan <= 10) {
				if ((sat == 3 && minut >= 55) || (sat == 4 && minut <=30)) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if ((sat == 4 && minut > 30 && minut < 45)) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if ((sat == 4 && minut >= 45) || (sat == 5 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if (sat == 5 && minut > 30)  {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 6 && minut >= 0) || (sat == 7 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if (sat == 7 && minut > 15 && minut <= 55) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 7 && minut == 55) || sat == 8 || (sat == 9 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 9 && minut >= 35) || (sat == 10 && minut < 25)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 10 && minut >= 25) || sat == 11 || (sat == 12 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if ((sat == 12 && minut > 20 || (sat == 13 && minut < 5)))  {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 13 && minut >= 5) || sat == 14 ) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if (sat == 15 && minut >= 0 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 15 && minut >= 55) || sat == 16 || (sat == 17 && minut <= 50)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if ((sat == 17 && minut > 50) || (sat == 18 && minut < 35)) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 18 && minut >= 35) || sat == 19 || (sat == 20 && minut <= 25)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 20 && minut > 25) || (sat == 21 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if ((sat == 21 && minut >= 20) || sat == 22 || (sat == 23 && minut <= 5)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if (sat == 23 && minut > 5 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 23 && minut >= 55) || sat == 0 || (sat == 1 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if (sat == 1 && minut > 10 && minut < 45) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if ((sat == 1 && minut >= 45) || (sat == 2 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if (sat == 2 && minut > 30 ) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if (sat == 3 && minut >= 0 && minut <= 35) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if (sat == 3 && minut > 35 && minut < 55) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
			if (mesec == 5 && dan > 10 && dan <= 20) {
				if (sat == 3 && minut >= 15 && minut <= 50) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if ((sat == 3 && minut > 50) || (sat == 4 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if (sat == 4 && minut >=5 && minut<=50) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if ((sat == 4 && minut > 50) || (sat == 5 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 5 && minut >= 20) || (sat == 6 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if ((sat == 6 && minut > 15) || (sat == 7 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 7 && minut >= 15) || (sat == 8 && minut <= 55)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 8 && minut > 55) || (sat == 9 && minut < 40)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 9 && minut >= 40) || sat == 10 || (sat == 11 && minut <= 40)) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if ((sat == 11 && minut > 40) || (sat == 12 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 12 && minut >= 30) || sat == 13 || (sat == 14 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if ((sat == 14 && minut > 20) || (sat == 15 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 15 && minut >= 15) || sat == 16 || (sat == 17 && minut <= 5)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if (sat == 17 && minut > 5 && minut < 50) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 17 && minut >= 50) || sat == 18 || (sat == 19 && minut <= 45)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 19 && minut > 45) || (sat == 20 && minut < 40)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if ((sat == 20 && minut >= 40) || sat == 21 || (sat == 22 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if ((sat == 22 && minut > 20) || (sat == 23 && minut < 10)) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 23 && minut >= 10) || (sat == 0 && minut <= 25)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if ((sat == 0 && minut >= 25) || (sat == 1 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if (sat == 1 && minut >= 5 && minut <= 50) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if ((sat == 1 && minut > 50) || (sat == 2 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if (sat == 2 && minut >= 20 && minut <= 55) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if((sat == 2 && minut > 55) || (sat == 3 && minut < 15)) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
			if (mesec == 5 && dan > 20) {
				if ((sat == 2 && minut >= 30) || (sat == 3 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(0));
				} else if (sat == 3 && minut > 10 && minut < 30) {
					System.out.println(uvodPodznak + znakovi.get(0) + "-" + znakovi.get(1));
				} else if ((sat == 3 && minut >= 30) || (sat == 4 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(1));
				} else if (sat == 4 && minut > 10 && minut < 35) {
					System.out.println(uvodPodznak + znakovi.get(1) + "-" + znakovi.get(2));
				} else if ((sat == 4 && minut >= 35) || (sat == 5 && minut <= 55)) {
					System.out.println(uvodPodznak + znakovi.get(2));
				} else if ((sat == 5 && minut > 55) || (sat == 6 && minut < 40)) {
					System.out.println(uvodPodznak + znakovi.get(2) + "-" + znakovi.get(3));
				} else if ((sat == 6 && minut >= 40)  || sat == 7 || (sat == 8 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(3));
				} else if ((sat == 8 && minut > 15) || (sat == 9 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(3) + "-" + znakovi.get(4));
				} else if ((sat == 9 && minut >= 5) || sat == 10 || sat == 11 && minut == 0) {
					System.out.println(uvodPodznak + znakovi.get(4));
				} else if (sat == 11 && minut < 45) {
					System.out.println(uvodPodznak + znakovi.get(4) + "-" + znakovi.get(5));
				} else if ((sat == 11 && minut >= 45) || sat == 12 || (sat == 13 && minut <= 35)) {
					System.out.println(uvodPodznak + znakovi.get(5));
				} else if ((sat == 13 && minut > 35) || (sat == 14 && minut < 30)) {
					System.out.println(uvodPodznak + znakovi.get(5) + "-" + znakovi.get(6));
				} else if ((sat == 14 && minut >= 30) || sat == 15 || (sat == 16 && minut <= 30)) {
					System.out.println(uvodPodznak + znakovi.get(6));
				} else if ((sat == 16 && minut > 30) || (sat == 17 && minut <= 20)) {
					System.out.println(uvodPodznak + znakovi.get(6) + "-" + znakovi.get(7));
				} else if ((sat == 17 && minut >= 20) || sat == 18 || (sat == 19 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(7));
				} else if ((sat == 19 && minut > 10) || (sat == 20 && minut < 5)) {
					System.out.println(uvodPodznak + znakovi.get(7) + "-" + znakovi.get(8));
				} else if((sat == 20 && minut >= 5) || (sat == 21 && minut <= 45)) {
					System.out.println(uvodPodznak + znakovi.get(8));
				} else if ((sat == 21 && minut > 45) || (sat == 22 && minut < 35)) {
					System.out.println(uvodPodznak + znakovi.get(8) + "-" + znakovi.get(9));
				} else if ((sat == 22 && minut >= 35) || (sat == 23 && minut <= 45)) {
					System.out.println(uvodPodznak + znakovi.get(9));
				} else if (sat == 23 && minut > 45 || (sat == 0 && minut < 20)) {
					System.out.println(uvodPodznak + znakovi.get(9) + "-" + znakovi.get(10));
				} else if ((sat == 0 && minut >= 20) || (sat == 1 && minut <= 10)) {
					System.out.println(uvodPodznak + znakovi.get(10));
				} else if (sat == 1 && minut > 10 && minut < 45) {
					System.out.println(uvodPodznak + znakovi.get(10) + "-" + znakovi.get(11));
				} else if ((sat == 1 && minut >= 45) || (sat == 2 && minut <= 15)) {
					System.out.println(uvodPodznak + znakovi.get(11));
				} else if (sat == 2 && minut > 15 && minut < 30) {
					System.out.println(uvodPodznak + znakovi.get(11) + "-" + znakovi.get(0));
				}
			}
	}
}