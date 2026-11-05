package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

		private Innlegg[] innleggtabell;
	private int nesteledig;


	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
			innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}


	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}


	public int finnInnlegg(Innlegg innlegg) {
		int pos = -1;
		int i = 0;

		while (i < nesteledig && pos == -1) {
			if (innleggtabell[i].erLik(innlegg)) {
				pos = i;
			}
				i++;
		}
		return pos;
	}


	public boolean finnes(Innlegg innlegg) {
			return finnInnlegg(innlegg) != -1;
	}


	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}


	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;

		if (ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		}
			return lagtTil;
	}


	@Override
	public String toString() {
		String res = nesteledig + "\n";

		for (int i = 0; i < nesteledig; i++) {
			res += innleggtabell[i].toString();
		}
		return res;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}