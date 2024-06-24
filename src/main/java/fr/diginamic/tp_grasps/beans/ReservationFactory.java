package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

public class ReservationFactory {
	public static Reservation getInstance(Client client, TypeReservation type, LocalDateTime dateReservation, int nbPlaces) {
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		//Calcul du montant total de la réservation qui dépend:
				// - du nombre de places
				// - de la réduction qui s'applique si le client est premium ou non
				reservation.setTotal(type.calcTotal(nbPlaces, client));
		return reservation;
	}

}
