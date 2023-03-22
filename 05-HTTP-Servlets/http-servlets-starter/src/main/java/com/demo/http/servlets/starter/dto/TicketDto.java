package com.demo.http.servlets.starter.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;
@Value
@Builder
public class TicketDto {

    Long id;
    Long flightId;
    String seatNo;

//    public TicketDto(Long id, Long flightId, String seatNo) {
//        this.id = id;
//        this.flightId = flightId;
//        this.seatNo = seatNo;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public Long getFlightId() {
//        return flightId;
//    }
//
//    public String getSeatNo() {
//        return seatNo;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        TicketDto ticketDto = (TicketDto) o;
//        return Objects.equals(id, ticketDto.id) &&
//                Objects.equals(flightId, ticketDto.flightId) &&
//                Objects.equals(seatNo, ticketDto.seatNo);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, flightId, seatNo);
//    }
//
//    @Override
//    public String toString() {
//        return "TicketDto{" +
//                "id=" + id +
//                ", flightId=" + flightId +
//                ", seatNo='" + seatNo + '\'' +
//                '}';
//    }
}