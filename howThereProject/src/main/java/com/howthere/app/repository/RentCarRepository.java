package com.howthere.app.repository;

import com.howthere.app.entity.rentCar.RentCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentCarRepository extends JpaRepository<RentCar,Long> {
}