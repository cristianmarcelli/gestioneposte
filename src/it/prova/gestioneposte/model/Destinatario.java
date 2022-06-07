package it.prova.gestioneposte.model;

public class Destinatario {

	private Long id;

	private String nome;

	private String cognome;

	private int eta;

	private String indirizzo;

	private boolean possessoreDiContoCorrente;

	private PostaDiPaese postaDipaese;

	public Destinatario() {
	}

	public Destinatario(Long id, String nome, String cognome, int eta, String indirizzo,
			boolean possessoreDiContoCorrente, PostaDiPaese postaDipaese) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
		this.postaDipaese = postaDipaese;
	}

	public Destinatario(String nome, String cognome, int eta, String indirizzo, boolean possessoreDiContoCorrente,
			PostaDiPaese postaDipaese) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
		this.postaDipaese = postaDipaese;
	}

	public Destinatario(String nome, String cognome, int eta, String indirizzo, boolean possessoreDiContoCorrente) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public boolean isPossessoreDiContoCorrente() {
		return possessoreDiContoCorrente;
	}

	public void setPossessoreDiContoCorrente(boolean possessoreDiContoCorrente) {
		this.possessoreDiContoCorrente = possessoreDiContoCorrente;
	}

	public PostaDiPaese getPostaDipaese() {
		return postaDipaese;
	}

	public void setPostaDipaese(PostaDiPaese postaDipaese) {
		this.postaDipaese = postaDipaese;
	}

	@Override
	public String toString() {
		return "Destinatario [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", indirizzo=" + indirizzo
				+ ", possessoreDiContoCorrente=" + possessoreDiContoCorrente + "]";
	}

}