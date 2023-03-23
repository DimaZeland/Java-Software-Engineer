package com.demo.http.dto;

import lombok.Builder;
import lombok.Value;

//@AllArgsConstruct
//@Getter
//@EqualsAndHashCode
//@ToString
//@NoArgsConstructor
//@Data
@Value
@Builder
public final class FlightDto {

    Long id;
    String description;

//    public FlightDto(Long id, String description) {
//        this.id = id;
//        this.description = description;
//    }
//
//    public static FlightDtoBuilder builder() {
//        return new FlightDtoBuilder();
//    }
//
//    public static class FlightDtoBuilder {
//        private Long id;
//        private String description;
//
//        FlightDtoBuilder() {
//        }
//
//        public FlightDtoBuilder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public FlightDtoBuilder description(String description) {
//            this.description = description;
//            return this;
//        }
//
//        public FlightDto build() {
//            return new FlightDto(id, description);
//        }
//
//        public String toString() {
//            return "FlightDto.FlightDtoBuilder(id=" + this.id + ", description=" + this.description + ")";
//        }
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public String getDescription() {
//        return description;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        FlightDto flightDto = (FlightDto) o;
//        return Objects.equals(id, flightDto.id) &&
//                Objects.equals(description, flightDto.description);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, description);
//    }

//    @Override
//    public String toString() {
//        return "FlightDto{" +
//                "id=" + id +
//                ", description='" + description + '\'' +
//                '}';
//    }
}