package it.prova.gestioneposte.listandstreams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.gestioneposte.model.PostaDiPaese;
import it.prova.gestioneposte.model.Destinatario;

public class MockData {

	public static final List<PostaDiPaese> POSTA_DI_PAESE_LIST = new ArrayList<>();

	static {
		try {
			PostaDiPaese primoUfficioPostale = new PostaDiPaese(1L, "Ufficio Centrale di Lugano", "Via Italia, 52",
					new SimpleDateFormat("dd/MM/yyyy").parse("05/10/2021"), 70);
			Destinatario destinatarioPrimoUfficio1 = new Destinatario(45L, "Eros", "Fabbri", 20, "Via Caramalli, 89",
					true, primoUfficioPostale);
			primoUfficioPostale.getDestinatari().add(destinatarioPrimoUfficio1);
			Destinatario destinatarioPrimoUfficio2 = new Destinatario(433L, "Claudio", "Buzi", 21,
					"Via Sotomarossi, 25", true, primoUfficioPostale);
			primoUfficioPostale.getDestinatari().add(destinatarioPrimoUfficio2);

			PostaDiPaese secondoUfficioPostale = new PostaDiPaese(2L, "Ufficio postale di Romagna", "Via Sassari, 46",
					new SimpleDateFormat("dd/MM/yyyy").parse("15/11/2001"), 50);
			Destinatario destinatarioSecondoUfficio1 = new Destinatario(451L, "Saverio", "Carelli", 26,
					"Via Purututti, 56", false, secondoUfficioPostale);
			secondoUfficioPostale.getDestinatari().add(destinatarioSecondoUfficio1);

			PostaDiPaese terzoUfficioPostale = new PostaDiPaese(3L, "Ufficio postale di Calabria", "Via Mirenze, 78",
					new SimpleDateFormat("dd/MM/yyyy").parse("15/01/2022"), 8);
			Destinatario destinatarioTerzoUfficio1 = new Destinatario(455L, "Lucia", "Calabria", 22, "Via Sutturi, 78",
					true, terzoUfficioPostale);
			terzoUfficioPostale.getDestinatari().add(destinatarioTerzoUfficio1);
			Destinatario destinatarioTerzoUfficio2 = new Destinatario(567L, "Ivan", "Bendotti", 21, "Via Cartoli, 21",
					false, terzoUfficioPostale);
			terzoUfficioPostale.getDestinatari().add(destinatarioTerzoUfficio2);

			PostaDiPaese quartoUfficioPostale = new PostaDiPaese(4L, "Ufficio postale di Sesto Giacomo",
					"Via Baleari, 1", new SimpleDateFormat("dd/MM/yyyy").parse("31/01/2008"), 19);
			Destinatario destinatarioQuartoUfficio1 = new Destinatario(589L, "Alessio", "Conti", 21,
					"Via Cartoletti, 21", false, quartoUfficioPostale);
			quartoUfficioPostale.getDestinatari().add(destinatarioQuartoUfficio1);
			Destinatario destinatarioQuartoUfficio2 = new Destinatario(590L, "Andrea", "Marotti", 25, "Via Goletti, 12",
					true, quartoUfficioPostale);
			quartoUfficioPostale.getDestinatari().add(destinatarioQuartoUfficio2);
			Destinatario destinatarioQuartoUfficio3 = new Destinatario(619L, "Alessia", "Ivanotti", 35,
					"Via Calestori, 101", true, quartoUfficioPostale);
			quartoUfficioPostale.getDestinatari().add(destinatarioQuartoUfficio3);

			POSTA_DI_PAESE_LIST.add(primoUfficioPostale);
			POSTA_DI_PAESE_LIST.add(secondoUfficioPostale);
			POSTA_DI_PAESE_LIST.add(terzoUfficioPostale);
			POSTA_DI_PAESE_LIST.add(quartoUfficioPostale);
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}