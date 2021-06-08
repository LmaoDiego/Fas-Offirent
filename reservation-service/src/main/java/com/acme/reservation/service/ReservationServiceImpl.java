package com.acme.reservation.service;

//import com.acme.reservation.domain.model.Office;
//import com.acme.reservation.domain.repository.AccountRepository;
//import com.acme.reservation.domain.repository.OfficeRepository;
import com.acme.reservation.domain.model.Reservation;
import com.acme.reservation.domain.repository.ReservationRepository;
import com.acme.reservation.domain.service.ReservationService;
import com.acme.reservation.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Autowired
//    private OfficeRepository officeRepository;

//    @Override
//    public Reservation getReservationByIdAndAccountId(Long accountId, Long reservationId) {
//        return reservationRepository.findByIdAndAccountId(reservationId,accountId)
//                .orElseThrow(()->new ResourceNotFoundException(
//                        "Reservation not found with Id " + reservationId +
//                                " and Account Id " + accountId));
//    }
//
//    @Override
//    public Page<Reservation> getAllReservationsByAccountId(Long accountId, Pageable pageable) {
//        return reservationRepository.findByAccountId(accountId,pageable);
//    }
//    @Override
//    public Page<Reservation> getAllReservationsByOfficeId(Long officeId, Pageable pageable) {
//        return reservationRepository.findByOfficeId(officeId,pageable);
//    }
//
//    @Override
//    public Reservation createReservation(Reservation reservation, Long accountId, Long officeId) {
//        return accountRepository.findById(accountId).map(account -> {
//            Office office = officeRepository.findById(officeId)
//                    .orElseThrow(()->new ResourceNotFoundException("Office","Id",officeId));
//            reservation.setAccount(account);
//            reservation.setOffice(office);
//            return reservationRepository.save(reservation);
//        }).orElseThrow(()->new ResourceNotFoundException("Account","Id",accountId));
//    }

//    @Override
    public Reservation updateReservation(Long reservationId, Reservation reservationRequest) {
        return reservationRepository.save(reservationRequest);
    }

//    @Override
//    public ResponseEntity<?> deleteReservation(Long reservationId, Long accountId) {
//        if(!accountRepository.existsById(accountId))
//            throw new ResourceNotFoundException("Account","Id", accountId);
//
//        return reservationRepository.findById(reservationId).map(reservation -> {
//            reservationRepository.delete(reservation);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(()->new ResourceNotFoundException("Reservation","Id",reservationId));
//    }
}
