package generic;

import java.util.Iterator;

/**
 * Classe qui permet d'itérer dans une collection de dés.
 */
public class IterateurDes implements Iterator<De> {

    private int index = 0;
    private De[] tabDes;

    /**
     * Instancie un itérateur selon une liste de dés donnée.
     * @param tabDes liste de dés ou on veut itérer
     */
	public IterateurDes(De[] tabDes) {
	    this.tabDes = tabDes;
    }

    /**
     * Vérifie si nous ne sommes pas arrivés à la fin de la collection.
     * @return vrai si nous ne sommes pas à la fin, faux sinon.
     */
	@Override
	public boolean hasNext() {

		return index >= tabDes.length || tabDes[index] == null ? false : true;
	}

    /**
     * Obtient le prochain dé de la collection.
     * @return le prochain De.
     */
	@Override
	public De next() {
	    return tabDes[index++];
	}

}
