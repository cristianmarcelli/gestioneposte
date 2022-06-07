package it.prova.gestioneposte.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import it.prova.gestioneposte.listandstreams.MockData;
import it.prova.gestioneposte.model.Destinatario;
import it.prova.gestioneposte.model.PostaDiPaese;

public class TestGestionePoste {
	public static void main(String[] args) throws ParseException {

		List<PostaDiPaese> listaPosteMOCK = MockData.POSTA_DI_PAESE_LIST;

		//tutte le poste il cui indirizzo contenga “(MI)”;
		System.out.println("Cerco tutte le poste il cui indirizzo contiene mi...");
		List<PostaDiPaese> posteCheContenganoMi = listaPosteMOCK.stream().filter(postaItem -> postaItem.getIndirizzoSede().contains("Mi")).collect(Collectors.toList());
		
		//stampo la lista
		posteCheContenganoMi.forEach(postaItem -> System.out.println(postaItem));

		//tutte le poste che sono state aperte dopo il primo marzo 2019;
		System.out.println("tutte le poste che sono state aperte dopo il primo marzo 2019...");
		
		Date dataTest = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2019");
		
		List<PostaDiPaese> posteAperteDopoIlDuemiladiciannove = listaPosteMOCK.stream().filter(postaItem -> postaItem.getDataApertura().after(dataTest)).collect(Collectors.toList());

		posteAperteDopoIlDuemiladiciannove.forEach(postaItem -> System.out.println(postaItem));

		// la lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20
		System.out.println("la lista di indirizzi delle poste il cui numero dipendenti sia superiore a 20");

		List<PostaDiPaese> listaIndirizziPosteConNumeroDipendentiSuperioriAVenti = listaPosteMOCK.stream()
				.filter(postaItem -> postaItem.getNumeroDipendenti() > 20).collect(Collectors.toList());

		listaIndirizziPosteConNumeroDipendentiSuperioriAVenti
				.forEach(postaItem -> System.out.println(postaItem.getIndirizzoSede()));

		// la lista di indirizzi di destinatari di poste con almeno 10 dipendenti;
		System.out.println("la lista di indirizzi di destinatari di poste con almeno 10 dipendenti");
		List<PostaDiPaese> listaPosteConAlmenoDieciDipendenti = listaPosteMOCK.stream()
				.filter(postaItem -> postaItem.getNumeroDipendenti() >= 10).collect(Collectors.toList());

		List<String> listaIndirizziDestinatariDiPosteConAlmenoDieciDipendenti = listaPosteConAlmenoDieciDipendenti
				.stream().flatMap(postaItem -> postaItem.getDestinatari().stream()
						.map(destinatarioItem -> destinatarioItem.getIndirizzo()))
				.collect(Collectors.toList());
		
		listaIndirizziDestinatariDiPosteConAlmenoDieciDipendenti.forEach(i -> System.out.println(i));
		
		//la lista di destinatari possessori di conto corrente ma appartenenti a poste con numero dipendenti compreso tra 50 e 100;
		System.out.println("la lista di destinatari possessori di conto corrente ma appartenenti a poste con numero dipendenti compreso tra 50 e 100");
		
		List<PostaDiPaese> listaPosteConNumeriDipendentiTraCinquantaECento = listaPosteMOCK.stream().filter(postaItem -> postaItem.getNumeroDipendenti() >= 50 && postaItem.getNumeroDipendenti() < 100).collect(Collectors.toList());

		List<Destinatario> listaDestinatariPossessoriDiContoCorrente = listaPosteConNumeriDipendentiTraCinquantaECento.stream().flatMap(p -> p.getDestinatari().stream().filter(d -> d.isPossessoreDiContoCorrente() == true)).collect(Collectors.toList());
		
		listaDestinatariPossessoriDiContoCorrente.forEach(d -> System.out.println(d));

		// la lista delle età dei destinatari delle poste che contengano nel campo
		// denominazione la stringa ‘Centrale’ e siano state aperta almeno dal primo
		// gennaio 2000.

		System.out.println(
				"la lista delle eta dei destinatari delle poste che contengano nel campo denominazione la stringa ‘Centrale’ e siano state aperta almeno dal primo gennaio 2000.");

		Date dataTest2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");

		List<PostaDiPaese> listaPosteCheContengonoCentraleEAperteAlmenoDalPrimoGennaioDuemila = listaPosteMOCK.stream()
				.filter(p -> p.getDenominazione().contains("Centrale") && p.getDataApertura().after(dataTest2))
				.collect(Collectors.toList());

		List<Integer> listaEtaDestinatari = listaPosteCheContengonoCentraleEAperteAlmenoDalPrimoGennaioDuemila.stream().flatMap(p -> p.getDestinatari().stream().map(d -> d.getEta())).collect(Collectors.toList());
		
		listaEtaDestinatari.forEach(d -> System.out.println(d));
		
	}

}