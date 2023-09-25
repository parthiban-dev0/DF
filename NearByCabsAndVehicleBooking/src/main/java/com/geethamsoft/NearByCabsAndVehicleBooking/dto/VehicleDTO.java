package com.geethamsoft.NearByCabsAndVehicleBooking.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {
    @NotBlank(message = "Vehicle name is required")
    private String vehicleName;

    @NotBlank(message = "Vehicle type is required")
    private String vehicleType;

    @NotNull(message = "Number of seats is required")
    @Min(value = 1, message = "Minimum seats must be at least 1")
    private Integer numberOfSeats;

    @NotBlank(message = "Model year is required")
    private String modelYear;

    @NotBlank(message = "License plate is required")
    private String licensePlate;

    @NotBlank(message = "Contact information is required")
    private String contactInformation;

    @NotBlank(message = "Availability is required")
    private String availability;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Price per hour is required")
    @DecimalMin(value = "0.0", message = "Price per hour must be a non-negative number")
    private double pricePerHour;

    @NotNull(message = "Price per day is required")
    @DecimalMin(value = "0.0", message = "Price per day must be a non-negative number")
    private double pricePerDay;

    @NotNull(message = "Price per kilometer is required")
    @DecimalMin(value = "0.0", message = "Price per kilometer must be a non-negative number")
    private double pricePerKilometer;

    @NotBlank(message = "Transmission type is required")
    private String transmission;

    @NotBlank(message = "Fuel type is required")
    private String fuelType;

    private List<String> features;

}

