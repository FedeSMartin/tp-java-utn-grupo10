package view;

import java.util.*;

import controller.Participante;

public class VisorConsola {

	public static void mostrarResultados(List<Participante> participantes) {

		tituloPrograma();

		for (Participante participante : participantes) {

			System.out.println(participante.getNombre() + ", tiene " + participante.getPuntos() + " punto"
					+ (participante.getPuntos() == 1 ? "" : "s") + ", acertó " + participante.getAciertos()
					+ " pronóstico" + (participante.getAciertos() == 1 ? "" : "s") + ".");
		}

	}

	public static void tituloPrograma() {

		arteDeCaratula();

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nPresione Enter continuar...");
		scanner.nextLine();
	}

	public static void arteDeCaratula() {
		System.out.println("###############################################################");
		System.out.println("#  ______              ______        _____          __  _     #");
		System.out.println("#  | ___ \\             |  _  \\      /  ___|        / _|| |    #");
		System.out.println("#  | |_/ / _ __   ___  | | | |  ___ \\ `--.   ___  | |_ | |_   #");
		System.out.println("#  |  __/ | '__| / _ \\ | | | | / _ \\ `--. \\ / _ \\ |  _|| __|  #");
		System.out.println("#  | |    | |   | (_) || |/ / |  __//\\__/ /| (_) || |  | |_   #");
		System.out.println("#  \\_|    |_|    \\___/ |___/   \\___|\\____/  \\___/ |_|   \\__|  #");
		System.out.println("#                                                             #");
		System.out.println("#                       Programa de ProDe                     #");
		System.out.println("#                                                             #");
		System.out.println("###############################################################");

	}
}
