package fr.diginamic.tp_grasps;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Params;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.ReservationFactory;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.utils.DateUtil;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 * 
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	/** DAO permettant d'accéder à la table des clients */
	private ClientDao clientDao = new ClientDao();

	/** DAO permettant d'accéder à la table des types de réservation */
	private TypeReservationDao typeReservationDao = new TypeReservationDao();

	/**
	 * Méthode qui créée une réservation pour un client à partir des informations
	 * transmises
	 * 
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {

		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();

		// 2) Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = DateUtil.toDate(dateReservationStr);

		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);

		// 4) Extraction de la base de données des infos concernant le type de la
		// réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

		// 5) Création de la réservation
		Reservation reservation = ReservationFactory.getInstance(client, type, dateReservation, nbPlaces);

		// 6) Ajout de la réservation au client
		client.getReservations().add(reservation);

		
		return reservation;
	}

}
